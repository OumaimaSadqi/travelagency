/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelagency.travelagency.domain.service.impl;

import com.travelagency.travelagency.bean.Client;
import com.travelagency.travelagency.domain.dao.ClientDao;
import com.travelagency.travelagency.domain.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Oumaima
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;

    public ClientDao getClientDao() {
        return clientDao;
    }

    public void setClientDao(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    @Override
    public Client findByCin(String Cin) {
        return clientDao.findByCin(Cin);

    }

    @Override
    public int save(Client client) {
        if (clientDao.findByCin(client.getCin()) != null) {
            return -1;
        } else {
            clientDao.save(client);
            return 1;
        }
    }

   @Override
    public List<Client> findAll() {
        return clientDao.findAll();
    }

}
