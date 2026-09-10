package project;
import  project.Employee;

public class Main {
    public static void main(String[] args) {
        Employee obj =new Employee(1, "sk", "IT");
        System.out.println(obj.empId);
        System.out.println(obj.empName);
        System.out.println(obj.empDept);
    }
    
}
