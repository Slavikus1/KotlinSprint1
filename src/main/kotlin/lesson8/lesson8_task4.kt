package lesson8

fun main() {
    val ingredientsArray = arrayOf("огурец", "морковка", "мясо", "яйцо")
    println(ingredientsArray)

    println("Какой ингридиент вы хотели бы заменить?")
    val usersChoice = readln()

    if (ingredientsArray.indexOf(usersChoice) == -1) {
        println("Такого ингредиента нет в списке.")
        return
    } else {
        println("Введите новый ингридиент:")
        val newIngredient = readln()
        val getIndex = ingredientsArray.indexOf(usersChoice)
        ingredientsArray[getIndex] = newIngredient
    }
    println(ingredientsArray.joinToString())
}
