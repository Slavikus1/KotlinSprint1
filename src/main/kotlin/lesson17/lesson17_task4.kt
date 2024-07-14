package lesson17

class Package(
    packNumber: Int,
    currentPlace: String,
) {
    private var moveCounter: Int = 0
    val number = packNumber
    var place = currentPlace
        set(value) {
            field = value
            moveCounter++
            println("Посылка номер: $number прибыла в $value. Счетчик перемещний равен: $moveCounter")
        }
}

fun main() {
    val ball = Package(320120, "Ильский")
    ball.place = "Краснодар"
    ball.place = "Сочи"
}