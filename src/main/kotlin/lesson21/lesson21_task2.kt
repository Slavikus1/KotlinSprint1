package lesson21

fun MutableList<Int>.evenNumbersSum(numbers: MutableList<Int>): Int {
    return this.filter { it % 2 == 0 }.sum()
}

fun main() {
    val a = mutableListOf(1, 2, 3, 4)
    println(a.evenNumbersSum(a))
}