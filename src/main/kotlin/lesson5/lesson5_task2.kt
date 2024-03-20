package lesson5

const val AGE_OF_MAJORITY = 18

fun main() {

    println("Введите ваш год рождения:")

    val age = readln().toInt()
    val currentYear = 2024

    when {
        (currentYear - age >= AGE_OF_MAJORITY) -> println("Показать экран со скрытым контентом")
        else -> println("Контент недоступен")
    }
}