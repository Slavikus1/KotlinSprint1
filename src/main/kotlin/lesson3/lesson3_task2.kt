package lesson3

fun main() {
    val familyName = "Андреева"
    val name = "Татьяна"
    val surname = "Сергеевна"
    val age = 20
    val nextFamilyName = "Сидорова"
    val age2 = 22
    println(
        """
        [$familyName $name $surname, $age.]
        [$nextFamilyName $name $surname, $age2.]
    """.trimIndent()
    )
}