package lab_08_01;

public class FullTimeEmployee extends Employee{

    @Override
    public int getSalary(){
        return 50000;
    }

    @Override
    public String getType(){
        return "FTE";
    }
}
