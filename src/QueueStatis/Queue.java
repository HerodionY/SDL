/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueStatis;

/**
 *
 * @author ACER
 */
public class Queue {

    private Object[] elemen;
    private int front;
    private int rear;
    private int size;

    public Queue() {
        elemen = new Object[10];
        front = 0;
        size = 0;
        rear = 0;

    }

    public Queue(int x) {
        elemen = new Object[x];
        front = 0;
        size = 0;
        rear = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;

        } else {
            return false;
        }
    }

    public boolean enqueue(Object obj) {
    if (size() != this.elemen.length) {
        this.elemen[rear] = obj;
        rear++;
        if (rear == this.elemen.length) {
            rear = 0;
        }
        size++;
        return true;
    } else {
        System.out.println("Antrian Penuh");
        return false;
    }
}


    public Object dequeue() {
        if (isEmpty() == true) {
            System.out.println("Antrian kosong");
            return -1;
        } else {
            Object temp = elemen[front];
            front++;
            if (front == elemen.length) {
                front = 0;
            }
            size--;
            return temp;
        }
    }

    public String toString() {
        String temp = "[ ";
        for (int i = front; i < size; i++) {
            temp = temp + elemen[i] + " ";

        }
        temp += "]";
        return temp;

    }
}
