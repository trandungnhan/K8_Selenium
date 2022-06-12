package lab_08_01;

public class ContractEmployee extends Employee{

    @Override
    public int getSalary(){
        return 40000;
    }

    @Override
    public String getType(){
        return "Contractor";
    }
}
