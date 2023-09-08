/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author orang biasa
 */
public class Lingkaran {
    int sisi;
    public Lingkaran(int sisi){
        this.sisi = sisi;
    }
    int luas(int sisi)
    {
        return (22/7)*sisi;
    }
    int keliling(){
        return (22/7)*sisi;
    }
    int penampang (){
        return 2*((22/7)*sisi*(sisi*2*sisi));
    }
    int volume(){
        return (22/7)*sisi*2*sisi;
    }
    int penampangNew(){
        return luas(sisi)+(luas(sisi)*sisi);
    }
    int volumeNew(){
        return sisi*luas(sisi);
    }
}
