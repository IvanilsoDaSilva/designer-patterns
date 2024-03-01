package org.example.configuration

class ConfigurationsManager{
    private var configurations: MutableMap<String, String>? = null

    // Caso ainda não possua uma valor é criada uma novo, se não o mesmo valor retornado sem criar outro
    public fun getConfigurations(): MutableMap<String, String>{
        if (configurations.isNullOrEmpty()) {
            configurations = mutableMapOf()

            configurations!!["spring.datasource.url"] = "jdbc:mysql://localhost:3306/banco_de_dados?useTimezone=true&serverTimezone=UTC"
            configurations!!["spring.datasource.username"] = "usuario"
            configurations!!["spring.datasource.password"] = "senha"
            configurations!!["spring.datasource.driver-class-name"] = "com.mysql.cj.jdbc.Driver"

            configurations!!["spring.jpa.show_sql"] = "true"
            configurations!!["spring.jpa.properties.hibernate.show_sql"] = "true"
            configurations!!["spring.jpa.hibernate.ddl-auto"] = "create-drop"

            configurations!!["server.port"] = "8080"
        }

        return configurations!!
    }
}