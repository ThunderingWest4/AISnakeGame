import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //launch(args);


        Snake s = new Snake();


        //to start the program
        s.main(args);

        int XDim = 30;
        int YDim = 30;

        //useful link: https://howtodoinjava.com/java/collections/arraylist/arraylist-get-method-example/
        //obj to int https://stackoverflow.com/questions/3661413/how-to-cast-an-object-to-an-int
        //https://stackoverflow.com/questions/16956720/how-to-create-an-2d-arraylist-in-java
        int[][] AppleGrid = new int[XDim][YDim];

        //30x30 grid of possible things
        //set them all to zero - binary; 0 if no apple, 1 if apple
        int ColCount = 1;
        int RowCount = 1;

        env E = new env();

        //move to mainloop after key recieved

        ArrayList appleloc = E.GetApple(XDim, YDim);

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



        try {
            s.Move(1, 2, 'u');
        }
        catch (ArithmeticException a) {

            System.out.println("invalid direction type given to the snake");
        }


    }

}