package com.kruzhok.day_1.kotlin_101.individual

/**
 * Задача: Напишите функцию, которая проверяет валидность строки, содержащей только символы '(', ')', '{', '}', '[' и ']'.
 * Пример:
 * Input: "{[]}"
 * Output: true
 */
fun isValid(s: String): Boolean {
    // TODO: Реализуйте этот метод
    return false
}

fun main() {
    println("Введите строку со скобками:")
    val s = readLine()!!

    val result = isValid(s)
    println("Является ли строка валидной: $result")
}
