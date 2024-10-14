package com.coding404.kotlinbasic.day01


fun main() {
    //조건문

    var point = 90
    var grade : String

    if(point >= 90) {
        grade = "A"
    } else if(point >= 80) {
        grade = "B"
    } else {
        grade = "C"
    }

    //if구문의 향상된 표현식 - 단, else문이 꼭 있어야 합니다.
    var result = if(point >= 90) {
        println("점수: $point")
        "A"
    } else if(point >= 80) {
        println("점수: $point")
        "B"
    } else {
        println("점수: $point")
        "C"
    }

    println("$grade $result")

    println("--------------------------------------------------------------")
    //switch구문 -> when구문

    var data = "홍길동"

    when(data) {
        "이순신" -> {
            println("이순신 입니다~")
        }
        "홍길동" -> {
            println("홍길동 입니다~")
        }
        "HELLO", "hello" -> {
            println("hello 입니다")
        }
        else -> {
            println("아무고토 아닌데요")
        }
    }

    println("----------------------------------------------------")
    //when절도 향상된 구문이 가능합니다.
    val age = 10

    val result2 = when(age) {
        10 -> {
            "10세 입니다"
        }
        20 -> {
            "20세 입니다"
        }
        else -> {
            "어린이 입니다"
        }
    }















}
