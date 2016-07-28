/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.artist.entity;

/**
 *
 * @author Admin
 */
public class Artist {
     private int id,salary;
    private String Artistname,Age,Talent;
    private boolean status;

    public Artist() {
    }

    public Artist(int id, int salary, String Artistname, String Age, String Talent, boolean status) {
        this.id = id;
        this.salary = salary;
        this.Artistname = Artistname;
        this.Age = Age;
        this.Talent = Talent;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getArtistname() {
        return Artistname;
    }

    public void setArtistname(String Artistname) {
        this.Artistname = Artistname;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getTalent() {
        return Talent;
    }

    public void setTalent(String Talent) {
        this.Talent = Talent;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
