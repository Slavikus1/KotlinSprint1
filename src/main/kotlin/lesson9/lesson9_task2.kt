package lesson9

fun main(){
    val ingredientsList = mutableListOf("картошка", "мясо", "соль")

    println("В рецепте есть базовые ингридиенты: ${ingredientsList.joinToString()}.")
    println("Желаете добавить еще?")

    var newOne = ""
    val answer = readln()
    if (answer == "Нет" || answer == "нет" || answer == "Не хочу" || answer == "не хочу") return
    else {
        println("Какой ингридиент вы хотите добавить?")
        newOne = readln()
        ingredientsList.add(newOne)
        println("Теперь в рецепте есть следующие ингридиенты: ${ingredientsList.joinToString()}.")
    }
}