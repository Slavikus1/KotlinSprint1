package lesson10

import kotlin.system.exitProcess

const val MIN_DATA_RANGE = 4

fun main() {
    val login = getLogin()
    val password = getPassword()

    if (!checkLength(login) || !checkLength(password)) {
        println("Логин или пароль недостаточно длинные")
        return
    } else println("Welcome!")


    println("Welcome $login")
}

fun getLogin(): String {
    println("Придумайте логин:")
    return readln()
}

fun getPassword(): String {
    println("Придумайте пароль:")
    return readln()
}

fun checkLength(data: String): Boolean {
    return data.length >= MIN_DATA_RANGE
}