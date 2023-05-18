package ru.netology

const val ERROR_LIMIT_DAY = -1
const val ERROR_LIMIT_MONTH = -2
fun main() {
    println(amountFee(1000000))
}
fun amountFee(
    amount: Int,
    amountMonth: Int = 0,
    cardType: String = "VK Pay"
): Int = when {
    cardType == "VK Pay" && amount > 15_000 -> ERROR_LIMIT_DAY
    cardType == "VK Pay" && amountMonth > (40_000 - amount) -> ERROR_LIMIT_MONTH
    cardType != "VK Pay" && amount > 150_000 -> ERROR_LIMIT_DAY
    cardType != "VK Pay" && amountMonth > (600_000 - amount) -> ERROR_LIMIT_MONTH
    else -> when {
        (cardType == "Mastercard" || cardType == "Maestro") && amountMonth > (75000 - amount) -> amount * 6 / 10 / 100 + 20
        (cardType == "Visa" || cardType == "Мир") && (amount * 75 / 100 / 100) > 35 -> amount * 75 / 100 / 100
        (cardType == "Visa" || cardType == "Мир") && (amount * 75 / 100 / 100) < 35 -> 35
        else -> 0
    }
}