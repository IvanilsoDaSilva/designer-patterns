package org.example.payment

fun main() {
    val purchase:Purchase = Purchase(10.00);

    purchase.processPayment(CreditCardPayment());
    purchase.processPayment(DebitCardPayment());
}