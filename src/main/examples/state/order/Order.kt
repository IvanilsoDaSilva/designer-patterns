package org.example.order

class Order {
    private var state: OrderStateInterface? = null;

    init {
        this.state = PendingOrderState();
    }

    fun setState(state:OrderStateInterface){
        this.state = state;
    }

    fun processOrder(){
        this.state?.processOrder(this);
    }
}