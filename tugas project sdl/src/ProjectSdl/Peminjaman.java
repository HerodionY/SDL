/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectSdl;



import java.util.Scanner;



public class Peminjaman implements Comparable  {
    // Deklarasi variabel
    private String namaTempat;
    private int tanggal;
    int waktuAwal;
    int counter;
    private int waktuAkhir;
    private String namaPeminjam;
    private boolean status=false;

    // Metode getter
    public String getNamaTempat() {
        return namaTempat;
    }

    public int getTanggal() {
        return tanggal;
    }

    public int getWaktuAwal() {
        return waktuAwal;
    }

    public int getWaktuAkhir() {
        return waktuAkhir;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public boolean isStatus() {
        return status;
    }

    // Konstruktor
    public Peminjaman(String namaTempat,int waktuAwal,int waktuAkhir,  String namaPeminjam, boolean status) {
        this.namaTempat=namaTempat;
        this.waktuAwal=waktuAwal;
        this.waktuAkhir=waktuAkhir;
        this.namaPeminjam=namaPeminjam;
        this.status=status;
    }

    public Peminjaman() {
    }

    // Metode untuk membaca input dari pengguna
    public String ketik(){
        Scanner input=new Scanner(System.in);
        return input.nextLine().toUpperCase();
    }

    
    
   
    
   
    
    // Metode untuk mengubah objek menjadi string
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(String.format("%-18s", namaTempat));
        sb.append(String.format("%-8s", waktuAwal + "-" + waktuAkhir));
        sb.append(String.format("%-18s",namaPeminjam));
        sb.append(String.format("%-8s", status));
        sb.append("\n");
        return sb.toString();
    }

    // Konversi dari Queue ke array
    public Peminjaman[] queueToArray(Queue queue) {
        Peminjaman[] array = new Peminjaman[queue.size()];
        int index = 0;

        while (!queue.isEmpty()) {
            array[index] = (Peminjaman) queue.dequeue();
            index++;
        }

        return array;
    }

    // Algoritma Bubble Sort untuk mengurutkan array Peminjaman berdasarkan waktuAwal
    
    
    // Konversi dari array ke Queue
    public Queue arrayToQueue(Peminjaman[] array) {
        Queue queue = new Queue();

        // Memindahkan data dari array ke dalam queue
        for (int i = 0; i < array.length; i++) {
            queue.enqueue(array[i]);
        }

        return queue;
    }

   
   
    @Override
    public int compareTo(Object o) {
        if (this.getWaktuAwal() == ((Peminjaman) o).getWaktuAwal()) {
            return 0;
        } else if (this.getWaktuAwal() < ((Peminjaman) o).getWaktuAwal()) {
            return -1;
        } else {
            return 1;
        }
    }

    // Pencarian peminjam berdasarkan nama dalam array Peminjaman
    public void bubbleSort(Object[] o) {
        int n = o.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (((Comparable) o[j]).compareTo(o[j + 1]) > 0) {
                    Object temp = o[j];
                    o[j] = o[j + 1];
                    o[j + 1] = temp;
                }
            }
        }
    }
  
}
