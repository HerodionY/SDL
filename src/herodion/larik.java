/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herodion;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class larik {

    public static void cetak(int[] y) {
        for (int i = 0; i < y.length; i++) {
            System.out.printf("%4d%8d\n", i, y[i]);

        }

    }

    public static int SequentialSearch(int array[], int x) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] == x) {
                return i;
            }
        }

        return -1;
    }

    public static int BinarySearch(int array[], int toFind) {

        int l = 0, h = array.length - 1;
        while (l <= h) {
            int mid = (h + l) / 2;

            // Check if x is present at mid
            if (array[mid] == toFind) {
                return mid;
            } // If x greater, ignore left half
            else if (array[mid] < toFind) {
                l = mid + 1;
            } // If x is smaller, ignore right half
            else {
                h = mid - 1;
            }
        }

        return -1;
    }

    public static int interpolationSearch(int array[], int toFind) {
    int l = 0, h = array.length - 1;
    while (l <= h && toFind >= array[l] && toFind <= array[h]) {
        // Calculate mid using interpolation formula
        int mid = l + ((toFind - array[l]) * (h - l)) / (array[h] - array[l]);

        // Check if toFind is present at mid
        if (array[mid] == toFind) {
            return mid;
        } 
        // If toFind is greater, search in the right half
        else if (array[mid] < toFind) {
            l = mid + 1;
        } 
        // If toFind is smaller, search in the left half
        else {
            h = mid - 1;
        }
    }

    return -1; // Element not found
}


    public static void bubleSort(int array[]) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }

        }

    }

    public static void bubleSortDes(int array[]) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }

        }

    }

    public static void selectionSort(int array[]) {
        int n = array.length;

        for (int i = 0; i <= n - 2; i++) {
            int minIndeks = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[j] < array[minIndeks]) {
                    minIndeks = j;

                }

            }
            int temp = array[i];
            array[i] = array[minIndeks];
            array[minIndeks] = temp;

        }

    }

    public static void selectionSortDes(int array[]) {
        int n = array.length;

        for (int i = 0; i <= n - 2; i++) {
            int minIndeks = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (array[j] > array[minIndeks]) {
                    minIndeks = j;

                }

            }
            int temp = array[i];
            array[i] = array[minIndeks];
            array[minIndeks] = temp;

        }
    }

    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] >= temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;

        }

    }

    public static void insertionSortDes(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] <= temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;

        }

    }

    public static void QuickSort(int array[]) {
        larik.quickSort(array, 0, array.length - 1);

    }

    private static void quickSort(int array[], int awal, int akhir) {
        if (awal < akhir) {
            int i = awal + 1, j = akhir;
            while (i <= akhir && array[i] <= array[awal]) {
                i++;
            }
            while (j > awal && array[j] > array[awal]) {
                j--;
            }
            while (i < j) {
                int pivot = array[i];
                array[i] = array[j];
                array[j] = pivot;
                while (i <= akhir && array[i] <= array[awal]) {
                    i++;
                }
                while (j > awal && array[j] > array[awal]) {
                    j--;
                }
               
            } 
            int pivot = array[awal];
                array[awal] = array[j];
                array[j] = pivot;

                larik.quickSort(array, awal, j - 1);
                larik.quickSort(array, j + 1, akhir);
        }
        

    }
public static void QuickSortDes(int array[]) {
        larik.quickSortDes(array, 0, array.length - 1);

    }

    private static void quickSortDes(int array[], int awal, int akhir) {
        if (awal < akhir) {
            int i = awal + 1, j = akhir;
            while (i <= akhir && array[i] >= array[awal]) {
                i++;
            }
            while (j > awal && array[j] < array[awal]) {
                j--;
            }
            while (i < j) {
                int pivot = array[i];
                array[i] = array[j];
                array[j] = pivot;
                while (i <= akhir && array[i] >= array[awal]) {
                    i++;
                }
                while (j > awal && array[j] < array[awal]) {
                    j--;
                }
               
            } 
            int pivot = array[awal];
                array[awal] = array[j];
                array[j] = pivot;

                larik.quickSortDes(array, awal, j - 1);
                larik.quickSortDes(array, j + 1, akhir);
        }
        

    }
    public static void cetak(Object[]  data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println( data[i].toString());

        }
        System.out.println("");
    }
   public static int SequentialSearch(Object o[], Object key) {
        for (int i = 0; i < o.length; i++) {

            if (((Comparable)o[i]).compareTo(key)==0) {
                return i;
            }
            
                
                
        }
        return -1;
   } 
    public static void bubleSort(Object[] o ) {
        int n = o.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (((Comparable)o[j]).compareTo(o[j+1]) > 0) {
                    Object temp = o[j];
                    o[j] = o[j + 1];
                    o[j + 1] = temp;
                } 

            }

        }

    }
    
      private static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        // Merge the temp arrays
 
        // Initial indices of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
   public static void mergesort(int arr[], int l, int r)
    {
        if (l < r) {
 
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // Sort first and second halves
            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);
 
            // Merge the sorted halves
            larik.merge(arr, l, m, r);
        }
    }
   
   public static void Mergesort(int array[]) {
        larik.mergesort(array, 0, array.length - 1);

    }
}
