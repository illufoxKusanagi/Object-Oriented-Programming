/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg2;

/**
 *
 * @author orang biasa
 */
public class TesMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Biru", "Minibus", 2000, 7);
        Mobil mobil2 = new Mobil("Daihatsu", "Hitam", "Pick up", 1500, 2);
        Mobil mobil3 = new Mobil("Suzuki", "Silver", "SUV", 1800, 5);
        Mobil mobil4 = new Mobil("Honda", "Merah", "Sedan", 1300, 5);

        System.out.print("mobil 1 : ");
        mobil1.getMobil();
        System.out.print("mobil 2 : ");
        mobil2.getMobil();
        System.out.print("mobil 3 : ");
        mobil3.getMobil();
        System.out.print("mobil 4 : ");
        mobil4.getMobil();
    }

}
