package lesson8

fun main() {
    val ingredientsArray = arrayOf("рис", "куриная грудка", "помидор", "перец")
    println("Введите ингридиент:")
    val result = readln()
    ingredientsArray.forEach{element ->
        if (element == result) {
            println("Данный ингридиент \"$result\" есть в списке")
            return
        }
    }
    println("Данного ингридиента \"$result\" нет в списке")
}