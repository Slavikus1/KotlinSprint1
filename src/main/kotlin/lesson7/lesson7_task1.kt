package lesson7

import kotlin.random.Random

fun main() {
    val size = 1..6
    val chars = 'a'..'z'
    val numbers = 1..9
    var password: String = ""

    for (i in size) {
        password = if (i % 2 != 0) {
            (password + numbers.random().toString())
        } else {
            (password + chars.random().toString())
        }
    }
    println(password)
}

