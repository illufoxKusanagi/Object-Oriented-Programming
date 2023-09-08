/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author orang biasa
 */
public class Segitiga {
    int sisi;
    public Segitiga(int sisi){
        this.sisi = sisi;
    }
    int luas()
    {
        return (sisi*sisi)/2;
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
}
