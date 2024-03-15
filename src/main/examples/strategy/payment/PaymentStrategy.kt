package org.example.payment

interface PaymentStrategy {
    fun pay(value:Double);
}