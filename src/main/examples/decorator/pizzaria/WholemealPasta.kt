package org.example.pizza

class WholemealPasta(private val pizza:Pizza):PizzaDecorator(pizza) {
    override fun preco(): Double {
        return pizza.preco()*1.2;
    }
}