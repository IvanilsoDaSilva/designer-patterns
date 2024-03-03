package org.example.order

class DeliveredOrderState: OrderStateInterface{
    override fun processOrder(order: Order) {
        println("Pedido entregue!");
    }
}