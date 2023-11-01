/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;
import java.util.Arrays;
import herodion.larik;

/**
 *
 * @author ACER
 */
public class arrayMain {
    public static void main(String[] args){
     int[] a={ 5, 8, 26,15,11,31};
          int cari = 15;
     
     Arrays.sort(a);
larik.cetak(a);
       System.out.println("indeks dari sequential search : "+larik.SequentialSearch(a, cari));
        System.out.println("indeks dari binary search : "+larik.BinarySearch(a, cari)); 
        System.out.println("Indeks dari interpolation search : "+larik.interpolationSearch(a, cari));
        
    
    
    
    
    }
    
}
