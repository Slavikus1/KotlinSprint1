package lesson8

fun main() {
    val ingredientsArray = arrayOf("огурец", "морковка", "мясо", "яйцо")
    println(ingredientsArray)

    println("Какой ингридиент вы хотели бы заменить? ")
    val usersChoice = readln()
    val index = ingredientsArray.indexOf(usersChoice)


    if (index == -1) {
        println("Такого ингредиента нет в списке.")
        return
    } else {
        println("Введите новый ингридиент:")
        val newIngredient = readln()
        ingredientsArray[index] = newIngredient
    }
    println(ingredientsArray.joinToString())
}
