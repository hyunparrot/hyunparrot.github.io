package com.example.kiosk_programming



fun main() {

  //  var kiosk = ArrayList<menu>()

   // add(burgerMenu)
   // kiosk.add("음료")
   // kiosk.add("사이드")

    //listOf<String>("")


    println("========== 맥도날드 메뉴 ==========")
    println("1. 버거")
    println("2. 음료")
    println("3. 사이드")
    println("4. 종료")
    println("=================================")

    print("원하는 메뉴를 선택하세요. ")
    var userInput = readLine()


    var mainMenuChoice = userInput?.toIntOrNull() ?: 0

    when (mainMenuChoice) {

        1 -> {
            burgerMenu().showBurgerMenu()
        }
        2 -> {
            beverageMenu().showBeverageMenu()
        }
        3 -> {
            sideMenu().showSideMenu()
        }
        4 -> {
            exitProgram().showExitProgram()
        }

        else -> {
            println("잘못된 번호입니다. 다시 선택해주세요.")
            main()

        }
    }
}




