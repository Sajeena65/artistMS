/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sajeena.artist;

import com.sajeena.artist.dao.artistDAO;
import com.sajeena.artist.dao.impl.ArtistDAOImpl;
import com.sajeena.artist.entity.Artist;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        artistDAO artistdao = new ArtistDAOImpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1.Enter Artist detail:");
            System.out.println("2.Delete record:");
            System.out.println("3.Show all:");
            System.out.println("4.Search by Id:");
            System.out.println("5.Exit");
            System.out.println("Enter your choice [1-5]:");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Artist detail:");
                    Artist c = new Artist();
                    System.out.println("Enter Artist ID: ");
                    c.setId(input.nextInt());
                    System.out.println("Enter Artist Name: ");
                    c.setArtistname(input.next());

                    System.out.println("Enter Age : ");
                    c.setAge(input.next());

                    System.out.println("Enter talent:");
                    c.setTalent(input.next());
                    System.out.println("Enter Salary: ");
                    c.setSalary(input.nextInt());

                    System.out.println("Enter Status: ");
                    c.setStatus(input.nextBoolean());
                    if (artistdao.insert(c)) {
                        System.out.println("Inserted successfully");

                    } else {
                        System.out.println("Data Full");
                    }
                    break;
                case 2:
                    System.out.println("Enter the Id to delete: ");
                    int id = input.nextInt();
                    if (artistdao.delete(id)) {
                        System.out.println("Id No " + id + " is deleted successfully.");
                    } else {
                        System.out.println("Id not found.");
                    }

                    break;
                case 3:
                    System.out.println("Listing all Artists:");
                    Artist[] ar = artistdao.getAll();
                    for (int i = 0; i < ar.length; i++) {
                        Artist a = ar[i];
                        if (a != null) {
                            System.out.println("Id:" + a.getId());
                            System.out.println("Name:" + a.getArtistname());
                            System.out.println("Age:" + a.getAge());
                            System.out.println("Talent:" + a.getTalent());
                            System.out.println("Salary:" + a.getSalary());
                            System.out.println("Status:" + a.isStatus());

                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter Id:");
                    int a = input.nextInt();
                    Artist x = artistdao.getbyId(a);
                    if(x!=null){
                    System.out.println("Id:" + x.getId());
                    System.out.println("Name:" + x.getArtistname());
                    System.out.println("Age:" + x.getAge());
                    System.out.println("Talent:" + x.getTalent());
                    System.out.println("Salary:" + x.getSalary());
                    System.out.println("Status:" + x.isStatus());
                     }else
                    System.out.println("Artist could not be found.");
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

}
