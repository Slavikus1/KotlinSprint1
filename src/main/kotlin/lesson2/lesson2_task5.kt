package lesson2

import kotlin.math.pow

fun main() {
    val mainSUmm = 70000.0
    val percentPerYear = 16.7
    val years = 20.0
    val result = mainSUmm * (1 + (percentPerYear / 100)).pow(years)
    println(String.format("%6.3f", result))
}
