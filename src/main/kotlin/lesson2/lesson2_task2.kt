package lesson2

fun main() {
    val salaryOfSeniors = 50 * 30000
    val salaryOfJuniors = 30 * 20000
    val totalExpenses = salaryOfJuniors + salaryOfSeniors
    val averageSalary = totalExpenses / 80

    println(salaryOfSeniors)
    println(totalExpenses)
    println(averageSalary)
}
