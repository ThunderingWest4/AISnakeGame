import java.util.ArrayList;
import java.util.Random;

public class env {

    public ArrayList GetApple(int x, int y) {

        ArrayList a = new ArrayList();

        Random r = new Random();


        int Xval = r.nextInt(x);
        int Yval = r.nextInt(y);


        a.add(Xval);
        a.add(Yval);

        return a;
    }

    public ArrayList GetAppleArray(int XDim, int YDim) {



        ArrayList a = new ArrayList();
        ArrayList appleloc = GetApple(XDim, YDim);
        int[][] AppleGrid = new int[XDim][YDim];


        int appleX = (int) appleloc.get(0);

        int appleY = (int) appleloc.get(1);

        for (int i = 0; i < XDim; i++) {

            for (int j = 0; j < YDim; j++) {

                //format is x, y and in this i, j
                if (i == appleX && j == appleY) {

                    AppleGrid[i][j] = 1;

                }
                else {

                    AppleGrid[i][j] = 0;
                }


            }

        }


        return a;
    }

    public void IfAppleEaten(int appleX, int appleY) {

    }

}