package lesson_01

fun main () {
    val totalSeconds = 6480

    val hours = totalSeconds / 60 / 60
    val minutes = (totalSeconds / 60) - (hours * 60)
    val seconds = totalSeconds % 60

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}
