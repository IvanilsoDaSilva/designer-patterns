package org.example.temperaturesensor

fun main() {
    val temperatureSensor = TemperatureSensor()

    TemperatureAdapter(temperatureSensor).startListening()
}