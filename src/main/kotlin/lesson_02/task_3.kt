package lesson_02

fun main () {
    val departureTime = "9:39"
    val departureTimeInMinutes = departureTime.split(":").first().toInt() * 60 + departureTime.split(":").last().toInt()
    val travelTime = 457

    val arrivalTimeInMinutes = departureTimeInMinutes + travelTime
    val arrivalTimeHours = arrivalTimeInMinutes / 60
    val arrivalTimeMinutes = arrivalTimeInMinutes - arrivalTimeHours * 60

    println("%02d:%02d".format(arrivalTimeHours, arrivalTimeMinutes))
}