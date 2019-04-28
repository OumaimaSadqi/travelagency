/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelagency.travelagency.rest;

import com.travelagency.travelagency.domain.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.travelagency.travelagency.bean.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Oumaima
 */
@RestController
@RequestMapping("/voyage-api/client")
public class ClientRest {

    @Autowired
    private ClientService clientService;

    @PostMapping("/")
    public int save(@RequestBody Client client) {
        return clientService.save(client);

    }

    @GetMapping("/")
    public List<Client> findAll() {
        return clientService.findAll();

    }

}
