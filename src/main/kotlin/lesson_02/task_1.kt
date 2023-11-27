package lesson_02

fun main () {
    val numberOfStudents = 7

    val firstMark = 3
    val secondMark = 4
    val thirdMark = 3
    val forthMark = 5

    val sumOfMarks = firstMark + secondMark + thirdMark + forthMark.toDouble()

    val average = sumOfMarks / numberOfStudents

    println("%.2f".format(average))
}
