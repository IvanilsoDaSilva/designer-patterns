package org.example.payment

class DebitCardPayment:PaymentStrategy {
    public override fun pay(value: Double) {
        println("Pagou no debito: "+value+" Reais");
    }
}