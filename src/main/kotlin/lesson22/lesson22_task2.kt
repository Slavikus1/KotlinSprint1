package lesson22

class RegularBookА(
    val name: String,
    val author: String,
)

data class DataBookА(
    val name: String,
    val author: String,
)

fun main() {
    val bookA = RegularBookА("Ruslan and Ludmila", "A.S.Pushkin")
    val bookB = DataBookА("Ruslan and Ludmila", "A.S.Pushkin")

    println(bookA)
    // выведет непонятные буквы, так как в обычном классе нужно переопределить метод toString
    println(bookB)
    // выведет понятные данные, так как у Data класса уже переопределен такой метод
}
