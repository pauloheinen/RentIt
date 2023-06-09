package com.time7.rentit.Service.Interface.Vehicle;

import com.time7.rentit.Entity.Vehicle;
import java.util.List;

/**
 *
 * @author Paulo Henrique
 */
public interface VehicleServiceInterface {
    void createVehicle(Vehicle vehicle) throws Exception;
    void updateVehicle(Vehicle vehicle) throws Exception;
    void deleteVehicle(Vehicle vehicle) throws Exception;
    
    Vehicle getVehicleById(Long id) throws Exception;
    List<Vehicle> getVehicles() throws Exception;
}
