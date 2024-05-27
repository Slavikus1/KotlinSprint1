package lesson15

abstract class User {
    abstract val nickname: String
    abstract fun writeMessage()

}

interface Admin {
    fun deleteUser(user: User)
    fun deleteMessage()
}

class CommonUser(override val nickname: String) : User() {
    override fun writeMessage() {
        val message = readln()
        println(message)
    }
}

class Administrator(override val nickname: String) : User(), Admin {
    override fun writeMessage() {
        val message = readln()
        println(message)
    }

    override fun deleteUser(user: User) {
        println("$nickname удалил пользователя $user")
    }

    override fun deleteMessage() {
        println("Администратор удалил сообщение")
    }


}