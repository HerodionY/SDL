/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul_2;

/**
 *
 * @author ACER
 */
public class RekrusifVariasi3 {
    public static void main (String args[]) 
	{
		count(3);
		System.out.println();
	}

	public static void count (int index) 
	{
		if (index < 2) 
			count(index+1);
		System.out.print(index);
	}
}
