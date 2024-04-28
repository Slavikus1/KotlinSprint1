package lesson12

import kotlin.random.Random

class MyWeather(
    var dayTemp: Int = Random.nextInt(1, 10),
    var nightTemp: Int = Random.nextInt(-10, -1),
    var isPrecipitation: Boolean = Random.nextBoolean(),
)

fun main() {
    val weatherList = mutableListOf<MyWeather>()
    val precipitationDay = mutableListOf<MyWeather>()
    val dayTemps = mutableListOf<Int>()
    val nightTemps = mutableListOf<Int>()

    for (day in 1..30) {
        val newDay = MyWeather()
        weatherList.add(newDay)
        if (newDay.isPrecipitation) {
            precipitationDay.add(newDay)
        }
        dayTemps.add(newDay.dayTemp)
        nightTemps.add(newDay.nightTemp)
    }

    fun MutableList<Int>.average(): Int {
        return if (this.isNotEmpty()) {
            this.sum() / this.size
        } else {
            return 0
        }
    }

    println(
        "Средняя дневная температура: ${dayTemps.average()}, cредняя ночная температура: ${nightTemps.average()}," +
                " количество дней с осадками: ${precipitationDay.size}"
    )
}

