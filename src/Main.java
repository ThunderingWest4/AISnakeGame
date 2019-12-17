import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;


public class Main {

    public void keyPressed(KeyEvent evt) {
        System.out.println(evt);
    }

    public static void main(String[] args) {
        //launch(args);

        //public void keyPressed(KeyEvent evt);
        Snake s = new Snake();


        //to start the program
        s.main(args);

        int XDim = 30;
        int YDim = 30;

        boolean Running = true;

        //useful link: https://howtodoinjava.com/java/collections/arraylist/arraylist-get-method-example/
        //obj to int https://stackoverflow.com/questions/3661413/how-to-cast-an-object-to-an-int
        //https://stackoverflow.com/questions/16956720/how-to-create-an-2d-arraylist-in-java

        //30x30 grid of possible things
        //set them all to zero - binary; 0 if no apple, 1 if apple

        env E = new env();

        ArrayList AppleGrid = E.GetAppleArray(XDim, YDim);

        //move to mainloop after key recieved


        while (Running == true) {



            try {
                s.Move(1, 2, 'u');
            } catch (ArithmeticException a) {

                System.out.println("invalid direction type given to the snake");
            }


        }

    }

}