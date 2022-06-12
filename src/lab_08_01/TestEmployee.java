package lab_08_01;

public class TestEmployee {

    public static void main(String[] args) {

        Employee fullTimeEmployee = new FullTimeEmployee();
        Employee contractEmployee = new ContractEmployee();

        System.out.println("Salary of full time employee is " + fullTimeEmployee.getSalary());
        System.out.println("Salary of contract employee is " + contractEmployee.getSalary());

        System.out.println("Type of full time employee is " + fullTimeEmployee.getType());
        System.out.println("Type of contract employee is " + contractEmployee.getType());
    }
}
