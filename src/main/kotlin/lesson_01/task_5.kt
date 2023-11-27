package lesson_01

fun main () {
    val totalSeconds = 6480

    val hours = totalSeconds / 60 / 60
    val minutes = (totalSeconds / 60) - (hours * 60)
    val seconds = totalSeconds % 60

    println("${String.format("%02d", hours)}:$minutes:${String.format("%02d", seconds)}")
}
