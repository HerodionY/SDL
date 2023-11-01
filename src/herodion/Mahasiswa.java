/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herodion;

/**
 *
 * @author ACER
 */

import java.util.Scanner;
public class Mahasiswa implements Comparable{
    private String nama;
    private int nim;

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    Mahasiswa() {
           }

    Mahasiswa(int i) {
       this.nim=i;  }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
   
  
    @Override
    public String toString(){
       
        return  "Nama : "+nama+"  Nim : "+nim;
    
    
}

    @Override
    public int compareTo(Object o) {
        if (this.nim==((Mahasiswa)o).nim) {
            return 0;
            
        } 
        else if(this.nim<((Mahasiswa)o).nim){
            return -1;
        }else{return 1;}
    }
    
 
}
