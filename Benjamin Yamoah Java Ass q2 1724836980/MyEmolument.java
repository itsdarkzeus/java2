public class MyEmolument extends Emolument {

    // Default constructor (values 0 for basic salary and tax relief)
    public MyEmolument() {
        super(0, 0);
    }

    // Constructor with specified basicSalary and taxRelief
    public MyEmolument(double basicSalary, double taxRelief) {
        super(basicSalary, taxRelief);
    }

    // Method to calculate income tax
    public double incomeTax() {
        double taxableIncome = taxableIncome();
        double incomeTax = 0;

        // First 500 taxed at 5%
        if (taxableIncome > 500) {
            incomeTax += 500 * 0.05;
            taxableIncome -= 500;
        } else {
            return taxableIncome * 0.05;
        }

        // Next 500 taxed at 12.5%
        if (taxableIncome > 500) {
            incomeTax += 500 * 0.125;
            taxableIncome -= 500;
        } else {
            return incomeTax + (taxableIncome * 0.125);
        }

        // Remaining taxable income taxed at 17.5%
        if (taxableIncome > 0) {
            incomeTax += taxableIncome * 0.175;
        }

        return incomeTax;
    }

    // Method to calculate total deduction
    public double totalDeduction() {
        return SSNIT() + incomeTax();
    }

    // Method to calculate net salary
    public double netSalary() {
        return getBasicSalary() - totalDeduction();
    }
}
