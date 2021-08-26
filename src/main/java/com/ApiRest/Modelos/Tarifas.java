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

/**
 *
 * @author Jefferson Rueda
 */

@Entity
@Table(name="Tarifas")
public class Tarifas {
    
    
    @Id
    @Column(name ="Id_Tarifa")
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_tarifa;
    @NotNull
    private int Id_Cliente;
    @NotNull
    private int Id_PaisDestino;
    private float Peso;
    private float Ancho;
    private float Alto;
    private float Largo;
    @Column(name="NombrePaisOrigen", nullable = false,length = 60)
    private String NombrePaisOrigen;
    @Column(name="NombreRegion", nullable = false,length = 60)
    private String NombreRegion;
    @NotNull
    private float DescuentoCliente;// se la aplicara un descuento del 10% a los clientes con nivel = cliente
    @NotNull
    private float MontoTarifa;//monto de la tarifa
    

    public int getId_tarifa() {
        return Id_tarifa;
    }

    public void setId_tarifa(int Id_tarifa) {     
        this.Id_tarifa = Id_tarifa;
    }

    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

    public int getId_PaisDestino() {
        return Id_PaisDestino;
    }

    public void setId_PaisDestino(int Id_PaisDestino) {
        this.Id_PaisDestino = Id_PaisDestino;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    public float getAncho() {
        return Ancho;
    }

    public void setAncho(float Ancho) {
        this.Ancho = Ancho;
    }

    public float getAlto() {
        return Alto;
    }

    public void setAlto(float Alto) {
        this.Alto = Alto;
    }

    public float getLargo() {
        return Largo;
    }

    public void setLargo(float Largo) {
        this.Largo = Largo;
    }

    public String getNombrePaisOrigen() {
        return NombrePaisOrigen;
    }

    public void setNombrePaisOrigen(String NombrePaisOrigen) {
        this.NombrePaisOrigen = NombrePaisOrigen;
    }

    public String getNombreRegion() {
        return NombreRegion;
    }

    public void setNombreRegion(String NombreRegion) {
        this.NombreRegion = NombreRegion;
    }

    public float getDescuentoCliente() {
        
        
        
            return DescuentoCliente;
      
    }

    public void setDescuentoCliente(float DescuentoCliente) {
        this.DescuentoCliente = DescuentoCliente;
    }

    public float getMontoTarifa() {
        return MontoTarifa;
    }

    public void setMontoTarifa(float MontoTarifa) {
        this.MontoTarifa = MontoTarifa;
    }



   
    
   
    
    

    

    
    

   
    
    

    
    
}
