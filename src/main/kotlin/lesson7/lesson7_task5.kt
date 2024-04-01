package lesson7

import kotlin.random.Random

fun main() {
    println("Введите число (не меньше 6), которое будет являться длинной пароля:")
    val minPasswordLength = 6
    var userPasswordSize = readln().toInt()
    while (userPasswordSize < minPasswordLength) {
        println("Пароль должен быть не меньше 6 символов. Введите ваше число:")
        userPasswordSize = readln().toInt()
    }

    val chars = 'a'..'z'
    val upperChars = 'A'..'Z'
    val numbers = 0..9
    val allChars = chars + numbers + upperChars
    val password = mutableListOf<String>()

    password.add(chars.random().toString())
    password.add(upperChars.random().toString())
    password.add(numbers.random().toString())

    while (password.size != userPasswordSize) {
        password.add(allChars.random().toString())
    }
    password.shuffle()

    for (i in password) {
        print(i)
    }
}