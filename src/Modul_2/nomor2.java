/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_2;

/**
 *
 * @author ACER
 */
public class nomor2 {
    public static void main(String[]args){
        paijo(3);
        System.out.println(paijo(3));
        
    }
   public static int paijo (int x){
if (x == 0) {
return 0;
   }
else{
return 2 * paijo (x - 1) + x * x;
  
}   
} 
}
