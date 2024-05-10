package lesson14

import kotlin.math.pow
import kotlin.math.sqrt

abstract class Figure(
    val color: String,
) {
    abstract fun calculatePerimeter(): Int

    abstract fun calculateArea(): Int
}

class Circle(
    color: String,
    private val radius: Int,
) : Figure(color) {
    override fun calculateArea(): Int {
        return 3 * radius.toDouble().pow(2).toInt()
    }

    override fun calculatePerimeter(): Int {
        return 2 * (radius * 3)
    }
}

class Triangle(
    color: String,
    private val width: Int,
    private val height: Int,
) : Figure(color) {
    override fun calculatePerimeter(): Int {
        val thirdSide = sqrt((width.toDouble().pow(2)) + (height.toDouble().pow(2))).toInt()
        return width + height + thirdSide
    }

    override fun calculateArea(): Int {
        return (width * height) / 2
    }
}

fun main() {
    val aTriangle = Triangle("белый", 5, 7)
    val bTriangle = Triangle("черный", 6, 8)
    val aCircle = Circle("белый", 10)
    val bCircle = Circle("черный", 20)

    val list = listOf(aCircle, bCircle, aTriangle, bTriangle)
    val whiteList = list.filter { it.color == "белый" }.sumBy { it.calculateArea() }
    val blackList = list.filter { it.color == "черный" }.sumBy { it.calculatePerimeter() }

    println(whiteList)
    println(blackList)


}

