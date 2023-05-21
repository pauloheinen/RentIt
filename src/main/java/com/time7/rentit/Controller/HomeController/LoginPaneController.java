package com.time7.rentit.Controller.HomeController;

import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Panes.HomePane.ManagerPane;
import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Service.Employee.EmployeeService;
import com.time7.rentit.Utilities.EmployeeUtilities;
import javax.swing.JFrame;

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
            Prompts.promptWarning(root, "Preencha usuário e senha!");
            return;
        } 
        
        EmployeeService service = EmployeeService.getInstance();
        
        try {
            Employee employee = service.getEmployeeByUsernameAndPassword(username, password);
            
            if (employee == null){
                Prompts.promptWarning(null, "Não foi possível fazer login.");
                return;
            }
            
            root.dispose();
            
            EmployeeUtilities.setActiveEmployee(employee);
                    
            ManagerPane managerPane = new ManagerPane(root);
            managerPane.setVisible(true);
        } catch (Exception e) {
            Prompts.promptError(root, e);
        }
    }
}
