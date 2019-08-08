public class Main {

    public static void main(String[] args) {

        Snake s = new Snake();


        env E = new env();

        //move to mainloop after key recieved
        try {
            s.Move(1, 2, 'u');
        }
        catch (ArithmeticException a) {

            System.out.println("invalid direction type given to the snake");
        }


    }

}