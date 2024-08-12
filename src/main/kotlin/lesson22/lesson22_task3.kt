package lesson22

data class Person(
    val name: String,
    val age: Int,
    val city: String,
    val gender: String,
)

fun main() {
    val alex = Person("Alex", 25, "Moscow", "мужской")
    val (name, age, city, gender) = alex
    println(name)
    println(age)
    println(city)
    println(gender)
}