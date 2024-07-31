package lesson19

enum class Gender {
    MAN,
    WOMAN,
    NONBINARY,
}

class Man(
    val name: String,
    val gender: Gender,
) {
    fun printInfo() {
        println("Карточка с именем $name и полом $gender")
    }
}

fun main() {
    println("Здравствуйте! Введите имя и пол пятерых людей в формате - Иван, мужской.")
    val list: MutableList<Man> = mutableListOf()
    val requiredNumberOfList = 5
    while (list.size < requiredNumberOfList) {
        list.add(createMan())
    }
    for (i in list) i.printInfo()
}

fun createMan(): Man {
    println("Укажите имя:")
    val name = readln()
    println("Укажите пол:")
    val answer = readln()
    val gender = when (answer.toUpperCase()) {
        "МУЖСКОЙ" -> Gender.MAN
        "ЖЕНСКИЙ" -> Gender.WOMAN
        else -> Gender.NONBINARY
    }
    println("Карточка с именем $name и полом $gender успешно создана")
    println()
    return Man(name, gender)
}