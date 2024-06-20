package lesson16

import kotlin.random.Random

class Dice(){
    private val number = Random.nextInt(from = 1, until = 6)
    fun rollTheDice(){
        println("на кубике выпало $number")
    }
}

fun main(){
    val dice = Dice()
    dice.rollTheDice()
}