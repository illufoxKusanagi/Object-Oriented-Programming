/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author orang biasa
 */
public class Pesanan {

    double hargaMobil;
    double hargaMotor;
    double hargaTotal;

    public Pesanan(double hargaMobil, double hargaMotor) {
        this.hargaMobil = hargaMobil;
        this.hargaMotor = hargaMotor;
    }

    public void detail(Mobil mobil, Motor motor) {
        System.out.println("Detail pesanan anda : ");
        System.out.printf("|Kendaraan\t | Tipe\t\t | Brand\t | Nama\t\t | Harga\t|\n");
        mobil.infoMobil();
        System.out.print(hargaMobil + "\t|\n");
        motor.infoMotor();
        System.out.print(hargaMotor + "\t|\n");
    }
    
    public void status(Mobil mobil, Motor motor){
        if(mobil.sedia() && motor.sedia()){
            System.out.println("Pesanan berhasil");
        }
        else{
            System.out.println("Pesanan gagal");
        }
    }
}
