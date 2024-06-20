package lesson16

class Order(
    private val numberOfOrder: Int = 123,
    private var status: String = "В ожидании",
) {
    fun changeStatus() {
        println("Укажите менеджеру новый статус заказа:")
        status = readln()
        println("Новый статус - $status")
    }
}

fun main() {
    val iphone = Order(1234, "sadasd")
    iphone.changeStatus()
}