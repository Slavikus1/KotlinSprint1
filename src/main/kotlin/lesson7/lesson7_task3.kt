package lesson7

fun main() {
    println("Здравствуйте! Давайте отобразим все четные числа в выбранном диапазоне! Введите число:")
    val maxNumber = readln().toInt()
    val minNumber = 0
    val range = minNumber..maxNumber

    for (i in range step 2) {
        println(i)
    }
}