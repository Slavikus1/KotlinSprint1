package lesson4

const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_CAPACITY = 100

fun main() {
    val cargoOneWeight = 20
    val cargoOneCapacity = 80
    val cargoTwoWeight = 50
    val cargoTwoCapacity = 100

    println(
        "Груз с весом $cargoOneWeight кг и объемом $cargoOneCapacity л соответствует категории 'Average':" +
                "${
                    (cargoOneWeight >= AVERAGE_MIN_WEIGHT && cargoOneWeight <=
                            AVERAGE_MAX_WEIGHT && cargoOneCapacity < AVERAGE_MAX_CAPACITY)
                }."
    )
    println(
        "Груз с весом $cargoTwoWeight кг и объемом $cargoTwoCapacity л соответствует категории 'Average':" +
                "${
                    (cargoTwoWeight >= AVERAGE_MIN_WEIGHT && cargoTwoWeight <=
                            AVERAGE_MAX_WEIGHT && cargoTwoCapacity < AVERAGE_MAX_CAPACITY)
                }."
    )
}