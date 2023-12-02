// Represents a temporary employment contract
public class Temporary extends Contract {
    private double hourlySalary;    // Hourly salary for temporary employee
    private int accumulatedHours;   // Accumulated hours worked

    // constructor for Temporary contract
    public Temporary(double hourlySalary, int accumulatedHours) {
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }

    // get method for hourly salary, hours worked
    public double getHourlySalary() {
        return hourlySalary;
    }
    public int getAccumulatedHours() {
        return accumulatedHours;
    }

    // overrides toString method to provide contract information
    @Override
    public String toString() {
        // Generate and return contract information as a string
        String info = ". He/She is a temporary employee with " +
                getHourlySalary() + " hourly salary and he worked for " +
                getAccumulatedHours() + " hours";
        return info;
    }
}
