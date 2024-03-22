package lesson6

import kotlin.random.Random

fun main() {
    var int1 = Random.nextInt(1, 9)
    var int2 = Random.nextInt(1, 9)
    var attempts = 3

    do {
        println("Докажите что вы не бот! Сложите $int1 и $int2:")
        val result = readln().toInt()

        if (result == (int1 + int2)) {
            println("Добро пожаловать!")
            return
        } else {
            int1 = Random.nextInt(1, 9)
            int2 = Random.nextInt(1, 9)
            attempts--
        }
    } while (attempts > 0)
    println("Доступ запрещен!")
}