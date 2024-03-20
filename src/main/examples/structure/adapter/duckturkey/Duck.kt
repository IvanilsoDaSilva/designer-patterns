package org.example.duckturkey

class Duck: DuckInterface {
    public override fun quack() {
        println("Quack");
    }

    public override fun fly() {
        println("I'm flying");
    }
}