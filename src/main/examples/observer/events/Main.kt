package org.example.events

fun main() {
    // Criando um observável
    val eventNotifier = EventNotifier()

    // Criando observadores
    val observer1 = Logging("Observer 1")
    val observer2 = Logging("Observer 2")

    // Adicionando observadores
    eventNotifier.addObserver(observer1)
    eventNotifier.addObserver(observer2)

    // Realizando uma ação que notifica os observadores
    eventNotifier.doSomething()

    // Removendo um observador
    eventNotifier.removeObserver(observer2)

    // Realizando a mesma ação novamente
    eventNotifier.doSomething()
}