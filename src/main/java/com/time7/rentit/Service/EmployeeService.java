package com.time7.rentit.Service;

import com.time7.rentit.Entity.Employee;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface EmployeeService {
    void createEmployee(Employee userDTO) throws Exception;
    void updateEmployee(Employee employee) throws Exception;
    void deleteEmployee(Employee employee) throws Exception;
    Employee getEmployeeById(Long employeeId) throws Exception;
    List<Employee> getEmployees() throws Exception;  
}
