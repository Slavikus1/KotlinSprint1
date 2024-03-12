package lesson3

fun main() {
    val greetings = "Добрый"
    val timeDay = "день"
    val timeNight = "вечер"
    val name = "Петр"
    var screen = "$greetings $timeDay, $name!"
    println(screen)
    screen = "$greetings $timeNight, $name!"
    println(screen)
}