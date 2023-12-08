package com.example.kiosk_programming;

class sideMenu : menu("치즈스틱, 맥너겟, 치킨텐더, 타로파이") {

     var sideName: String = ""
     // 음료 이름을 저장하는 프로퍼티
     fun showSideMenu() {



         println("========== 사이드 메뉴 ==========")
         println("1. 치즈스틱")
         println("2. 맥너겟")
         println("3. 치킨텐더")
         println("4. 타로파이")
         println("5. 이전 메뉴로 돌아가기")
         println("===============================")

         var userInput1 = readLine()

         var sideMenuChoice = userInput1?.toInt() ?: 0

         when (sideMenuChoice) {

             1 -> {
                 sideName = "치즈스틱"
                 cheeseStick()
                 println("치즈스틱을 선택하셨습니다.")
             }

             2 -> {
                 sideName = "맥너겟"
                 chickenMcNugget()
                 println("맥너겟을 선택하셨습니다.")
             }

             3 -> {
                 sideName = "치킨텐더"
                 chickenTender()
                 println("치킨텐더를 선택하셨습니다.")
             }

             4 -> {
                 sideName = "타로파이"
                 taroPie()
                 println("타로파이를 선택하셨습니다.")
             }

             5 -> {
                 main()
             }

             else -> {
                 println("잘못된 번호입니다. 다시 선택해주세요.")
                 return showSideMenu()
             }
         }
     }
 }


fun cheeseStick () {

    println("========== 주문 내역 ==========")
    println("1. 주문 추가")
    println("2. 결제 하기")
    println("3. 이전 메뉴로 돌아가기")
    println("4. 처음으로 돌아가기")
    println("===============================")

    var userInput2 = readLine()

    var cheeseChoice = userInput2?.toInt() ?: 0

    when (cheeseChoice) {

        1 -> {
            main()
        }

        2 -> {
            exitProgram().showExitProgram()
        }

        3 -> {
            sideMenu().showSideMenu()
        }

        4 -> {
            println("처음으로 돌아갑니다.")
            main()
        }

        else -> {
            println("잘못된 번호입니다. 다시 선택해주세요.")
            return sideMenu().showSideMenu()

        }
    }
}

fun chickenMcNugget() {

    println("========== 주문 내역 ==========")
    println("1. 주문 추가")
    println("2. 결제 하기")
    println("3. 이전 메뉴로 돌아가기")
    println("4. 처음으로 돌아가기")
    println("===============================")

    var userInput3 = readLine()

    var nuggetChoice = userInput3?.toInt() ?: 0

    when (nuggetChoice) {

        1 -> {
            main()
        }

        2 -> {
            exitProgram().showExitProgram()
        }

        3 -> {
            sideMenu().showSideMenu()
        }

        4 -> {
            println("처음으로 돌아갑니다.")
            main()
        }

        else -> {
            println("잘못된 번호입니다. 다시 선택해주세요.")
            return sideMenu().showSideMenu()

        }
    }
}

fun chickenTender() {

    println("========== 주문 내역 ==========")
    println("1. 주문 추가")
    println("2. 결제 하기")
    println("3. 이전 메뉴로 돌아가기")
    println("4. 처음으로 돌아가기")
    println("===============================")

    var userInput4 = readLine()

    var tenderChoice = userInput4?.toInt() ?: 0

    when (tenderChoice) {

        1 -> {
            main()
        }

        2 -> {
            exitProgram().showExitProgram()
        }

        3 -> {
            sideMenu().showSideMenu()
        }

        4 -> {
            println("처음으로 돌아갑니다.")
            main()
        }

        else -> {
            println("잘못된 번호입니다. 다시 선택해주세요.")
            return sideMenu().showSideMenu()

        }
    }
}

fun taroPie() {

    println("========== 주문 내역 ==========")
    println("1. 주문 추가")
    println("2. 결제 하기")
    println("3. 이전 메뉴로 돌아가기")
    println("4. 처음으로 돌아가기")
    println("===============================")

    var userInput4 = readLine()

    var taroChoice = userInput4?.toInt() ?: 0

    when (taroChoice) {

        1 -> {
            main()
        }

        2 -> {
            exitProgram().showExitProgram()
        }

        3 -> {
            sideMenu().showSideMenu()
        }

        4 -> {
            println("처음으로 돌아갑니다.")
            main()
        }

        else -> {
            println("잘못된 번호입니다. 다시 선택해주세요.")
            return sideMenu().showSideMenu()

        }
    }
}
