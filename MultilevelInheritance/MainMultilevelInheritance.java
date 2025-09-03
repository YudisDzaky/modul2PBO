/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2PBO.MultilevelInheritance;

/**
 *
 * @author YUDDZAYAS
 */
public class MainMultilevelInheritance {
    public static void main(String[] args) {
        Sedan s = new Sedan();
        s.kecepatan = 150;
        s.pintu = 4;
        s.model = "Camry";
        s.jalan();
        s.infoSedan();
    }
}