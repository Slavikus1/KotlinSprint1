package lesson15

abstract class User {
    abstract val nickname: String
    abstract fun writeMessage()

}

class CommonUser(override val nickname: String) : User() {
    override fun writeMessage() {
        val message = readln()
        println(message)
    }
}

class Administrator(override val nickname: String) : User() {
    override fun writeMessage() {
        val message = readln()
        println(message)
    }

    fun deleteUser(user: User) {
        println("$nickname удалил пользователя $user")
    }

    fun deleteMessage() {
        println("Администратор удалил сообщение")
    }
}