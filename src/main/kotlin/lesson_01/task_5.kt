package lesson_01

val TOTAL_SECONDS = 6480

fun main () {
    val hours = TOTAL_SECONDS / 60 / 60
    val minutes = (TOTAL_SECONDS / 60) - (hours * 60)
    val seconds = TOTAL_SECONDS % 60

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}
