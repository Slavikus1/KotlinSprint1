package lesson9

fun main() {
    val scrambleRecipe = mutableListOf(2, 50, 15)

    println("Какое количество порций омлета вы хотите приготовить?")

    val numberOfPortion = readln().toInt()
    val newRecipe = scrambleRecipe.map { it * numberOfPortion }
    println(
        "На $numberOfPortion порций омлета вам понадобится: Яиц - ${newRecipe[0]}, " +
                "молока - ${newRecipe[1]} мл, сливочного масла ${newRecipe[2]} гр"
    )
}