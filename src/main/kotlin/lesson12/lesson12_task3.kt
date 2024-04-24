package lesson12

const val KELVIN = 273

class MyWeather(
    _dayTemp: Int,
    _nightTemp: Int,
    _isPrecipitation: Boolean,
) {
    var dayTemp = _dayTemp - KELVIN
    var nightTemp = _nightTemp - KELVIN
    var isPrecipitation = _isPrecipitation

    fun showInfo() {
        println("Дневная темпертаура - $dayTemp, ночная температура - $nightTemp, осадки - $isPrecipitation")
    }
}

fun main() {
    val newDay = MyWeather(5, 0, false)
    newDay.showInfo()
}