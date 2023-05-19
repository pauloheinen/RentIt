package com.time7.rentit.Service.Interface.Employee;

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
    Employee getEmployeeByNameOrUsername(String user, String username) throws Exception;
    Employee getEmployeeByUsernameAndPassword(String user, String password) throws Exception;
    Employee getEmployeeByUsername(String user) throws Exception;
}