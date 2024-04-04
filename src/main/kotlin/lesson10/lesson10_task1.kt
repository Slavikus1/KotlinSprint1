package lesson10

import kotlin.random.Random

fun main() {
    val humanResult = rollTheDice()
    println("Человек выбросил $humanResult")

    val machineResult = rollTheDice()
    println("Машина выбросила $machineResult")

    if (humanResult > machineResult) println("Победило человечество")
    else if (machineResult > humanResult) println("Победили машины")
    else println("Ничья!")

}

fun rollTheDice(): Int {
    return Random.nextInt(1, 6)
}