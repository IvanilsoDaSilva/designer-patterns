package org.example.database

import java.sql.Connection
import java.sql.DriverManager

class DatabaseConnection {
    private var connection: Connection? = null

    init {}

    public fun getConnection(): Connection {
        if (connection == null) {
            // Configurações de conexão com o banco de dados
            val url = "jdbc:mysql://localhost:3306/banco_de_dados"
            val username = "usuario"
            val password = "senha"

            // Estabelece a conexão com o banco de dados
            connection = DriverManager.getConnection(url, username, password)
        }
        return connection!!
    }
}