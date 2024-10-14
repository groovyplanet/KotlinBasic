package com.example.kotlinbasic.day03

fun main() {
    val words = listOf("apple", "cat", "banana", "dog")
    for (word in words) {
        if (word.length >= 4) {
            println(word.uppercase())
        } else {
            println(word)
        }
    }
}
