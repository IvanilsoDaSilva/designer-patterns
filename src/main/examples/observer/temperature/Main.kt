package org.example.temperature

fun main() {
    // Criar uma estação meteorológica
    val weatherStation = WeatherStation()

    // Criar dispositivos de exibição (observadores)
    val phoneDisplay = DisplayDevice("Phone")
    val carDisplay = DisplayDevice("Car")

    // Adicionar dispositivos de exibição como observadores
    weatherStation.addObserver(phoneDisplay)
    weatherStation.addObserver(carDisplay)

    // Simular uma mudança na temperatura
    weatherStation.setTemperature(25.0) // A temperatura atual é: 25°C
    weatherStation.setTemperature(30.0) // A temperatura atual é: 30°C
}