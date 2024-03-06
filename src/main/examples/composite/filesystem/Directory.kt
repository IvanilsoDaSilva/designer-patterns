package org.example.filesystem

class Directory(private val name: String) : ComponentSystem {
    private val children = mutableListOf<ComponentSystem>()

    fun addChildren(child: ComponentSystem) {
        if (!child.equals(this)) {
            children.add(child);
        } else {
            println("O diretorio não pode se adicionar");
        }
    }

    fun removeChildren(child: ComponentSystem) {
        children.remove(child);
    }

    override fun showInfo() {
        println("Diretório: $name");

        children.forEach {
            it.showInfo()
        };
    }
}