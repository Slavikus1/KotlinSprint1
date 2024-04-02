package lesson10

const val LOGIN = "Slavikus1"
const val PASSWORD = "4292xander"
const val BASKET = "наушники, часы, будильник, весы"
const val TOKEN_LENGTH = 32

fun main() {
    getBasket()
}

fun authorization(): String? {
    val chars = 'a'..'z'
    val numbers = 0..9
    val allChars = chars + numbers
    val tokenGenerator = mutableListOf<String>()

    tokenGenerator.add(chars.random().toString())
    tokenGenerator.add(numbers.random().toString())
    while (tokenGenerator.size != TOKEN_LENGTH) {
        tokenGenerator.add(allChars.random().toString())
    }
    val token = tokenGenerator.joinToString("")

    println("Введите логин:")
    val login = readln()

    println("Введите пароль:")
    val password = readln()

    return if (login == LOGIN && password == PASSWORD) {
        token
    } else null

}

fun getBasket() {
    val token = authorization()
    if (token == null) println("Authorization failed")
    else println(BASKET)
}