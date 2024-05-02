package lesson13

import java.lang.NumberFormatException

class NewDirectoryListBook(
    val name: String,
    val company: String? = null,
    var phoneNumber: Long,
) {
    fun printData() {
        println("$name - name. $phoneNumber - number. $company - company")
    }
}

fun main() {
    val contactBook = mutableListOf<NewDirectoryListBook>()

    println("Введите кол-во контактов, которые хотите добавить:")
    val numberOfContacts = readln().toInt()

    while (contactBook.size != numberOfContacts) {
        println("Введите имя:")
        val contactName = readln()

        println("Введите компанию:")
        val contactCompany = readln()

        println("Введите номер телефона:")
        val contactPhoneNumber = readln()

        try {
            contactBook.add(NewDirectoryListBook(contactName,contactCompany,contactPhoneNumber.toLong()))
        }
        catch (e: NumberFormatException) {
            println("Ошибка ${e.message}")
        }
    }
    contactBook.forEach { it.printData() }
}

