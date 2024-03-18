package lesson5

fun main() {
    val rightFirstNumber = 7
    val rightSecondNumber = 21

    println("Выберите случайное число от 0 до 42:")

    val firstChoosen = readln().toInt()

    println("Выберите случайное число от 0 до 42:")

    val secondChoosen = readln().toInt()

    when {
        (firstChoosen == rightFirstNumber) &&
                (secondChoosen == rightSecondNumber) -> println("Поздравляем! Вы выиграли главный приз!")

        (firstChoosen == rightFirstNumber) ||
                (secondChoosen == rightSecondNumber) -> println("Вы выиграли утешительный приз!")

        else -> println("Неудача!")
    }
    println("Выигрышные числа: $rightFirstNumber & $rightSecondNumber")
}