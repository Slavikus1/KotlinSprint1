package lesson8

fun main() {
    val viewsArray = intArrayOf(1000, 4354, 2045, 9809, 6789, 9843, 6543)
    var result: Int = 0
    for (i in viewsArray){
        result += i
    }
    println(result)
}

