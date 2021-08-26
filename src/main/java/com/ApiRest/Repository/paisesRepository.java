/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ApiRest.Repository;

import com.ApiRest.Modelos.PaisDestino;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jefferson Rueda
 */
public interface paisesRepository extends  CrudRepository<PaisDestino, Integer>{
    
}
