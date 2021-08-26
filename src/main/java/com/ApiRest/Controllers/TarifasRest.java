/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ApiRest.Controllers;

import com.ApiRest.ClsConexion.Conexion;
import com.ApiRest.Service.TarifasService;
import com.ApiRest.Modelos.Tarifas;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jefferson Rueda
 */
@CrossOrigin(origins = "http://localhost:4200")//aqui le doy permisos para que se pueda conectar con mi app angular
@RestController
@RequestMapping("/tarifas")//url que se van a exponer los serivios
public class TarifasRest {

    @Autowired
    private TarifasService tfService;

    @GetMapping("/mostrar")//obtenemos todos los datos que tenemos almacenados
    public List<Tarifas> getTarifas()//metodo tipo generico de la entidad tarifas, me retorna todos los datos de la base de datos
    {
        return tfService.obtenertarifas();
    }

    @GetMapping("/formula")
    public List<Object> users() {

        Conexion cn = new Conexion();

         return cn.conexion();
    }


    @PostMapping("/creartarifa")
    public ResponseEntity<Tarifas> agregartarifa(@RequestBody Tarifas tf)//metodo que me crea una nueva tarifa que esta relacionada con el cliente
    {
        Tarifas newtarifa = tfService.guardartf(tf);

        return ResponseEntity.ok(newtarifa);
    }

//    @DeleteMapping(value = "/{Id_tarifa}")
//    public void eliminar(@PathVariable("Id_tarifa") Integer Id_tarifa)//metodo tipo generico de la entidad tarifas, me retorna todos los datos de la base de datos
//    {
//        tfService.deleteById(Id_tarifa);
//    }
//    
}
