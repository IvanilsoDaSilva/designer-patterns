package org.example.events

import org.example.events.EventObserverInterface

class Logging(private val name: String): EventObserverInterface {
    override fun update(event: String) {
        println("$name recebeu a notificação: $event")
    }
}