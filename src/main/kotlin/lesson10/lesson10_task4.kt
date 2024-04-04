package lesson10

fun main() {
    var humanWins = 0
    var machineWins = 0
    do {
        val humanRoll = toGenerateRollingTheDice()
        val machineRoll = toGenerateRollingTheDice()
        if (humanRoll > machineRoll) {
            println("Победил человек - $humanRoll против $machineRoll")
            humanWins += 1
        } else if (machineRoll > humanRoll) {
            println("Победила машина - $machineRoll против $humanRoll")
            machineWins += 1
        } else println("Ничья - $humanRoll против $machineRoll")
    } while (toStartNewRound())
    println("Количество партий где победил человек: $humanWins")
}

fun toGenerateRollingTheDice(): Int {
    val numbersOfDice = 1..6
    return numbersOfDice.random()
}

fun toStartNewRound(): Boolean {
    println("Хотите бросить кости еще раз? Введите Да или Нет: ")
    val answer = readln()
    return answer.equals("да", ignoreCase = true)
}

