package lab_08_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeController {

    public static void main(String[] args) {

        Employee fullTimeEmployee = new FullTimeEmployee();
        Employee contractEmployee = new ContractEmployee();

        new EmployeeController().acceptListEmployee(Arrays.asList(fullTimeEmployee, contractEmployee));

    }

    public void acceptListEmployee(List<Employee> employeeList){
        int totalSalary =0;
        ArrayList<String> employeeType=new ArrayList<String>();

        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary();
            employeeType.add(employee.getType());
        }
        System.out.printf("Total salary is %d\n", totalSalary);
        System.out.println("Employee type are "+ employeeType);

    }
}
