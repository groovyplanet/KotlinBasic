package com.example.kotlinbasic.day02


//코틀린에서 생성자는 주생성자 or 보조생성자
//주생성자는 클래스 선언부에 들어가는 생성자
//보조생성자는 constructor 키워드로 만들어지는 보조 생성자

//class ContructEx01(name : String) {
//    val name : String = name
//}

//생성자의 val or var 변수를 사용할 수 있습니다.
//class ContructEx01(val name : String){}

class ContructEx01 (val name : String = "홍길자"){ // name에 값이 없으면 , 홍길자라는 이름을 주겠다.

    init{
        //객체가 생성될 때 실행됩니다.
        println("생성자 매개변수는 $name 입니다.")
    }
}

fun main(){
    val a = ContructEx01()
    val b = ContructEx01("이순신")
    println(a.name)
    println(b.name)
}