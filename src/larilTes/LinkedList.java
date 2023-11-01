package larilTes;

import java.util.NoSuchElementException;



public class LinkedList {
    ListNode head;
    int size;
    int i=0;

    public int size() {
        return size;
    }

    public LinkedList() {
        size = 0;
        head = new ListNode(null);
        head.next = head;
        head.prev = head;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void addBefore(Object s, ListNode node) {
        ListNode baru = new ListNode(s);
        baru.next = node;
        baru.prev = node.prev;
        node.prev.next = baru;
        node.prev = baru;
        size++;
    }

    public void addFirst(Object elemen) {
        addBefore(elemen, head.next);
    }

    public void addLast(Object elemen) {
        addBefore(elemen, head);
    }

    private Object remove(ListNode node) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
        return node.elemen;
    }

    public Object removeFirst() {
        return remove(head.next);
    }

    public Object removeLast() {
        return remove(head.prev);
    }

    @Override
    public String toString() {
        ListNode node = head.next;
        StringBuilder kalimat = new StringBuilder();
        while (node != head) {
            kalimat.append(node.elemen);
            node = node.next;
            if (node != head) {
                kalimat.append(i++);
            }
        }
        kalimat.append("");
        return kalimat.toString();
    }


    public void print() {
        ListNode node = head.next;
        while (node != head) {
            System.out.print(node.elemen + " ");
            node = node.next;
        }
        System.out.println();
    }

    public ListNode search(Object find) {
        ListNode node = head.next;
        while (node != head) {
            if (node.elemen.equals(find)) {
                return node;
            } else {
                node = node.next;
            }
        }
        return null;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        ListNode node = head.next;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node.elemen;
    }

    public void set(int index, Object elemen) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        ListNode node = head.next;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        node.elemen = elemen;
    }
}
