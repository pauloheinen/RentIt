package com.time7.rentit.Service.Employee;

import com.time7.rentit.Database.Database;
import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Service.Interface.Employee.EmployeeServiceInterface;

/**
 *
 * @author Daniel
 */
public class EmployeeService 
    implements 
        EmployeeServiceInterface {
    
    private static EmployeeService employeeService;
    
    private EmployeeService() {}
    
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
    public Employee getEmployeeByNameOrUsername(String name, String username) throws Exception{
        Database database = Database.getInstance();
        
        String sql = "select e from employees e where e.name = '" + name + "' or e.username = '" + username + "'";
        
        return database.findSingleBySql(Employee.class, sql);
    }
    
    @Override
    public Employee getEmployeeByUsername(String username) throws Exception{
        Database database = Database.getInstance();
        
        String sql = "select e from employees e where e.username = '" + username + "'";
        
        return database.findSingleBySql(Employee.class, sql);
    }
    
    @Override
    public Employee getEmployeeByUsernameAndPassword(String name, String password) throws Exception{
        Database database = Database.getInstance();
        
        String sql = "select e from employees e where e.name = '" + name + "' and e.password = '" + password + "'";
        
        return database.findSingleBySql(Employee.class, sql);
    }
}