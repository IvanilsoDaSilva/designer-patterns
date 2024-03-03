package org.example.order

class PendingOrderState: OrderStateInterface{
    override fun processOrder(order: Order) {
        println("Pedido pendente!");
    }
}