package lesson_02

import kotlin.math.pow

fun main () {
    val initialFee = 70_000
    val rate = 0.167
    val years = 20
    val daysInYear = 365
    val daysForFee = 365
    val finalFee = initialFee * (1 + rate * daysForFee / daysInYear * 1).pow(years)

    println("%.3f".format(finalFee))
}

/*
Формула выглядит следующим образом:

Σ = I * (1 + s * t / d * 100%) (в степени n),

где:

Σ — будущая сумма на счету;
I — начальная сумма вложений;
s — процентная ставка;
t — число дней, через который начисляется процентный доход;
d — число дней в году;
n — число периодов выплаты процентов.
Подробнее на сайте Banki.ru https://www.banki.ru/news/daytheme/?id=10994224
 */