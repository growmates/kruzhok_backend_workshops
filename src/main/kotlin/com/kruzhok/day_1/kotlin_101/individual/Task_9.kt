package com.kruzhok.day_1.kotlin_101.individual

/**
 * Задача: Напишите функцию, чтобы найти наибольшую общую приставку строк в массиве.
 * Пример:
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 */
fun longestCommonPrefix(strs: Array<String>): String {
    // TODO: Реализуйте этот метод
    return ""
}

fun main() {
    println("Введите строки, разделяя их пробелом:")
    val strs = readLine()!!.split(" ").toTypedArray()

    val result = longestCommonPrefix(strs)
    println("Наибольшая общая приставка: $result")
}
