package lesson19

enum class Cartridge(val power: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank() {
    lateinit var currentPatron: Cartridge
    fun recharge(patron: String) {
        when (patron.toUpperCase()) {
            "BLUE" -> currentPatron = Cartridge.BLUE
            "GREEN" -> currentPatron = Cartridge.GREEN
            "RED" -> currentPatron = Cartridge.RED
            else -> println("Такого вида патронов нет!")
        }
    }

    fun makeShot() {
        println("Танк выстрелил ${currentPatron.name} патроном и нанес ${currentPatron.power} урона.")
    }
}

fun main() {
    val t34 = Tank()
    t34.recharge("green")
    t34.makeShot()
    t34.recharge("red")
    t34.makeShot()
    t34.recharge("blue")
    t34.makeShot()




}