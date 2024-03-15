package lesson3

fun main() {
    var stepInfo = "D2-D4;0"
    var infoParts = stepInfo.split("-", ";")
    val stepFrom = infoParts[0]
    val stepTo = infoParts[1]
    val stepNumber = infoParts[2]
    println(stepFrom)
    println(stepTo)
    println(stepNumber)

}