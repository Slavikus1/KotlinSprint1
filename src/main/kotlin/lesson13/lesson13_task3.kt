package lesson13

class DirectoryList(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printData() {
        println("- Имя: $name \n- Номер: $phoneNumber \n- Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val phoneBook = listOf(
        DirectoryList("Dima", 89180000000),
        DirectoryList("Semen", 89183133130),
        DirectoryList("Petr", 89180202022, "Google"),
        DirectoryList("Sam", 89181010101, "Microsoft"),
        DirectoryList("Nicole", 89189090900, "null")
    )
    phoneBook.forEach { if (it.company != null) println(it.company) }
}