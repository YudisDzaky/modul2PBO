/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2PBO.TugasNo2Enkapsulasi;

/**
 *
 * @author YUDDZAYAS
 */
class Rekening {
    private String pemilik;
    private double saldo; // data sensitif

    public Rekening(String pemilik, double saldoAwal) {
        this.pemilik = pemilik;
        this.saldo = saldoAwal;
    }

    // hanya baca saldo, gak bisa langsung ubah
    public double getSaldo() {
        return saldo;
    }

    // tambah saldo dengan validasi
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        } else {
            System.out.println("Jumlah setor tidak valid!");
        }
    }

    // tarik saldo dengan validasi
    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
    }
}

