package org.example.temperaturesensor

interface TemperatureListenerInterface {
    fun onTemperatureChange(temperature: Double);
}