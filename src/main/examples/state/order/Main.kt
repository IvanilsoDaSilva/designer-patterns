package org.example.order

fun main() {
    val pedido:Order = Order();

    pedido.processOrder();
    pedido.setState(ProcessingOrderState());
    pedido.processOrder();
    pedido.setState(ShippedOrderState())
    pedido.processOrder();
    pedido.setState(DeliveredOrderState())
    pedido.processOrder();
}