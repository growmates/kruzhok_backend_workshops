package com.kruzhok.day_1.kotlin_101.individual

/*
Палиндром:

Задача: Напишите функцию, которая проверяет, является ли данное слово или предложение палиндромом. Палиндром – это слово, фраза, число или другая последовательность символов, которая читается вперед и назад одинаково (игнорируя пробелы, пунктуацию и регистр).

Пример:
Input: "A man, a plan, a canal: Panama"
Output: true
*/

fun isPalindrome(s: String): Boolean {
    // TODO: Реализуйте этот метод
    return false
}

fun main() {
    println("Введите строку:")
    val s = readLine()!!
    val result = isPalindrome(s)
    println("Является ли строка палиндромом: $result")
}