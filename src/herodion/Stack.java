/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herodion;

/**
 *
 * @author ACER
 */
public class Stack {
    private int[] elemen ;
    private  int front;
    private  int size;
    
    
    public Stack(){
    elemen=new int[10];
    front=-1;
    size =0;
    
    }
    public Stack(int x){
    elemen=new int[x];
     front=-1;
    size =0;
    }
    public int size(){
    return size;
    }
    public  boolean isEmpty(){
        if (size==0) {
            return true;
            
        }
        else{
        return false;
        }
    }
    
    public  boolean push(int elemen){
        if (this.elemen.length!=size) {
            front=front+1;
            size++;
            this.elemen[front]=elemen;
            return true;
                    
                    
                    
            
        }else{
        return false;
        }
    }
    public  boolean pop(){
        if (!isEmpty()) {
            int temp=elemen[front];
            front=front-1;
            size--;
            return true;
            
        }
        else  
            System.out.println("kosong");
        return false;
    
    
    }
    public  int Pop(){
        if (!isEmpty()) {
            int temp=elemen[front];
            front=front-1;
            size--;
            return temp;
            
        }
        else  
            System.out.println("kosong");
        return -1;
    
    
    }
    public String toString(){
    String temp =" ";
        for (int i = 0; i < size; i++) {
            temp=temp+elemen[i]+" ";
            
        }
        return temp;
    
    
    }
    
}
