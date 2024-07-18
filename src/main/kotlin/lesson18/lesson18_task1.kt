package lesson18

class Order {
    fun showOrderDetails(orderNumber: Int, product: String) {
        println("Заказан товар: $product")
    }

    fun showOrderDetails(orderNumber: Int, product: List<String>) {
        println("Заказаны товары: $product")
    }
}

fun main() {
    val ozon = Order()
    ozon.showOrderDetails(12345, "футбольный мяч")
    ozon.showOrderDetails(54321, listOf("полотенце", "зеркало", "джинсы"))
}