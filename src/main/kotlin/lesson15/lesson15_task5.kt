package lesson15

interface Vehicle {
    fun move()
}

interface CargoCarrier {
    val maxCargo: Int

    var currentCargo: Int

    fun loadCargo(weight: Int)

    fun unloadCargo(weight: Int)
}

interface PassengerCarrier {
    val maxPassengers: Int

    var currentPassengers: Int

    fun loadPassenger(number: Int)

    fun unloadPassenger(number: Int)
}

class CargoCar(override val maxPassengers: Int = 1, override val maxCargo: Int = 2) : CargoCarrier, PassengerCarrier,
    Vehicle {
    override var currentPassengers: Int = 0
    override var currentCargo: Int = 0

    override fun move() {
        println("Завожу двигатель грузовика и еду")
    }

    override fun loadCargo(weight: Int) {
        if (weight + currentCargo <= maxCargo && weight > 0) {
            println("Загрузил $weight тонны груза")
            currentCargo += weight
        } else println("Невозможно загрузить столько груза")
    }

    override fun unloadCargo(weight: Int) {
        if (weight in 0..currentCargo) {
            println("Выгрузил $weight тонны груза")
            currentCargo -= weight
        } else println("Невозможно выгрузить столько груза")
    }

    override fun loadPassenger(number: Int) {
        if (number + currentPassengers <= maxPassengers && number > 0) {
            println("Загрузил $number пассажира")
            currentPassengers += number
        } else println("Невозможно загрузить столько пассажиров")
    }

    override fun unloadPassenger(number: Int) {
        if (number in 1..currentPassengers) {
            println("Выгрузил $number пассажира")
            currentPassengers -= number
        } else println("Невозможно выгрузить столько пассажиров")
    }
}

class PassengerCar(override val maxPassengers: Int = 3) : PassengerCarrier, Vehicle {
    override var currentPassengers: Int = 0

    override fun loadPassenger(number: Int) {
        if (number + currentPassengers <= maxPassengers && number > 0) {
            println("Загрузил $number пассажира")
            currentPassengers += number
        } else println("Невозможно загрузить столько пассажиров")
    }

    override fun unloadPassenger(number: Int) {
        if (number in 1..currentPassengers) {
            println("Выгрузил $number пассажира")
            currentPassengers -= number
        } else println("Невозможно выгрузить столько пассажиров")
    }

    override fun move() {
        println("Завожу мотор и еду")
    }

}

fun main(){
    val toyota = PassengerCar()
    val nissan = PassengerCar()
    val kamaz = CargoCar()

    toyota.loadPassenger(3)
    nissan.loadPassenger(2)
    kamaz.loadPassenger(1)
    kamaz.loadCargo(2)

    println()

    println("Кол-во пассажиров в тойоте - ${toyota.currentPassengers}")
    println("Кол-во пассажиров в ниссане - ${nissan.currentPassengers}")
    println("Кол-во пассажиров в камазе - ${kamaz.currentPassengers}")
    println("Кол-во груза в камазе - ${kamaz.currentCargo}")

    println()

    toyota.move()
    nissan.move()
    kamaz.move()

    println()

    toyota.unloadPassenger(3)
    nissan.unloadPassenger(2)
    kamaz.unloadPassenger(1)
    kamaz.unloadCargo(2)

    println()

    println("Кол-во пассажиров в тойоте - ${toyota.currentPassengers}")
    println("Кол-во пассажиров в ниссане - ${nissan.currentPassengers}")
    println("Кол-во пассажиров в камазе - ${kamaz.currentPassengers}")
    println("Кол-во груза в камазе - ${kamaz.currentCargo}")
}
