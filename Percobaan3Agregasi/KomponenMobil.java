/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul2PBO.Percobaan3Agregasi;

/**
 *
 * @author YUDDZAYAS
 */
class KomponenMobil {
    String namakomponen;

    public KomponenMobil(String namakomponen) {
        this.namakomponen = namakomponen;
    }

    public void tampilkanInfo() {
        System.out.println("Komponen: " + namakomponen);
    }
}

// Subclass Mesin yang mewarisi KomponenMobil
class Mesin extends KomponenMobil {
    public Mesin(String namaMesin) {
        super(namaMesin);
    }

    public void nyalakanMesin() {
        System.out.println(namakomponen + " dinyalakan.");
    }
}

// Subclass Baterai yang mewarisi KomponenMobil
class Baterai extends KomponenMobil {
    public Baterai(String namaBaterai) {
        super(namaBaterai);
    }

    public void cekBaterai() {
        System.out.println(namakomponen + " diperiksa.");
    }
}

// Kelas Mobil yang memiliki objek Mesin dan Baterai (Agregasi)
class Mobil {
    private Mesin mesin;
    private Baterai baterai;

    public Mobil(Mesin mesin, Baterai baterai) {
        this.mesin = mesin;
        this.baterai = baterai;
    }

    public void mulaiJalan() {
        System.out.println("Mobil mulai berjalan...");
        mesin.nyalakanMesin();
        baterai.cekBaterai();
    }
}