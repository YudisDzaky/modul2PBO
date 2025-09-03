/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2PBO.HybridInheritance;

/**
 *
 * @author YUDDZAYAS
 */
public class SedanHybrid extends MobilHybrid implements MesinHybrid {
    String model;
    public void hidupkanMesin() {
        System.out.println("Mesin sedan " + model + " dihidupkan...");
    }
    void infoSedan() {
        System.out.println("Sedan model " + model + " siap melaju.");
    }
}
