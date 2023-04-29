package ru.netology

fun main() {
    val amount = 1000
    val fee = 75
    val minFee = 35
    //Ставка была приведена в целочисленное значение. Вводится индекс для корректного расчета. Индекс не может быть равен 0
    val index = 1 * 100 * 100

    val amountFee = amount * fee / index
    val result = if (amountFee > minFee) amountFee else minFee
    println("Сумма комиссии за перевод: $result")
}