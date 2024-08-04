package lesson20

fun main() {
    val lambdaGreetings: (String) -> Unit
    lambdaGreetings = { userName: String -> println("С наступающим новым годом $userName!") }
    lambdaGreetings("Sam")
}