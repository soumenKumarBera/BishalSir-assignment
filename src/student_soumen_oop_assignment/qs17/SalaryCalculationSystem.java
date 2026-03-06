package student_soumen_oop_assignment.qs17;

public class SalaryCalculationSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new FullTimeEmployee("Amit",30000);
        employees[1] = new FullTimeEmployee("sumon",45000);
        employees[2] = new PartTimeEmployee("manik", 10, 500);
        employees[3] = new PartTimeEmployee("ani", 5, 400);



        for (Employee e: employees){
            System.out.println("Employees Name: " + e.name);
            System.out.println("Calculate Salaries: " + e.calculateSalary());
            System.out.println("...........................................");


        }
    }
}
