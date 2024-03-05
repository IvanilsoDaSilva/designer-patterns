package org.example.graphicalinterface

class Input(private var text:String): ComponentGUI {
    public override fun renderizar() {
        println("Renderizando input com texto: $text");
    }
}