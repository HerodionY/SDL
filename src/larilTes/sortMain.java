/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package larilTes;

import herodion.larik;
import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class sortMain {
    public static void main(String [] args){
        int []  array1=new int[100000];
       
        int n=array1.length;
        for (int i = 0; i < array1.length; i++) {
            array1[i]=(int)(Math.random()*100);
                 
       }
         int array2[]=Arrays.copyOf(array1, n);
         int array3[]=Arrays.copyOf(array1, n);
         int array4[]=Arrays.copyOf(array1, n);
         
        System.out.println("");
         System.out.println("QuickSort");
     double start4 = System.nanoTime();
     
     
     larik.QuickSort(array4);
    
        
    double finish4 = System.nanoTime();
    
        System.out.println("Waktu yang dibutuhkan "+(finish4-start4)/1000000000);
        System.out.println("");
    System.out.println("InsertionSort");
     double start3 = System.nanoTime();
     
     
     larik.insertionSort(array3);
    
        
    double finish3 = System.nanoTime();
    
        System.out.println("Waktu yang dibutuhkan "+(finish3-start3)/1000000000);
        
        System.out.println("SelectionSort");
     double start1 = System.nanoTime();
    
     
     larik.selectionSort(array1);
    
        
    double finish1 = System.nanoTime();
    
        System.out.println("Waktu yang dibutuhkan "+(finish1-start1)/1000000000);
        
        System.out.println("");
        System.out.println("BubleSort");
     double start2 = System.nanoTime();
     
     
     larik.bubleSort(array2);
    
        
    double finish2 = System.nanoTime();
    
       
          System.out.println("Waktu yang dibutuhkan "+(finish2-start2)/1000000000);
    
    
    }
    
    
    
    
    }
    
    
    

