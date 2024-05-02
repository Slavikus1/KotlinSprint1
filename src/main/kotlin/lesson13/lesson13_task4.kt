package lesson13

import java.lang.IllegalArgumentException

class DirectoryListBook(
    val name: String,
    val company: String? = null,
    var phoneNumber: String = readln(),
) {
    fun printData() {
        println("$name - name. $phoneNumber - number. $company - company")
    }
}

fun main() {
    val contactBook = mutableListOf<DirectoryListBook>()
    val listToCheck = mutableListOf<DirectoryListBook>(
        DirectoryListBook("Semen", "Amazon"),
        DirectoryListBook("Ann", "Apple"),
        DirectoryListBook("Sam")
    )
    for (i in listToCheck){
        val number = i.phoneNumber.toLongOrNull()
        if (number == null){
            println("У ${i.name} не указан номер телефона. Запись не будет добавлена.")
            continue
        }
        else contactBook.add(i)
    }

    contactBook.forEach { it.printData() }
}

