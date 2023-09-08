package posttest5;
public class Square {
    int sisi;
    public Square(int sisi){
        this.sisi = sisi;
    }
    int luas(int sisi){
        return sisi+sisi;
    }
    int keliling()
    {
        return sisi+4;
    }
    int penampang(){
        return 6*luas(sisi);
    }
    int volume(){
        return sisi*luas(sisi);
    }
    int penampangNew(){
        return 4* luas(sisi);
    }
    int volumeNew(){
        return sisi*luas(sisi);
    }
        
}
