package lesson16

import kotlin.math.pow
import kotlin.math.sqrt

open class Circle (
    private val pi: Double = 3.14,
    protected val radius: Double,
){
    fun calculateArea(){
        println("Площадь равна ${pi * radius.pow(2)}")
    }

    fun calculateCircumference(){
        println("Длина окружности равна ${2 * pi * radius}")
    }

}

fun main(){
    val cirlce = Circle(radius = 5.5)
    cirlce.calculateArea()
    cirlce.calculateCircumference()
}