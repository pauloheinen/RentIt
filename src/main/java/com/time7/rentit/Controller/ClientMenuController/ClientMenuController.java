package com.time7.rentit.Controller.ClientMenuController;

import com.time7.rentit.Entity.Client;
import com.time7.rentit.Panes.Prompts.Prompts;
import com.time7.rentit.Service.ClientService;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
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
            Prompts.PromptError(null, e);
        }
    }
    
    public void editRow(JTable table) {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        
        try {
            
        } catch (Exception e) {
            Prompts.PromptError(null, e);
        }
    }
    
    public void addRow(JTable table) {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        
        try {            
            
        } catch (Exception e) {
            Prompts.PromptError(null, e);
        }
    }
    
    public void removeRow(JTable table) {
        ClientService clientService = ClientService.getInstance();
        
        try {            
            //Saber a linha que o usuário selecionou
            int line = table.getSelectedRow();
            int column = 0;
            
            //Recebendo o valor do ID da linha selecionada
            Object object = table.getValueAt(line, column);
            
            //Transformando o objeto em int para pesquisar o cliente no BD pelo ID
            int idClient = Integer.parseInt(object.toString());
                        
            //Buscando o cliente
            Client client = ClientService.getInstance().getClientById(idClient);
                        
            int option = JOptionPane.showConfirmDialog(null, "Deseja excluir o cliente de código: " + client.getId() +" ?", "Atenção!", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                clientService.deleteClient(client);
                JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!", "Cliente removido.", 1);
            }
        } catch (Exception e) {
            Prompts.PromptError(null, e);
        }
    }
}
