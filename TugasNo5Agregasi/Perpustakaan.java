/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2PBO.TugasNo5Agregasi;

/**
 *
 * @author YUDDZAYAS
 */

// Class Perpustakaan (agregasi -> punya banyak Buku)
import java.util.List;

class Perpustakaan {
    String nama;
    List<Buku> daftarBuku;

    Perpustakaan(String nama, List<Buku> daftarBuku) {
        this.nama = nama;
        this.daftarBuku = daftarBuku;
    }

    void tampilkanBuku() {
        System.out.println("Daftar buku di " + nama + ":");
        for (Buku b : daftarBuku) {
            b.infoBuku();
        }
    }
}

