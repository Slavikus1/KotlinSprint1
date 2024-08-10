package lesson21

fun main() {
    val skills = mapOf<String, Int>("Сила" to 100, "Ловкость" to 50, "Харизма" to 50, "Выносливость" to 100, "Ум" to 75)
    println(skills.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
    val maxSkill = this.maxByOrNull { it.value }
    return if (maxSkill != null) {
        "Самый прокачанный навык ${maxSkill.key} с ${maxSkill.value} очками."
    } else "Коллекция пуста"
}