package org.example.database

import java.sql.Connection
import java.sql.DriverManager

class DatabaseConnection {
    private var connection: Connection? = null;

    // Caso ainda não possua uma valor é criada uma novo, se não o mesmo valor retornado sem criar outro
    public fun getConnection(): Connection {
        if (connection == null) {
            val url = "jdbc:mysql://localhost:3306/banco_de_dados";
            val username = "usuario";
            val password = "senha";

            connection = DriverManager.getConnection(url, username, password);
        }
        return connection!!;
    }
}
