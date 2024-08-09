package lesson21

fun main() {
    val string = "У лукоморья дуб зеленый"
    println(string.vowelCount(string))
}

fun String.vowelCount(input: String): Int {
    val vowels = "УуЕеЫыАаОоЭэЯяИиЮюEeYyUuIiOoAa"
    return input.count { it in vowels }
}