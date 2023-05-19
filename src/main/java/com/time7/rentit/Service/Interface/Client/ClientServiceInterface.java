package com.time7.rentit.Service.Interface.Client;

import com.time7.rentit.Entity.Client;
import java.util.List;

/**
 *
 * @author Daniel
 */
    public interface ClientServiceInterface {
        void createClient(Client client) throws Exception;
        void updateClient(Client client) throws Exception;
        void deleteClient(Client client) throws Exception;

        Client getClientById(int id) throws Exception;
        List<Client> getClients() throws Exception;
    }
