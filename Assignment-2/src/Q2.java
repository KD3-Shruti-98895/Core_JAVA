
public class Q2 {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Q2(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        // Initialize monthlySalary if it is positive; otherwise, default to 0.0
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Set and Get for firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    // Set and Get for lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    // Set and Get for monthlySalary
    public void setMonthlySalary(double monthlySalary) {
        // If the monthly salary is not positive, do not set its value
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Helper method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }
}


}
