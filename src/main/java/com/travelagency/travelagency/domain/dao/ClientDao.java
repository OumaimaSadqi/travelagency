/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelagency.travelagency.domain.dao;

import org.springframework.stereotype.Repository;
import com.travelagency.travelagency.bean.Client;
import org.springframework.data.jpa.repository.JpaRepository;     

/**
 *
 * @author Oumaima
 */
@Repository
public interface ClientDao extends JpaRepository<Client, Long>{
    public Client findByCin(String cin);
    
}
