package com.example.kiosk_programming;



class burgerMenu : menu("불고기, 상하이, 맥치킨, 1955") {

    fun showBurgerMenu() {


        println("========== 버거 메뉴 ==========")
        println("1. 단품")
        println("2. 세트")
        println("3. 이전 메뉴로 돌아가기")

        println("===============================")

        print("원하는 메뉴를 선택해주세요.")

        var userInput1 = readLine()

        var burgerMenuChoice = userInput1?.toInt() ?: 0

        when (burgerMenuChoice) {

            1 -> single()
            2 -> set()
            3 -> main()
            else -> {
                println("잘못된 번호입니다. 다시 선택해주세요.")
                return showBurgerMenu()
            }
        }
    }


    fun single() {
        println("========== 주문 내역 ==========")
        println("1. 주문 추가")
        println("2. 결제 하기")
        println("3. 이전 메뉴로 돌아가기")
        println("4. 처음으로 돌아가기")
        println("===============================")

        var userInput2 = readLine()

        var singleChoice = userInput2?.toInt() ?: 0

        when (singleChoice) {

            1 -> {
                main()
            }
            //1 -> 에다가 주문 추가를 하려고 showBurgerMenu()
            //3 -> 이전으로 가려는데 오류남
            //두번 입력됨


            2 -> {
                println("")

            }

            3 -> {
                println("이전으로 돌아갑니다.")
                burgerMenu().showBurgerMenu()
            }

            4 -> {
                println("처음으로 돌아갑니다.")
                main()
            }


//코드를 다시 실행시킨다 , 라벨링코드로 이동 시키는 방법,단위별로 나눠지는게 편함
            else -> {
                println("잘못된 번호입니다. 다시 선택해주세요.")
                return single()

            }
        }
        for (i in 2..2) {
            println("감사합니다! 또 이용해주세요!")
            break
        }
    }
}




fun set() {


    println("========== 주문 내역 ==========")
    println("1. 주문 추가")
    println("2. 결제 하기")
    println("3. 이전 메뉴로 돌아가기")
    println("4. 처음으로 돌아가기")
    println("===============================")

    var userInput3 = readLine()

    var setChoice = userInput3?.toInt() ?: 0

    when (setChoice) {

        1 -> {
            main()
        }

        2 -> {
        }

        3 -> {
            burgerMenu().showBurgerMenu()
        }

        4 -> {
            println("처음으로 돌아갑니다.")
            main()
        }

        else -> {
            println("잘못된 번호입니다. 다시 선택해주세요.")
            return set()

        }
    }
        for (i in 2..2) {
            println("감사합니다! 또 이용해주세요!")
            break
        }


}



