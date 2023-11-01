/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackTes;

import herodion.LinkedList;
import herodion.ListNode;
import java.util.NoSuchElementException;

/**
 *
 * @author ACER
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        System.out.println("Menambahkan 8");
        list.addFirst(8);
        System.out.println("Menambahkan 15");
        list.addFirst(15);
        System.out.println("Menambahkan 26");
        list.addFirst(26);
        list.addLast(0);
        System.out.println("Menambahkan 14");
        list.addFirst(14);
        System.out.println(list.toString());
        ListNode hasil= list.search(26);
        if(hasil!=null){
                System.out.println(hasil.getElemen()+" Elemen Ditemukan ");
        }else{
                System.out.println("Elemen tidak Dietmukan");
        }
        
        try{    System.out.println("Menghilangkan ");
                   list.removeLast();
                   System.out.println(list.toString());
                   System.out.println("Menghilangkan ");
                   list.removeLast();
                   System.out.println(list.toString());
                   System.out.println("Menghilangkan ");
                   list.removeFirst();
                   System.out.println(list.toString());
                   System.out.println("Menghilangkan ");
                   list.removeFirst();
                   System.out.println(list.toString());
                   list.removeFirst();
                   System.out.println(list.toString());
                        

        
        }
        catch(NoSuchElementException e){
            System.out.println("Kosong");
        
        }
        
       
      
    }
   
}
