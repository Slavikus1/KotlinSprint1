package lesson8

fun main() {
    println("Укажите планируемое количество ингридиентов:")
    val maxNumberOfIngredients = readln().toInt()
    val ingredientsArray = arrayOfNulls<String>(maxNumberOfIngredients)
    var index = 0
    var numberOfIngredient = 1

    for (i in ingredientsArray) {
        println("Введите ингридиент №$numberOfIngredient: ")
        val ingredient = readln()
        ingredientsArray[index] = ingredient
        index += 1
        numberOfIngredient += 1
    }
    println(ingredientsArray.joinToString())
}