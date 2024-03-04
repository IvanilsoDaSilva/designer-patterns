package org.example.temperature

class WeatherStation {
    private var temperature: Double = 40.3;
    private val observers: MutableList<TemperatureObserverInterface> = mutableListOf();

    public fun addObserver(observer: TemperatureObserverInterface?) {
        observers.addLast(observer);
    }

    public fun removeObserver(observer: TemperatureObserverInterface?) {
        observers.removeAt(observers.indexOf(observer));
    }

    public fun setTemperature(temperature: Double) {
        this.temperature = temperature;
        notifyObservers();
    }

    private fun notifyObservers() {
        for (observer in observers) {
            observer.update(temperature);
        }
    }
}