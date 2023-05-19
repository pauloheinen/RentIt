package com.time7.rentit.Service.Interface.Rent;

import com.time7.rentit.Entity.Rent;
import java.util.List;

/**
 *
 * @author Daniel
 */
 public interface RentServiceInterface {
    void createRent(Rent rent) throws Exception;
    void updateRent(Rent rent) throws Exception;
    void deleteRent(Rent rent) throws Exception;
        
    List<Rent> getRents() throws Exception;
}