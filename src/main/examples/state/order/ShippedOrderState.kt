package org.example.order

class ShippedOrderState: OrderStateInterface{
    public override fun processOrder(order: Order) {
        println("Pedido em envio!");
    }
}