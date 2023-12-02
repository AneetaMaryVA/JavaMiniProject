// Car class inheriting the Vehicle class
public class Car extends Vehicle {
    // private member variables specific to the Car class
    private Gear gear;
    private CarType type;

    // constructor to initialize a Car with specific details
    public Car(String make, String plate, String color, VehicleType category, Gear gear, CarType type) {
        // calling the constructor of the parent class to set common attributes
        super(make, plate, color, category);
        this.gear = gear;
        this.type = type;
    }

    // getter method to retrieve the gear and type of the Car
    public Gear getGear() {
        return gear;
    }
    public CarType getType() {
        return type;
    }

    // overrides the method to provide a specific description for the Car
    @Override
    public String getVehicle() {
        return "Car";
    }

    // overrides the method to provide detailed information about the Car
    @Override
    public String getVehicleDetails() {
        return super.getVehicleDetails() + "\n\t- gear type: " + getGear() + "\n\t- type: " + getType();
    }
}