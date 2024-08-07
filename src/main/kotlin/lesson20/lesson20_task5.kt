package lesson20

class Robot {
    private val listOfPhrases = listOf(
        "Здравствуйте! Я робот.",
        "Чем я могу помочь вам?",
        "Я обожаю звездные войны.",
        "Как я появился на свет?",
        "Андроид это круто."
    )
    private var modifier: ((String) -> String)? = null
    private val phrase = listOfPhrases.random()

    fun say() {
        val modePhrase = modifier?.invoke(phrase) ?: phrase
        println(modePhrase)
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}

fun main() {
    val android = Robot()
    android.say()
    android.setModifier { phrase -> phrase.replace("а", "!") }
    android.say()
}