package percobaan;

public class Angka {

    int angka;

    public Angka(int n) {
        this.angka = n;
    }

    void getFibo() {
        for(int i = 0; i < angka; i++){
            System.out.print(this.fibo(i) + (" "));
        }
    }

    int fibo(int angka) {
        if (angka == 0) {
            return 0;
        } else if (angka == 1) {
            return 1;
        } else {
            return this.fibo(angka - 1) + this.fibo(angka - 2);
        }
    }
}
