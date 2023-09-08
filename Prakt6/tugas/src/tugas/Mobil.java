/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author orang biasa
 */
public class Mobil {
    String tipe;
    String brand;
    String model;
    int pesanan;
    int stok;
    
    public Mobil(String tipe, String brand, String model, int pesanan){
        this.tipe = tipe;
        this.brand = brand;
        this.model = model;
        this.pesanan = pesanan;
    }
    
    public boolean sedia(){
        stok = 5;
        if((stok - pesanan) > 0){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void infoMobil(){
        System.out.print("| Mobil \t | ");
        System.out.print(tipe + "\t\t | ");
        System.out.print(brand + "\t | ");
        System.out.print(model + "\t | ");
    }
}
