package lesson8

fun main() {
    println("Укажите планируемое количество ингридиентов:")
    val maxNumberOfIngredients = readln().toInt()
    val ingredientsArray = arrayOfNulls<String>(maxNumberOfIngredients)

    for (index in 0..(ingredientsArray.size - 1)) {
        println("Введите ингридиент №${(index) + 1}: ")
        ingredientsArray[index] = readln()
    }
    println(ingredientsArray.joinToString())
}