// Tester Class inheriting the Employee class
public class Tester extends Employee {
    // private member variables specific to the Tester class
    private int nbBugs;
    private int rate;

    // default base rate for the Tester class
    double baseRate = 0;

    // constructors
    public Tester(String name, int birthYear, int nbBugs, int rate) {
        super(name, birthYear);
        this.nbBugs = nbBugs;
        // Ensure valid occupation rate using the parent class method
        this.rate = super.getOccupationRate(rate);
    }

    public Tester(String name, int birthYear, int nbBugs, int rate, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        this.nbBugs = nbBugs;
        // ensure valid occupation rate using the parent class method
        this.rate = super.getOccupationRate(rate);
    }

    // get methods for specific attributes of the Tester class
    public int getNbBugs() {
        return nbBugs;
    }

    public int getRate() {
        return rate;
    }

    // overrides the method to get the employee type as "Tester"
    @Override
    public String getEmployeeType() {
        return "Tester";
    }

    // overrides the method to calculate the annual income for a Tester
    @Override
    public double annualIncome() {
        double income = 0;
        // calculate the income based on the specified formula
        income = ((12 * baseRate) * rate) + nbBugs * GAIN_FACTOR_ERROR;
        return income;
    }

    // overrides the method to provide a string representation of the Tester
    @Override
    public String toString() {
        // combine details from the parent class and Tester-specific details
        return super.toString() + "\n" + getName() + " has an Occupation rate: " + getRate() + "%" +
                " and corrected " + getNbBugs() + " bugs.\nHis/Her estimated annual income is " + annualIncome();
    }
}
