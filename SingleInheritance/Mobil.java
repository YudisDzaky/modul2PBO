/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2PBO.SingleInheritance;

/**
 *
 * @author YUDDZAYAS
 */
public class Mobil extends Kendaraan {
    int pintu;
    void infoMobil() {
        System.out.println("Mobil dengan " + pintu + " pintu sedang melaju dengan kecepatan " + kecepatan + " km/jam");
    }
}