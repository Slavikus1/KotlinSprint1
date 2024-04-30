package lesson13

class DirectoryListBook(
    val name: String,
    val phoneNumber: Long,
    var company: String? = null,
) {
    fun printData() {
        println("name - $name, phone number - $phoneNumber, company - $company")
    }
}

fun main() {
    val phoneBook = mutableListOf<DirectoryListBook>()

    println("Введите имя:")
    val name = readln()

    println("Введите номер телефона:")
    val phoneNumber = readln()
    val correctNumber = phoneNumber.toLongOrNull()

    if (correctNumber == null) {
        println("Номер телефона не указан, запись не будет добавлена.")
        return
    }

    println("Введите название компании:")
    val company = readlnOrNull()

    val newContact = DirectoryListBook(name, correctNumber, company)
    phoneBook.add(newContact)
    newContact.printData()


}

