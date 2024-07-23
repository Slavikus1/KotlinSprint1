package lesson18

class Screen {
    fun draw(shape: Dot) {
        println("Рисуем точку с координатами  ${shape.centerX}, ${shape.centerY}" )
    }
    fun draw(shape: Dot) {
        println("Рисуем точку с координатами ${shape.centerX.toInt()}, ${shape.centerY.toInt()}" )
    }
}

open class Shape() {}

class Dot(val centerX: Float, val centerY: Float) : Shape() {
    constructor(centerX: Int, centerY: Int) : this (centerX.toFloat(), centerY.toFloat())
}

class Square(val centerX: Float, val centerY: Float) : Shape() {
    constructor(centerX: Int, centerY: Int) : this (centerX.toFloat(), centerY.toFloat())
}

class Circle(val centerX: Float, val centerY: Float) : Shape() {
    constructor(centerX: Int, centerY: Int) : this (centerX.toFloat(), centerY.toFloat())
}

fun main(){
    val dot = Dot(2,2)
}