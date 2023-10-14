package com.kruzhok.day_1.kotlin_101.individual

/*
Пересечение двух массивов:

Задача: Даны два массива целых чисел. Напишите функцию для определения их пересечения.

Пример:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
*/

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    // TODO: Реализуйте этот метод
    return intArrayOf()
}

fun main() {
    println("Введите первый массив чисел через пробел:")
    val nums1 = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    println("Введите второй массив чисел через пробел:")
    val nums2 = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    val result = intersect(nums1, nums2)
    println("Пересечение: [${result.joinToString(", ")}]")
}
