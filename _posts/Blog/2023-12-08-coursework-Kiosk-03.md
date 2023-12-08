---
title:  "키오스크 프로그래밍 과제" 
excerpt: "과제03"

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

fun main() {

   var kiosk = ArrayList<Menu>()

       kiosk.add(SideMenu())   //=> () 주의
          // 버거메뉴를 불러와야하는데 불러오질못해서 생긴문제 상속class바로뒤에 ()를 붙여줘야함

       kiosk.add(BurgerMenu())



       listOf<String>("")

       println(" $kiosk")
