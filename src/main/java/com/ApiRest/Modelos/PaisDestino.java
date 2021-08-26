/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ApiRest.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jefferson Rueda
 */

@Entity
@Table(name = "PaisDestino")
public class PaisDestino {
    
    @Id
    @Column(name = "Id_PaisDestino")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_PaisDestino;
     @Column(name="NombrePaisDestino", nullable = false,length = 60)
    private String NombrePaisDestino;
    private int CodigoPostal;

    public int getId_PaisDestino() {
        return Id_PaisDestino;
    }

    public void setId_PaisDestino(int Id_PaisDestino) {
        this.Id_PaisDestino = Id_PaisDestino;
    }

    public String getNombrePaisDestino() {
        return NombrePaisDestino;
    }

    public void setNombrePaisDestino(String NombrePaisDestino) {
        this.NombrePaisDestino = NombrePaisDestino;
    }

    public int getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(int CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }
    
    

    
     
}
