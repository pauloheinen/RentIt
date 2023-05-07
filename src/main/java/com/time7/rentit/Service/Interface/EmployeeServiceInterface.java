package com.time7.rentit.Service.Interface;

import com.time7.rentit.Dto.EmployeeDto;
import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Service.EmployeeService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Daniel
 */
@Service
public class EmployeeServiceInterface
    implements 
        EmployeeService {
    
    @Override
    public void createEmployee(EmployeeDto userDTO) throws Exception {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateEmployee(Employee employee) throws Exception {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void deleteEmployee(Employee employee) throws Exception {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) throws Exception {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public List<EmployeeDto> getEmployees() throws Exception {
        throw new java.lang.UnsupportedOperationException("Not supported yet.");
    }
}
