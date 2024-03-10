package lesson1

fun main() {
    val allSeconds = 6480
    val findMinutes = 60
    val findHours = 3600
    val allMinutes = allSeconds / findMinutes
    //println(allMinutes)
    val spaceHours = allSeconds / findHours
    //println(hours)
    val restOfSecondsAndMinutes = allSeconds % findHours
    //println(restOfSecondsAndMinutes)
    val spaceSec = restOfSecondsAndMinutes % findMinutes
    //println(spaceSec)
    val spaceMin = restOfSecondsAndMinutes / findMinutes
    //println(spaceMin)
    println("Гагарин провел в космосе [01:$spaceMin:0$spaceSec]")
}
