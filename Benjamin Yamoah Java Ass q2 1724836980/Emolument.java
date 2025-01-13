public class Emolument {
    // Encapsulated fields
    private double basicSalary;
    private double taxRelief;

    // Constructor to initialize basicSalary and taxRelief
    public Emolument(double basicSalary, double taxRelief) {
        this.basicSalary = basicSalary;
        this.taxRelief = taxRelief;
    }

    // Method to return basicSalary
    public double getBasicSalary() {
        return basicSalary;
    }

    // Method to return taxRelief
    public double getTaxRelief() {
        return taxRelief;
    }

    // Method to calculate SSNIT contribution (3.5% of Basic Salary)
    public double SSNIT() {
        return 0.035 * basicSalary;
    }

    // Method to calculate taxable income
    public double taxableIncome() {
        return basicSalary - (taxRelief + SSNIT());
    }
}
