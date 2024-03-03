package org.example.order

class ShippedOrderState: OrderStateInterface{
    override fun processOrder(order: Order) {
        println("Pedido em envio!");
    }
}