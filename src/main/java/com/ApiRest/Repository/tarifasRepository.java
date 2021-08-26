/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ApiRest.Repository;

import com.ApiRest.Modelos.Tarifas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jefferson Rueda
 */
@Repository
public interface tarifasRepository extends  CrudRepository<Tarifas, Integer>{
    
}
