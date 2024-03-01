package org.example.duckturkey

class Turkey: TurkeyInterface {
    override fun gobble() {
        println("Gobble")
    }

    override fun fly() {
        println("I'm flying a short distance")
    }
}