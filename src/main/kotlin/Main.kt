package ru.netology

fun main() {
    val purchasePrice = 15_001.0
    val regularCustomer = true

    val standartDiscount =
        if (purchasePrice > 0 && purchasePrice <= 1000) purchasePrice
        else if (purchasePrice > 1000 && purchasePrice <= 10_000) purchasePrice - 100
        else  purchasePrice * 0.95
    println(
        String.format(
            "%.2f",
            if (regularCustomer) standartDiscount * 0.99
            else standartDiscount
        )
    )
}