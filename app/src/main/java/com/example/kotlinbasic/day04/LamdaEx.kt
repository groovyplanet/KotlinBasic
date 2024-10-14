package com.example.kotlinbasic.day04

import android.view.View

//최상위 함수 - > 반드시 클래스 바깥에 함수나 변수의 정의가 가능
//fun some(a:Int){
//    println(a)
//}

//익명함수
//var some = fun(a:Int){
//    println(a)
//}

//람다식 = {매개변수 : 타입 -> 실행문} 람다식은 무조건 중괄호
//var some = {a:Int ->
//    println(a)
//}

//한줄 코드로 작성하면 자동으로 리턴하게 됩니다.
//var some = {a:Int -> a * 10}

var some = {a:Int->
    println(a)
    a*10 //리턴으로 돌아가고 있다.
}

//타입추론
//변수명 : 람다타입 = {람다식}
var some2 : (Int) -> Int = {a->
    a*10 // 인트를 생략할 수 있다.
}

// it 키워드 사용 - 람다의 매개변수가 하나일때는 -> 를 지우고 it 키워드로 값을 참조할 수 있음
    var some3 : (Int) -> Int ={
        it * 10
        //무진장 중요함 , 매개변수가 하나일때는 따로 지정하지 않고, 아무것도 하지 않아도 it이 자동으로 lamda에서 int로 지정해줌
}


fun main() {
    println(some(10))
    println(some2(10))
    println(some3(10))

//람다식은 이런 식으로 쓰여짐
    // View.OnClickListener 사용 예시
    var func: (View) -> Unit = { v: View ->
        print(v)
    }

    // 1. 일반적인 방법
    View.OnClickListener(func)

    //위 코드를 줄여서 2nd
    View.OnClickListener({ v: View ->
        print(v)
    })

    //마지막 매개변수가 1개이고 람다식이라면 , ()를 생략하고 밖으로 뺄 수 있음
    View.OnClickListener{
        println(it)
    }

    //매개변수에서 람다식
    example({a: Int -> true})
    example { a:Int ->
        true
    }

}
//매개변수로 함수를 받을 때는
fun example(a:(Int) -> Boolean){
    var bool = a(10)
}
