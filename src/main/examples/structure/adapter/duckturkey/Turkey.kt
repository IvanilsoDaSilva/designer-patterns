package org.example.duckturkey

class Turkey: TurkeyInterface {
    public override fun gobble() {
        println("Gobble");
    }

    public override fun fly() {
        println("I'm flying a short distance");
    }
}