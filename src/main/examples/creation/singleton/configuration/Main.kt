package org.example.configuration

fun main() {
    // Criação do objeto
    var configurations: ConfigurationsManager? = ConfigurationsManager();

    println(configurations?.getConfigurations().toString());
}