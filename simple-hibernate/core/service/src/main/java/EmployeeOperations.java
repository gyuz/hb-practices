package simple.core.service;

import simple.core.model.*;
import simple.core.dao.*;

public class EmployeeOperations {
      Employee emp;
      EmployeeDAO empDao;
 
      public EmployeeOperations(){
            emp = new Employee(); 
            empDao = new EmployeeDAO();
      }
      
      public void addEmployee(String firstName, String lastName, int salary){
            emp.setFirstName(firstName);
            emp.setLastName(lastName);
            emp.setSalary(salary);
            empDao.persists(emp);
      }
}
