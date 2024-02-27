package org.example.database

fun main() {
    var database: DatabaseConnection? = DatabaseConnection()

    println(database?.getConnection())
}