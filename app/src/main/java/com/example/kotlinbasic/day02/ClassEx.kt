package com.example.kotlinbasic.day02; // 패키지명을 맞추지 않아도 됩니다. 단 특별한 일이 아니라면 바꾸지 마세요

//코틀린에서 파일명과 클래스 명이 반드시 일치해야 하는 것은 아닙니다.

class Person {
    var name : String = "홍길동"
    var age : Int? = null //코틀린은 반드시 초기값이 지정이 되야함
    lateinit var addr : String // lateinit >> 초기값 미루기 - 나중에 초기화 해야함
    
    val pay : Int by lazy { // 변수를 초기화하면서 실행시킬 구문이 있다면 by lazy - val 변수만 됨
        println("hello world")
        10 //10을 초기화 
    }

    fun info (){
        println("$name 입니다.")
    }

}


fun main(){
    val p = Person() //객체생성
    println(p.name)
    p.info()

    p.addr = "서울시"
    println(p.addr) //lateinit 변수는 반드시 초기화 후에 사용되어야 함

    println(p.pay) // by lazy는 한번만 실행이 됩니다.

}

