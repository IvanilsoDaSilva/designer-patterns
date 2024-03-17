package org.example.pizza

class StuffedEdge(private val pizza:Pizza, private var edgeType:String):PizzaDecorator(pizza) {
    public override fun preco(): Double {
        return pizza.preco()+5.0;
    }
}