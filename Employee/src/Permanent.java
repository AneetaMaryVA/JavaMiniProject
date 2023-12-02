// Represents a permanent employment contract
public class Permanent extends Contract {
    private int nbChildren;             // Number of children
    private boolean married;            // Marital status
    private double monthlySalary;       // Fixed monthly salary
    private double bonusPerChildPerMonth; // Monthly bonus per child
    private int accumulatedDays;        // Number of days worked in the month

    // constructor for Permanent contract
    public Permanent(int nbChildren, boolean married, double monthlySalary, double bonusPerChildPerMonth, int accumulatedDays) {
        this.nbChildren = nbChildren;
        this.married = married;
        this.monthlySalary = monthlySalary;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
    }

    // get method for number of children, marital status, monthly salary,bonus ,accumulated days
    public int getNbChildren() {
        return nbChildren;
    }
    public String isMarried() {
        return married ? "married" : "not married";
    }

    // Getter method for
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public double getBonusPerChildPerMonth() {
        return bonusPerChildPerMonth;
    }
    public int getAccumulatedDays() {
        return accumulatedDays;
    }

    // overrides toString method to provide contract information
    @Override
    public String toString() {
        // generate and return contract information as a string
        String info = ". He/She is " + isMarried() + " and " +
                "he/she has " + getNbChildren() + " children." +
                "\nHe/She has worked for " + getAccumulatedDays() + " days and upon contract his/her" +
                " monthly salary is " + getMonthlySalary();
        return info;
    }
}
