package com.time7.rentit.Controller;

import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Panes.Prompts.Prompts;
import com.time7.rentit.Panes.VehiclePane.VehicleMenuPane;
import com.time7.rentit.Service.EmployeeService;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author José Augusto Scherer
 */
public class LoginPaneController {

    private final Component root;
    
    public LoginPaneController(Component root) {
        this.root = root;
    }
    
    public void logInEmployee(String user, String password) {
        if (user.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha usuário e senha!");
            
            return;
        } 
        
        EmployeeService service = EmployeeService.getInstance();
        
        try {
            Employee employee = service.getEmployeeByUsernameAndPassword(user, password);
            
            if (employee == null){
                JOptionPane.showMessageDialog(null, "Dados inválidos!", "Não foi possível fazer login.", 0);
                return;
            } 
            
            root.setVisible(false); // should dispose, but how?
            
            VehicleMenuPane vehicleMenuPane = new VehicleMenuPane();
            vehicleMenuPane.setVisible(true);
            
        } catch (Exception e) {
            Prompts.PromptError(null, e);
        }
    }
}
