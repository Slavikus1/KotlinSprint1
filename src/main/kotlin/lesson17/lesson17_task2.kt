package lesson17

class Ship(
    n: String,
    s: Double,
    p: String,

    ) {
    var name: String = n
        set(value) {
            if (value != name) println("Нельзя переименовать корабль!") else println("Такое имя уже установлено")
            field = name
        }
    val averageSpeed: Double = s
    val port: String = p
}

fun main() {
    val titanic = Ship("Titanic", 100.0, "London")
    titanic.name = "Otto"
    println(titanic.name)
}