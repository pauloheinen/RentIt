package com.time7.rentit.Controller;

import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Panes.ManagerPane;
import com.time7.rentit.Panes.Prompts.Prompts;
import com.time7.rentit.Panes.VehiclePane.VehicleTablePane;
import com.time7.rentit.Service.EmployeeService;
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
    
    public void logInEmployee(String user, String password) {
        if (user.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(root, "Preencha usuário e senha!");
            
            return;
        } 
        
        EmployeeService service = EmployeeService.getInstance();
        
        try {
            Employee employee = service.getEmployeeByUsernameAndPassword(user, password);
            
            if (employee == null){
                JOptionPane.showMessageDialog(null, "Dados inválidos!", "Não foi possível fazer login.", 0);
                return;
            } 
            
            root.dispose();
            
            ManagerPane managerPane = new ManagerPane();
            managerPane.setVisible(true);
            managerPane.setLocationRelativeTo(root);
            
        } catch (Exception e) {
            Prompts.promptError(root, e);
        }
    }
}
