package lesson9

fun main(){
    val listOfIngredients = listOf<String>("капуста", "апельсин", "говяжий язык", "куриная грудка", "молоко")
    println("В рецепте есть следующие ингридиенты: ")
    listOfIngredients.forEach { it -> println(it) }
}
