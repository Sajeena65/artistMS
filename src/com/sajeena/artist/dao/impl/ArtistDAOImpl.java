/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.artist.dao.impl;

import com.sajeena.artist.dao.artistDAO;
import com.sajeena.artist.entity.Artist;

/**
 *
 * @author Admin
 */
public class ArtistDAOImpl implements artistDAO {

    private int count = 0;
    private Artist[] Artistlist = new Artist[10];

    @Override
    public boolean insert(Artist ar) {
        if (count == Artistlist.length) {
            return false;
        }
        Artistlist[count] = ar;
        count++;
        return true;

    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < Artistlist.length; i++) {
            Artist c = Artistlist[i];
            if (c != null && c.getId() == id) {
                Artistlist[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Artist getbyId(int id) {
        for (int i = 0; i < Artistlist.length; i++) {
            Artist c = Artistlist[i];
            if (c != null && c.getId() == id) {

                return c;
            }
        }
        return null;
    }

    @Override
    public Artist[] getAll() {
        return Artistlist;
    }

}
