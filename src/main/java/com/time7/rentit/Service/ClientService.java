/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.time7.rentit.Service;

import com.time7.rentit.Entity.Client;

/**
 *
 * @author Daniel
 */
public interface ClientService {
    Client createClient (Client client) throws Exception;
    void updateClient (Client client) throws Exception;
    void deleteClient (Client client) throws Exception;    
}
