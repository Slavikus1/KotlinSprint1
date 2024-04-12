package lesson9

fun main() {
    val ingredients = mutableSetOf<String>()
    for (i in 1..5) {
        println("Введите ингридиент №$i:")
        val ingredient = readln()
        ingredients.add(ingredient)
    }
    val sortedIngredients = ingredients.sortedBy { it }.toMutableSet()
    val firstElement = sortedIngredients.first().capitalize()
    val new = sortedIngredients.joinToString(", ")
    println(new)

}