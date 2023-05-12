package com.time7.rentit.Controller;

import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Panes.Prompts.PromptError;
import com.time7.rentit.Service.EmployeeService;
import javax.swing.JOptionPane;
import java.awt.Component;


/**
 *
 * @author José Augusto Scherer
 */
public class RegisterPaneController
        extends
        Employee {

    Component root;
    
    public RegisterPaneController(Component root) {
        this.root = root;
    }
    
    public void registerEmployee(String name, String username, String password, String confirmPassword, int type) {
        EmployeeService service = EmployeeService.getInstance();

        if (name.strip().isEmpty()
                && username.strip().isEmpty()
                && password.strip().isEmpty()
                && confirmPassword.strip().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Para se registrar, é necessário preencher os campos!");

        } else if (name.strip().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Insira seu nome!");

        } else if (username.strip().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Insira seu nome de usuário!");

        } else if (password.strip().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Insira sua senha!");

        } else if (confirmPassword.strip().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Confirme sua senha!");

        }

        if (!password.equals(confirmPassword)) {
            System.out.println("Senhas diferentes!");
            return;
        }

        try {
            Employee employee = service.getEmployeeByNameAndUsername(name, username);

            if (employee != null) {

                JOptionPane.showMessageDialog(null, "Já existe um usuário com esse nome e username!");

                return;
            }

            employee = new Employee();

            employee.setName(name);
            employee.setUsername(username);
            employee.setPassword(password);
            employee.setType(type);

            service.createEmployee(employee);
        } catch (Exception e) {
            new PromptError().log(root, e);
        }
    }
}
