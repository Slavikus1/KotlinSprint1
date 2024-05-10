package lesson14

open class SkyBody(
    val name: String,
    val atmosphere: Int,
    val isGoodForLanding: Boolean = false
)

class Planet(
    name: String,
    atmosphere: Int,
    isGoodForLanding: Boolean,
    val satelliteList: List<Satellite> = listOf(),
) : SkyBody(name, atmosphere, isGoodForLanding)

class Satellite(
    name: String,
    atmosphere: Int,
    isGoodForLanding: Boolean,
) : SkyBody(name, atmosphere, isGoodForLanding)

fun main() {
    val veles = Satellite("Велес", 0, false)
    val moon = Satellite("Луна", 0, true)
    val earth = Planet("Земля", 100, true, listOf(moon, veles))

    println("${earth.name}: ${earth.satelliteList.joinToString { it.name }}")
}