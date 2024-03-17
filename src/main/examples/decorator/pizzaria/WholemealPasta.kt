package org.example.pizza

class WholemealPasta(private val pizza:Pizza, private var porcentWholemealPasta:Double):PizzaDecorator(pizza) {
    public override fun price(): Double {
        return pizza.price()*1.2;
    }

    override fun describe(): String {
        return pizza.describe()+"\n -> Porcentagem de massa integral: "+this.porcentWholemealPasta+"%";
    }
}