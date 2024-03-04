package org.example.temperature

class DisplayDevice(private val name: String): TemperatureObserverInterface {
    public override fun update(temperature: Double) {
        System.out.println(name + ": A temperatura atual é: " + temperature + "°C");
    }
}