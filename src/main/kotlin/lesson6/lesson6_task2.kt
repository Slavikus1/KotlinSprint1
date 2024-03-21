package lesson6

fun main() {
    println("Добро пожаловать в таймер! Введите количество секунд, которые нужно засечь:")
    var seconds = readln().toInt()
    var resultSave = seconds

    while (seconds > 0) {
        println(seconds--)
        Thread.sleep(1000)
    }
    println("Прошло $resultSave секунд.")
}