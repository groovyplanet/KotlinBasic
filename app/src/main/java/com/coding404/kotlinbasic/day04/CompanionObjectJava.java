package com.coding404.kotlinbasic.day04;

//자바
public class CompanionObjectJava {
    //자바의 내부클래스는 2종류 static클래스, 일반클래스
    String name = "홍길동";

    public class Inner1 {
        String a = "a";
        public String example() {
            return name; //외부클래스에 멤버에 접근이 가능
        }
    }

    public static class Inner2 {
        String a = "a";
//        public String example() {
//            return name; //외부클래스에 멤버에 접근 불가능
//        }
    }

    //static메서드
    public static void method() {

    }

    public static void main(String[] args) {

        //inner1객체 생성 - 일반 내부클래스
        Inner1 inner1 = new CompanionObjectJava().new Inner1(); 
        //inner2객체 생성 - 스테틱 내부클래스
        Inner2 inner2 = new CompanionObjectJava.Inner2();

    }

}
