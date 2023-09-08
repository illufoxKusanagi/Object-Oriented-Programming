/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author orang biasa
 */
public class Shape {

    public double length;
    public double width;
    public double height;
    public double volume;

    public Shape(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double compareTo(Shape shape) {
        double selisih;        
        if(shape.volume > this.volume){
            return selisih = shape.volume - this.volume;
        }
        else{
            return selisih = this.volume - shape.volume;
        }
    }

    private void calculateVolume() {
        volume = length * width * height;
    }

    public void cetak() {
        calculateVolume();
        System.out.println("Panjangxlebarxtinggi = " + length + "x" + width + "x" + height);
        System.out.println("Volume = " + volume);
    }
}
