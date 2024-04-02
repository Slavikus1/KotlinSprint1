package lesson9

fun main() {
    println("Введите пять ингридиентов, используя запятую с пробелом \", \" как разделитель:")
    val ingredients = readln()
    val listOfIngredients = ingredients.split(", ")
    val sortedList = listOfIngredients.sortedBy { it }
    println(sortedList.joinToString())
}