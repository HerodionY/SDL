/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StackTes;

import herodion.Stack;

/**
 *
 * @author ACER
 */
public class StackTes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack s=new Stack(); //1
  s.push(23); //2
  
 s.push(45); //3
 s.push(56); //4
 
 System.out.println("Ukuran : "+s.size()+ " => "+s.toString()); //5
 if (s.isEmpty()) //6
 System.out.println("data sudah habis");
 else
 System.out.println("Ukuran : "+s.size()+ " => "+s.toString());
        int e = s.Pop(); //7
 System.out.println("Data yang di pop : " + e);
 if (s.isEmpty())
 System.out.println("data sudah habis");
 else
 System.out.println("Ukuran : "+s.size()+ " => "+s.toString());
 s.push(56); //8
 if (s.isEmpty())
 System.out.println("data sudah habis");
 else
 System.out.println("Ukuran : "+s.size()+ " => "+s.toString());
 if (s.isEmpty()) //9
 System.out.println("data sudah habis");
 else
 System.out.println("Ukuran : "+s.size()+ " => "+s.toString());
    }
    
}
