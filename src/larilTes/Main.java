
package larilTes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Peminjaman pinjam = new Peminjaman();
        Queue daftarPeminjaman = new Queue();
        Queue baru = new Queue();
        Scanner scanner = new Scanner(System.in);
        int pilih = 0;
        String nama;
        int ruangan;
        Peminjaman[] data;
        

        
        
        int pilihan = 0;
        while (pilihan != 6) {
            data = pinjam.queueToArray(daftarPeminjaman);
            pinjam.bubbleSort(data);
            daftarPeminjaman = pinjam.arrayToQueue(data);
            System.out.println();
            System.out.println("Program Booking all you can eat ");
            System.out.println("1. Tampilkan Daftar Tempat");
            System.out.println("2. Pinjam Tempat");
            System.out.println("3. Seaching nama ");
            System.out.println("4. Kembalikan Tempat Yang sudah digunakan");
            System.out.println("5. Kembalikan Semua ");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();
           
            switch (pilihan) {
                
              case 1:
                System.out.println("Daftar Pemesanan:");
                System.out.println("_____________________________________________________________________________________________________________________");
                System.out.printf("%-4s", "No");
                System.out.printf("%-18s", "Nama Tempat");
                System.out.printf("%-8s", "Waktu");
                System.out.printf("%-18s", "Nama");
                System.out.printf("%-8s", "Status");
                System.out.println();
                System.out.println("_____________________________________________________________________________________________________________________");
                System.out.println();
                
                System.out.println(daftarPeminjaman.toString());
                
                

                    break;

                   
                case 2:
                    System.out.println("Pinjam ruangan : ");
                    System.out.println("1. Ruang A ");
                    System.out.println("2. Ruang B ");
                    System.out.println("3. Ruang C ");
                    System.out.println("Pilih ruangan yang inggin dipesan : ");
                    ruangan = scanner.nextInt();
                    switch (ruangan) {
                        case 1:
                            System.out.println("Ruang A ");
                            
                                 System.out.println("Daftar Pemesanan:");
                                System.out.println("_____________________________________________________________________________________________________________________");
                                System.out.printf("%-4s", "No");
                                System.out.printf("%-18s", "Nama Tempat");
                                System.out.printf("%-8s", "Waktu");
                                System.out.printf("%-18s", "Nama");
                                System.out.printf("%-8s", "Status");
                                System.out.println();
                                System.out.println("_____________________________________________________________________________________________________________________");
                                for (int i = 0; i < data.length; i++) {
                                    if (data[i] instanceof ruangA) {
                                        int j=0;
                                        System.out.printf("%-4s", j+1);
                                        System.out.printf("%-18s", data[i].getNamaTempat());
                                        System.out.printf("%-8s", data[i].getWaktuAwal()+"-"+data[i].getWaktuAkhir());
                                        System.out.printf("%-18s", data[i].getNamaPeminjam());
                                        System.out.printf("%-8s", data[i].isStatus());
                                        System.out.println("");
                                        
                                    }
                                
                            }
                                System.out.println("________________________________________________________________________________________________________________-");
                    
                            System.out.println("1. Pukul 08.00 Sampai Pukul 10.00  ");
                            System.out.println("2. Pukul 10.00 Sampai Pukul 12.00  ");
                            System.out.println("3. Pukul 12.00 Sampai Pukul 14.00  ");
                            System.out.println("4. Pukul 14.00 Sampai Pukul 16.00  ");
                            System.out.println("5. Pukul 16.00 Sampai Pukul 18.00  ");
                            System.out.println("6. Pukul 18.00 Sampai Pukul 20.00  ");
                            System.out.println("7. Pukul 20.00 Sampai Pukul 22.00  ");
                            System.out.println("8. Pukul 22.00 Sampai Pukul 00.00  ");
                            System.out.println("Pilih waktu yang anda ingginkan : ");
                            pilih = scanner.nextInt();
                            System.out.println("Masukan Nama Anda : ");
                            nama = pinjam.ketik();
                            switch (pilih) {
                                case 1:
                                    daftarPeminjaman.enqueue(new ruangA("Ruang A ",8, 10, nama, true));
                                    break;
                                case 2:
                                    daftarPeminjaman.enqueue(new ruangA("Ruang A ",10, 12, nama, true));
                                    break;
                                case 3:
                                    daftarPeminjaman.enqueue(new ruangA("Ruang A ",12, 14, nama, true));
                                    break;
                                case 4:
                                    daftarPeminjaman.enqueue(new ruangA("Ruang A ",14, 16, nama, true));
                                    break;
                                case 5:
                                    daftarPeminjaman.enqueue(new ruangA("Ruang A ",16, 18, nama, true));
                                    break;
                                case 6:
                                    daftarPeminjaman.enqueue(new ruangA("Ruang A ",18, 20, nama, true));
                                    break;
                                case 7:
                                    daftarPeminjaman.enqueue(new ruangA("Ruang A ",20, 22, nama, true));
                                    break;
                                case 8:
                                    daftarPeminjaman.enqueue(new ruangA("Ruang A ",22, 00, nama, true));
                                    break;

                            }
                            break;
                        case 2:
                            System.out.println("Ruang B ");
                             System.out.println("Daftar Pemesanan:");
                                System.out.println("_____________________________________________________________________________________________________________________");
                                System.out.printf("%-4s", "No");
                                System.out.printf("%-18s", "Nama Tempat");
                                System.out.printf("%-8s", "Waktu");
                                System.out.printf("%-18s", "Nama");
                                System.out.printf("%-8s", "Status");
                                System.out.println();
                                System.out.println("_____________________________________________________________________________________________________________________");
                                for (int i = 0; i < data.length; i++) {
                                    if (data[i] instanceof ruangB) {
                                        int j=0;
                                        System.out.printf("%-4s", j+1);
                                        System.out.printf("%-18s", data[i].getNamaTempat());
                                        System.out.printf("%-8s", data[i].getWaktuAwal()+"-"+data[i].getWaktuAkhir());
                                        System.out.printf("%-18s", data[i].getNamaPeminjam());
                                        System.out.printf("%-8s", data[i].isStatus());
                                        System.out.println("");
                                        
                                    }
                                
                            }
                                System.out.println("________________________________________________________________________________________________________________-");
                    
                            System.out.println("1. Pukul 08.00 Sampai Pukul 10.00  ");
                            System.out.println("2. Pukul 10.00 Sampai Pukul 12.00  ");
                            System.out.println("3. Pukul 12.00 Sampai Pukul 14.00  ");
                            System.out.println("4. Pukul 14.00 Sampai Pukul 16.00  ");
                            System.out.println("5. Pukul 16.00 Sampai Pukul 18.00  ");
                            System.out.println("6. Pukul 18.00 Sampai Pukul 20.00  ");
                            System.out.println("7. Pukul 20.00 Sampai Pukul 22.00  ");
                            System.out.println("8. Pukul 22.00 Sampai Pukul 00.00  ");
                            System.out.println("Pilih waktu yang anda ingginkan : ");
                            pilih = scanner.nextInt();
                            System.out.println("Masukan Nama Anda : ");
                            nama = pinjam.ketik();
                             switch (pilih) {
                                case 1:
                                    daftarPeminjaman.enqueue(new ruangB("Ruang B ",8, 10, nama, true));
                                    break;
                                case 2:
                                    daftarPeminjaman.enqueue(new ruangB("Ruang B ",10, 12, nama, true));
                                    break;
                                case 3:
                                    daftarPeminjaman.enqueue(new ruangB("Ruang B ",12, 14, nama, true));
                                    break;
                                case 4:
                                    daftarPeminjaman.enqueue(new ruangB("Ruang B ",14, 16, nama, true));
                                    break;
                                case 5:
                                    daftarPeminjaman.enqueue(new ruangB("Ruang B ",16, 18, nama, true));
                                    break;
                                case 6:
                                    daftarPeminjaman.enqueue(new ruangB("Ruang B ",18, 20, nama, true));
                                    break;
                                case 7:
                                    daftarPeminjaman.enqueue(new ruangB("Ruang B ",20, 22, nama, true));
                                    break;
                                case 8:
                                    daftarPeminjaman.enqueue(new ruangB("Ruang B ",22, 00, nama, true));
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("Ruang C ");
                             System.out.println("Daftar Pemesanan:");
                                System.out.println("_____________________________________________________________________________________________________________________");
                                System.out.printf("%-4s", "No");
                                System.out.printf("%-18s", "Nama Tempat");
                                System.out.printf("%-8s", "Waktu");
                                System.out.printf("%-18s", "Nama");
                                System.out.printf("%-8s", "Status");
                                System.out.println();
                                System.out.println("_____________________________________________________________________________________________________________________");
                                for (int i = 0; i < data.length; i++) {
                                    if (data[i] instanceof ruangC) {
                                        int j=0;
                                        System.out.printf("%-4s", j+1);
                                        System.out.printf("%-18s", data[i].getNamaTempat());
                                        System.out.printf("%-8s", data[i].getWaktuAwal()+"-"+data[i].getWaktuAkhir());
                                        System.out.printf("%-18s", data[i].getNamaPeminjam());
                                        System.out.printf("%-8s", data[i].isStatus());
                                        System.out.println("");
                                        
                                    }
                                
                            }
                                System.out.println("________________________________________________________________________________________________________________-");
                            System.out.println("1. Pukul 08.00 Sampai Pukul 10.00  ");
                            System.out.println("2. Pukul 10.00 Sampai Pukul 12.00  ");
                            System.out.println("3. Pukul 12.00 Sampai Pukul 14.00  ");
                            System.out.println("4. Pukul 14.00 Sampai Pukul 16.00  ");
                            System.out.println("5. Pukul 16.00 Sampai Pukul 18.00  ");
                            System.out.println("6. Pukul 18.00 Sampai Pukul 20.00  ");
                            System.out.println("7. Pukul 20.00 Sampai Pukul 22.00  ");
                            System.out.println("8. Pukul 22.00 Sampai Pukul 00.00  ");
                            System.out.println("Pilih waktu yang anda ingginkan : ");
                            pilih = scanner.nextInt();
                            System.out.println("Masukan Nama Anda : ");
                            nama = pinjam.ketik();
                            switch (pilih) {
                                case 1:
                                    daftarPeminjaman.enqueue(new ruangC("Ruang C ",8, 10, nama, true));
                                    break;
                                case 2:
                                    daftarPeminjaman.enqueue(new ruangC("Ruang C ",10, 12, nama, true));
                                    break;
                                case 3:
                                    daftarPeminjaman.enqueue(new ruangC("Ruang C ",12, 14, nama, true));
                                    break;
                                case 4:
                                    daftarPeminjaman.enqueue(new ruangC("Ruang C ",14, 16, nama, true));
                                    break;
                                case 5:
                                    daftarPeminjaman.enqueue(new ruangC("Ruang C ",16, 18, nama, true));
                                    break;
                                case 6:
                                    daftarPeminjaman.enqueue(new ruangC("Ruang C ",18, 20, nama, true));
                                    break;
                                case 7:
                                    daftarPeminjaman.enqueue(new ruangC("Ruang C ",20, 22, nama, true));
                                    break;
                                case 8:
                                    daftarPeminjaman.enqueue(new ruangC("Ruang C ",22, 00, nama, true));
                                    break;

                            }
                    }

                            break;
                        case 3:
                System.out.print("Masukkan nama Peminajam yang inggin dicari : ");
                String namaPeminjam = scanner.next();
                           int hasil =pinjam.searchPeminjam(data, namaPeminjam);
                            if (-1!=hasil) {
                      System.out.println("Data Ditemukan di elemen ke "+hasil);
                       }else{System.out.println("Data Tidak ditemukan ");}
                break;
                        case 4 : System.out.println("Kembalikan tempat yang sudah digunakan : ");
                                       Peminjaman hapus = (Peminjaman) daftarPeminjaman.dequeue();
                                       System.out.println(hapus);
                     break;
                      case 5 : System.out.println("Kembalikan semua : ");
                                       while (!daftarPeminjaman.isEmpty()) {
                                                     daftarPeminjaman.dequeue();
                                        
                                       
                                        }
                       break;
                        case 6:
                            System.out.println("Terima kasih!");
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            break;
                    
            }
            System.out.println();

        }
    }
}

