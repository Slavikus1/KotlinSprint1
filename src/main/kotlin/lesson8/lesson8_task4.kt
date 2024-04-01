package lesson8

fun main() {
    val ingredientsArray = arrayOf("огурец", "морковка", "мясо", "яйцо")
    println(ingredientsArray)

    println("Какой ингридиент вы хотели бы заменить?")
    val usersChoice = readln()
    val index = ingredientsArray.indexOf(usersChoice)


    if (index in ingredientsArray.indices) {
        println("Введите новый ингридиент:")
        val newIngredient = readln()
        ingredientsArray[index] = newIngredient
    } else {
        println("Такого ингредиента нет в списке.")
        return
    }
    println(ingredientsArray.joinToString())
}
