/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2PBO.MultipleInheritance;

/**
 *
 * @author YUDDZAYAS
 */
public class MobilBalap implements Mesin, Rem {
    public void hidupkanMesin() {
        System.out.println("Mesin mobil balap dihidupkan!");
    }
    public void pakaiRem() {
        System.out.println("Rem mobil balap dipakai!");
    }
}
