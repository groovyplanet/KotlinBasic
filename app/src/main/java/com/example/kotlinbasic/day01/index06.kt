package com.example.kotlinbasic.day01

fun main (){


    //자바 null pointer exception은 런타임 시에 발생됨
    //코틀린에서는 null safety 컴파일 시점에 에러를 잡을 수 있도록 도와주는 구문

    //? -> null 일 수도 있음
    var a : String? = null
    var name : String? = "hong"

    //?. => null이 아니면 실행해라
    println(name?.uppercase())

    //?: 대체값 -> null인 경우게 대체값으로 바꿔라, ()도 함께 사용
    var age : Int?= null
    var result = (age ?: 0)
    println(result)

    //!! -> 내가 null값이 아닌 것을 보장한다
    var k : String? = "null일 수도 있는 값"
    var result2 = k!!.uppercase()

    //let{} => null 이 아니면 실행하라
    var data : String? = null

    //if (data!=null){
    // }

    data?.let {
        println("null이 아니면 실행해라")
        println(it)
    } ?: run{
        println("null이면 이거 실행해라")
    }




}