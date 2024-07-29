package lesson19

enum class OnlineShop {
    CLOTHES {
        override fun getTextName(): String {
            return "категория - $name"
        }
    },
    STATIONERY {
        override fun getTextName(): String {
            return "категория - $name"
        }
    },
    MISCELLANEOUS {
        override fun getTextName(): String {
            return "категория - $name"
        }
    };

    abstract fun getTextName(): String
}

class Product(
    val name: String,
    val id: Int,
    val category: OnlineShop,
) {
    fun getProductInfo() {
        println("Информация о товаре: имя - $name, id - $id, ${category.getTextName()}")
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