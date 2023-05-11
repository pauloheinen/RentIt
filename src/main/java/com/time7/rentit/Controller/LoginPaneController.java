package com.time7.rentit.Controller;

import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Service.EmployeeService;
import javax.swing.JOptionPane;
import org.springframework.stereotype.Controller;

/**
 *
 * @author José Augusto Scherer
 */
@Controller
public class LoginPaneController {

    public LoginPaneController() {
        
    }
    
    public void logInEmployee(String user, String password) {
        EmployeeService service = EmployeeService.getInstance();
        
        try {
            Employee employee = service.getEmployeeByUsernameAndPassword(user, password);

            if (employee == null){
                JOptionPane.showMessageDialog(null, "Dados inválidos!", "Não foi possível fazer login.", 0);
                return;
            } else {
                System.out.println("Entrou na tela principal");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
