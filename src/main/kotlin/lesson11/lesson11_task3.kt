package lesson11

class Room(
    val cover: String,
    val name: String,
    val listOfMembers: MutableList<Member>,

    ) {
    fun addNewMember(newMember: Member) {
        listOfMembers.add(newMember)
    }

    fun updateStatus(username: Member, newStatus: String) {
        val name = username.nickname
        val memberToFind = listOfMembers.find { it.nickname == name }
        if (memberToFind != null) {
            memberToFind.status = newStatus
            println("Пользователь $name теперь имеет статус $newStatus")
        } else println("Пользователь $name не найден")
    }

    fun showInfo(avatar: Member) {
        val minSec = 3
        println("Нажмите на ${avatar.avatar} и удерживайте $minSec сек, чтобы получить инфо. Сколько секунд удерживаете?")
        var answer = readln().toInt()
        while (answer < minSec) {
            Thread.sleep(answer.toLong())
            println("Удерживайте не меньше трех секунд")
            println("Сколько секунд удерживаете?")
            answer = readln().toInt()
            if (answer >= minSec) break
        }
        println(avatar.nickname)
    }

}

class Member(
    val avatar: String,
    val nickname: String,
    var status: String,
)

fun main() {
    val dima = Member("Statham", "Dima21", "Микрофон выключен")
    val vasya = Member("Stallone", "Vasyok321", "Разговаривает")
    val sveta = Member("Svetka v Gelendzhe", "_Svetaaaa_", "Пользователь заглушен")

    val room1 = Room("yellow, black and whilte", "MusicRoom", mutableListOf(dima, vasya))

    println(room1.listOfMembers.size)

    room1.addNewMember(sveta)

    println(room1.listOfMembers.size)

    room1.showInfo(dima)

    println(vasya.status)

    room1.updateStatus(vasya, "Микрофон выключен")

    println(vasya.status)

}