package com.kruzhok.day_1.kotlin_101.individual

/*
Два числа, дающие сумму:

Задача: Дан массив чисел nums и целевое число target.
Верните индексы двух чисел, сумма которых равна target.
Вы можете предположить, что у вас есть только одно решение и вы не будете использовать один и тот же элемент дважды.

Пример:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
*/

fun twoSum(nums: IntArray, target: Int): IntArray {
    // TODO: Реализуйте этот метод
    return intArrayOf()
}

fun main() {
    println("Введите числа через пробел:")
    val nums = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    println("Введите цель:")
    val target = readLine()!!.toInt()

    val result = twoSum(nums, target)
    println("Индексы: [${result.joinToString(", ")}]")
}


