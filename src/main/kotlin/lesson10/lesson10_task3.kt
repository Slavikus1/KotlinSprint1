package lesson10

fun main() {
    println(createPassword())
}

fun createPassword(): String {
    val symbols = '!'..'/'
    val allChars = symbols + ' '
    val numbers = 0..9

    println("Укажите цифру или число для определения длины вашего пароля: ")
    val lengthOfPassword = readln().toInt()
    var password = ""
    while (password.length != lengthOfPassword) {
        if ((password.length % 2 == 0)) {
            password += numbers.random()
        } else {
            password += allChars.random()
        }
    }
    return password
}