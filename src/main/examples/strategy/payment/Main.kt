package org.example.payment

fun main() {
    val compra:Compra = Compra(10.00);

    compra.processPayment(CreditCardPayment());
    compra.processPayment(DebitCardPayment());
}