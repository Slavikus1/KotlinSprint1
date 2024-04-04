package lesson10

import kotlin.system.exitProcess

const val MIN_DATA_RANGE = 4

fun main() {
    val login = getLogin()
    val password = getPassword()

    checkStringLength(login!!, password!!)

    println("Welcome $login")
}

fun getLogin(): String? {
    println("Придумайте логин:")
    return readlnOrNull()
}

fun getPassword(): String? {
    println("Придумайте пароль:")
    return readlnOrNull()
}

fun checkStringLength(login: String, password: String) {
    if (login.length < MIN_DATA_RANGE || password.length < MIN_DATA_RANGE) {
        println("Логин или пароль недостаточно длинные")
        exitProcess(1)
    }

}