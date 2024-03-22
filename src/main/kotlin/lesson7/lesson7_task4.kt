package lesson7

fun main() {
    println("Добро пожаловать в таймер! Введите количество секунд, которое вы хотите засечь:")
    val secondsMax = readln().toInt()
    val secondsMin = 0
    val secPause = 1000L

    for (i in secondsMax downTo secondsMin) {
        println("Осталось $i секунд до конца")
        Thread.sleep(secPause)
    }
    println("Время вышло.")
}