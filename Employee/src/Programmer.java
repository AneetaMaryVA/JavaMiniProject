// Programmer Class inheriting the Employee class
public class Programmer extends Employee {
    // private member variables specific to the Programmer class
    private int nbProjects;
    private int rate;
    double baseRate = 0;

    // constructors
    public Programmer(String name, int birthYear, int nbProjects) {
        super(name, birthYear);
        this.nbProjects = nbProjects;
        this.rate = 100;
    }
    public Programmer(String name, int birthYear, int nbProjects, int rate) {
        super(name, birthYear);
        this.nbProjects = nbProjects;
        // Ensure valid occupation rate using the parent class method
        this.rate = super.getOccupationRate(rate);
    }
    public Programmer(String name, int birthYear, int nbProjects, int rate, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        this.nbProjects = nbProjects;
        // Ensure valid occupation rate using the parent class method
        this.rate = super.getOccupationRate(rate);
    }
    public Programmer(String name, int birthYear, int nbProjects, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        this.nbProjects = nbProjects;
        this.rate = 100;
    }

    // get methods for specific attributes of the Programmer class
    public int getRate() {
        return rate;
    }
    public int getNbProjects() {
        return nbProjects;
    }

    // overrides the method to get the employee type as "Programmer"
    @Override
    public String getEmployeeType() {
        return "Programmer";
    }

    // overrides the method to calculate the annual income for a Programmer
    @Override
    public double annualIncome() {
        double income = 0;
        // calculate the income based on the specified formula
        income = ((12 * baseRate) * rate) + GAIN_FACTOR_PROJECTS * nbProjects;
        return income;
    }

    // overrides the method to provide a string representation of the Programmer
    @Override
    public String toString() {
        // combine details from the parent class and Programmer-specific details
        return super.toString() + "\n" + getName() + " has an Occupation rate: " + getRate() + "%" +
                " and completed " + getNbProjects() + " projects.\nHis/Her estimated annual income is " + annualIncome();
    }
}