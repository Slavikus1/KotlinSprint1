package lesson2

import kotlin.math.pow

const val MAIN_SUMM = 70000.0
const val PERCENT_PER_YEAR = 16.7
const val YEARS = 20.0

fun main() {
    val result = MAIN_SUMM * (1 + (PERCENT_PER_YEAR / 100)).pow(YEARS)
    println(String.format("%6.3f", result))
}
