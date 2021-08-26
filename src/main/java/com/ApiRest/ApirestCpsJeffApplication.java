package com.ApiRest;

import com.ApiRest.ClsConexion.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApirestCpsJeffApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApirestCpsJeffApplication.class, args);

    }

}
