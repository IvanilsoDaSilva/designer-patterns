package org.example.configuration

fun main() {
    var configurations: ConfigurationsManager? = ConfigurationsManager()

    println(configurations?.getConfigurations().toString())
}