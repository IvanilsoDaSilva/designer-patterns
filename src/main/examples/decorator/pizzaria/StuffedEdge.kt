package org.example.pizza

class StuffedEdge(private val pizza:Pizza, private var edgeType:String):PizzaDecorator(pizza) {
    public override fun price(): Double {
        return pizza.price()+5.0;
    }

    override fun describe(): String {
        return pizza.describe()+"\n -> Tipo da borda: "+this.edgeType;
    }
}