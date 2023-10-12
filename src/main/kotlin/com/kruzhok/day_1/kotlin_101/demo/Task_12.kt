package com.kruzhok.day_1.kotlin_101.demo

// Задание: Напишите функцию, которая возводит число в квадрат, и используйте ее.
fun square(num: Int): Int {
    // TODO: верните квадрат числа
    return 0
}

fun main() {
    println("Введите число:")
    val number = readLine()!!.toInt()
    println("Квадрат числа: ${square(number)}")
}

