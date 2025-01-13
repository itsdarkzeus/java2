import java.util.Scanner;

public class TestMyEmolument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input for basic salary and tax relief
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter Tax Relief: ");
        double taxRelief = scanner.nextDouble();

        // Create MyEmolument object
        MyEmolument staffSalary = new MyEmolument(basicSalary, taxRelief);

        // Display calculated values
        System.out.println("\n--- Salary Details ---");
        System.out.println("Basic Salary: " + staffSalary.getBasicSalary());
        System.out.println("Tax Relief: " + staffSalary.getTaxRelief());
        System.out.println("SSNIT Contribution: " + staffSalary.SSNIT());
        System.out.println("Taxable Income: " + staffSalary.taxableIncome());
        System.out.println("Income Tax: " + staffSalary.incomeTax());
        System.out.println("Total Deduction: " + staffSalary.totalDeduction());
        System.out.println("Net Salary: " + staffSalary.netSalary());

        scanner.close();
    }
}
