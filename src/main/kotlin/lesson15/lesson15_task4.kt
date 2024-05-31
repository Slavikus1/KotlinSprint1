package lesson15

interface Searchable {
    fun searchDetails()
}

open class Product(
    val name: String,
    val amount: Int,
)

class MusicInstrument(name: String, amount: Int) : Product(name, amount), Searchable{
    override fun searchDetails() {
        println("Выполняется поиск...")
    }
}

class Components(name: String, amount: Int) : Product(name, amount)