package ru.netology

import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun amountFee_mir() {
        val sum = 10_000
        val sumMonth = 0
        val card = "Мир"

        val result = ru.netology.amountFee(amount = sum, amountMonth = sumMonth, cardType = card)

        assertEquals(75, result)
    }

    @Test
    fun amountFee_vkPay() {
        val sum = 10_000
        val sumMonth = 0
        val card = "VK Pay"

        val result = ru.netology.amountFee(amount = sum, amountMonth = sumMonth, cardType = card)

        assertEquals(0, result)
    }

    @Test
    fun amountFee_vkPayLimitDay() {
        val sum = 16_000
        val sumMonth = 0
        val card = "VK Pay"

        val result = ru.netology.amountFee(amount = sum, amountMonth = sumMonth, cardType = card)

        assertEquals(-1, result)
    }

    @Test
    fun amountFee_vkPayLimitMonth() {
        val sum = 10_000
        val sumMonth = 45_000
        val card = "VK Pay"

        val result = ru.netology.amountFee(amount = sum, amountMonth = sumMonth, cardType = card)

        assertEquals(-2, result)
    }

    @Test
    fun amountFee_visaLimitDay() {
        val sum = 160_000
        val sumMonth = 0
        val card = "Visa"

        val result = ru.netology.amountFee(amount = sum, amountMonth = sumMonth, cardType = card)

        assertEquals(-1, result)
    }

    @Test
    fun amountFee_visaLimitMonth() {
        val sum = 10_000
        val sumMonth = 600_000
        val card = "Visa"

        val result = ru.netology.amountFee(amount = sum, amountMonth = sumMonth, cardType = card)

        assertEquals(-2, result)
    }

    @Test
    fun amountFee_visaFee35() {
        val sum = 1_000
        val sumMonth = 0
        val card = "Visa"

        val result = ru.netology.amountFee(amount = sum, amountMonth = sumMonth, cardType = card)

        assertEquals(35, result)
    }

    @Test
    fun amountFee_visaFee() {
        val sum = 100_000
        val sumMonth = 0
        val card = "Visa"

        val result = ru.netology.amountFee(amount = sum, amountMonth = sumMonth, cardType = card)

        assertEquals(750, result)
    }

    @Test
    fun amountFee_mirFee35() {
        val sum = 1_000
        val sumMonth = 0
        val card = "Мир"

        val result = ru.netology.amountFee(amount = sum, amountMonth = sumMonth, cardType = card)

        assertEquals(35, result)
    }

    @Test
    fun amountFee_mastercardPromo() {
        val sum = 75_000
        val sumMonth = 0
        val card = "Mastercard"

        val result = ru.netology.amountFee(amount = sum, amountMonth = sumMonth, cardType = card)

        assertEquals(0, result)
    }

    @Test
    fun amountFee_mastercardNoPromo() {
        val sum = 100_000
        val sumMonth = 0
        val card = "Mastercard"

        val result = ru.netology.amountFee(amount = sum, amountMonth = sumMonth, cardType = card)

        assertEquals(620, result)
    }
}