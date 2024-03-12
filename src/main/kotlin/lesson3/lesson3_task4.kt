package lesson3

fun main() {
    var stepFrom = "E2"
    var stepTo = "E4"
    var stepNumber = 1
    var result = "[$stepFrom-$stepTo; $stepNumber]"
    println(result)
    stepFrom = "D2"
    stepTo = "D3"
    stepNumber = 2
    println("[$stepFrom-$stepTo; $stepNumber]")
}
