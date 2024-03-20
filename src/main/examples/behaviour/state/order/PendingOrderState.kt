package org.example.order

class PendingOrderState: OrderStateInterface{
    public override fun processOrder(order: Order) {
        println("Pedido em processamento!");
        order.setState(ProcessingOrderState())
    }
}