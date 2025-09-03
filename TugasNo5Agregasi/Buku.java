/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2PBO.TugasNo5Agregasi;

/**
 *
 * @author YUDDZAYAS
 */
// Class Buku
class Buku {
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void infoBuku() {
        System.out.println(judul + " oleh " + penulis);
    }
}
