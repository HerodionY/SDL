/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herodion;

/**
 *
 * @author ACER
 */
public class Queque {
    private int[] elemen ;
    private  int front;
    private int rear;
    private  int size;
    
     public Queque(){
    elemen=new int[10];
    front=0;
    size =0;
    rear=0;
    
    }
    public Queque(int x){
    elemen=new int[x];
     front=0;
    size =0;
    rear=0;
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
    public boolean enqueque(int elemen){
        if (size()!=this.elemen.length) {
            this.elemen[rear]=elemen;
            rear++;
            if (rear==this.elemen.length) {
                rear=0;   
            }
            size++;
            return true; 
        }
        else{
            System.out.println("Antrian Penuh");
            return false;
        }
    }
    public int dequeque(){
        if (isEmpty()==true) {
            System.out.println("Antrian kosong");
            return -1;
        }
        else{
        int temp= elemen[front];
        front++;
            if (front==elemen.length) {
                front=0;
            }
            size--;
            return temp;
        }
    }
   public String toString(){
    String temp ="[ ";
        for (int i = front; i < size; i++) {
            temp=temp+elemen[i]+" ";
            
        }
        temp+="]";
        return temp;
    
    
    } 
}
