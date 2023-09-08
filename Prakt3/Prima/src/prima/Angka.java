package prima;

public class Angka {

    int angka;

    public Angka(int n) {
        this.angka = n;
    }

    void getPrime() {
        for (int i = 2; i <= angka; i++) {
            if (this.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    boolean isPrime(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i*i <= angka; i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}
