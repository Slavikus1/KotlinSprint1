package lesson8

fun main() {
    println("Укажите планируемое количество ингридиентов:")
    val maxNumberOfIngredients = readln().toInt()
    val minNumberOfIngredients = 1
    var arrayOfIngredients: Array<String> = arrayOf()

    for (i in minNumberOfIngredients..maxNumberOfIngredients) {
        println("Введите название ингридиента №$i")
        val entered = readln()
        arrayOfIngredients += entered
    }
    println("Ваш список: ${arrayOfIngredients.joinToString()}")
}