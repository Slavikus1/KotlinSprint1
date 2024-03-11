package lesson2

fun main() {
    val startHour = 9
    val startMinute = 39
    val minInTravel = 457
    val findMinutes = 60
    val findHours = 60
    val allTimeMinutes = minInTravel + startMinute + (startHour * findMinutes)
    val arriveHour = allTimeMinutes / findHours
    val arriveMinute = allTimeMinutes % arriveHour
    print("Прибытие в $arriveHour:$arriveMinute")
}