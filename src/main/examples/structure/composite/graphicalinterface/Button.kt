package org.example.graphicalinterface

class Button(private var text:String):ComponentGUI {
    public override fun renderizar() {
        println("Renderizando button com texto: $text");
    }
}