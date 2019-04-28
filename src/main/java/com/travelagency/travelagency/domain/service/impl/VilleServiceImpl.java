/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelagency.travelagency.domain.service.impl;

import com.travelagency.travelagency.bean.Ville;
import com.travelagency.travelagency.domain.dao.VilleDao;
import com.travelagency.travelagency.domain.service.VilleService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Oumaima
 */
public class VilleServiceImpl implements VilleService {

    @Autowired
    private VilleDao villeDao;

    @Override
    public Ville findByLibelle(String libelle) {
        return villeDao.findByLibelle(libelle);

    }

}
