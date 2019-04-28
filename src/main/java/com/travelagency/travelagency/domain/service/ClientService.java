/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelagency.travelagency.domain.service;
import com.travelagency.travelagency.bean.Client;
import java.util.List;

/**
 *
 * @author Oumaima
 */
public interface ClientService {
    public Client findByCin (String Cin);
    public int save (Client client);
    public List<Client> findAll();
   
}
