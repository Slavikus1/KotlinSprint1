package lesson13

import java.lang.IllegalArgumentException

class DirectoryListBook(
    val name: String,
    val company: String? = null,
    var phoneNumber: Long,
) {
    fun printData() {
        println("$name - name. $phoneNumber - number. $company - company")
    }
}

fun main() {
    val contactBook = mutableListOf<DirectoryListBook>()

    println("Введите кол-во контактов, которые хотите добавить:")
    val numberOfContacts = readln().toInt()

    while (contactBook.size != numberOfContacts) {
        println("Введите имя:")
        val contactName = readln()

        println("Введите компанию")
        val contactCompany = readln()

        println("Введите номер телефона")
        val contactPhoneNumber = readln().toLongOrNull()

        if (contactPhoneNumber == null) {
            println("у $contactName не указан номер телефона. Такая запись не будет добавлена.")
        } else {
            contactBook.add(DirectoryListBook(contactName,contactCompany,contactPhoneNumber))
        }
    }
    contactBook.forEach { it.printData() }
}

