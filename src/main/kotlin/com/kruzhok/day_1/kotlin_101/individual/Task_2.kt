package com.kruzhok.day_1.kotlin_101.individual

/*
Обратная строка:

Задача: Создайте функцию, которая принимает строку в качестве входных данных и возвращает эту строку в обратном порядке.

Пример:
Input: "hello"
Output: "olleh"
*/

fun reverseString(s: String): String {
    // TODO: Реализуйте этот метод
    return ""
}

fun main() {
    println("Введите строку:")
    val s = readLine()!!
    val result = reverseString(s)
    println("Обратная строка: $result")
}
