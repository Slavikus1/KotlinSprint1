package lesson11

class User(
    val login: String,
    val password: String,
    val email: String,
    val uniqueId: String,
)

fun main() {
    val kolya = User("Kolya2", "123321", "kolya@mail.ru", "999")
    println(kolya.login)
    println(kolya.email)
    println(kolya.password)
    println(kolya.uniqueId)

    println()

    val petya = User("petr1", "321123", "petrfirst@mail.ru", "321")
    println(petya.login)
    println(petya.email)
    println(petya.password)
    println(petya.uniqueId)
}