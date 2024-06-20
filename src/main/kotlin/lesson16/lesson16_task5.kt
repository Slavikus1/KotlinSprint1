package lesson16

import kotlin.random.Random

class Player(
    name: String,
    private var health: Int = 100,
    private var punchPower: Int = 25,
) {

    fun getDamage() {
        val damage = Random.nextInt(from = 10, until = 40)
        if (health in 1..100) {
            println("Вы получили урон = $damage")
            health -= damage
            if (health <= 0) getDead()
        } else if (health <= 0) {
            println("Невозможно получить больше урона")
        }
    }

    private fun getDead() {
        println("Ваш персонаж погиб")
        health = 0
        punchPower = 0
    }

    fun getHeal() {
        val healing = Random.nextInt(from = 10, until = 40)
        if (health in 1..99) {
            println("Вы получили лечение = $healing")
            health += healing
            if (health >= 100) {
                health = 100
                println("Здоровье полное.")
            }
        } else {
            println("Лечение невозможно.")
        }
    }
}

fun main() {
    val alex = Player("Alex")
    alex.getDamage()
    alex.getDamage()
    alex.getHeal()
    alex.getHeal()
    alex.getHeal()
    alex.getDamage()
    alex.getDamage()
    alex.getDamage()
    alex.getDamage()
    alex.getDamage()
    alex.getDamage()
}