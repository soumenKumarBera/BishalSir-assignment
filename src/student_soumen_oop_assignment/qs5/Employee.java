package student_soumen_oop_assignment.qs5;

import java.security.PrivateKey;

public class Employee {
    private String name;
    private double  basicSalary;

    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double calculateSalary(){

        return  this.basicSalary + (0.20 * this.basicSalary);


    };

    public void displaySalary(){

        System.out.println("Name: " + this.name);
        System.out.println("Total Salary (adds 20% bonus to basic salary): " + calculateSalary());


    }
}
