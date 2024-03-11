package lesson1

const val ALL_SECONDS = 6480
const val FIND_MINUTES = 60

fun main() {

    val findHours = 3600
    val allMinutes = ALL_SECONDS / FIND_MINUTES
    //println(allMinutes)
    val spaceHours = ALL_SECONDS / findHours
//    println(spaceHours)
    val restOfSecondsAndMinutes = ALL_SECONDS % findHours
    //println(restOfSecondsAndMinutes)
    val spaceSec = restOfSecondsAndMinutes % FIND_MINUTES
//    println(spaceSec)
    val spaceMin = restOfSecondsAndMinutes / FIND_MINUTES
//    println(spaceMin)
    val stringFormat = String.format("%02d:%d:%02d", spaceHours, spaceMin, spaceSec)
    println(stringFormat)
}
