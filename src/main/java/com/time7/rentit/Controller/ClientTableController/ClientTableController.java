package com.time7.rentit.Controller.ClientTableController;

import com.time7.rentit.Editors.ClientTableEditor.ClientCellEditor;
import com.time7.rentit.Entity.Client;
import com.time7.rentit.Service.ClientService;
import com.time7.rentit.Utilities.GenericObserver;
import javax.swing.JFrame;


/**
 *
 * @author Daniel
 */
public class ClientTableController {
    
    private final JFrame root;
    
    public ClientTableController(JFrame root){
        this.root = root;
    }
    
    public void addClient(GenericObserver callback) {
        new ClientCellEditor(root, (Object object) -> {
            ClientService service = ClientService.getInstance();
        
            try {
                Client client = Client.class.cast(object);
                service.createClient(client);
                
                // prompt something to inform that the client has been added
                
                callback.inform(client);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).addClient();
    }
    
    public void editClient(Client client, GenericObserver callback) {
        new ClientCellEditor(root, (Object object) -> {
            ClientService service = ClientService.getInstance();
        
            try {
                Client c = Client.class.cast(object);
                service.updateClient(c);
                
                // prompt something to inform that the client has been edited
                
                callback.inform(c);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).editClient(client);
    }
}
