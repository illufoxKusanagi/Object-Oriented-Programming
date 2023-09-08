/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author orang biasa
 */
public class PersegiPanjang {

    int sisi;

    public PersegiPanjang(int sisi) {
        this.sisi = sisi;
    }

    int luas(int sisi) {
        return 2*(sisi+sisi);
    }
    int luasSquare(int sisi){
        return sisi*sisi;
    }
    int keliling() {
        return 4 * sisi;
    }

    int penampang() {
        return (2*luas(sisi))+(4*(sisi*(sisi)));
    }
    int volume(){
        return (2*sisi)*luas(sisi);
    }
    int penampangNew(){
        return (2*luasSquare(sisi)) + (4*luas(sisi));
    }
    int volumeNew(){
        return ((2*sisi)*2)*sisi;
    }
}
