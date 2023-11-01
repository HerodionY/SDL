/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author ACER
 */
public class test {
     public static void main(String[] args) {
        // TODO code application logic here
        int [] a= {32,27,64,18,95,14,90,70,60,37};
         for (int i = 0; i < a.length; i++) {
             System.out.println(a[i]);
         }
         System.out.println("Setelah Disorting");
     larik.insertionSort(a);
     for (int i = 0; i < a.length; i++) {
             System.out.println(a[i]);
            
        
         }
      int cari=64;
              System.out.println("indeks dari sequential search : "+larik.SequentialSearch3(a, cari));
       System.out.println("indeks dari binary search : "+larik.binarySearch3(a, cari)); 
        System.out.println("Indeks dari interpolation search : "+larik.InterpolationSearch3(a, cari));
     
     }
}
