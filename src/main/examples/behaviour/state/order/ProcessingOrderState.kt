package org.example.order

class ProcessingOrderState: OrderStateInterface{
    public override fun processOrder(order: Order) {
        println("Pedido em envio!");
        order.setState(ShippedOrderState())
    }
}