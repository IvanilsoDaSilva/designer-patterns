package org.example.pizza

class StuffedEdge(private val pizza:Pizza):PizzaDecorator(pizza) {
    override fun preco(): Double {
        return pizza.preco()+5.0;
    }
}