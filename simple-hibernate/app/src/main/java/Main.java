package simple.app;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration; 

import simple.core.service.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating new Employee..");
        EmployeeOperations emp = new EmployeeOperations();
        emp.addEmployee("Grace", "Yu", 10000);
    }
}
