package lesson20

class Player(
    val name: String,
    var currentHP: Int,
    val maxHP: Int = 100,
) {}

fun main() {
    val healingPoison: (Player) -> Unit = { it: Player -> it.currentHP = it.maxHP }
    val hulk = Player("Bruce", 60)
    println(hulk.currentHP)
    healingPoison(hulk)
    println(hulk.currentHP)
}