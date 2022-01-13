abstract class Vehicle {

    private String name; // instansvariabel

    public Vehicle(String name) {
        this.name = name;
    }

    abstract String getAdditionalInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {  // setter
        this.name = name;
    }

}
