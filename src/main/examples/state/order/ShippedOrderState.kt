package org.example.order

class ShippedOrderState: OrderStateInterface{
    public override fun processOrder(order: Order) {
        println("Pedido entregue!");
        order.setState(DeliveredOrderState())
    }
}