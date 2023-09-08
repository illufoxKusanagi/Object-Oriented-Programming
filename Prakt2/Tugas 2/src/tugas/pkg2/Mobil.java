/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg2;

/**
 *
 * @author orang biasa
 */
public class Mobil {

    String merk;
    String warna;
    String tipe;
    int mesin;
    int seat;

    public Mobil(String brand, String color, String type, int engine, int seater) {
        merk = brand;
        warna = color;
        tipe = type;
        mesin = engine;
        seat = seater;
    }

    public void getMerk(String brand) {
        this.merk = brand;
    }

    public void getWarna(String color) {
        this.warna = color;
    }

    public void getTipe(String type) {
        this.tipe = type;

    }

    public void getMesin(int engine) {
        this.mesin = engine;
    }

    public void getSeat(int seater) {
        this.seat = seater;
    }

    public void getMobil() {
        System.out.printf("%s\t", merk);
        System.out.printf("%s\t", warna);
        System.out.printf("%s\t", tipe);
        System.out.printf("%d\t", mesin);
        System.out.printf("%d\t\n", seat);
    }
}
