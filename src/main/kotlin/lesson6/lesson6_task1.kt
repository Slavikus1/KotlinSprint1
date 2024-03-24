package lesson6

fun main() {
    println("Для регистрации нового аккаунта придумайте логин:")
    val regLogin = readln()

    println("Теперь придумайте пароль:")
    val regPassword = readln()

    do {
        println("Введите ваши данные для входа. Логин:")
        val enteredLogin = readln()

        println("Пароль:")
        val enteredPassword = readln()

    } while ((enteredLogin != regLogin) && (enteredPassword != regPassword))
    println("Welcome!")
}
