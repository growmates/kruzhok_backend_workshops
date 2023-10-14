package com.kruzhok.day_1.kotlin_101.individual

/**
 * Задача: Напишите функцию, которая принимает две двоичные строки a и b в качестве входных данных и возвращает их сумму в виде двоичной строки.
 * Пример:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
fun addBinary(a: String, b: String): String {
    // TODO: Реализуйте этот метод
    return ""
}

fun main() {
    println("Введите первую двоичную строку:")
    val a = readLine()!!
    println("Введите вторую двоичную строку:")
    val b = readLine()!!

    val result = addBinary(a, b)
    println("Сумма: $result")
}

