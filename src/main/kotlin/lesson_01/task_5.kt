package lesson_01

fun main () {
    val totalSeconds = 6480

    val hours = 6480 / 60 / 60
    val minutes = (totalSeconds / 60) - (hours * 60)
    val seconds = totalSeconds % 60

    print("0" + hours)
    print(":")
    print(minutes)
    print(":")
    print("0" + seconds)
}