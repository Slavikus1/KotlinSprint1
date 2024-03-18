package lesson4

fun main() {
    var numberOfWorkoutDay = 5
    val isOddDay = (numberOfWorkoutDay % 2) != 0

    println(
        """
        |Упражнения для рук: $isOddDay
        |Упражнения для ног: ${!isOddDay}
        |Упражнения для спины: ${!isOddDay}
        |Упражнения для пресса: $isOddDay
    """.trimMargin()
    )
}