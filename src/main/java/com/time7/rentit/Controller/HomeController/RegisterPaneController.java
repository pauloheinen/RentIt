package com.time7.rentit.Controller.HomeController;

import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Service.Employee.EmployeeService;
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
                Prompts.promptWarning(root, "Já existe um usuário com esse nome e username!");

                return;
            }

            employee = new Employee();

            employee.setName(name);
            employee.setUsername(username);
            employee.setPassword(password);
            
            service.createEmployee(employee);
            
            Prompts.promptInfo(root, "Usuário cadastrado com sucesso!");
        } catch (Exception e) {
            Prompts.promptError(null, e);
        }
    }
    
    private boolean validateFields(String name, String username, String password, String confirmPassword) {
        
        if (name.strip().isEmpty() ||
            username.strip().isEmpty() ||
            password.strip().isEmpty() ||
            confirmPassword.strip().isEmpty()) {
            
            Prompts.promptWarning(root, "Há campos vazios!");
            
            return false;
        }

        if (!password.equals(confirmPassword)) {
            Prompts.promptWarning(root, "As senhas são diferentes!");
            return false;
        }
        
        return true;
    }
}