// Manager Class inheriting the Employee class
public class Manager extends Employee {
    // private member variables specific to the Manager class
    private int nbClients;
    private int nbTravelDays;
    private int rate;

    // default base rate for the Manager class
    double baseRate = 0;

    // constructors
    public Manager(String name, int birthYear, int nbClients, int nbTravelDays) {
        super(name, birthYear);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        this.rate = 100;
    }
    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, int rate) {
        super(name, birthYear);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        // ensuring valid occupation rate using the parent class method
        this.rate = super.getOccupationRate(rate);
    }
    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        this.rate = 100;
    }
    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, int rate, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        // Ensure valid occupation rate using the parent class method
        this.rate = super.getOccupationRate(rate);
    }

    // get methods for specific attributes of the Manager class
    public int getNbClients() {
        return nbClients;
    }

    public int getNbTravelDays() {
        return nbTravelDays;
    }

    public int getRate() {
        return rate;
    }

    // overrides the method to get the employee type as "Manager"
    @Override
    public String getEmployeeType() {
        return "Manager";
    }

    // overrides the method to calculate the annual income for a Manager
    @Override
    public double annualIncome() {
        double income = 0;
        // Calculate the income based on the specified formula
        income = ((12 * baseRate) * rate) + (nbClients * GAIN_FACTOR_CLIENT) + (nbTravelDays * GAIN_FACTOR_TRAVEL);
        return income;
    }

    // overrides the method to provide a string representation of the Manager
    @Override
    public String toString() {
        // combining details from the parent class and Manager-specific details
        return super.toString() + "\n" + getName() + " has an Occupation rate: " + getRate() + "%" +
                " He/She travelled " + getNbTravelDays() + " days and has brought " + getNbClients() + " new clients.\n" +
                "His/Her estimated annual income is " + annualIncome();
    }
}
