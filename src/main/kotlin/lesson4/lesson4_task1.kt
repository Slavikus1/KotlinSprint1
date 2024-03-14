package lesson4

const val ALL_TABLES = 13

fun main() {
    val bookedTablesToday = 13
    val bookedTablesTomorrow = 4
    val availableToday = bookedTablesToday < ALL_TABLES
    val availableTomorrow = bookedTablesTomorrow < ALL_TABLES
    println("Доступность столиков на сегодня: $availableToday\nДоступность столиков на завтра: $availableTomorrow")
}