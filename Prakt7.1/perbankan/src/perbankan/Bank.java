package perbankan;

public class Bank {
    private Nasabah[] nasabah;
    private int jumlahNasabah;

    public Bank() {
    };

    public void tambahNasabah(String namaAwal, String namaAkhir) {
        if (nasabah == null) {
            nasabah = new Nasabah[100];
        }
        nasabah[jumlahNasabah] = new Nasabah(namaAwal, namaAkhir);
        jumlahNasabah++;
    }

    public int getJumlahNasabah() {
        return jumlahNasabah;
    }

    public Nasabah getNasabah(int indeks) {
        return nasabah[indeks];
    }
}