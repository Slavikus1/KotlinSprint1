package lesson2

fun main() {
    val numberOfSeniors = 50
    val numberOfJuniors = 30
    val numberOFAllWorkers = numberOfJuniors + numberOfSeniors
    val salaryOfJuniors = 20000
    val salaryOfSeniors = 30000
    val expensesOnSeniors = numberOfSeniors * salaryOfSeniors
    val expenseOfJuniors = numberOfJuniors * salaryOfJuniors
    val totalExpenses = expenseOfJuniors + expensesOnSeniors
    val averageSalary = totalExpenses / numberOFAllWorkers

    println(expensesOnSeniors)
    println(totalExpenses)
    println(averageSalary)
}
