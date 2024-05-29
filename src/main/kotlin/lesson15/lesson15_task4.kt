package lesson15

interface Searchable {
    fun searchDetails() {
        println("Выполняется поиск...")
    }
}

open class Product(
    val name: String,
    val amount: Int,
)

class MusicInstrument(name: String, amount: Int) : Product(name, amount), Searchable

class Components(name: String, amount: Int) : Product(name, amount)