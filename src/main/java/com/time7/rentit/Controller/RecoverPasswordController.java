package com.time7.rentit.Controller;

import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Panes.Prompts.Prompts;
import com.time7.rentit.Service.EmployeeService;
import java.awt.Component;

/**
 *
 * @author Daniel
 */
public class RecoverPasswordController {
    private final Component root;
    
    public RecoverPasswordController(Component root) {
        this.root = root;
    }
    
    public void recoverPassword (String name, String user, String newPassword, String retryNewPassword){
        if (name.isEmpty() || user.isEmpty() || newPassword.isEmpty() || retryNewPassword.isEmpty()){
            String message = "Preencha todos os campos!";
            Prompts.PromptWarning(root, message);
            
            return;
        }
        if (newPassword == retryNewPassword) {
            String message = "As senhas são diferentes!";
            Prompts.PromptWarning(root, message);
                        
            return;
        }
            
        EmployeeService service = EmployeeService.getInstance();
        
        try {
            Employee employee = service.getEmployeeByNameAndUsername(name, user);

            if (employee == null){
                String message = "Não foi possível localizar o usuário.";
                Prompts.PromptWarning(root, message);
                return;
            } else {
                employee.setPassword(newPassword);
                String message = "Senha alterada com sucesso!";
                Prompts.PromptInfo(root, message);
                service.updateEmployee(employee);
            }
        } catch (Exception e) {
            Prompts.PromptError(root, e);
        }
    }
}