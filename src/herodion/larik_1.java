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
public class larik_1 {

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
        while (l <= h) {
            int mid = l + ((toFind - array[l]) * (h - l)) / (array[h] - array[l]);

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
        larik_1.quickSort(array, 0, array.length - 1);

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

                larik_1.quickSort(array, awal, j - 1);
                larik_1.quickSort(array, j + 1, akhir);
        }
        

    }
public static void QuickSortDes(int array[]) {
        larik_1.quickSortDes(array, 0, array.length - 1);

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

                larik_1.quickSortDes(array, awal, j - 1);
                larik_1.quickSortDes(array, j + 1, akhir);
        }
        

    }
}
