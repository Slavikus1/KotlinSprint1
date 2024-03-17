package lesson4

fun main() {
    var numberOfWorkoutDay = 1
    var absAndArmsExercises: Boolean
    var backAndLegsExercises: Boolean

    numberOfWorkoutDay += 4
    absAndArmsExercises = numberOfWorkoutDay in (1..100).filter { number -> number % 2 != 0 }
    backAndLegsExercises = numberOfWorkoutDay in (1..100).filter { number -> number % 2 == 0 }

    println(
        """
        |Упражнения для рук: $absAndArmsExercises
        |Упражнения для ног: $backAndLegsExercises
        |Упражнения для спины: $backAndLegsExercises
        |Упражнения для пресса: $absAndArmsExercises
    """.trimMargin()
    )
}