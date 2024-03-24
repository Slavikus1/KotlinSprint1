package lesson7

fun main() {
    val rangeNumbers = 1000..9999

    do {
        val result = rangeNumbers.random().toString()
        println(
            """
            Ваш код авторизации $result
            Введите код чтобы авторизоваться:
        """.trimIndent()
        )
        val enteredCode = readln().toString()
        if (enteredCode != result) {
            println("Неверно! Попробуйте еще раз.")
        }
    } while (enteredCode != result)
    println("Добро пожаловать!")
}