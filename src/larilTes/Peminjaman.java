/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package larilTes;

import java.util.Scanner;

/**
 *
 * @author ACER
 */

public class Peminjaman  {
    private String namaTempat;
    private int tanggal;
    int waktuAwal;
    int counter;
    private int waktuAkhir;
    private String namaPeminjam;
    private boolean status=false;

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

    public Peminjaman(String namaTempat,int waktuAwal,int waktuAkhir,  String namaPeminjam, boolean status) {
        this.namaTempat=namaTempat;
        this.waktuAwal=waktuAwal;
        this.waktuAkhir=waktuAkhir;
        this.namaPeminjam=namaPeminjam;
        this.status=status;
    }

    

    public Peminjaman() {
    }
      public  String ketik(){
    Scanner input=new Scanner(System.in);
    return input.nextLine().toUpperCase();}

    /**
     *
     * @param o
     * @return
     */
    public int compareTo(Object o) {
        if (this.waktuAwal==((Peminjaman)o).waktuAwal) {
            return 0;
            
        } 
        else if(this.waktuAwal<((Peminjaman)o).waktuAwal){
            return -1;
        }else{return 1;}
    }
    
   public int compareToString(Object o) {
       if(this.namaPeminjam.equalsIgnoreCase(namaPeminjam)){
           return 0;
       
       }
       else{return -1;}
    }
    
    
    
    
    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
   
   
        sb.append(String.format("%-4s",counter++ ));
        sb.append(String.format("%-18s", namaTempat));
        sb.append(String.format("%-8s", waktuAwal + "-" + waktuAkhir));
        sb.append(String.format("%-18s",namaPeminjam));
        sb.append(String.format("%-8s", status));
        sb.append("\n");
        
        

    return sb.toString();
}

public Peminjaman[] queueToArray(Queue queue) {
    Peminjaman[] array = new Peminjaman[queue.size()];
    int index = 0;

    while (!queue.isEmpty()) {
        array[index] = (Peminjaman) queue.dequeue();
        index++;
    }

    return array;
}

public void bubbleSort(Peminjaman[] peminjamans) {
    int n = peminjamans.length;

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (peminjamans[j].compareTo(peminjamans[j + 1]) > 0) {
                Peminjaman temp = peminjamans[j];
                peminjamans[j] = peminjamans[j + 1];
                peminjamans[j + 1] = temp;
            }
        }
    }
}
public Queue arrayToQueue(Peminjaman[] array) {
    Queue queue = new Queue();

    // Memindahkan data dari array ke dalam queue
    for (int i = 0; i < array.length; i++) {
        queue.enqueue(array[i]);
    }

    return queue;
}

public int searchPeminjam(Peminjaman[] pinjam,String nama) {
    int hasil = 0;
    for (int i = 0; i < pinjam.length; i++) {
       
        if (nama.equalsIgnoreCase(pinjam[i].getNamaPeminjam())) {
           hasil = i;
        }else{ hasil = -1;}
    }
        return hasil;
       

}
}
