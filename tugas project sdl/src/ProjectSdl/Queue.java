package ProjectSdl;

import java.util.NoSuchElementException;

public class Queue {
    private LinkedList antrian;

    public Queue() {
        antrian = new LinkedList();
    }

    public int size() {
        return antrian.size();
    }

    public boolean isEmpty() {
        return antrian.isEmpty();
    }

    public void enqueue(Object o) {
        antrian.addLast(o);
    }

    public Object dequeue() {
        return antrian.removeFirst();
    }
    
    // Metode cetak untuk mencetak elemen-elemen dalam antrian
    public static void cetak(Object[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].toString());
        }
        System.out.println("");
    }
    
  
    // Metode untuk melakukan bubble sort pada elemen-elemen dalam antrian
    public void bubbleSort() {
        int n = antrian.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Perbandingan objek menggunakan compareTo() method
                if (((Comparable) antrian.get(j)).compareTo(antrian.get(j + 1)) > 0) {
                    Object temp = antrian.get(j);
                    antrian.set(j, antrian.get(j + 1));
                    antrian.set(j + 1, temp);
                }
            }
        }
    }
    
    // Metode toString untuk mengembalikan representasi string dari objek antrian
    @Override
    public String toString() {
        return antrian.toString();
    }
}
