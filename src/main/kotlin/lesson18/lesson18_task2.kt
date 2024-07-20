package lesson18

import kotlin.random.Random

abstract class Dice {
    abstract val sides: Int
    open fun rollTheDice() {}
}

class FourSideDice: Dice() {
    override val sides: Int = 4
    override fun rollTheDice() {
        println("На кубике с четырьмя гранями выпало число ${Random.nextInt(from = 1, until = sides)}")
    }
}

class SixSideDice : Dice() {
    override val sides: Int = 6
    override fun rollTheDice() {
        println("На кубике с шестью гранями выпало число ${Random.nextInt(from = 1, until = sides)}")
    }
}

class EightSideDice: Dice() {
    fun IntRange.random(): Int {
        val range = 1..sides
        return start + (Math.random() * range).toInt()
    }
    override val sides: Int = 8
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
