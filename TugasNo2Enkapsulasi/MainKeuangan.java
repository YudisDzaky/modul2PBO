/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2PBO.TugasNo2Enkapsulasi;

/**
 *
 * @author YUDDZAYAS
 */
public class MainKeuangan {
    public static void main(String[] args) {
        Rekening r1 = new Rekening("Yudis", 500000);
        r1.setor(200000);
        r1.tarik(100000);

        System.out.println("Saldo akhir: " + r1.getSaldo());
    }
}
