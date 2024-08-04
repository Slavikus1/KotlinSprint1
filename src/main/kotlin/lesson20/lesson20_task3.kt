package lesson20

class Player(
    val name: String,
    val keyExistance: Boolean,
)

fun main() {
    val user = Player("Nick", false);
    { it: Player -> if (user.keyExistance) println("Игрок открыл дверь") else println("Дверь заперта") }(user)
}