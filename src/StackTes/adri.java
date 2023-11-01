/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackTes;

import herodion.Queque;

/**
 *
 * @author ACER
 */
public class adri {
     public static void main(String[] args) {
        Queque antrian = new Queque(7);
        antrian.enqueque(26);
        antrian.enqueque(15);
        antrian.enqueque(8);
        antrian.enqueque(14);
        antrian.enqueque(3);
        antrian.enqueque(2);
       
        
        
        System.out.println(" Antrean : " + antrian.toString());
        System.out.println(" jumlah antrean : " + antrian.size() + "\n");

        System.out.println(" keluar " + antrian.dequeque());
        System.out.println(" keluar " + antrian.dequeque());
        System.out.println(" Antrean : " + antrian.toString());
        System.out.println(" jumlah antrean : " + antrian.size() + "\n");
        System.out.println(" keluar " + antrian.dequeque());
        System.out.println(" keluar " + antrian.dequeque());
        System.out.println(" Antrean : " + antrian.toString());
        System.out.println(" jumlah antrean : " + antrian.size() + "\n");
        System.out.println(" keluar " + antrian.dequeque());
        System.out.println(" keluar " + antrian.dequeque() + "\n");

        System.out.println(" Antrean : " + antrian.toString());
        System.out.println(" jumlah antrean : " + antrian.size() + "\n");
        
        antrian.enqueque(5);
        antrian.enqueque(3);
        antrian.enqueque(2);
        
       
        System.out.println(" Antrean : " + antrian.toString());
}

}
