/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;
import java.util.Scanner;
/**
 *
 * @author orang biasa
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pesanan mobil anda : ");
        int amount1 = input.nextInt();
        Mobil mobil = new Mobil("SUV", "Toyota", "Fortuner", amount1);        
        System.out.print("Pesanan motor anda : ");
        int amount2 = input.nextInt();
        Motor motor = new Motor("Skutik", "Honda", "Vario", amount2);
        Pesanan pesanan = new Pesanan(550000, 23000);
        pesanan.detail(mobil, motor);
        pesanan.status(mobil, motor);
    }
    
}
