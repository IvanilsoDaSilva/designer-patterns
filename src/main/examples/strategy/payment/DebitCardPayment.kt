package org.example.payment

class DebitCardPayment:PaymentStrategy {
    override fun pay(value: Double) {
        println("Pagou no debito: "+value+" Reais");
    }
}