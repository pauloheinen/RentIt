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
    
    public void recoverPassword (String user, String newPassword, String retryNewPassword){
        if (! validateFields(user, newPassword, retryNewPassword)) {
            return;
        }
        
        try {
            EmployeeService service = EmployeeService.getInstance();
            Employee employee = service.getEmployeeByNameOrUsername("", user);
            
            if (employee == null){
                    String message = "Não foi possível localizar o usuário.";
                    Prompts.PromptWarning(root, message);
                    return;
                } else {
                    employee.setPassword(newPassword);
                    service.updateEmployee(employee);
                    
                    String message = "Senha alterada com sucesso!";
                    Prompts.PromptInfo(root, message);
                }
        } catch (Exception e){
            Prompts.PromptError(null, e);
        }
    }
    
    private boolean validateFields (String user, String newPassword, String retryNewPassword){
        
        if (user.isEmpty() || newPassword.isEmpty() || retryNewPassword.isEmpty()){
            String message = "Preencha todos os campos!";
            Prompts.PromptWarning(root, message);

            return false;
        }
        else if (!newPassword.equals(retryNewPassword)) {
            String message = "As senhas são diferentes!";
            Prompts.PromptWarning(root, message);

            return false;
        }
        
        return true;
    }
}
