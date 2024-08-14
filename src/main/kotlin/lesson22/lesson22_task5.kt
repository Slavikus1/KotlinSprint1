package lesson22

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateAndTime: String,
    val distanceFromEarth: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        "Альфа Центавра", "тройная звёздная система в созвездии Центавра",
        "6 миллиардов лет", 4.36
    )
    println(alphaCentauri)
}