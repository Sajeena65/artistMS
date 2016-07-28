/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.artist.dao;

import com.sajeena.artist.entity.Artist;

/**
 *
 * @author Admin
 */
public interface artistDAO {
      boolean insert(Artist ar);
    boolean delete(int id);
    Artist getbyId(int id);
    Artist[] getAll();
    
}
