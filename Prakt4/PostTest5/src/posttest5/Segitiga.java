/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author orang biasa
 */
public class Segitiga {
    int sisi;
    public Segitiga(int sisi){
        this.sisi = sisi;
    }
    int luas(int sisi)
    {
        return (sisi*sisi)/2;
    }
    int luasSquare(int sisi){
        return (sisi*sisi);
    }
    int keliling()
    {
        return sisi*3;
    }
    int penampang(){
        return (2*((sisi*sisi)/2))+(3*sisi*sisi);
    }
    int volume(){
        return ((sisi*sisi)/2)*sisi;
    }
    int penampangNew(){
        return (2*luas(sisi))+(4*luas(sisi));
    }
    int volumeNew(){
        return luas(sisi)*sisi;
    }
}
