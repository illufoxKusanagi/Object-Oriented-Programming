/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest3;

/**
 *
 * @author orang biasa
 */
public class JajarGenjang {
    int sisi;
    public JajarGenjang(int sisi){
        this.sisi = sisi;
    }
    int luas(){
        return (sisi+sisi)/2;
    }
    int keliling(){
        return sisi*sisi;
    }
}
