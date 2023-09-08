/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.pkg1;

/**
 *
 * @author orang biasa
 */
public class Tabungan {

    int saldo;

    public Tabungan(int initSaldo) {
        saldo = initSaldo;
    }

    int getSaldo() {
        return saldo;
    }
    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }
    public boolean ambilUang(int jumlah){
       if(saldo > jumlah){
           saldo -= jumlah;
           return true;
       }
       else{
           return false;
       }
    }
    
}
