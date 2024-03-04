package org.example.events

class EventNotifier {
    private val observers: MutableList<EventObserverInterface> = mutableListOf();

    public fun addObserver(observer: EventObserverInterface) {
        observers.add(observer)
    }

    public fun removeObserver(observer: EventObserverInterface) {
        observers.remove(observer)
    }

    public fun doSomething() {
        // Realiza alguma ação


        // Quando algo interessante acontece, notifica os observadores
        notifyObservers("Alguma coisa aconteceu!")
    }

    private fun notifyObservers(event: String) {
        for (observer in observers) {
            observer.update(event)
        }
    }
}
