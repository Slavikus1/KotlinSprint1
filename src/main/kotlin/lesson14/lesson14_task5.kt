package lesson14

class Chat(
    val messages: MutableList<Message> = mutableListOf(),
) {
    fun addMessage(messageText: String, messageAuthor: String) {
        messages.add(Message(messageText, messageAuthor, messageId = messages.size))
    }

    fun addThreadMessage(messageText: String, messageAuthor: String, parentMessageId: Int) {
        messages.add(ChildMessage(messageText, messageAuthor, messages.size, parentMessageId))
    }

    fun printChat() {

       val groupMessages = messages.groupBy {
            if (it is ChildMessage) {
                it.parentMessageId
            } else it.messageId
        }
        groupMessages.forEach { println() }
    }
}

open class Message(val text: String, val author: String, var messageId: Int)

class ChildMessage(text: String, author: String, messageId: Int, val parentMessageId: Int) :
    Message(text, author, messageId)

fun main() {
    val chat = Chat()
    chat.addMessage("Всем здарова народ! Какие планы на майские?", "Паша")
    chat.addThreadMessage("Здарова, братик. Я на шашлыки", "Митя", 0)
    chat.addMessage("Как проехать в галерею?", "Эмиль")
    chat.addThreadMessage("на 10-ке", "Костя", 1)
    chat.addThreadMessage("я к родителям", "Коля", 0)

    chat.printChat()
}