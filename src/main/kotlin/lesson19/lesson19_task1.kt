package lesson19

enum class Fishes(val type: String){
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun main(){
    println("Пользователь может добавить в аквариум следующих рыб:")
    println()
    for (i in Fishes.entries) println(i.type)
}