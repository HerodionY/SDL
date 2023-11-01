/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herodion;

/**
 *
 * @author ACER
 */

import java.util.Scanner;
public class MahasiswaMain {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user=new Scanner(System.in);
        Mahasiswa[] mhs=new Mahasiswa[7];
        Mahasiswa m=new Mahasiswa();
                 mhs[0]=new   Mahasiswa("jokowu", 226641007);
                 mhs[1]=new   Mahasiswa("bambang", 226641003);
                 mhs[2]=new   Mahasiswa("agus", 226641005);
                 mhs[3]=new   Mahasiswa("yanto", 226641001);
                 mhs[4]=new   Mahasiswa("miku", 226641006);
                 mhs[5]=new   Mahasiswa("robin", 226641002);
                 mhs[6]=new   Mahasiswa("zoro", 226641004);
                 

               System.out.println("Hasil Larik Cetak");
               larik.cetak(mhs);
               System.out.println("Cari Mahasiswa dengan nim 226641003 ");
               Mahasiswa cari=new Mahasiswa(226641003);
              
               int hasil=larik.SequentialSearch(mhs, cari);
               if (-1!=hasil) {
                      System.out.println("Data Ditemukan di elemen ke "+hasil);
        }else{System.out.println("Data Tidak ditemukan ");}
               System.out.println("");
               System.out.println("");
               System.out.println("Hasil Sorting ");
               larik.bubleSort(mhs);
               larik.cetak(mhs);
               System.out.println("");
               System.out.println("");
                System.out.println("Cari Mahasiswa dengan nim 226641003 ");
               hasil=larik.SequentialSearch(mhs, cari);
               if (-1!=hasil) {
                      System.out.println("Data Ditemukan di elemen ke "+hasil);
        }else{System.out.println("Data Tidak ditemukan ");}
}
}
