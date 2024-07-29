package lesson18

abstract class Dice {
    abstract val sides: Int
    open fun rollTheDice() {}
}

class FourSideDice: Dice() {
    override val sides: Int = 4
    override fun rollTheDice() {
        println("На кубике с четырьмя гранями выпало число ")
    }
}

class SixSideDice : Dice() {
    override val sides: Int = 6
    override fun rollTheDice() {
        println("На кубике с шестью гранями выпало число ")
    }
}

class EightSideDice: Dice() {
    fun IntRange.random(){
        val range = 1..sides
    }
    override val sides: Int = 8
    override fun rollTheDice() {
        println("На кубике c восьмью гранями выпало число")
    }
}

fun main() {
    val dice1 = FourSideDice()
    val dice2 = SixSideDice()
    val dice3 = EightSideDice()

    val diceList: List<Dice> = listOf(dice1, dice2, dice3)
    diceList.forEach { it.rollTheDice() }
}
