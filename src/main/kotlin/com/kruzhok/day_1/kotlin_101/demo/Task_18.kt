package com.kruzhok.day_1.kotlin_101.demo

// Задание: Если пользователь вводит число меньше 0, выбросите собственное исключение.
class NegativeNumberException : Exception("Число не должно быть отрицательным!")

fun main() {
    println("Введите положительное число:")
    val number = readLine()!!.toInt()

    // TODO: выбросите исключение, если число отрицательное
}
