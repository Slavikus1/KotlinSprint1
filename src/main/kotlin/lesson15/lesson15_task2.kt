package lesson15

abstract class WeatherStationStats() {
    abstract val data: Int
    abstract fun printInfo()
}

class Temperature(override var data: Int) : WeatherStationStats() {
    override fun printInfo() {
        println("Температура сегодня - $data")
    }

}

class PrecipitationAmount(override val data: Int) : WeatherStationStats() {
    override fun printInfo() {
        println("Осадки сегодня - $data")
    }
}

class WeatherServer(val data: WeatherStationStats) {
    fun pushDataOnServer() {
        when (data) {
            is Temperature -> println("Температура сегодня - $data")
            is PrecipitationAmount -> println("Осадки сегодня - $data")
            else -> println("Неизвестный тип данных.")
        }
    }
}

fun main() {
    val precipitationMonday = PrecipitationAmount(10)
    val temperatureMonday = Temperature(20)
    val serverMonday = WeatherServer(temperatureMonday)
    serverMonday.pushDataOnServer()

}