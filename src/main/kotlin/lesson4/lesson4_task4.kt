package lesson4

fun main() {
    var numberOfWorkoutDay = 5
    val isEvenDay = (numberOfWorkoutDay % 2) == 0
    val isOddDay = (numberOfWorkoutDay % 2) != 0

    println(
        """
        |Упражнения для рук: $isOddDay
        |Упражнения для ног: $isEvenDay
        |Упражнения для спины: $isEvenDay
        |Упражнения для пресса: $isOddDay
    """.trimMargin()
    )
}