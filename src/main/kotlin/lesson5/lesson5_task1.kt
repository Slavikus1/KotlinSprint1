package lesson5

fun main() {
    println("Докажите что вы не бот! Введите число:")

    val numberA = readLine()!!.toInt()

    println("Введите еще одно число:")

    val numberB = readLine()!!.toInt()

    println("Сложите ваши числа и запишите реузльтат!")

    val result = readLine()!!.toInt()

    when {
        (result == (numberA + numberB)) -> println("Добро пожаловать!")
        else -> println("Доступ запрещен.")
    }
}
