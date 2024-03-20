package lesson4

const val RECOMMENDED_NUMBER_OF_CREW = 70
const val MINIMAL_NUMBER_OF_CREW = 55
const val MINIMAL_NUMBER_OF_FOODBOX = 50
const val SHIP_DAMAGED = false
const val GOOD_WEATHER = true

fun main() {
    println("Поврежден ли корпус? true/false")

    val answerAboutDamage = readln()
    val isCurrentDamage = answerAboutDamage.toBoolean()

    println("Укажите текущее количество членов экипажа:")

    val answerAboutCrew = readln()
    val currentNumberOfCrew = answerAboutCrew.toInt()

    println("Укажите сколько ящиков с провизией на борту:")

    val answerAboutFood = readln()
    val currentFood = answerAboutFood.toInt()

    println("Благоприятны ли метеусловия сейчас? true/false")

    val answerAboutWeatherConditions = readln()
    val isCurrentWeatherConditions = answerAboutWeatherConditions.toBoolean()

    if ((isCurrentDamage == SHIP_DAMAGED) &&
        (currentNumberOfCrew in (MINIMAL_NUMBER_OF_CREW..RECOMMENDED_NUMBER_OF_CREW)) &&
        (currentFood >= MINIMAL_NUMBER_OF_FOODBOX)
    ) println("Корабль может отправиться в плавание")
    else if ((isCurrentDamage != SHIP_DAMAGED) &&
        (currentNumberOfCrew == RECOMMENDED_NUMBER_OF_CREW) &&
        (isCurrentWeatherConditions == GOOD_WEATHER) &&
        (currentFood >= MINIMAL_NUMBER_OF_FOODBOX)
    ) println("Корабль может отправиться в плавание")
    else println("Корабль не может отправиться в долгосрочное плавание")
}