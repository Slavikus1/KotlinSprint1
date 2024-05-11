package lesson14

class Chat(
    private val messages: MutableList<Message> = mutableListOf(),
    private val childMessages: MutableList<ChildMessage> = mutableListOf(),
) {
    fun addMessage(messageText: String, messageAuthor: String) {
        messages.add(Message(messageText, messageAuthor, messageId = ))
    }

    fun addThreadMessage(parentMessageId: Int) {}

    fun printChat() {}
}

open class Message(val text: String, val author: String, var messageId: Int)

class ChildMessage(text: String, author: String, childMessageId: Int, val parentMessageId: Int) :
    Message(text, author, messageId = childMessageId)