package lesson7

import kotlin.random.Random

fun main() {
    println("Введите число (не меньше 6), которое будет являться длинной пароля:")
    var userPasswordSize = readln().toInt()
    val chars = 'a'..'z'
    val upperChars = 'A'..'Z'
    val numbers = 0..9
    var password = ""

    while (userPasswordSize < 6) {
        println("Пожалуйста, введите число не меньше 6:")
        userPasswordSize = readln().toInt()
    }

    while (password.length != userPasswordSize) {
        password += chars.random()
        if (password.length == userPasswordSize) {
            break
        }
        password += upperChars.random()
        if (password.length == userPasswordSize) {
            break
        }
        password += numbers.random()
        if (password.length == userPasswordSize) {
            break
        }
    }
    println("Ваш пароль: $password")
}