package com.example.kiosk_programming

class beverageMenu : menu("탄산음료, 커피, 쉐이크, 칠러") {

    var beverageName: String = ""
    // 음료 이름을 저장하는 프로퍼티

    fun showBeverageMenu() {

        println("========== 음료 메뉴 ==========")
        println("1. 탄산음료")
        println("2. 커피")
        println("3. 쉐이크")
        println("4. 칠러")
        println("5. 이전 메뉴로 돌아가기")
        println("===============================")

        var userInput1 = readLine()

        var beverageMenuChoice = userInput1?.toInt() ?: 0

        when (beverageMenuChoice) {

            1 -> {
                beverageName = "탄산음료"
                soda()
                println("탄산음료를 선택하셨습니다.")
            }

            2 -> {
                beverageName = "커피"
                coffee()
                println("커피를 선택하셨습니다.")
            }

            3 -> {
                beverageName = "쉐이크"
                shake()
                println("쉐이크를 선택하셨습니다.")
            }
            4 -> {
                beverageName = "칠러"
                chiller()
                println("칠러를 선택하셨습니다.")
            }
            5 -> {
                main()
            }
            else -> {
                println("잘못된 번호입니다. 다시 선택해주세요.")
                return showBeverageMenu()
            }
        }
    }

    fun drink() {

        println("========== 음료 메뉴 ==========")
        println("1. 탄산음료")
        println("2. 커피")
        println("3. 쉐이크")
        println("4. 칠러")
        println("5. 이전 메뉴로 돌아가기")
        println("===============================")

        var userinput2 = readLine()

        var drinksMenuChoice = userinput2?.toInt() ?: 0

        when (drinksMenuChoice) {
            1 -> {
                soda()
                println("탄산음료를 선택하셨습니다.")

            }

            2 -> {
                coffee()
                println("커피를 선택하셨습니다.")
            }


            3 -> {
                shake()
                println("쉐이크를 선택하셨습니다.")
            }

            4 -> {
                chiller()
                println("칠러를 선택하셨습니다.")
            }

            5 -> {
                beverageMenu().showBeverageMenu()
                println("이전 메뉴로 돌아갑니다.")
            }
            else -> {
                println("잘못된 번호입니다. 다시 선택해주세요.")
                return drink()
            }
        }


    }

    fun coffee() {

        println("========== 주문 내역 ==========")
        println("1. 주문 추가")
        println("2. 결제 하기")
        println("3. 이전 메뉴로 돌아가기")
        println("4. 처음으로 돌아가기")
        println("===============================")

        var userInput3 = readLine()

        var coffeeChoice = userInput3?.toInt() ?: 0

        when (coffeeChoice) {

            1 -> {
                main()
            }

            2 -> {
            }

            3 -> {
                beverageMenu().showBeverageMenu()
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
    }


    fun soda() {
        println("========== 주문 내역 ==========")
        println("1. 주문 추가")
        println("2. 결제 하기")
        println("3. 이전 메뉴로 돌아가기")
        println("4. 처음으로 돌아가기")
        println("===============================")

        var userInput4 = readLine()

        var sodaChoice = userInput4?.toInt() ?: 0

        when (sodaChoice) {

            1 -> {
                main()
            }

            2 -> {
            }

            3 -> {
                beverageMenu().showBeverageMenu()
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

    fun shake() {
        println("========== 주문 내역 ==========")
        println("1. 주문 추가")
        println("2. 결제 하기")
        println("3. 이전 메뉴로 돌아가기")
        println("4. 처음으로 돌아가기")
        println("===============================")

        var userInput5 = readLine()

        var coffeeChoice = userInput5?.toInt() ?: 0

        when (coffeeChoice) {

            1 -> {
                main()
            }

            2 -> {
            }

            3 -> {
                beverageMenu().showBeverageMenu()
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

    fun chiller() {
        println("========== 주문 내역 ==========")
        println("1. 주문 추가")
        println("2. 결제 하기")
        println("3. 이전 메뉴로 돌아가기")
        println("4. 처음으로 돌아가기")
        println("===============================")

        var userInput6 = readLine()

        var coffeeChoice = userInput6?.toInt() ?: 0

        when (coffeeChoice) {

            1 -> {
                main()
            }

            2 -> {
            }

            3 -> {
                beverageMenu().showBeverageMenu()
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

