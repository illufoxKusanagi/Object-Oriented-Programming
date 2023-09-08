package percobaan;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan urutan fibonacci : ");
        int n = input.nextInt();
        Angka angka = new Angka(n);
        System.out.print("Deret fibionacci " + n + " Bilangan adalah : ");
            
        angka.getFibo();
    }

}
