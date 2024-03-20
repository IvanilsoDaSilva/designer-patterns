package org.example.pizza

class PizzaArtesao(private val ingredients: HashMap<String, Double>) : Pizza {

    public override fun price(): Double {
        var value:Double = 0.0;
        for (ingredient in ingredients) {
            value = value + ingredient.value;
        }
        return value;
    }

    override fun describe(): String {
        var ingredients:String = "";
        for (ingredient in this.ingredients) {
            ingredients = ingredients+ingredient.toString()+"\n";
        }
        return ingredients
    }
}