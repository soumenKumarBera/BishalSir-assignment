package student_soumen_oop_assignment.qs18;

public class CompanyManagement {
    public static void main(String[] args) {
        Employee e1 = new Employee("amit");
        Employee e2 = new Employee("sajol");
        Employee e3 = new Employee("sanjoy");
        e1.display();
        e2.display();
        e3.display();

        Employee.companyName = "TATA";

        e1.display();
        e2.display();
        e3.display();


    }
}
