package larilTes;


import herodion.larik;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class larikTest {
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a= {32,27,64,18,95,14,90,70,60,37};
      System.out.println("Asli");
         larik.cetak(a);
//         System.out.println("BubleSort Asending : ");
//        larik.bubleSort(a);
//        larik.cetak(a);
//          System.out.println("BubleSort Desending : ");
//        larik.bubleSortDes(a);
//        larik.cetak(a);
//          System.out.println("SelectionSort Asending : ");
//        larik.selectionSort(a);
//        larik.cetak(a);
//        System.out.println("SelectionSort Desending : ");
//        larik.selectionSortDes(a);
//        larik.cetak(a);
//        System.out.println("InsertionSort Asending : ");
//       larik.insertionSort(a);
//        larik.cetak(a);
//        System.out.println("InsertionSort Dessending : ");
//        larik.insertionSortDes(a);
//        larik.cetak(a);
//        System.out.printf("%s%8s\n","indeks","Value");
//        
//       
//        
//        
         int cari = 95;
//     
//     
//larik.cetak(a);
//       System.out.println("indeks dari sequential search : "+larik.SequentialSearch(a, cari));
System.out.println("indeks dari binary search : "+larik.BinarySearch(a, cari)); 
System.out.println("Indeks dari interpolation search : "+larik.interpolationSearch(a, cari));
//      larik.cetak(a);
//        System.out.println("QuickSort Ascending : ");
//          larik.QuickSort(a);
//           larik.cetak(a);
//          System.out.println("QuickSort Descending : ");
//          larik.QuickSortDes(a);
//          larik.cetak(a);
    }
}
