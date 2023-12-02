// Motorcycle class inherits the Vehicle class
public class Motorcycle extends Vehicle {
    // private member variable specific to the Motorcycle class
    private boolean sideCar;

    // constructor to initialize a Motorcycle with specific details
    public Motorcycle(String make, String plate, String color, VehicleType category, boolean sideCar) {
        super(make, plate, color, category);
        this.sideCar = sideCar;
    }

    // get method to check if the Motorcycle has a sidecar
    public boolean isSideCar() {
        return sideCar;
    }

    // overrides the method to provide a specific description for the Motorcycle
    @Override
    public String getVehicle() {
        return "MotorCycle";
    }

    // method to provide detailed information about the Motorcycle
    public String getVehicleDetails() {
        // calling the getVehicleDetails method of the parent class (Vehicle) to include common details
        String motorCycleDetails = super.getVehicleDetails();
        // appending additional details based on the presence of a sidecar
        if (isSideCar()) {
            motorCycleDetails += "\n\t- with sidecar";
        } else {
            motorCycleDetails += "\n\t- without sidecar";
        }
        return motorCycleDetails;
    }
}
