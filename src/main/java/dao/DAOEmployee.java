package dao;

import model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class DAOEmployee implements DAOInterface<Employee>{
    @Override
    public List<Employee> selectAll() {
        List<Employee> list = new ArrayList<Employee>();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

            if (sessionFactory != null) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();

                // execute SQL / HQL
                String hql = "from Employee";
                Query query = session.createQuery(hql);
                list = query.getResultList();

                transaction.commit();
                session.close();;
            } else {
                /*if (transaction != null) {
                    transaction.rollback();
                }*/
            }

            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public Employee selectById(Employee employee) {
        return null;
    }

    @Override
    public boolean insert(Employee employee) {
        return false;
    }

    @Override
    public boolean update(Employee employee) {
        return false;
    }

    @Override
    public boolean delete(Employee employee) {
        return false;
    }
}
