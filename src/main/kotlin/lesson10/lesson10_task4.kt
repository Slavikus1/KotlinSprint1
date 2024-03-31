package lesson10

fun main() {
    var humanWins = 0
    var machineWins = 0
    do {
        val humanRoll = generateRollingTheDice()
        val machineRoll = generateRollingTheDice()
        if (humanRoll > machineRoll) {
            println("Победил человек - $humanRoll против $machineRoll")
            humanWins += 1
        } else if (machineRoll > humanRoll) {
            println("Победила машина - $machineRoll против $humanRoll")
            machineWins += 1
        } else println("Ничья - $humanRoll против $machineRoll")
    } while (newRound() != "Нет")
    println("Количество партий где победил человек: $humanWins")
}

fun generateRollingTheDice(): Int {
    val numbersOfDice = 1..6
    return numbersOfDice.random()
}

fun newRound(): String {
    println("Хотите бросить кости еще раз? Введите Да или Нет: ")
    return readln()
}

