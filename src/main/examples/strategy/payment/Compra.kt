package org.example.payment

class Compra(private val value:Double) {
    public fun processPayment(paymentStrategy:PaymentStrategy){
        paymentStrategy.pay(value);
    }
}