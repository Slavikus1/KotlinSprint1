package lesson2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffPercent = 20
    val crystalBuffAmount = (crystalOre * buffPercent) / 100
    val buffedCrystal = crystalBuffAmount + crystalOre
    val ironBuffAmount = (ironOre * buffPercent) / 100
    val buffedIron = ironBuffAmount + ironOre
    println(crystalBuffAmount)
    println(ironBuffAmount)
}
