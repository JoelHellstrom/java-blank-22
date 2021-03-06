import java.util.Random;

public class Car extends Vehicle {

    int mileage;

    // Klassvariabel (samma värde för alla instanser)
    static int carCounter = 0;
    Random rnd = new Random();

    // Konstruktor
    public Car(String name) {
        super(name); // "super" är samma sak som "this", men gäller superklassen
        carCounter++;

        // slumpmässig range (1000-10 000) i java, t.ex. så här:
        mileage = rnd.nextInt(9000) + 1000;

    }

    @Override
    String getAdditionalInfo() {
        return String.format("%d km", mileage);
    }

    // Fel: inga direkta utskrifter i logikklasserna
    public void getAdditionalInfo2() {
        System.out.printf("Milage is %d km\n", mileage);
    }

    @Override
    int getSubObjectCount() {
        return carCounter;
    }

}
