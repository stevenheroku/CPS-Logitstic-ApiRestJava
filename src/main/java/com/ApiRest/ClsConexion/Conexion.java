/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ApiRest.ClsConexion;

import com.ApiRest.Modelos.Tarifas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author Jefferson Rueda
 */
public class Conexion {

    public List<Object> conexion() {
        String connectionUrl = "jdbc:sqlserver://LAPTOP-GKNJP61S\\\\JRODRIGUEZR:1433;databaseName=CPS_ApiRest;user=CPS_Prueba; password=$SQLSERVER4200$;";
        // Declaramos los sioguientes objetos
        List<Object> result = new ArrayList<Object>();
        try {
            //Establecemos la conexión
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(connectionUrl);
            System.out.println("CONEXION EXITOSA");
            // Create and execute an SQL statement that returns some data.
            String SQL = "select ((peso*monto_tarifa)+1.66*alto*largo*ancho-descuento_cliente*0.5*peso) from tarifas";
            Statement st;
            ResultSet rs;
            ResultSetMetaData md;
            st = con.createStatement();
            rs = st.executeQuery(SQL);
            md = rs.getMetaData();
            int columnas = md.getColumnCount();
            while (rs.next()) {
                Object dato = new Object[columnas];
                for (int i = 1; i <= columnas; i++) {
                    dato = rs.getObject(i);
                }
                result.add(dato);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
    
    

