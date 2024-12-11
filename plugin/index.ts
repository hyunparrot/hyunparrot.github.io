import style from './style.css?inline'; // 스타일을 인라인으로 가져옵니다

import { createPlugin } from '@/utils';

export default createPlugin({
  name: 'Plugin Label',
  restartNeeded: true, // 값이 true면, YTM은 재시작 다이얼로그를 표시합니다
  config: {
    enabled: false,
  }, // 나의 커스텀 config
  stylesheets: [style], // 나의 스타일
  menu: async ({ getConfig, setConfig }) => {
    // 모든 *Config 메서드는 Promise<T>로 래핑됩니다
    const config = await getConfig();
    return [
      {
        label: 'menu',
        submenu: [1, 2, 3].map((value) => ({
          label: `value ${value}`,
          type: 'radio',
          checked: config.value === value,
          click() {
            setConfig({ value });
          },
        })),
      },
    ];
  },
  backend: {
    start({ window, ipc }) {
      window.maximize();

      // 이를 사용하여 렌더러 플러그인과 통신할 수 있습니다
      ipc.handle('some-event', () => {
        return 'hello';
      });
    },
    // config가 변경되면 실행됩니다
    onConfigChange(newConfig) { /* ... */ },
    // 플러그인이 비활성화되면 실행됩니다
    stop(context) { /* ... */ },
  },
  renderer: {
    async start(context) {
      console.log(await context.ipc.invoke('some-event'));
    },
    // 렌더러에서만 사용 가능한 훅입니다
    onPlayerApiReady(api: YoutubePlayer, context: RendererContext<T>) {
      // 플러그인의 config를 간단하게 설정할 수 있습니다
      context.setConfig({ myConfig: api.getVolume() });
    },
    onConfigChange(newConfig) { /* ... */ },
    stop(_context) { /* ... */ },
  },
  preload: {
    async start({ getConfig }) {
      const config = await getConfig();
    },
    onConfigChange(newConfig) {},
    stop(_context) {},
  },
});
