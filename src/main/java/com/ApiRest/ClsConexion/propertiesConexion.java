/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ApiRest.ClsConexion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Jefferson Rueda
 */
public class propertiesConexion {
    
    //cargo el archivo properties para poder realizar un servicio basado e la formula indicada
    public Properties realizarConexion() throws FileNotFoundException, IOException{
        Properties prd = new Properties();
        InputStream archivo = new FileInputStream("C:\\Users\\Jefferson Rueda\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\APIREST-CPS-JEFF\\src\\main\\resources\\application.properties");
        prd.load(archivo);
        return  prd;
        
    }
    
}
