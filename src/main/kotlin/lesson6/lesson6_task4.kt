package lesson6

import kotlin.random.Random

fun main() {
    val number = Random.nextInt(1, 9)
    var attempts = 5

    println("Добро пожаловать в игру! Угадай число от 1 до 9. У тебя есть $attempts попыток")

    while (attempts > 0) {
        println("Введи число: ")
        val trying = readln().toInt()

        if (trying == number) {
            println("Это была великолепная игра!")
            return
        } else if (trying != number) {
            println("Неверно! Осталось попыток ${--attempts}")
        }

    }
    println("Было загадано число $number")
}

