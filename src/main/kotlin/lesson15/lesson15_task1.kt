package lesson15

interface Flyable {
    abstract fun fly()
}

interface Swimming {
    abstract fun swim()
}

class Fish() : Swimming {
    override fun swim() {
        println("карась поплыл")
    }
}

class SeaBird() : Flyable {
    override fun fly() {
        println("чайка полетела")
    }
}

class Duck() : Swimming, Flyable {
    override fun fly() {
        println("утка полетела")
    }

    override fun swim() {
        println("утка поплыла")
    }
}

fun main() {
    val donald = Duck()
    val bird = SeaBird()
    val fish = Fish()

    donald.fly()
    donald.swim()
    println()

    bird.fly()
    println()

    fish.swim()
}