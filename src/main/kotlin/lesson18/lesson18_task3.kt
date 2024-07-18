package lesson18

open class TamagotchiObject {
    open fun eat() {}
    open fun sleep() {}
}

class Fox(
    val name: String,
) : TamagotchiObject() {
    override fun eat() {
        println("$name кушает ягоды")
    }

    override fun sleep() {
        println("$name спит в лесу")
    }
}

class Cat(
    val name: String,
) : TamagotchiObject() {
    override fun eat() {
        println("$name кушает рыбу")
    }

    override fun sleep() {
        println("$name спит на диване")
    }
}

class Dog(
    val name: String,
) : TamagotchiObject() {
    override fun eat() {
        println("$name кушает кости")
    }

    override fun sleep() {
        println("$name спит в будке")
    }
}

fun main() {
    val kitty = Cat("Kitty")
    val sam = Dog("Sam")
    val masha = Fox("Masha")
    val animalList: Array<TamagotchiObject> = arrayOf(kitty, sam, masha)

    animalList.forEach { it.eat() }

}

