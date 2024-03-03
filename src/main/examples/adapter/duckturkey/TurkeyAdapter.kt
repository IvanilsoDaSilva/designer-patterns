package org.example.duckturkey

class TurkeyAdapter(private val turkey: Turkey) : DuckInterface {
    // Um peru quack() se traduz em um gobble() do peru
    override fun quack() {
        turkey.gobble();
    }

    // Um peru precisa voar algumas vezes para alcançar a mesma distância de um pato
    override fun fly() {
        for (i in 0 until 5) {
            turkey.fly();
        }
    }
}