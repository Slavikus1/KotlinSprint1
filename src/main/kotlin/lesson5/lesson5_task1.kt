package lesson5

fun main() {
    println("Докажите что вы не бот! Введите число:")

    val numberA = readln().toInt()

    println("Введите еще одно число:")

    val numberB = readln().toInt()

    println("Сложите ваши числа и запишите реузльтат!")

    val result = readln().toInt()

    when {
        (result == (numberA + numberB)) -> println("Добро пожаловать!")
        else -> println("Доступ запрещен.")
    }
}
