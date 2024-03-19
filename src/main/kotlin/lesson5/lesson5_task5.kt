package lesson5

import kotlin.random.Random

fun main() {
    val randomA = Random.nextInt(from = 0, until = 42)
    val randomB = Random.nextInt(from = 0, until = 42)
    val randomC = Random.nextInt(from = 0, until = 42)

    val randomList = setOf<Int>(randomA, randomB, randomC)

    println("Введите первое число:")
    val numberA = readln().toInt()

    println("Введите второе число:")
    val numberB = readln().toInt()

    println("Введите третье число:")
    val numberC = readln().toInt()

    val numbersList = setOf<Int>(numberA, numberB, numberC)

    val result = randomList.intersect(numbersList)
    val numberOfCoincidence = result.size

    when (numberOfCoincidence) {
        1 -> println("Вы выиграли утешительный приз!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        3 -> println("JACKPOT!!!CONGRATULATIONS!")
        else -> println("Вы не угадали ни одного числа.")
    }

    println("Выигрышные числа $randomA, $randomB, $randomC!")
}