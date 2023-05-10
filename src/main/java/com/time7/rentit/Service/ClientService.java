package com.time7.rentit.Service;

import com.time7.rentit.Database.Connection;
import com.time7.rentit.Database.Database;
import com.time7.rentit.Entity.Client;
import com.time7.rentit.Service.Interface.ClientServiceInterface;

/**
 *
 * @author Daniel
 */
public class ClientService 
    implements 
        ClientServiceInterface {
    
    private static ClientService clientService;
    
    public static ClientService getInstance() {
        if (clientService == null) {
            clientService = new ClientService();
        }
        
        return clientService;
    }
    
    @Override
    public Client createClient (Client client) throws Exception {
        Database database = Database.getInstance();
        
        database.add(client);
        
        return null;
    }
    
    @Override
    public void updateClient (Client client) throws Exception {
        Database database = Database.getInstance();
        
        Client find = database.findById(Client.class, client.getId());
        
        find.setName(client.getName());
        find.setEmail(client.getEmail());
        find.setPhone(client.getPhone());
        find.setType(client.getType());
        
        database.update(find);
    }
    
    @Override
    public void deleteClient (Client client) throws Exception {
        Database database = Database.getInstance();
        
        database.delete(client);
    }
    
    public Client getClientById(int id) throws Exception {
        Database database = Database.getInstance();
     
        return database.findById(Client.class, id);
    }
    
    public Client getAll() throws Exception {
        Connection connection = Connection.getConnection();
        
        String sql = "select e from clients";
        
        return connection.findObjectBySql(Client.class, sql);
    }
}
