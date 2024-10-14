package com.example.kotlinbasic.day03

fun main() {
    val a = 10
    val b = 20

    // maxNumber 함수 호출 후 결과를 출력하세요.
    val result = maxNumber(a, b)
    println("두 수 중 더 큰 수는 ? =  $result")
}

// 두 개의 정수 a와 b를 입력받아 더 큰 값을 반환하는 함수
fun maxNumber(a: Int, b: Int): Int {
    // if-else 문을 사용하여 더 큰 값을 반환
    return if (a > b) {
        a
    } else {
        b
    }
}


