/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ApiRest.Controllers;


import com.ApiRest.Modelos.PaisDestino;
import com.ApiRest.Service.PaisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jefferson Rueda
 */

@CrossOrigin(origins ="http://localhost:4200")//aqui le doy permisos para que se pueda conectar con mi api Resy
@RestController
@RequestMapping("/paises")
public class PaisDestinoRest {
    

   
    
    @Autowired
    private PaisService paisService;
    
     @GetMapping("/view")
    public List<PaisDestino> getpaises()//metodo tipo generico de la entidad tarifas, me retorna todos los datos de la base de datos
    {
       //List<PaisDestino> destino = paisDestinoDao.findAll();

        return paisService.paiseslista();
    }
    
    @PostMapping("/newpais")
    public void agregar(@RequestBody PaisDestino ps)//metdo que me inserta un nuevo pais destino a mi base de datos
    {
        paisService.postPaisDestino(ps);
    }
    
    
    
    @DeleteMapping(value = "/{id_pais_destino}")
    public void eliminar(@PathVariable("id_pais_destino") Integer id_pais_destino)//metodo que me eliminar un registro de mi base de datos
    {
       // paisService.deleteById(id_pais_destino);
    }
    
    
}
