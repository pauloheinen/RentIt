package com.time7.rentit.Controller.HomeController;

import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Panes.HomePane.ManagerPane;
import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Service.Employee.EmployeeService;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author José Augusto Scherer
 */
public class LoginPaneController {

    private final JFrame root;
    
    public LoginPaneController(JFrame root) {
        this.root = root;
    }
    
    public void logInEmployee(String username, String password) {
        if (username.isEmpty() || password.isEmpty()){
            Prompts.promptInfo(root, "Preencha usuário e senha!");
            
            return;
        } 
        
        EmployeeService service = EmployeeService.getInstance();
        
        try {
            Employee employee = service.getEmployeeByUsernameAndPassword(username, password);
            
            if (employee == null){
                Prompts.promptInfo(null, "Não foi possível fazer login.");
                return;
            } 
            
            root.dispose();
            
            ManagerPane managerPane = new ManagerPane();
            managerPane.setVisible(true);
        } catch (Exception e) {
            Prompts.promptError(root, e);
        }
    }
}
