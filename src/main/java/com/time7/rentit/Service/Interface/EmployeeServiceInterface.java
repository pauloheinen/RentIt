package com.time7.rentit.Service.Interface;

import com.time7.rentit.Entity.Employee;

/**
 *
 * @author Daniel
 */
public interface EmployeeServiceInterface {
    void createEmployee(Employee employee) throws Exception;
    void updateEmployee(Employee employee) throws Exception;
    void deleteEmployee(Employee employee) throws Exception;
    
    Employee getEmployeeById(int id) throws Exception;
    public Employee getEmployeeByNameAndUsername(String user, String username) throws Exception;
}