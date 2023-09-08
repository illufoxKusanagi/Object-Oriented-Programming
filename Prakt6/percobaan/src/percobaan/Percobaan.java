/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan;
import java.util.Scanner;
/**
 *
 * @author orang biasa
 */
public class Percobaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan id : ");
        String id = input.nextLine();
        String desc = input.nextLine();
        String date = input.nextLine();
        String time = input.nextLine();
        Alarm alarm = new Alarm(id, desc, date, time);
    }
    
}
