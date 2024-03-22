package lesson6

fun main() {
    println("Добро пожаловать в таймер! Введите количество секунд, которые нужно засечь:")
    var seconds = readln().toInt()

    while (seconds > -1) {
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}