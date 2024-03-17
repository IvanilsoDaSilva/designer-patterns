package org.example.pizza

class PizzaArtesao(private val ingredients: HashMap<String, Double>) : Pizza {

    override fun preco(): Double {
        var value:Double = 0.0;
        for (ingredient in ingredients) {
            value = value + ingredient.value;
        }
        return value;
    }
}