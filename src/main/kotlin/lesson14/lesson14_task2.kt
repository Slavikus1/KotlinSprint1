package lesson14

open class NewLiner(
    val speed: Int = 150,
    val liftingCapacity: Int = 200,
    val menCapacity: Int = 1000,
) {
    open fun startEngine() {
        println("двигатель лайнера запущен, корабль готов к плаванию")
    }

    open fun loadShipment() {
        println("лайнер выдвигает горизонтальный трап со шкафута")
    }
}

class NewIceBreaker(
    speed: Int = 50,
    liftingCapacity: Int = 150,
    menCapacity: Int = 250,
) : NewLiner(speed, liftingCapacity, menCapacity) {
    override fun startEngine() {
        println("двигатель ледокола запущен, корабль готов к плаванию")
    }

    override fun loadShipment() {
        println("ледокол открывает ворота со стороны кормы")
    }
}

class NewCargoShip(
    speed: Int = 100,
    liftingCapacity: Int = 1000,
    menCapacity: Int = 200,
) : NewLiner(speed, liftingCapacity, menCapacity) {
    override fun startEngine() {
        println("двигатель грузового корабля запущен, корабль готов к плаванию")
    }

    override fun loadShipment() {
        println("грузовой корабль активирует погрузочный кран")
    }
}

fun main(){
    val cargo = NewCargoShip()
    val icebreaker = NewIceBreaker()
    val liner = NewLiner()
    cargo.loadShipment()
    icebreaker.loadShipment()
    liner.loadShipment()
}