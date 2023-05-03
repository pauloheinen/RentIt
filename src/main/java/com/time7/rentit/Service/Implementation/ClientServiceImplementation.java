/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.time7.rentit.Service.Implementation;

import com.time7.rentit.Database.Database;
import com.time7.rentit.Entity.Client;
import com.time7.rentit.Service.ClientService;
import jdk.jshell.spi.ExecutionControl;

/**
 *
 * @author Daniel
 */
public class ClientServiceImplementation 
    implements 
        ClientService {
    final private Database db = Database.getInstance();
    
    @Override
    public Client createClient (Client client) throws Exception {
        throw new ExecutionControl.NotImplementedException("not implemented");
    }
    
    @Override
    public void updateClient (Client client) throws Exception {
        throw new ExecutionControl.NotImplementedException("not implemented");
    }
    
    @Override
    public void deleteClient (Client client) throws Exception {
        throw new ExecutionControl.NotImplementedException("not implemented");
    }
}
