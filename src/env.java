import java.util.ArrayList;
import java.util.Random;

public class env {

    public ArrayList GenApple(int x, int y) {

        ArrayList a = new ArrayList();

        Random r = new Random();


        int Xval = r.nextInt(x);
        int Yval = r.nextInt(y);


        a.add(Xval);
        a.add(Yval);

        return a;
    }

}