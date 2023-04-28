package controller;

import dao.DAOEmployee;
import model.Employee;

import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        DAOEmployee daoEmployee = new DAOEmployee();

        // Test select all
        /*List<Employee> list = daoEmployee.selectAll();
        for (Employee e: list) {
            System.out.println(e);
        }*/

        // Test select by id
        Employee objEmployee = daoEmployee.selectById(1);
        System.out.println(objEmployee);
    }
}
