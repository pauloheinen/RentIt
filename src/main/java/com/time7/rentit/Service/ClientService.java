package com.time7.rentit.Service;

import com.time7.rentit.Database.Database;
import com.time7.rentit.Entity.Client;
import com.time7.rentit.Service.Interface.ClientServiceInterface;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class ClientService 
    implements 
        ClientServiceInterface {
    
    private static ClientService clientService;
    
    private ClientService() {}
    
    public static ClientService getInstance() {
        if (clientService == null) {
            clientService = new ClientService();
        }
        
        return clientService;
    }
    
    @Override
    public void createClient (Client client) throws Exception {
        Database database = Database.getInstance();
        
        database.add(client);
    }
    
    @Override
    public void updateClient (Client client) throws Exception {
        Database database = Database.getInstance();
        
        Client find = database.findById(Client.class, client.getId());
        
        find.setName(client.getName());
        find.setEmail(client.getEmail());
        find.setPhone(client.getPhone());
                
        database.update(find);
    }
    
    @Override
    public void deleteClient (Client client) throws Exception {
        Database database = Database.getInstance();
        
        database.delete(client);
    }
    
    @Override
    public Client getClientById(int id) throws Exception {
        Database database = Database.getInstance();
     
        return database.findById(Client.class, id);
    }
    
    @Override
    public List<Client> getClients() throws Exception {
        Database database = Database.getInstance();
        
        String sql = "select c from clients c";
        
        return database.findAllBySql(Client.class, sql);
    }
}