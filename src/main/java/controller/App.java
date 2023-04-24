package controller;

import dao.DAOEmployee;
import model.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Employee employee = new Employee("Hoang Cong Dung");

        //EmployeeController employeeController = new EmployeeController();
        //employeeController.saveEmployee(employee);

        DAOEmployee daoEmployee = new DAOEmployee();

        // Test select all
        List<Employee> list = daoEmployee.selectAll();
        for (Employee e: list) {
            System.out.println(e);
        }
    }
}
