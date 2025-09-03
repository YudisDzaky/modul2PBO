/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2PBO.MultilevelInheritance;

/**
 *
 * @author YUDDZAYAS
 */
public class Sedan extends MobilMulti {
    String model;
    void infoSedan() {
        System.out.println("Sedan model " + model + " dengan " + pintu + " pintu, kecepatan " + kecepatan + " km/jam");
    }
}