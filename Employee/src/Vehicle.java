// Vehicle class
public class Vehicle {
    // private member variables to store information about the vehicle as per the question
    private String make;
    private String plate;
    private String color;
    private VehicleType category;

    // constructor to initialize the vehicle with specific details
    public Vehicle(String make, String plate, String color, VehicleType category){
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    // following are the get method to retrieve the make,plate,color,category, generic description and detailed information of the vehicle - encapsulation
    public String getMake(){
        return make;
    }
    public String getPlate(){
        return plate;
    }
    public String getColor(){
        return color;
    }
    public VehicleType getCategory(){
        return category;
    }
    public String getVehicle(){
        return "Vehicle";
    }
    public String getVehicleDetails(){
        return "Employee has a " + getVehicle() + "\n\t- make: " +
                getMake() + "\n\t- plate: " + getPlate() + "\n\t- color: " +
                getColor() + "\n\t- category: " + getCategory();
    }
}
