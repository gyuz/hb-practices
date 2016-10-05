package simple.core.dao;

import org.hibernate.*;
import simple.core.model.*;

public class EmployeeDAO extends CrudImpl<Employee>{
      public EmployeeDAO(){
            super.newSessionFactory();     
      }
}
