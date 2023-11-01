/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package larilTes;

/**
 *
 * @author ACER
 */
public class ruangC extends Peminjaman {

    public ruangC(String namaTempat, int waktuAwal, int waktuAkhir, String namaPeminjam, boolean status) {
        super(namaTempat, waktuAwal, waktuAkhir, namaPeminjam, status);
    }
public int compareTo(ruangC other) {
        if (this.waktuAwal == other.waktuAwal) {
            return 0;
        } else if (this.waktuAwal < other.waktuAwal) {
            return -1;
        } else {
            return 1;
        }
    }
    
}
