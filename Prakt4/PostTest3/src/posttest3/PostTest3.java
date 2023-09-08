/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest3;

public class PostTest3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square[] persegi = new Square[500];
        Segitiga[] segitiga = new Segitiga[500];
        Lingkaran[] lingkaran = new Lingkaran[500];
        JajarGenjang[] jajarGenjang = new JajarGenjang[500];
        System.out.println("Luas : ");
        System.out.println("Persegi\tSegitiga\tLingkaran\tJajarGenjang");
        for(int i = 0; i<500; i++){
            persegi[i]= new Square(i+1);
            segitiga[i] = new Segitiga(i+1);
            lingkaran[i] = new Lingkaran(i+1);
            jajarGenjang[i] = new JajarGenjang(i+1);
            System.out.printf("%d\t %d\t\t %d\t\t %d\n",persegi[i].luas(),segitiga[i].luas(),lingkaran[i].luas(),jajarGenjang[i].luas());    
        }
        System.out.println("Keliling : ");
        System.out.println("Persegi\tSegitiga\tLingkaran\tJajarGenjang");
        for(int i = 0; i<500; i++){
            persegi[i]= new Square(i+1);
            segitiga[i] = new Segitiga(i+1);
            lingkaran[i] = new Lingkaran(i+1);
            jajarGenjang[i] = new JajarGenjang(i+1);
            System.out.printf("%d\t %d\t\t %d\t\t %d\n",persegi[i].keliling(),segitiga[i].keliling(),lingkaran[i].keliling(),jajarGenjang[i].keliling());    
        }
    }
    
}
