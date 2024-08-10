package lesson21

import java.io.File

fun main() {
    val wordsFile: File = File("Words.txt")
    wordsFile.createNewFile()
    wordsFile.addWordToFile("String")
}

fun File.addWordToFile(text: String) {
    val newContent = text.toLowerCase()
    appendText(newContent)
}