package lesson8

fun main() {
    val ingredientsArray = arrayOf("рис", "куриная грудка", "помидор", "перец")
    println("Введите ингридиент:")
    val result = readln()
    if (ingredientsArray.indexOf(result) == -1) {
        println("Такого ингредиента \"$result\" нет в списке.")
    } else println("Такой ингридиент $result в списке есть.")
}