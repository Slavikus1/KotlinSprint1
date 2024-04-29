package lesson13

class Directory(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {
    val dima = Directory("Dima", 89189681779)
}