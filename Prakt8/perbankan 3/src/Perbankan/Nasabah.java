/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Perbankan;

/**
 *
 * @author ASUS
 */
public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;
    public Nasabah (String namaAwal, String namaAkhir){
        this.namaAwal=namaAwal;
        this.namaAkhir=namaAkhir;
    }
    public String getNamaAwal(){
        return namaAwal;
    }
    public String getNamaAkhir(){
        return namaAkhir;
    }
    public Tabungan getTabungan(){
        return tabungan;
    }
    public void setTabungan(Tabungan tabungan){
        this.tabungan=tabungan;
    }

    public void setNamaAwal(String namaAwal) {
        this.namaAwal= namaAwal;
    }
    public void setNamaAkhir(String namaAkhir) {
        this.namaAkhir= namaAkhir;
    }
    
}
