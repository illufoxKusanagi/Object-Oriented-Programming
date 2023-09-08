/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perbankan;

/**
 *
 * @author orang biasa
 */
public class Nasabah {
    String namaAwal;
    String namaAkhir;
    Tabungan tabungan;
    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    public String namaAwal(){
        
       return namaAwal; 
    }
    public String namaAkhir(){
        return namaAkhir;
    }
    public Tabungan getTabungan(){
        
        return tabungan;
    }
    public void setTabungan(Tabungan tabungan){
        
    }
}
