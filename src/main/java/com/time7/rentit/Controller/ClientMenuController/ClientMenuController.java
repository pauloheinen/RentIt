package com.time7.rentit.Controller.ClientMenuController;

import com.time7.rentit.Entity.Client;
import com.time7.rentit.Panes.Prompts.PromptError;
import com.time7.rentit.Service.ClientService;
import java.awt.Component;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class ClientMenuController {
    
    Component root;
    
    public ClientMenuController(Component root){
        this.root = root;
    }
    
    public void fillRow(JTable table) {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        
        try {
            List <Client> clients = ClientService.getInstance().getClients();
            
            Object[] row = new Object[5];
            
            for (int i = 0; i<clients.size(); i++) {
                row[0] = clients.get(i).getId();
                row[1] = clients.get(i).getName();
                row[2] = clients.get(i).getEmail();
                row[3] = clients.get(i).getPhone();
                row[4] = clients.get(i).getType();
                
                model.addRow(row);
            }
        } catch (Exception e) {
            new PromptError().log(root, e);
        }
    }
}
