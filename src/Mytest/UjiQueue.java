/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mytest;

import QueueStatis.Queue;



/**
 *
 * @author ACER
 */
public class UjiQueue {
    public static void main(String[] args) { 
Queue antrian = new Queue();

antrian.enqueue(14);
antrian.enqueue(25);
antrian.enqueue(58);
        System.out.println(antrian.toString());
while (!antrian.isEmpty()) {
 System.out.println(antrian.dequeue());
}
// System.out.println(antrian.dequeue());
// System.out.println(antrian.dequeue());
// System.out.println(antrian.dequeue());
}
}
