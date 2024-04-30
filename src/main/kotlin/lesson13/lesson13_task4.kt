package lesson13

class DirectoryListBook(
    val name: String,
    val phoneNumber: Long? = null,
    var company: String? = null,
)

fun main() {
    val phoneBook = mutableListOf<Long>()
    val contactsList = mutableListOf<DirectoryListBook>(
        DirectoryListBook("Sam"),
        DirectoryListBook("Ann", 89183130031, "Apple"),
        DirectoryListBook("Taddy", 89180303030, "Nokia")
    )
    contactsList.forEach {
        if (it.phoneNumber == null) println("${it.name} не ввел номер телефона")
        else {
            it.phoneNumber.toLong()
            phoneBook.add(it.phoneNumber)
        }
    }

    contactsList.forEach { if (it.company == null) it.company = null }
}

