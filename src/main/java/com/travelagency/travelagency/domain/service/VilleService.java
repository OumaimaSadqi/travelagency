/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.travelagency.travelagency.domain.service;
import com.travelagency.travelagency.bean.Ville;

/**
 *
 * @author Oumaima
 */
public interface VilleService {
    public Ville findByLibelle(String libelle);
    
}