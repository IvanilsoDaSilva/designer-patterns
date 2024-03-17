package org.example.pizza

fun main() {
    val ingredients: HashMap<String, Double> = HashMap();
    ingredients["Chocolate"] = 2.00;
    ingredients["Morango"] = 4.00;
    ingredients["Uva"] = 4.00;

    val pizza:Pizza = PizzaArtesao(ingredients);

    var opcaoPizza:Pizza =
        WholemealPasta(StuffedEdge(pizza, "cheese"), 70.00);

    println("Pizza sem opções"+pizza.preco());
    println("Pizza com opções"+opcaoPizza.preco());
}
