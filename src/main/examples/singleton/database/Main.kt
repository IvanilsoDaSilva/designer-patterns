package org.example.database

fun main() {
    // Criação do objeto
    var database: DatabaseConnection? = DatabaseConnection();

    println(database?.getConnection());
}