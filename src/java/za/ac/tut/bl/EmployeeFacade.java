/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.Employee;

/**
 *
 * @author Jeanette
 */
@Stateless
public class EmployeeFacade extends AbstractFacade<Employee> implements EmployeeFacadeLocal {

    @PersistenceContext(unitName = "EmployeeEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeeFacade() {
        super(Employee.class);
    }

    @Override
    public Long countFemaleEmp() {
        // Create a query to count the number of female employees
        Query query = em.createQuery("SELECT COUNT(e) FROM Employee e WHERE e.gender='F'");
        // Execute the query and get the result as a single Long value
        Long count = (Long) query.getSingleResult();
        return count;
    }

    @Override
    public Long countMaleEmp() {
        // Create a query to count the number of male employees
        Query query = em.createQuery("SELECT COUNT(e) FROM Employee e WHERE e.gender='M'");
        // Execute the query and get the result as a single Long value
        Long count = (Long) query.getSingleResult();
        return count;
    }

    @Override
    public double maleAvg() {
        // Create a query to calculate the average age of male employees
        Query query = em.createQuery("SELECT AVG(e.age) FROM Employee e WHERE e.gender = 'M'");
        // Execute the query and get the result as a single Double value
        Double count = (Double) query.getSingleResult();
        return count;
    }

    @Override
    public double femaleAvg() {
        // Create a query to calculate the average age of female employees
        Query query = em.createQuery("SELECT AVG(e.age) FROM Employee e WHERE e.gender='F'");
        // Execute the query and get the result as a single Double value
        Double count = (Double) query.getSingleResult();
        return count;
    }

    @Override
    public Employee youngestEmployee() {
        // Create a query to retrieve the youngest employee
        Query query = em.createQuery("SELECT e FROM Employee e ORDER BY e.age ASC");
        // Limit the result to one and retrieve the youngest employee
        query.setMaxResults(1);
        Employee emp = (Employee) query.getSingleResult();
        return emp;
    }

}
