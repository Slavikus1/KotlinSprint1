package lesson8

fun main() {
    val ingredientsArray = arrayOf("cucumber", "carrot", "meat", "egg")
    println(ingredientsArray)

    println("which ingredient you would like to replace?")
    val usersChoice = readln()

    for (i in ingredientsArray) {
        if (usersChoice == i) {
            val index = ingredientsArray.indexOf(i)
            println("enter new ingredient: ")

            val newIngredient = readln()
            ingredientsArray[index] = newIngredient

            println("Done! You have saved new ingredients list: ${ingredientsArray.joinToString()}")
            return
        }
    }
    println("You entered unavailable ingredient.")
}
