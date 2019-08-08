import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Snake extends Application{

    @Override
    //thanks https://www.tutorialspoint.com/javafx/2dshapes_rectangle
    public void start(Stage stage) {
        //Drawing a Rectangle
        Rectangle rectangle = new Rectangle();

        //Setting the properties of the rectangle
        rectangle.setX(150.0f);
        rectangle.setY(75.0f);
        rectangle.setWidth(300.0f);
        rectangle.setHeight(150.0f);

        //Creating a Group object
        Group root = new Group(rectangle);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        //Setting title to the Stage
        stage.setTitle("Drawing a Rectangle");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }

    public void Test() {

        System.out.println("test successful");
    }


    public void Create() {
        /*Rectangle rect = new Rectangle();
        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(500.0);
        line.setEndY(150.0);*/

    }

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