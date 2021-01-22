import java.util.ArrayList;

class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary+overtime;
    }
}

public class Assignment2Q2 {
    static int salary = 10000;
    public int getSalary(int salary){
        return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        int totalsal=0;
        for(int x:employeeSalaries)
        {
            totalsal+=x;
        }
        return totalsal;
    }
    public static void main(String[] args){
        Assignment2Q2 l1 = new Labour();
        Assignment2Q2 l2 = new Labour();
        Assignment2Q2 l3 = new Labour();
        Assignment2Q2 l4 = new Labour();
        Assignment2Q2 m1 = new Manager();
        Assignment2Q2 m2 = new Manager();
        Assignment2Q2 m3 = new Manager();
        Assignment2Q2 m4 = new Manager();
        ArrayList<Integer> employeeSalaries = new ArrayList<Integer>();
        employeeSalaries.add(l1.getSalary(salary));
        employeeSalaries.add(l2.getSalary(salary));
        employeeSalaries.add(l3.getSalary(salary));
        employeeSalaries.add(l4.getSalary(salary));
        employeeSalaries.add(m1.getSalary(salary));
        employeeSalaries.add(m2.getSalary(salary));
        employeeSalaries.add(m3.getSalary(salary));
        employeeSalaries.add(m4.getSalary(salary));
        System.out.println(employeeSalaries);
        
    }
}