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
    println(
        "Имя объекта - ${alphaCentauri.component1()}, описание - ${alphaCentauri.component2()}," +
                " возраст объекта - ${alphaCentauri.component3()}, дистанция до земли ${alphaCentauri.component4()}"
    )
}