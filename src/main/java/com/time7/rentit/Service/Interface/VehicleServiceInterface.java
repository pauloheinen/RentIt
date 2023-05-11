package com.time7.rentit.Service.Interface;

import com.time7.rentit.Entity.Vehicle;

/**
 *
 * @author Paulo Henrique
 */
public interface VehicleServiceInterface {
    void createVehicle(Vehicle vehicle) throws Exception;
    void updateVehicle(Vehicle vehicle) throws Exception;
    void deleteVehicle(Vehicle vehicle) throws Exception;
    
    Vehicle getVehicleById(int id) throws Exception;
}