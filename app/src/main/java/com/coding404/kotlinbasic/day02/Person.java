package com.coding404.kotlinbasic.day02;


//convert to kotlin하면 됩니다.
public class Person {

    public String name;
    public int age;

    public Person(String name) {
        this.name = name;
        this.age = 1;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }



}
