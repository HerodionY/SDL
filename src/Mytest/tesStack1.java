/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mytest;


import QueueDinamis.Queue;
import herodion.Mahasiswa;

/**
 *
 * @author ACER
 */
public class tesStack1 {
     public static void main(String[] args) { 
Queue tump = new Queue();
tump.enqueue(new Mahasiswa("Jokowa", 225314022));
tump.enqueue(new Mahasiswa("jokowu", 225314500));
tump.enqueue(new Mahasiswa("jokowo", 225314501));
System.out.println(tump.toString());

while (!tump.isEmpty()) {
 System.out.println(tump.dequeue());
}
// System.out.println(tump.pop());
// System.out.println(tump.pop());
}
}
