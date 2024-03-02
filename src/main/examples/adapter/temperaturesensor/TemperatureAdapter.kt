package org.example.temperaturesensor

class TemperatureAdapter(private val temperatureSensor: TemperatureSensor) : TemperatureListenerInterface {
    override fun onTemperatureChange(temperature: Double) {
        // Converte a temperatura de Celsius para Fahrenheit
        val fahrenheitTemperature = (temperature * 9 / 5) + 32
        println("Temperature in Fahrenheit: $fahrenheitTemperature")
    }

    fun startListening() {
        onTemperatureChange(temperatureSensor.getCelsiusTemperature())
    }
}