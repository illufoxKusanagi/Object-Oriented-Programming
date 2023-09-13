/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perbankan;

/**
 *
 * @author ASUS
 */
public class Bank {

    private Nasabah[] nasabah;
    private int jumlahNasabah;

    public Bank() {
        this.nasabah = new Nasabah[100];
        this.jumlahNasabah = 0;
    }

    public void tambahNasabah(String namaAwal, String namaAkhir) {
        if (this.jumlahNasabah < nasabah.length) {
            nasabah[this.jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
            this.jumlahNasabah++;
        }
    }

    public int getJumlahNasabah() {
        return jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks) {
        return nasabah[indeks];
    }

    public int getIndexNasabah(String namaAwal, String namaAkhir) {
        int index = 0;
        for (Nasabah nasabah : this.nasabah) {
            if (nasabah.getNamaAwal().equals(namaAwal) && nasabah.getNamaAkhir().equals(namaAkhir)) {
                return index;
            }
            index++;
        }
        return 0;
    }
}
