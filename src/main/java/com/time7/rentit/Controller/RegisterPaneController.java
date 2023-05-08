package com.time7.rentit.Controller;

import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Service.EmployeeService;

/**
 *
 * @author José Augusto Scherer
 */
public class RegisterPaneController 
    extends 
        Employee{

    public void registerEmployee(String name, String username, String password, String confirmPassword, int type) {
        if (!password.equals(confirmPassword)){
            System.out.println("Senhas diferentes!");
            return;
        }
        
        EmployeeService service = EmployeeService.getInstance();
        Employee employee = service.getEmployeeByNameAndUsername(name, username);
        
        if (employee != null) {
            System.out.println("Usuário já existe com esse name e username");
            return;
        }
        
        employee = new Employee();
        
        employee.setName(name);
        employee.setUsername(username);
        employee.setPassword(password);
        employee.setType(type);
        
        try {
            service.createEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
}
