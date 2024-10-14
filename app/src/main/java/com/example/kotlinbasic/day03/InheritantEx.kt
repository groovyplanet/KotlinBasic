package com.example.kotlinbasic.day03

open class Person(val name: String, val age: Int) {
    open fun info() {
        println("부모님 메서드 info")
    }
}

class Student(name: String, age: Int) : Person(name, age) {
    override fun info() {
        println("자식의 오버라이드 한 메서드 info")
    }

    // 오버 로딩
    fun abc() {}
    fun abc(a: Int) {}
}

fun main() {
    val s = Student("홍길동", 20)
    println(s.name)
    println(s.age)
    s.info() // info() 메서드 호출
}
