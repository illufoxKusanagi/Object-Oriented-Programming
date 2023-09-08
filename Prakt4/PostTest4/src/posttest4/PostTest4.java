/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest4;

public class PostTest4 {

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
            System.out.printf("%d\t %d\t\t %d\t\t %d\n",persegi[i].penampang(),segitiga[i].penampang(),lingkaran[i].penampang(),jajarGenjang[i].penampang());    
        }
        System.out.println("Volume : ");
        System.out.println("Persegi\tSegitiga\tLingkaran\tJajarGenjang");
        for(int i = 0; i<500; i++){
            persegi[i]= new Square(i+1);
            segitiga[i] = new Segitiga(i+1);
            lingkaran[i] = new Lingkaran(i+1);
            jajarGenjang[i] = new JajarGenjang(i+1);
            System.out.printf("%d\t %d\t\t %d\t\t %d\n",persegi[i].volume(),segitiga[i].volume(),lingkaran[i].volume(),jajarGenjang[i].volume());    
        }
    }
    
}
