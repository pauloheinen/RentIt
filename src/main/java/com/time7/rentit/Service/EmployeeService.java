/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.time7.rentit.Service;

import com.time7.rentit.Entity.Employee;

/**
 *
 * @author Daniel
 */
public interface EmployeeService {
    Employee createClient (Employee employee) throws Exception;
    void updateClient (Employee employee) throws Exception;
    void deleteClient (Employee employee) throws Exception;   
}
