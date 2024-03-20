package org.example.order

class DeliveredOrderState: OrderStateInterface{
    public override fun processOrder(order: Order) {
        println("Pedido finalizado!");
    }
}