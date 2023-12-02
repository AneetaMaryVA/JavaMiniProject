// importing the necessary class for handling the current year
import java.time.Year;

// Employee Class
public class Employee {
    // Constants for gain factors
    final static int GAIN_FACTOR_CLIENT = 500;
    final static int GAIN_FACTOR_TRAVEL = 100;
    final static int GAIN_FACTOR_ERROR = 10;
    final static int GAIN_FACTOR_PROJECTS = 200;

    // private member variables
    private String name;
    private int birthYear;
    private Vehicle vehicle;
    private Contract contract;

    // constructors
    public Employee(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        display();
    }
    public Employee(String name, int birthYear, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.vehicle = vehicle;
        display();
    }

    // get method for name, birth year, associated vehicle,age and contract
    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }
    public Contract getContract() {
        return contract;
    }
    // abstract method for calculating annual income
    public double annualIncome() {
        return 0;
    }
    // abstract method for getting the employee type
    public String getEmployeeType() {
        return "Employee";
    }

    // method to sign a contract for the employee
    public void signContract(Contract contract) {
        this.contract = contract;
    }

    // method to get contract information
    public String contractInfo() {
        String info = name + ", is a " + getEmployeeType() + contract.toString();
        return info;
    }

    // method to display information of the employee
    public void display() {
        System.out.println("We have a new Employee: " + name + ", a " + getEmployeeType());
    }
    // method to get the effective occupation rate
    public int getOccupationRate(int rate) {
        if (rate > 100) {
            return 100;
        } else if (rate < 10 && rate > 0) {
            return 10;
        } else {
            return rate;
        }
    }
    // overrides the method for providing a string representation of the employee
    public String toString() {
        return "Name : " + name + ", a " + getEmployeeType() + "\n" +
                "Age : " + getAge() + "\n" + vehicle.getVehicleDetails();
    }
}