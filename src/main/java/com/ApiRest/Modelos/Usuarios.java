/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ApiRest.Modelos;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Jefferson Rueda
 */

@Entity
@RequestMapping
@Table(name = "Usuarios")
public class Usuarios {
    
    @Id
    @Column(name = "CodigoCliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CodigoCliente;
    @Column(name="Nombres", nullable = false,length = 60)
    private String Nombres;
    @Column(name="Apellidos", nullable = false,length = 60)
    private String Apellidos;
    private int telefono;
    private String direccion;
    @Column(name="NivelCliente", nullable = false)
    private String NivelCliente;

    public int getCodigoCliente() {
        return CodigoCliente;
    }

    public void setCodigoCliente(int CodigoCliente) {
        this.CodigoCliente = CodigoCliente;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNivelCliente() {
        return NivelCliente;
    }

    public void setNivelCliente(String NivelCliente) {
        this.NivelCliente = NivelCliente;
    }
    

   

    
    
    
}
