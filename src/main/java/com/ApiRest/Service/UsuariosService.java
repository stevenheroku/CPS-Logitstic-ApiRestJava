/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ApiRest.Service;

import com.ApiRest.Modelos.Usuarios;
import com.ApiRest.Repository.usuariosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jefferson Rueda
 */
@Service
public class UsuariosService {
    
     @Autowired
    private usuariosRepository userRepository;
    
    public List<Usuarios> getclientes()
    {
        return (List<Usuarios>) userRepository.findAll();
    }
    
    public Usuarios crearcliente(Usuarios client)
    {
        return userRepository.save(client);
    }
    
}
