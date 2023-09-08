/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author orang biasa
 */
public class PersegiPanjang {

    int sisi;

    public PersegiPanjang(int sisi) {
        this.sisi = sisi;
    }

    int luas() {
        return sisi*sisi;
    }

    int keliling() {
        return 4 * sisi;
    }

    int penampang() {
        return (2*((2*sisi)*sisi))+(4*(sisi*(sisi)));
    }
    int volume(){
        return (2*sisi)*sisi*sisi;
    }
}
