package org.example.temperaturesensor

fun main() {
    // Cria o sensor que moca o valor de 20 graus Celsius
    val temperatureSensor = TemperatureSensor();

    // Lendo o valor, usando o adapter para converter graus Celsius em Fahrenheit
    TemperatureAdapter(temperatureSensor).startListening();
}