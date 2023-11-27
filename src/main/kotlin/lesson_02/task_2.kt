package lesson_02

fun main () {
    val employees = 50
    val employeeSalary = 30_000
    val trainees = 30
    val traineeSalary = 20_000

    val employeesSalaryExpenses = employees * employeeSalary
    val traineesSalaryExpenses = trainees * traineeSalary
    val generalSalaryExpenses = employeesSalaryExpenses + traineesSalaryExpenses
    val averageSalary = (employeesSalaryExpenses + traineesSalaryExpenses) / (employees + trainees)

    println(employeesSalaryExpenses)
    println(generalSalaryExpenses)
    println(averageSalary)
}