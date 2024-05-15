package lesson14

class Chat(
    val messages: MutableList<Message> = mutableListOf(),
) {
    fun addMessage(messageText: String, messageAuthor: String) {
        messages.add(Message(messageText, messageAuthor, messageId = messages.size))
    }

    fun addThreadMessage(messageText: String, messageAuthor: String, parentMessageId: Int = messages.size) {
        messages.add(ChildMessage(messageText, messageAuthor, messages.size, parentMessageId - 1))
    }

    fun printChat() {
        val groupById = messages.groupBy {it.messageId}
    }
}

open class Message(val text: String, val author: String, var messageId: Int)

class ChildMessage(text: String, author: String, messageId: Int, val parentMessageId: Int) :
    Message(text, author, messageId)

fun main() {
    val chat = Chat()
    chat.addMessage("Всем здарова народ! Какие планы на майские?", "Паша")
    chat.addThreadMessage("Здарова, братик. Я на шашлыки", "Митя")
    chat.addMessage("Как проехать в галерею?", "Эмиль")
    chat.addThreadMessage("на 10-ке", "Костя")

    chat.messages.forEach { println(it.messageId) }

    chat.printChat()
}