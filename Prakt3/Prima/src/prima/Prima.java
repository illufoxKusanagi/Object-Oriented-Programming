package prima;

import java.util.Scanner;

public class Prima {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan prima : ");
        int n = input.nextInt();
        Angka angka = new Angka(n);
        System.out.print("bilangan prima sampai " + n + " adalah : ");
        
        angka.getPrime();
    }
    
}
