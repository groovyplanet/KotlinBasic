package com.example.kotlinbasic.day03

//추상 클래스
//추상변수, 추상메서드 사용할 때 abstract 키워드를 씁니다
//추상클래스는 자식에서 오버라이딩을 강제화 시킬때 사용합니다.
abstract class AbstractEx {

    //abstract를 가지려면 클래스도 abstract로 
    abstract var a : String // 추상변수
    abstract fun some() // 추상메서드

    fun some2(){

    }

    class Child : AbstractEx(){
        override var a: String
            get() = TODO("Not yet implemented")
            set(value) {}

        override fun some() {
            TODO("Not yet implemented")
        }


    }


}