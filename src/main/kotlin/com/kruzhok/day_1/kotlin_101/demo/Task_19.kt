package com.kruzhok.day_1.kotlin_101.demo

// Задание: Напишите функцию, которая принимает два числа и возвращает их произведение.
fun multiply(a: Int, b: Int): Int {
    // TODO: верните произведение двух чисел
    return 0
}

fun main() {
    println("Введите первое число:")
    val num1 = readLine()!!.toInt()
    println("Введите второе число:")
    val num2 = readLine()!!.toInt()
    println("Произведение: ${multiply(num1, num2)}")
}

