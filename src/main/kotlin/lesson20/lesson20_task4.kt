package lesson20

fun main() {
    val elements = listOf("кальций", "водород", "гелий", "литий")
    val lambdaPrintElements: List<() -> Unit> = elements.map { element -> { println("Нажат элемент $element") } }
    for (i in lambdaPrintElements.indices) {
        if ((i + 1) % 2 == 0) {
            lambdaPrintElements[i].invoke()
        }
    }
}