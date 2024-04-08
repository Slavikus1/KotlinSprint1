package lesson11

class User2(
    val login: String,
    var password: String,
    val email: String,
    val uniqueId: String,
    var bio: String = "",
) {
    fun showInfo() {
        println(
            """
            Информация о пользователе:
            login - $login
            password - $password
            email - $email
            uniqueId - $uniqueId
            
        """.trimIndent()
        )
    }

    fun fillUserBio() {
        println("Введите текст:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        val enteredPassword = readln()
        if (enteredPassword == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменен")
        }
    }
}

fun main() {
    val me = User2("mecool", "me123321", "me@mail.ru", "9090")
    me.changePassword()
    println()
    me.showInfo()
}