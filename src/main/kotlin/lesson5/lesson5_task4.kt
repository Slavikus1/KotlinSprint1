package lesson5

const val REGISTRATED_LOGIN = "Zaphod"
const val REGISTRATED_PASSWORD = "PanGalactic"

fun main() {
    println(
        """
    |Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold".
     |[вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.
      |Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь.
       |[вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные..:
    """.trimMargin()
    )

    val enteredLogin = readln()
    if (enteredLogin == REGISTRATED_LOGIN) {
        println("Здравствуйте, $REGISTRATED_LOGIN! Введите ваш пароль:")

        val enteredPassword = readln()

        if (enteredPassword == REGISTRATED_PASSWORD) {
            println("Добро пожаловать на борт!")
        } else {
            println("Введен неверный пароль.")
            return
        }
        println(
            """
        |[вздыхает...] Ваши данные проверены, и о, чудо, они верны...
         |Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold". Хотя мне всё равно...
          |Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...]
           |Надеюсь, вам понравится пребывание здесь больше, чем мне.
        """.trimMargin()
        )
    } else {
        println("Указаного пользователя нет в базе данных. Пожалуйста, зарегистрируйтесь!")
    }
}