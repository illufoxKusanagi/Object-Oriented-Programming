/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.pkg3;

/**
 *
 * @author orang biasa
 */
public class Truk {
    public double muatan;
    public double muatanMaks;
    
    public Truk(double beratMaks)
    {
        muatanMaks = beratMaks;
    }
    double getMuatan()
    {
        return muatan;
    }
    double getMuatanMaks()
    {
        return muatanMaks;
    }
    public void tambahMuatan(double berat)
    {
        if((muatan+berat)<=muatanMaks){
            muatan += berat;
        }
    }
}
