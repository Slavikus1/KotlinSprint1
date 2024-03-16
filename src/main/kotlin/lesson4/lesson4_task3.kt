package lesson4

fun main() {
    val isSunnyWeather = true
    val isTentOpen = true
    val airHumidity = 20
    val season = "зима"

    val isGoodConditionsForBeans = isSunnyWeather == true && isTentOpen == true && airHumidity == 20 && season != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $isGoodConditionsForBeans")
}