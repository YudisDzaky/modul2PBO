/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2PBO.Percobaan3Agregasi;

/**
 *
 * @author YUDDZAYAS
 */
// Kelas utama untuk mengatankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mesin dan Baterai
        Mesin mesin = new Mesin("Mesin V8");
        Baterai baterai = new Baterai("Baterai Lithium-ion");

        // Membuat objek Mobil yang memiliki Mesin dan Baterai (Agregasi)
        Mobil mobil = new Mobil(mesin, baterai);

        // Membuat mobil mulai jalan
        mobil.mulaiJalan();
    }
}
