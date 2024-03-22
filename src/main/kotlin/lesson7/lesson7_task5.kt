package lesson7

import kotlin.random.Random

fun main() {
    println("Введите число (не меньше 6), которое будет являться длинной пароля:")
    var userPasswordSize = readln().toInt()
    val firstPasswordNumber = 1
    val passwordSizeRange = firstPasswordNumber..userPasswordSize

    val chars = 'a'..'z'
    var charsList = chars.random().toString()

    val upperChars = 'A'..'Z'
    var upperCharsList = upperChars.random().toString()

    val numbers = 1..9
    var numbersList = numbers.random().toString()

    var randomList = listOf(numbersList, charsList, upperCharsList)
    var password = ""

    while (userPasswordSize < 6) {
        println("Пожалуйста, введите число не меньше 6:")
        userPasswordSize = readln().toInt()
    }

    for (i in passwordSizeRange) {
        password += randomList.random()
        charsList = chars.random().toString()
        upperCharsList = upperChars.random().toString()
        numbersList = numbers.random().toString()
        randomList = listOf(charsList, upperCharsList, numbersList)
    }
    println("Ваш пароль: $password")
}