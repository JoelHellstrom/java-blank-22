import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner läser input från consolen
        Scanner console = new Scanner(System.in);

        System.out.println("Hello Java!");


        Car car = new Car("Fiat");
        Vehicle otherBike = new Bike("Crecent", "mommo");
        Vehicle bike = new Bike("Trek", "fixie");

        Vehicle todaysVehicle = bike;

        /* While loop */

        int loopCount = 3;
        String userInput;
        while (loopCount > 0) {

            System.out.println(loopCount);
            //System.out.println("My car is a " + car.getName());
            System.out.println("My bike is a " + bike.getName());
            //System.out.println("My other bike is a " + otherBike.getName());
            System.out.println("Today i used my " + todaysVehicle.getName());

            System.out.println("Enter to continue, q to quit: ");

            userInput = console.nextLine();
            if (userInput.equals("q")) {
                System.out.println("Bye");
                break;
            }

        loopCount--;

        }

        console.close();
    }
}
