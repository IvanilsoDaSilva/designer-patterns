package org.example.graphicalinterface

import org.example.events.EventObserverInterface

class Painel:ComponentGUI {
    private var components: MutableList<ComponentGUI> = mutableListOf();

    public fun addComponent(component: ComponentGUI){
        if (!component.equals(this)) {
            components.addLast(component);
        } else {
            println("O painel não pode se adicionar")
        }

    }

    public fun removeComponent(component: ComponentGUI){
        components.remove(component);
    }

    public override fun renderizar() {
        println("Renderizando painel com components: ");
        for (component in components){
            component.renderizar();
        }
    }
}