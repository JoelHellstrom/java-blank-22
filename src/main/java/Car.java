public class Car extends Vehicle{

    int mileage;

    // konstruktorn

    public Car(String name) {
        super(name); // "super" är samma som "this", men gäller superklassen
    }

    @Override
    String getAdditionalInfo() {
        return String.format("%d km", mileage);
    }

}
