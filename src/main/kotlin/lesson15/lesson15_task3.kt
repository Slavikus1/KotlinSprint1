package lesson15

abstract class User {
    abstract val nickname: String
    fun writeMessage() {
        val message = readln()
        println(message)
    }
}

class CommonUser(override val nickname: String) : User()

class Administrator(override val nickname: String) : User() {

    fun deleteUser(user: User) {
        println("$nickname удалил пользователя $user")
    }

    fun deleteMessage() {
        println("Администратор удалил сообщение")
    }
}