package latihan.pkg1;

public class Main {

    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan(6000);
        System.out.println("Saldo awal : " + tabungan.saldo);
        tabungan.ambilUang(200);
        System.out.println("Jumlah uang yang diambil : 2300");
        System.out.println("Saldo sekarang : " + tabungan.saldo);

    }

}
