package com.time7.rentit.Utilities;

import com.time7.rentit.Entity.Employee;

/**
 *
 * @author Paulo Henrique
 */
public class EmployeeUtilities {

    private static Employee activeEmployee;
    
    public static Employee getActiveEmployee() {
        return activeEmployee;
    }
    
    public static void setActiveEmployee(Employee employee) {
        activeEmployee = employee;
    }
}
