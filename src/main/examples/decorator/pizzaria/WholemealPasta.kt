package org.example.pizza

class WholemealPasta(private val pizza:Pizza, private var porcentWholemealPasta:Double):PizzaDecorator(pizza) {
    public override fun preco(): Double {
        return pizza.preco()*1.2;
    }
}