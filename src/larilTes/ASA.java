/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package larilTes;

import herodion.larik;
import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class ASA {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        int[] array1 = new int[100];

        int n = array1.length;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 10000000
                    
                    );

        }
        int array2[] = Arrays.copyOf(array1, n);
        int array3[] = Arrays.copyOf(array1, n);
        int array4[] = Arrays.copyOf(array1, n);
        int find = 7;

      Arrays.sort(array4);
        


           System.out.println("Binary Search");
        double start1 = System.nanoTime();

        larik.BinarySearch(array4, find);

        double finish1 = System.nanoTime();

        System.out.println("Waktu yang dibutuhkan " + (finish1 - start1) / 1000000000);


        System.out.println("");
        System.out.println("Interpolation Search ");
        double start2 = System.nanoTime();

        larik.interpolationSearch(array4, find);

        double finish2 = System.nanoTime();

        System.out.println("Waktu yang dibutuhkan " + (finish2 - start2) / 1000000000);
        
        
    }

}
