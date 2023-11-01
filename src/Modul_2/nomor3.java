/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_2;

/**
 *
 * @author ACER
 */
public class nomor3 {
    public static void main(String[]args){
    upAndDown(1);
    
    
    }
    public static void upAndDown (int n) 
{
System.out.print ("\nLevel: " + n);
if (n < 4)
upAndDown (n+1);
System.out.print ("\nLEVEL: " + n);
}

}
