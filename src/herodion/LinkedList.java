/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herodion;

import java.util.NoSuchElementException;

/**
 *
 * @author ACER
 */
public class LinkedList {
    private ListNode head;
    private int size;
    
   public LinkedList() {
       size=0;
       head= new ListNode();
       head.next=head;
       head.prev=head;
    } 
    
public  boolean isEmpty(){
        if (size==0) {
            return true;
            
        }
        else{
        return false;
        }
    }
   



public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

   

    public void setHead(ListNode head) {
        this.head = head;
    }

    public ListNode getHead() {
        return head;
    }

    private void addBefore(int s, ListNode node){
                ListNode baru;
                baru = new ListNode(s);
                baru.next=node;
                baru.prev=node.prev;
                node.prev.next=baru;
                node.prev=baru;
                size++;
    
    
    }
    public void addFirst(int elemen){
            addBefore(elemen,head.next);
    
    }
    public void addLast(int elemen){
            addBefore(elemen,head);
    }
    
    private int remove(ListNode node){
           if (isEmpty()) {
               throw new NoSuchElementException();
        }
           
               node.prev.next=node.next;
               node.next.prev=node.prev;
               size --;
               return node.elemen;
           
          
           
    }
    public int removeFirst(){
    
        return remove(head.next);
    
    }
    public int removeLast(){
    
        return remove(head.prev);
    
    }
    
    
    @Override
    public String toString(){
            ListNode node= head.next;
            String kalimat;
            kalimat = "( ";
            while(node != head) {
                kalimat += node.elemen;
                node = node.next;
                if (node!=head) {
                    kalimat+=" ";
                    
                }
            
        }
            kalimat+=" )";
        return kalimat;
            
    }
    public void print(){
            ListNode node= head.next;
            while(node != head){
                System.out.println(node.next);
                System.out.println("    ");
                node=node.next;
            
            }
    
    
    }
    public ListNode search(int find){
        ListNode node ;
        node = head.next;
            while(node != head){
                if (node.elemen==find) {
                    
                    return node;
                }else{
                        node=node.next;
                }
               
            
            }
            
  
    
    return null;
    }
          
              

    
}
