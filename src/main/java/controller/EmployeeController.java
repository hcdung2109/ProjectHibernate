package controller;

import model.Employee;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import utils.HibernateUtil;

public class EmployeeController {
    public void saveEmployee(Employee employee) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // save the Employee object
            session.save(employee);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Employee> getEmployees() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Employee", Employee.class).list();
        }
    }
}
