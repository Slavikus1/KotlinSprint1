package lesson21

fun MutableList<Int>.evenNumbersSum(numbers: MutableList<Int>): Int {
    val evenList: MutableList<Int> = mutableListOf()
    numbers.map { val result = it % 2; if (result == 0) evenList.add(it) }
    return evenList.sum()
}

fun main() {
    val a = mutableListOf(1, 2, 3, 4)
    println(a.evenNumbersSum(a))
}