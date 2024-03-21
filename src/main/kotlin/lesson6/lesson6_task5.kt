package lesson6

import kotlin.random.Random

fun main() {
    var int1 = Random.nextInt(1, 9)
    var int2 = Random.nextInt(1, 9)
    var attempts = 3

    while (attempts > 0) {
        println("Требуется пройти проверку! Докажите что вы не бот - сложите $int1 и $int2:")
        var result = readln().toInt()

        if (result == (int1 + int2)) {
            println("Добро пожаловать!")
            return
        } else if (result != (int1 + int2)) {
            println("Неверно! Осталось попыток ${--attempts}")
            int1 = Random.nextInt(1, 9)
            int2 = Random.nextInt(1, 9)
            println("Попробуйте еще раз! Докажите что вы не бот - сложите $int1 и $int2:")
            result = readln().toInt()
            if (result == (int1 + int2)) {
                println("Добро пожаловать!")
                return
            } else if (result != (int1 + int2)) {
                println("Неверно! Осталось попыток ${--attempts}")
                int1 = Random.nextInt(1, 9)
                int2 = Random.nextInt(1, 9)
                println("Попробуйте еще раз! Докажите что вы не бот - сложите $int1 и $int2:")
                result = readln().toInt()
                if (result == (int1 + int2)) {
                    println("Добро пожаловать!")
                    return
                }
                else  {
                    println("Доступ запрещен")
                    return
                }
            }
        }
    }
}