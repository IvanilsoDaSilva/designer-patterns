package org.example.payment

class CreditCardPayment:PaymentStrategy {
    public override fun pay(value: Double) {
        println("Pagou no credito: "+value+" Reais");
    }
}