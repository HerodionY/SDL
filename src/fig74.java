/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class fig74 {
     public static void main(String[] args) {
        // TODO code application logic here
        final int array_length=10;
        int [] array= new int[array_length];
        
        
         for (int i = 0; i < array.length; i++) {
             array[i]=2+2*i;
         }
        System.out.printf("%s%8s\n","indeks","Value");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d%8d\n",i+1,array[i]);
            
        }
    }
}
