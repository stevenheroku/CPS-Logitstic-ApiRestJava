/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ApiRest.Service;



import com.ApiRest.Modelos.Tarifas;
import com.ApiRest.Modelos.Usuarios;
import com.ApiRest.Repository.tarifasRepository;
import com.ApiRest.Repository.usuariosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Jefferson Rueda
 */
@Service
public class TarifasService {

    //@Autowired
    //private TarifasDao tarifasDao;
    //private Usuarios user;


    
    @Autowired
    private tarifasRepository uRepository ;
    
    //obtener todas las tarifas
    
   
    public List<Tarifas> obtenertarifas()
    {
        return (List<Tarifas>) uRepository.findAll();
    }
       
    //metodo que me aguarda una nueva tarifa
    public Tarifas guardartf(Tarifas tf)
    {
        return uRepository.save(tf);
    }
    
    

  
    
}
