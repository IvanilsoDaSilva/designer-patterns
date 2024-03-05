package org.example.graphicalinterface

class Label(private var text:String): ComponentGUI {
    public override fun renderizar() {
        println("Renderizando label com texto: $text");
    }
}