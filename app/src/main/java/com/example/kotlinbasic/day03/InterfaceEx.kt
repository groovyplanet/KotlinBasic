package com.example.kotlinbasic.day03.inter

// 인터페이스 선언
interface InterfaceEx {
    // 추상 변수와 메서드
    var data: String
    fun some() // 추상 메서드 (abstract 생략 가능)
    fun some2() {
        // 일반 메서드
    }
}

interface InterfoceEx02 {}

// 클래스 Person이 InterfaceEx와 InterfoceEx02를 구현
class Person : InterfaceEx, InterfoceEx02 {
    // InterfaceEx의 추상 변수와 메서드를 구현해야 함
    override var data: String = "홍길동"

    override fun some() {
        // 구현 내용 작성
    }
}

fun main() {
    val p = Person()

    // 자식 객체를 부모 인터페이스 타입으로 저장할 수 있음
    val a: InterfaceEx = p // 올바른 타입 선언

    // 클래스 캐스팅 (InterfaceEx를 Person으로 캐스팅)
    val b: Person = a as Person

    println(b.data) // "홍길동" 출력
}
