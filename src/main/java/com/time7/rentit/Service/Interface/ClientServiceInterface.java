package com.time7.rentit.Service.Interface;

import com.time7.rentit.Entity.Client;

/**
 *
 * @author Daniel
 */
public interface ClientServiceInterface {
    Client createClient (Client client) throws Exception;
    void updateClient (Client client) throws Exception;
    void deleteClient (Client client) throws Exception;    
}
