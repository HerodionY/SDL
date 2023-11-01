/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;

/**
 *
 * @author ACER
 */
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorMain {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.addFirst("aaa");
        linkedList.addLast("bbb");
        linkedList.addLast("ddd");
        
        ListIterator iterator;
        iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("");
        System.out.println(iterator.previous());
        iterator.add("ccc");
        
        System.out.println(linkedList);

    }
}
