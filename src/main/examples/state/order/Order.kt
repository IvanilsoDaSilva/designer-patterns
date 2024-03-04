package org.example.order

class Order {
    private var state: OrderStateInterface? = null;

    init {
        this.state = PendingOrderState();
    }

    public fun setState(state:OrderStateInterface){
        this.state = state;
    }

    public fun processOrder(){
        this.state?.processOrder(this);
    }
}