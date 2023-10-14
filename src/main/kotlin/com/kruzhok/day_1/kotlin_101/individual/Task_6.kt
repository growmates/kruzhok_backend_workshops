package com.kruzhok.day_1.kotlin_101.individual

/**
 * Задача: Даны две строки s и t. Напишите функцию, чтобы определить, является ли t анаграммой для s.
 * Пример:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 */
fun isAnagram(s: String, t: String): Boolean {
    // TODO: Реализуйте этот метод
    return false
}

fun main() {
    println("Введите первую строку:")
    val s = readLine()!!
    println("Введите вторую строку:")
    val t = readLine()!!

    val result = isAnagram(s, t)
    println("Является ли строка анаграммой: $result")
}
