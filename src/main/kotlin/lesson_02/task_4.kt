package lesson_02

fun main () {
    val crystalOre = 7
    val ironOre = 11
    val buff = 0.2
    val buffedBonusCrystalOre = (crystalOre * buff).toInt()
    val buffedBonusIronOre = (ironOre * buff).toInt()

    println(buffedBonusCrystalOre)
    println(buffedBonusIronOre)
}