package com.time7.rentit.Service;

import com.time7.rentit.Dto.EmployeeDto;
import com.time7.rentit.Entity.Employee;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface EmployeeService {
    void createEmployee(EmployeeDto userDTO) throws Exception;
    void updateEmployee(Employee employee) throws Exception;
    void deleteEmployee(Employee employee) throws Exception;
    EmployeeDto getEmployeeById(Long employeeId) throws Exception;
    List<EmployeeDto> getEmployees() throws Exception;  
}
