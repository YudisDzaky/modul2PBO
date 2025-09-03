/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2PBO.TugasNo5Agregasi;

/**
 *
 * @author YUDDZAYAS
 */
// Main class untuk menjalankan
import java.util.*;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // Buat beberapa objek Buku
        Buku b1 = new Buku("Pemrograman Java", "Yudis");
        Buku b2 = new Buku("Struktur Data", "Andi");
        Buku b3 = new Buku("Basis Data", "Budi");

        // Masukkan buku ke List
        List<Buku> koleksi = new ArrayList<>();
        koleksi.add(b1);
        koleksi.add(b2);
        koleksi.add(b3);

        // Buat Perpustakaan dengan agregasi
        Perpustakaan perpustakaan = new Perpustakaan("Perpustakaan Kampus", koleksi);

        // Tampilkan isi perpustakaan
        perpustakaan.tampilkanBuku();
    }
}

