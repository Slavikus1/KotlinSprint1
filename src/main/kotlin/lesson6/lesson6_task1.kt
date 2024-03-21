package lesson6

fun main() {
    println("Для регистрации нового аккаунта придумайте логин:")
    val regLogin = readln()

    println("Теперь придумайте пароль:")
    val regPassword = readln()

    println("Введите ваши данные для входа. Логин:")
    var enteredLogin = readln()

    println("Пароль:")
    var enteredPassword = readln()

    while (enteredLogin != regLogin || enteredPassword != regPassword) {
        println("Введите корректные данные! Логин:")
        enteredLogin = readln()
        println("Пароль:")
        enteredPassword = readln()
    }
    println("Авторизация прошла успешно!")
}