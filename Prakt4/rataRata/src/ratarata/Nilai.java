/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ratarata;

/**
 *
 * @author orang biasa
 */
public class Nilai {

    int nilai[] = new int[4];

    public Nilai(int nilai[]) {
        for (int i = 0; i < 3; i++) {
            this.nilai[i] = nilai[i];
        }
    }
    float getRerata() {
        float sum = 0, rerata;
        for (int i = 0; i < 3; i++) {
            sum += this.nilai[i];
        }
        rerata = sum/3;
        return rerata;
    }
}
