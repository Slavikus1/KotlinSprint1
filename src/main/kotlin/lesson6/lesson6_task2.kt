package lesson6

fun main() {
    println("Добро пожаловать в таймер! Введите количество секунд, которые нужно засечь:")
    var seconds = readln().toInt()
    var resultSave = seconds
    var delay = seconds * 1000

    Thread.sleep(delay.toLong())

    println("Прошло $resultSave секунд.")
}