/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mytest;

import StackDinamisObject.Stack;
import herodion.Mahasiswa;

/**
 *
 * @author ACER
 */
public class tesStack {
     public static void main(String[] args) { 
Stack tump = new Stack();
tump.push(new Mahasiswa("Jokowa", 225314022));
tump.push(new Mahasiswa("jokowu", 225314500));
tump.push(new Mahasiswa("jokowo", 225314501));
System.out.println(tump.toString());

while (!tump.isEmpty()) {
 System.out.println(tump.Pop());
}
// System.out.println(tump.pop());
// System.out.println(tump.pop());
}
}
