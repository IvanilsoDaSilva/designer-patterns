package org.example.payment

class CreditCardPayment:PaymentStrategy {
    override fun pay(value: Double) {
        println("Pagou no credito: "+value+" Reais");
    }
}