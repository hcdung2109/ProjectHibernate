package controller;

import model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmployeeController employeeController = new EmployeeController();
        //Employee employee = new Employee("Hoang Cong Dung");
        Employee employee2 = new Employee("Tran Thi Thu Thuy");

        //employeeController.saveEmployee(employee);
        employeeController.saveEmployee(employee2);
    }
}
