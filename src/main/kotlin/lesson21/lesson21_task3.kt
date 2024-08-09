package lesson21

class NewPlayer(
    val name: String,
    val currentHP: Int,
    val maxHP: Int = 100,
)

fun NewPlayer.isHealthy(player: NewPlayer): Boolean {
    return (player.currentHP == maxHP)
}

fun main() {
    val captain = NewPlayer("Price", 100)
    println(captain.isHealthy(captain))
}