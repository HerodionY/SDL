/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StackTes;

import herodion.Queque;

/**
 *
 * @author ACER
 */
public class QuequeTes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queque antrian = new Queque(7);
        antrian.enqueque(26);
        antrian.enqueque(15);
        antrian.enqueque(8);
        antrian.enqueque(14);
        antrian.enqueque(0);
        antrian.enqueque(100);
        antrian.enqueque(200);
        
        
        System.out.println(antrian.toString());
        System.out.println(antrian.dequeque());
        System.out.println(antrian.dequeque());
        antrian.enqueque(77);
        antrian.enqueque(78);
        System.out.println(antrian.toString());
    }
}
