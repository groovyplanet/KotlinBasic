package com.coding404.kotlinbasic.day04

//코틀린
class CompanionObject {

    val name : String = "홍길동"

    //일반 내부클래스
    inner class Inner1 {
        val a : String = "a"
        fun example() : String {
            return name
        }
    }
    
    class Inner2 {
        val a : String = "a"
//        fun example() : String {
//            return name //외부클래스에 접근 불가
//        }
    }
    //코틀린에서는 static키워드가 없어서 static메서드 표현 companion object안에서 생성
    //companion = 스테틱
    //object = 싱글톤
    companion object {
        fun method() {
            //스테틱 메서드임~~
        }
    }
}

fun main() {
    val a = CompanionObject().Inner1() //일반내부클래스 객체생성
    val b = CompanionObject.Inner2() //스태틱내부클래스 객체생성
    CompanionObject.method() //스테틱 메서드
}


