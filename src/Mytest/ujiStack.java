/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mytest;

import StackDinamisObject.Stack;



/**
 *
 * @author ACER
 */
public class ujiStack {
    public static void main(String[] args) { 
Stack tump = new Stack();
tump.push(10);
tump.push(5);
tump.push(7);
System.out.println(tump.toString());

while (!tump.isEmpty()) {
 System.out.println(tump.Pop());
}
// System.out.println(tump.pop());
// System.out.println(tump.pop());
}
}
    