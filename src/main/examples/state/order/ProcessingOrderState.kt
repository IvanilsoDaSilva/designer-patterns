package org.example.order

class ProcessingOrderState: OrderStateInterface{
    override fun processOrder(order: Order) {
        println("Pedido em processamento!");
    }
}