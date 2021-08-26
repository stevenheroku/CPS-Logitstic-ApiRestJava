/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ApiRest.Service;

import com.ApiRest.Modelos.PaisDestino;
import com.ApiRest.Repository.paisesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jefferson Rueda
 */
@Service
public class PaisService {
    
    @Autowired
    private paisesRepository pRepository;
    
    public List<PaisDestino> paiseslista()
    {
        return (List<PaisDestino>) pRepository.findAll();
    }
    
    public PaisDestino postPaisDestino(PaisDestino ps)
    {
        return pRepository.save(ps);
    }
    
}
