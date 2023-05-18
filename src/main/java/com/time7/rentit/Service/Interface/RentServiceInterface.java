package com.time7.rentit.Service.Interface;

import com.time7.rentit.Entity.Rent;

/**
 *
 * @author Daniel
 */
    public interface RentServiceInterface {
        void createRent(Rent rent) throws Exception;
        void updateRent(Rent rent) throws Exception;
        void deleteRent(Rent rent) throws Exception;
}