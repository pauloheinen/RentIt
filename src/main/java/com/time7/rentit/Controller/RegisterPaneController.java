package com.time7.rentit.Controller;

import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Panes.Prompts.Prompts;
import com.time7.rentit.Service.EmployeeService;
import javax.swing.JOptionPane;
import java.awt.Component;

/**
 *
 * @author José Augusto Scherer
 */
public class RegisterPaneController {

    private final Component root;
    
    public RegisterPaneController(Component root) {
        this.root = root;
    }
    
    public void registerEmployee(String name, String username, String password, String confirmPassword) {
        if (! validateFields(name, username, password, confirmPassword)) {
            return;
        }
                
        try {
            EmployeeService service = EmployeeService.getInstance();
            
            Employee employee = service.getEmployeeByNameOrUsername(name, username);

            if (employee != null) {
                JOptionPane.showMessageDialog(null, "Já existe um usuário com esse nome e username!");

                return;
            }

            employee = new Employee();

            employee.setName(name);
            employee.setUsername(username);
            employee.setPassword(password);
            
            service.createEmployee(employee);
        } catch (Exception e) {
            Prompts.PromptError(null, e);
        }
    }
    
    private boolean validateFields(String name, String username, String password, String confirmPassword) {
        
        if (name.strip().isEmpty() ||
            username.strip().isEmpty() ||
            password.strip().isEmpty() ||
            confirmPassword.strip().isEmpty()) {
            
            JOptionPane.showMessageDialog(root, "Há campos vazios!");
            
            return false;
        }

        else if (!password.equals(confirmPassword)) {
            System.out.println("Senhas diferentes!");
            return false;
        }
        
        return true;
    }
}
