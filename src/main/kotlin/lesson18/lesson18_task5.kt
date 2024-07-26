package lesson18

class Screen {
    fun draw(shape: Dot) {
        println("Рисуем точку с координатами  ${shape.centerX}, ${shape.centerY}")
    }

    fun draw(shape: Square) {
        println("Рисуем квадрат с координатами ${shape.centerX}, ${shape.centerY}")
    }

    fun draw(shape: Circle) {
        println("Рисуем круг с координатами ${shape.centerX}, ${shape.centerY}")
    }
}

open class Shape() {}

class Dot(val centerX: Float, val centerY: Float) : Shape() {
    constructor(centerX: Int, centerY: Int) : this(centerX.toFloat(), centerY.toFloat())
}

class Square(val centerX: Float, val centerY: Float) : Shape() {
    constructor(centerX: Int, centerY: Int) : this(centerX.toFloat(), centerY.toFloat())
}

class Circle(val centerX: Float, val centerY: Float) : Shape() {
    constructor(centerX: Int, centerY: Int) : this(centerX.toFloat(), centerY.toFloat())
}

fun main() {
    val screen = Screen()

    val a = Dot(5.0f, 4.0f)
    val b = Dot(4, 4)

    val c = Square(2.0f, 3.0f)
    val d = Square(2, 2)

    val e = Circle(3.3f, 2.2f)
    val f = Circle(2, 2)

    screen.draw(a)
    println()
    screen.draw(b)
    println()
    screen.draw(c)
    println()
    screen.draw(d)
    println()
    screen.draw(e)
    println()
    screen.draw(f)

}