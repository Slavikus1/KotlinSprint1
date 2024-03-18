package lesson4

const val RECOMMENDED_NUMBER_OF_CREW = 70
const val MINIMAL_NUMBER_OF_CREW = 55
const val MINIMAL_NUMBER_OF_FOODBOX = 50

fun main() {
    println("Поврежден ли корпус? true/false")

    val answerAboutDamage = readLine()
    val isCurrentDamage = answerAboutDamage.toBoolean()

    println("Укажите текущее количество членов экипажа:")

    val answerAboutCrew = readLine()
    val currentNumberOfCrew = answerAboutCrew!!.toInt()

    println("Укажите сколько ящиков с провизией на борту:")

    val answerAboutFood = readLine()
    val currentFood = answerAboutFood!!.toInt()

    println("Благоприятны ли метеусловия сейчас? true/false")

    val answerAboutWeatherConditions = readLine()
    val isCurrentWeatherConditions = answerAboutWeatherConditions.toBoolean()

    if ((isCurrentDamage == false) &&
        (currentNumberOfCrew in (MINIMAL_NUMBER_OF_CREW..RECOMMENDED_NUMBER_OF_CREW)) &&
        (currentFood >= MINIMAL_NUMBER_OF_FOODBOX) &&
        (isCurrentWeatherConditions != true || isCurrentWeatherConditions == true)
    ) println("Корабль может отправиться в плавание")
    else if ((isCurrentDamage == true) &&
        (currentNumberOfCrew == RECOMMENDED_NUMBER_OF_CREW) &&
        (isCurrentWeatherConditions == true) &&
        (currentFood >= MINIMAL_NUMBER_OF_FOODBOX)
    ) println("Корабль может отправиться в плавание")
    else println("Корабль не может отправиться в долгосрочное плавание")
}