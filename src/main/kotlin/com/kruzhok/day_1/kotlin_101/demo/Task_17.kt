package com.kruzhok.day_1.kotlin_101.demo

// Задание: Используйте лямбда-функцию для определения, является ли число положительным.
val isPositive: (Int) -> Boolean = { it > 0 }

fun main() {
    println("Введите число:")
    val number = readLine()!!.toInt()

    // TODO: используйте лямбда-функцию, чтобы определить, является ли число положительным
}
