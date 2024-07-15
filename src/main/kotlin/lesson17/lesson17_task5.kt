package lesson17

class User(
    login: String,
    password: String,
) {
    var userLogin = login
        set(value) {
            field = value
            println("Пароль успешно изменен.")
        }
    var userPassword = password
        get() = field.replace(field, "*".repeat(field.length))
        set(value) {
            if (value != userPassword) println("Вы не можете изменить пароль.")
            else println("Такое имя уже установлено")
            field = userPassword
        }
}

fun main() {
    val slava = User("Slavikus", "123321")
    println(slava.userPassword)
    slava.userLogin = "Cr7TheBest"
}