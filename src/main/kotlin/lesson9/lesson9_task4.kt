package lesson9

fun main() {
    println("Введите пять ингридиентов, используя запятую с пробелом \", \" как разделитель:")
    val ingredients = readln().split(", ").sortedBy { it }.joinToString()
    println(ingredients)
}