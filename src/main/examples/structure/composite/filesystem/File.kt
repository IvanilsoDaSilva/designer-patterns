package org.example.filesystem

class File(private val name: String): ComponentSystem {
    public override fun showInfo() {
        println("Arquivo: $name");
    }
}