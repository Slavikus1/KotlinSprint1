package lesson21

import java.io.File
import java.util.*

fun main() {
    val wordsFile: File = File("Words.txt")
    wordsFile.createNewFile()
    wordsFile.addWordToFile("SANGE")
    wordsFile.addWordToFile("YASHA")
}

fun File.addWordToFile(text: String) {
    val newContent = text.lowercase(Locale.getDefault())
    val oldContent = this.readText()
    this.writeText("$newContent\n$oldContent")
}