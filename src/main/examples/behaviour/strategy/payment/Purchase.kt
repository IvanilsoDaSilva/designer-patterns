package org.example.payment

class Purchase(private val value:Double) {
    public fun processPayment(paymentStrategy:PaymentStrategy){
        paymentStrategy.pay(value);
    }
}