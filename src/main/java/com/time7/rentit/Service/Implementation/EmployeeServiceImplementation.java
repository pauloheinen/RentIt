/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.time7.rentit.Service.Implementation;

import com.time7.rentit.Database.Database;
import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Service.EmployeeService;
import jdk.jshell.spi.ExecutionControl;

/**
 *
 * @author Daniel
 */
public class EmployeeServiceImplementation
    implements 
        EmployeeService {
    
    final private Database db = Database.getInstance();
    
    @Override
    public Employee createClient (Employee client) throws Exception {
        throw new ExecutionControl.NotImplementedException("not implemented");
    }
    
    @Override
    public void updateClient (Employee client) throws Exception {
        throw new ExecutionControl.NotImplementedException("not implemented");
    }
    
    @Override
    public void deleteClient (Employee client) throws Exception {
        throw new ExecutionControl.NotImplementedException("not implemented");
    }   
}
