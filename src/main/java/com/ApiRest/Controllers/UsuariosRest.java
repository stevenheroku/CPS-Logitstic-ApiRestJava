/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ApiRest.Controllers;

import com.ApiRest.Modelos.Usuarios;
import com.ApiRest.Service.UsuariosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jefferson Rueda
 */

@CrossOrigin(origins ="http://localhost:4200")//aqui le doy permisos para que se pueda conectar con mi app
@RestController
@RequestMapping("/cliente")
public class UsuariosRest {
    
    @Autowired
    private UsuariosService usService;
    
     @GetMapping("/user")
    public List<Usuarios> getusuarios()//metodo que me retorna todos los registros almacenados en la tabla
    {
        return  (List<Usuarios>) usService.getclientes();
    }
    
    @PostMapping("/newuser")
    public void agregar(@RequestBody Usuarios ps)//metodo tipo generico de la entidad tarifas, me retorna todos los datos de la base de datos
    {
        usService.crearcliente(ps);
    }
    
    
    @DeleteMapping(value = "/{codigo_cliente}")
    public void eliminar(@PathVariable("codigo_cliente") Integer codigo_cliente)//metodo que elimina por medio del ID enviado en la ruta
    {
     //   usuariosDao.deleteById(codigo_cliente);
    }
    
}
