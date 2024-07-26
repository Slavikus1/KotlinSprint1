package lesson18

import kotlin.math.pow
import kotlin.math.sqrt

open class Box {
    open fun getBoxArea() = 0
}

class RectangleBox(
    private val height: Int,
    private val width: Int,
    private val length: Int,
) : Box() {
    override fun getBoxArea(): Int {
        return 2 * ((height * width) + (width * length) + (height * length))
    }
}

class CubeBox(
    private val ribLength: Int
) : Box() {
    override fun getBoxArea(): Int {
        return 6 * (ribLength.toDouble().pow(2).toInt())
    }
}

fun main() {
    val box1 = RectangleBox(5, 3, 2)
    val box2 = CubeBox(5)
    val listOfBoxes: List<Box> = listOf(box1, box2)
    listOfBoxes.forEach { println(it.getBoxArea()) }
}