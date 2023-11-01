/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueDinamis;

import Linkedlist.LinkedList;

/**
 *
 * @author ACER
 */
public class Queue {

    private Object[] elemen;
    LinkedList antrian;

    public Queue() {
        antrian = new LinkedList();
    }

    public int size() {
        return antrian.size();
    }

    public boolean isEmpty() {
        if (antrian.size() == 0) {
            return true;

        } else {
            return false;
        }
    }

    public void enqueue(Object obj) {
        antrian.addLast(obj);
    }

    public Object dequeue() {
        return antrian.removeLast();
    }

    public String toString() {

        return antrian.toString();
    }

}
