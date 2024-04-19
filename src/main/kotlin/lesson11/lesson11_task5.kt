package lesson11

class ForumMember(
    val memberId: Int,
    val memberName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum(){
    private val allMessages = mutableListOf<ForumMessage>()
    private val allMembers = mutableListOf<ForumMember>()
    private var idCounter = 0

    fun createNewMember(userName: String): ForumMember {
        val newUser = ForumMember(idCounter++, userName)
        allMembers.add(newUser)
        return newUser
    }

    fun createNewMessage(authorId: Int, theMessage: String): ForumMessage?{
        val idToFind = allMembers.find { it.memberId == authorId }
        return if (idToFind != null){
            val message = ForumMessage(authorId, theMessage)
            allMessages.add(message)
            message
        } else null
    }

    fun printThread (){
        allMessages.forEach { message -> val author = allMembers.find { it.memberId == message.authorId }
            author?.let { println("${author.memberName}: ${message.message}") }
        }
    }

}

fun main(){
    val forum = Forum()
    val dima = forum.createNewMember("Dima")
    val sasha = forum.createNewMember("Sasha")

    forum.createNewMessage(dima.memberId,"hi")
    forum.createNewMessage(sasha.memberId,"Hi, Dima")
    forum.createNewMessage(dima.memberId,"How are you, Sasha?")
    forum.createNewMessage(sasha.memberId,"Fine")

    forum.printThread()
}