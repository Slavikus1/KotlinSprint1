package lesson16

class User(
    val login: String = "Dima01",
    private val password: String = "Falcone12345",
) {
    fun validatePassword(): Boolean {
        println("Введите пароль:")
        val enter = readln()
        return enter == password
    }
}

fun main() {
    val max = User()
    println(max.validatePassword())
}