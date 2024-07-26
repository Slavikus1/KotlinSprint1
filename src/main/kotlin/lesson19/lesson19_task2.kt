package lesson19

enum class OnlineShop(private val textName: String) {
    CLOTHES("одежда"),
    STATIONERY("канцелярские товары"),
    MISCELLANEOUS("разное");

    fun getTextName(): String {
        return textName
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: OnlineShop,
) {
    fun getProductInfo() {
        println("Информация о товаре: имя - $name, id - $id, категория - ${category.getTextName()}")
    }
}

fun main() {
    val tShirt = Product("Футболка", 210, OnlineShop.CLOTHES)
    val pen = Product("Ручка", 211, OnlineShop.STATIONERY)
    val cink = Product("Цинк", 212, OnlineShop.MISCELLANEOUS)

    cink.getProductInfo()
    println()
    tShirt.getProductInfo()
    println()
    pen.getProductInfo()
}