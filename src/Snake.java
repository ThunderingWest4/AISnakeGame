import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Snake extends Application{

    public void Test() {

        System.out.println("test successful");
    }
    start(Stage) {
        
    }

    /*public void Create() {
        Rectangle rect = new Rectangle();
        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(500.0);
        line.setEndY(150.0);

    }*/

    public ArrayList Move(int x, int y, char dir) {

        switch(dir) {

            case 'u':
                y++;
                break;

            case 'd':
                y--;
                break;

            case 'l':
                x--;
                break;

            case 'r':
                x++;
                break;

            default:
                throw new ArithmeticException("invalid direction input recieved");

        }


        ArrayList b = new ArrayList();

        b.add(x);
        b.add(y);
        return b;
    }

    public void Draw(ArrayList locs) {



    }


}