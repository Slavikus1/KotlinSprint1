package lesson13

import java.lang.IllegalArgumentException

class DirectoryListBook(
    val name: String,
    var phoneNumber: String?,
    var company: String? = null,
) {
    init {
        println("Введите номер телефона $name:")
        phoneNumber = readlnOrNull()
        phoneNumber?.toLong() ?: throw IllegalArgumentException ("Номер не указан. Такая запись не будет добавлена.")
    }

    fun printData() {
        println("name - $name, phone number - $phoneNumber, company - $company")
    }
}

fun main() {
    val phoneBook = mutableListOf<DirectoryListBook>(
        DirectoryListBook("Sam", "Ss",),
        DirectoryListBook("Bob","s", "Apple")
    )
    phoneBook.forEach { it.printData() }

}

