package lesson22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)

fun main(){
    val bookA = RegularBook("Ruslan and Ludmila", "A.S.Pushkin")
    val bookB = RegularBook("Ruslan and Ludmila", "A.S.Pushkin")
    val bookC = DataBook("Ruslan and Ludmila", "A.S.Pushkin")
    val bookD = DataBook("Ruslan and Ludmila", "A.S.Pushkin")

    println(bookA == bookB)
    // вернет false потому, что сравниваются ссылки на объекты в памяти, а не значения.
    println(bookC == bookD)
    // вернет true потому, что в data class сравниваются значения.

}