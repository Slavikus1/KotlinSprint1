package lesson4

const val FAVORABLE_SUNNY_WEATHER = true
const val TENT_OPENNESS = true
const val FAVORABLE_AIR_HUMIDITY = 20
const val FAVORABLE_SEASON = "не зима"


fun main() {
    val isSunnyWeather = true
    val isTentOpen = true
    val currentAirHumidity = 20
    val currentSeason = "зима"

    val isGoodConditionsForBeans = isSunnyWeather == FAVORABLE_SUNNY_WEATHER &&
            isTentOpen == TENT_OPENNESS &&
            currentAirHumidity == FAVORABLE_AIR_HUMIDITY &&
            currentSeason == FAVORABLE_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $isGoodConditionsForBeans")
}