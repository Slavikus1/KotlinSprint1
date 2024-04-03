package lesson10

fun main() {
    usersDataCheck(login = getLogin(), password = getPassword())
}

fun getLogin(): String? {
    println("Придумайте логин:")
    return readlnOrNull()
}

fun getPassword(): String? {
    println("Придумайте пароль:")
    return readlnOrNull()
}

fun usersDataCheck(login: String?, password: String?) {
    val minDataRange = 4
    if (login != null && login.length < minDataRange) {
        println("Логин недостаточно длинный. Он должен содержать 4 символа")
        return
    } else if (password != null && password.length < minDataRange) {
        println("Пароль недостаточно длинный. Он должен содержать 4 символа")
        return
    } else println("Welcome, $login")
}