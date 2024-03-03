package org.example.duckturkey

class Duck: DuckInterface {
    override fun quack() {
        println("Quack");
    }

    override fun fly() {
        println("I'm flying");
    }
}