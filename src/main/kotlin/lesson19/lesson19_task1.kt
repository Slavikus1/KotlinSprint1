package lesson19

enum class Fishes{
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main(){
    println("Пользователь может добавить в аквариум следующих рыб:")
    println()
    for (i in Fishes.entries) println(i.name)
}