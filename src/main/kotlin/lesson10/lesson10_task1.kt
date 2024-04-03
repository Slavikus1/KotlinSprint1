package lesson10

import kotlin.random.Random

fun main() {
    val humanResult = humanRollsTheDice()
    val machineResult = machineRollsTheDice()
    if (humanResult > machineResult) println("Победило человечество")
    else if (machineResult > humanResult) println("Победили машины")
    else println("Ничья!")

}

fun humanRollsTheDice(): Int {
    val result: Int = Random.nextInt(1, 6)
    println("Человек сделал бросок и кубик показал: $result")
    return result
}

fun machineRollsTheDice(): Int {
    val result: Int = Random.nextInt(1, 6)
    println("Машина сделала бросок и кубик показал: $result")
    return result
}