/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herodion;

/**
 *
 * @author ACER
 */
public class ListNode {
     int elemen;
    ListNode next,prev;
    

    public int getElemen() {
        return elemen;
    }

    public ListNode( ) {
       
 
       
    }
    public ListNode(int elemen){
        this.elemen=elemen;
    
    }

    public ListNode(int elemen, ListNode next, ListNode prev ) {
        this.elemen = elemen;
        this.next = next;
        this.prev = prev;
       
    }
    

   


    

   

}
