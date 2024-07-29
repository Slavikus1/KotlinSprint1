package lesson19

enum class Cartridge(val power: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank() {
    var currentPatron: Cartridge? = null
    fun recharge(patron: Cartridge) {
        currentPatron = when (patron) {
            Cartridge.BLUE -> {
                println("Заряжаю синим патроном")
                Cartridge.BLUE
            }

            Cartridge.GREEN -> {
                println("Заряжаю зеленым патроном")
                Cartridge.GREEN
            }

            Cartridge.RED -> {
                println("Заряжаю красным патроном")
                Cartridge.RED
            }
        }
    }

    fun makeShot() {
        println("Танк выстрелил ${currentPatron?.name} патроном и нанес ${currentPatron?.power} урона.")
    }
}

fun main() {
    val t34 = Tank()
    t34.recharge(Cartridge.GREEN)
    t34.makeShot()
    t34.recharge(Cartridge.RED)
    t34.makeShot()
    t34.recharge(Cartridge.BLUE)
    t34.makeShot()
}