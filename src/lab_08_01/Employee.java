package lab_08_01;

/*
Create a class Employee with a method salary to return employee’s salary
There are 2 types of employee: Full time employee and contract employee
Full time employee has salary is 50000 and contract employee has salary 40000
Write a method to accept a list of Employee and calculate total salary
For example, company has 3 FTE and 2 contractor
*/

public abstract class Employee {

    public int salary;
    public String type;

    public Employee() {
    }

    public Employee(int salary, String id) {
        this.salary = salary;
        this.type = id;
    }

    public int getSalary(){
        return salary;
    }

    public String getType(){
        return type;
    }

}
