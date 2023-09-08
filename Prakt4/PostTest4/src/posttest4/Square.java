package posttest4;
public class Square {
    int sisi;
    public Square(int sisi){
        this.sisi = sisi;
    }
    int luas(){
        return sisi+sisi;
    }
    int keliling()
    {
        return sisi+4;
    }
    int penampang(){
        return 6*(sisi*sisi);
    }
    int volume(){
        return sisi*sisi*sisi;
    }
        
}
