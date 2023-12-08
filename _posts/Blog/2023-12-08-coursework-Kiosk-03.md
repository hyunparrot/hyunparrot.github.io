---
title:  "키오스크 프로그래밍 과제" 
excerpt: "study15, coursework03"

categories:
  - Coursework
tags:
  - [Coursework, Kotlin, Github,]

toc: true
toc_sticky: true
 
date: 2023-12-08
last_modified_at: 2023-12-08

---


## 키오스크 프로그래밍

클래스가 많기 때문에, 목차로 나눠서 설명할것이다.

## McDonaldKiosk.kt



    fun main() {

    val kiosk = ArrayList<Menu>()

       kiosk.add(SideMenu())
       kiosk.add(BurgerMenu())
       kiosk.add(BeverageMenu())
       kiosk.add(ExitProgram())
    // 버거메뉴를 불러와야하는데 불러오질못해서 생긴문제 burgerMenu바로뒤에 ()를 붙여줘야함


       listOf<String>("")

       println(" $kiosk")

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
            BurgerMenu().showBurgerMenu()
        }
        2 -> {
            BeverageMenu().showBeverageMenu()
        }
        3 -> {
            SideMenu().showSideMenu()
        }
        4 -> {
            ExitProgram().showExitProgram()
        }

        else -> {
            println("잘못된 번호입니다. 다시 선택해주세요.")
            main()

        }
    }
    }

## showBergerMenu.kt


    package com.example.kiosk_programming;



    class BurgerMenu : Menu("불고기, 상하이, 맥치킨, 1955") {

    //무조건 클래스는 처음대문자

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
                BurgerMenu().showBurgerMenu()
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
            BurgerMenu().showBurgerMenu()
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

  ## showSideMenu.kt

    package com.example.kiosk_programming;

    class SideMenu : Menu("치즈스틱, 맥너겟, 치킨텐더, 타로파이") {

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
            ExitProgram().showExitProgram()
        }

        3 -> {
            SideMenu().showSideMenu()
        }

        4 -> {
            println("처음으로 돌아갑니다.")
            main()
        }

        else -> {
            println("잘못된 번호입니다. 다시 선택해주세요.")
            return SideMenu().showSideMenu()

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
            ExitProgram().showExitProgram()
        }

        3 -> {
            SideMenu().showSideMenu()
        }

        4 -> {
            println("처음으로 돌아갑니다.")
            main()
        }

        else -> {
            println("잘못된 번호입니다. 다시 선택해주세요.")
            return SideMenu().showSideMenu()

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
            ExitProgram().showExitProgram()
        }

        3 -> {
            SideMenu().showSideMenu()
        }

        4 -> {
            println("처음으로 돌아갑니다.")
            main()
        }

        else -> {
            println("잘못된 번호입니다. 다시 선택해주세요.")
            return SideMenu().showSideMenu()

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
            ExitProgram().showExitProgram()
        }

        3 -> {
            SideMenu().showSideMenu()
        }

        4 -> {
            println("처음으로 돌아갑니다.")
            main()
        }

        else -> {
            println("잘못된 번호입니다. 다시 선택해주세요.")
            return SideMenu().showSideMenu()

        }
    }
    }


## showBeverageMenu.kt

    package com.example.kiosk_programming

    class BeverageMenu : Menu("탄산음료, 커피, 쉐이크, 칠러") {

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
                BeverageMenu().showBeverageMenu()
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
                ExitProgram().showExitProgram()
            }

            3 -> {
                BeverageMenu().showBeverageMenu()
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
                ExitProgram().showExitProgram()
            }

            3 -> {
                BeverageMenu().showBeverageMenu()
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
                ExitProgram().showExitProgram()
            }

            3 -> {
                BeverageMenu().showBeverageMenu()
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
                ExitProgram().showExitProgram()
            }

            3 -> {
                BeverageMenu().showBeverageMenu()
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
    }

## exitProgram.kt

    package com.example.kiosk_programming

    class ExitProgram : Menu("종료"){

    fun showExitProgram() {

        println("감사합니다. 다음에 또 이용해주세요!")
    }
    }
    
 ## menu.kt

    package com.example.kiosk_programming

    open class Menu(val name: String)







