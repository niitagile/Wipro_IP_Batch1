import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.model.EmployeeDTO;
import app.service.impl.EmployeeManager;

public class TestMain 
{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
  
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        EmployeeManager manager = (EmployeeManager) context.getBean("employeeManager");
  
        manager.getEmployeeById(1);
        manager.createEmployee(new EmployeeDTO());
    }
}