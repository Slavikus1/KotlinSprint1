package lesson18

import kotlin.random.Random

open class Dice {
    open fun rollTheDice() {}
}

class FourSideDice(
    private val sides: Int = 4,
) : Dice() {
    override fun rollTheDice() {
        println("На кубике с четырьмя гранями выпало число ${Random.nextInt(from = 1, until = sides)}")
    }
}

class SixSideDice(
    private val sides: Int = 4,
) : Dice() {
    override fun rollTheDice() {
        println("На кубике с шестью гранями выпало число ${Random.nextInt(from = 1, until = sides)}")
    }
}

class EightSideDice(
    private val sides: Int = 8,
) : Dice() {
    override fun rollTheDice() {
        println("На кубике c восьмью гранями выпало число ${Random.nextInt(from = 1, until = sides)}")
    }
}

fun main() {
    val dice1 = FourSideDice()
    val dice2 = SixSideDice()
    val dice3 = EightSideDice()

    val diceList: List<Dice> = listOf(dice1, dice2, dice3)
    diceList.forEach { it.rollTheDice() }
}