package posttest2;

public class PostTest2 {

    public static void main(String[] args) {
        Persegi[] luas = new Persegi[500];
        for (int i = 0; i < 500; i++) {
            luas[i]= new Persegi(i+1);
            int l = luas[i].Luas();
            System.out.printf("Luas persegi %d  adalah :  %d\n", i+1, l);
        }
    }

}
