package org.example.pizza

fun main() {
    val ingredients: HashMap<String, Double> = HashMap();
    ingredients["Chocolate"] = 2.00;
    ingredients["Morango"] = 4.00;
    ingredients["Uva"] = 4.00;

    val pizza:Pizza = PizzaArtesao(ingredients);

    val opcoesPizza:Pizza = StuffedEdge(WholemealPasta(pizza));

    println("Pizza sem opções"+pizza.preco());
    println("Pizza com opções"+opcoesPizza.preco());
}
