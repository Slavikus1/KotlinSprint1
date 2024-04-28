package lesson13

class DirectoryBook(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printData() {
        println("- Имя: $name \n- Номер: $phoneNumber \n- Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val dima = DirectoryBook("Dima", 89189681779, null)
    dima.printData()
}