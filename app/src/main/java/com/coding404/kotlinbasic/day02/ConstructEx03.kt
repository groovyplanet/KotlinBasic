package com.coding404.kotlinbasic.day02

//주생성자, 보조생성자 동시에 사용이 됩니다.
class ConstructEx03(val name : String) {

    var age : Int = 1
    //주생성자, 보조생성자를 같이 쓰게되면, 반드시 주생성자를 호출
    constructor(name: String, age : Int) : this(name) {
        this.age = age
    }
}