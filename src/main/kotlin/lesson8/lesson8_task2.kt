package lesson8

fun main() {
    val ingredients = arrayOf("картошка", "капуста", "мясо", "свёкла", "морковка", "томатная паста")

    println("Введите название ингридиента, который вы хотите найти:")
    val result = readln()

    for (i in ingredients) {
        if (result == i) {
            println("Ингридиент $i в рецепте есть")
            return
        }
    }
    println("Такого ингридиента \"$result\" в рецепте нет.")
}