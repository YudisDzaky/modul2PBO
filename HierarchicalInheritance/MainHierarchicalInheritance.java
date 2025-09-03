/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2PBO.HierarchicalInheritance;

/**
 *
 * @author YUDDZAYAS
 */
public class MainHierarchicalInheritance {
    public static void main(String[] args) {
        MobilHier m = new MobilHier();
        m.jalan();
        m.klakson();

        MotorHier motor = new MotorHier();
        motor.jalan();
        motor.stang();
    }
}

