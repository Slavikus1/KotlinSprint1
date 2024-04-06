package lesson10

import kotlin.system.exitProcess

const val LOGIN = "Slavikus1"
const val PASSWORD = "4292xander"
const val BASKET = "наушники, часы, будильник, весы"
const val TOKEN_LENGTH = 32

fun main() {
    toGetBasket()
}

fun toLogIn(): String? {
    println("Введите логин:")
    val login = readln()

    println("Введите пароль:")
    val password = readln()


    return if (login != LOGIN || password != PASSWORD) {
        return null
    } else {
        val chars = 'a'..'z'
        val numbers = 0..9
        val allChars = chars + numbers
        var token = ""

        token += (chars.random().toString())
        token += (numbers.random().toString())
        while (token.length != TOKEN_LENGTH) {
            token += allChars.random()
        }
        token
    }
}

fun toGetBasket() {
    val token = toLogIn()
    if (token != null) println(BASKET)
    else println("Authorization failed")
}