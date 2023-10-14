package com.kruzhok.day_1.kotlin_101.individual

/*
Первый уникальный символ в строке:

Задача: Напишите функцию, чтобы найти первый неповторяющийся символ в данной строке и вернуть его индекс. Если такого символа нет, верните -1.

Пример:
Input: "leetcode"
Output: 0
*/

fun firstUniqChar(s: String): Int {
    // TODO: Реализуйте этот метод
    return -1
}

fun main() {
    println("Введите строку:")
    val s = readLine()!!
    val result = firstUniqChar(s)
    println("Индекс первого уникального символа: $result")
}

