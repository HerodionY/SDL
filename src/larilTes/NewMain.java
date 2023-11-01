/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package larilTes;

import herodion.larik;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double waktuAwal;
        double waktuAkhir;
        
        System.out.println("");
        
        int[] data = new int[100000];
        
        System.out.println("____________________________________");
        System.out.println("             Bubble Sort            ");
        System.out.println("____________________________________");
        
        for (int i = 0; i < data.length; i++) {
            data[i] = (int)Math.random()*100;
        }
        
        waktuAwal = System.nanoTime();
        larik.bubleSort(data);
        waktuAkhir = System.nanoTime();
        
        System.out.printf("Waktu Awal  : %.0f\n", waktuAwal);
        System.out.printf("Waktu Akhir : %.0f\n", waktuAkhir);
        System.out.printf("Estimasi    : %.9f\n", (waktuAkhir-waktuAwal)/10e9);
        
        System.out.println("____________________________________");
        System.out.println("           Selection Sort           ");
        System.out.println("____________________________________");
        
        for (int i = 0; i < data.length; i++) {
            data[i] = (int)Math.random()*100;
        }
        
        waktuAwal = System.nanoTime();
        larik.selectionSort(data);
        waktuAkhir = System.nanoTime();
        
        System.out.printf("Waktu Awal  : %.0f\n", waktuAwal);
        System.out.printf("Waktu Akhir : %.0f\n", waktuAkhir);
        System.out.printf("Estimasi    : %.9f\n", (waktuAkhir-waktuAwal)/10e9);
        
        System.out.println("____________________________________");
        System.out.println("           Insertion Sort           ");
        System.out.println("____________________________________");
        
        for (int i = 0; i < data.length; i++) {
            data[i] = (int)Math.random()*100;
        }
        
        waktuAwal = System.nanoTime();
        larik.insertionSort(data);
        waktuAkhir = System.nanoTime();
        
        System.out.printf("Waktu Awal  : %.0f\n", waktuAwal);
        System.out.printf("Waktu Akhir : %.0f\n", waktuAkhir);
        System.out.printf("Estimasi    : %.9f\n", (waktuAkhir-waktuAwal)/10e9);
        
        System.out.println("____________________________________");
        System.out.println("              Quick Sort            ");
        System.out.println("____________________________________");
        
        for (int i = 0; i < data.length; i++) {
            data[i] = (int)Math.random()*100;
        }
        
        waktuAwal = System.nanoTime();
        larik.QuickSort(data);
        waktuAkhir = System.nanoTime();
        
        System.out.printf("Waktu Awal  : %.0f\n", waktuAwal);
        System.out.printf("Waktu Akhir : %.0f\n", waktuAkhir);
        System.out.printf("Estimasi    : %.9f\n", (waktuAkhir-waktuAwal)/10e9);
    }  
}
    

