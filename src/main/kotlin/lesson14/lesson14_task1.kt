package lesson14

open class Liner(
    val speed: Int = 150,
    val liftingCapacity: Int = 200,
    val menCapacity: Int = 1000,
) {
    open fun startEngine() {
        println("двигатель лайнера запущен, корабль готов к плаванию")
    }
}

class IceBreaker(
    speed: Int = 50,
    liftingCapacity: Int = 150,
    menCapacity: Int = 250,
) : Liner(speed, liftingCapacity, menCapacity) {
    override fun startEngine() {
        println("двигатель ледокола запущен, корабль готов к плаванию")
    }
}

class CargoShip(
    speed: Int = 100,
    liftingCapacity: Int = 1000,
    menCapacity: Int = 200,
) : Liner(speed, liftingCapacity, menCapacity) {
    override fun startEngine() {
        println("двигатель грузового корабля запущен, корабль готов к плаванию")
    }
}

fun main() {
    val avatar = Liner()
    val ivanGrozniy = IceBreaker()
    val bigShip = CargoShip()

    avatar.startEngine()
    ivanGrozniy.startEngine()
    bigShip.startEngine()
}