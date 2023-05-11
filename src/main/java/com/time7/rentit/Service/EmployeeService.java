package com.time7.rentit.Service;

import com.time7.rentit.Database.Database;
import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Service.Interface.EmployeeServiceInterface;

/**
 *
 * @author Daniel
 */
public class EmployeeService 
    implements 
        EmployeeServiceInterface {
    
    private static EmployeeService employeeService;
            
    public static EmployeeService getInstance() {
        if ( employeeService == null ) {
            employeeService = new EmployeeService();
        }
        
        return employeeService;
    }
    
    @Override
    public void createEmployee(Employee employee) throws Exception {
        Database database = Database.getInstance();
        
        database.add(employee);
    }

    @Override
    public void updateEmployee(Employee employee) throws Exception {
        Database database = Database.getInstance();
        
        Employee find = database.findById(Employee.class, employee.getId());
        
        find.setName(employee.getName());
        find.setUsername(employee.getUsername());
        find.setPassword(employee.getPassword());
        
        database.update(find);
    }

    @Override
    public void deleteEmployee(Employee employee) throws Exception {
        Database database = Database.getInstance();
        
        database.delete(employee); 
    }

    @Override
    public Employee getEmployeeById(int id) throws Exception {
        Database database = Database.getInstance();
        
        return database.findById(Employee.class, id); 
    }

    @Override
    public Employee getEmployeeByNameAndUsername(String user, String username) {
        Database database = Database.getInstance();
        
        String sql = "select e from employees e where e.name = '" + user + "' or e.username = '" + username + "'";
        
        return database.findObjectBySql(Employee.class, sql);
    }
    
    public Employee getEmployeeByUsernameAndPassword(String user, String password){
        Database database = Database.getInstance();
        
        String sql = "select e from employees e where e.name = '" + user + "' and e.password = '" + password + "'";
        
        return database.findObjectBySql(Employee.class, sql);
    }
}