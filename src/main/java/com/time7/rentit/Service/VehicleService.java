package com.time7.rentit.Service;

import com.time7.rentit.Database.Database;
import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Service.Interface.VehicleServiceInterface;

/**
 *
 * @author Paulo Henrique
 */
public class VehicleService
    implements
        VehicleServiceInterface {

    private static VehicleService vehicleService;
            
    public static VehicleService getInstance() {
        if ( vehicleService == null ) {
            vehicleService = new VehicleService();
        }
        
        return vehicleService;
    }
    
    @Override
    public void createVehicle(Vehicle vehicle) throws Exception {
        Database database = Database.getInstance();
        
        database.add(vehicle);
    }

    @Override
    public void updateVehicle(Vehicle vehicle) throws Exception {
        Database database = Database.getInstance();
        
        Vehicle find = database.find(Vehicle.class, vehicle.getId());
        
        find.setVehicleBrand(vehicle.getVehicleBrand());
        find.setVehicleModel(vehicle.getVehicleModel());
        find.setVehicleYear(vehicle.getVehicleYear());
        find.setVehiclePlate(vehicle.getVehiclePlate());
        find.setType(vehicle.getType());
        find.setStatus(vehicle.isStatus());
        
        database.update(find);
    }

    @Override
    public void deleteVehicle(Vehicle vehicle) throws Exception {
        Database database = Database.getInstance();
        
        database.delete(vehicle);
    }
    
    @Override
    public Vehicle getVehicleById(int id) throws Exception {
        Database database = Database.getInstance();
        
        return database.find(Vehicle.class, id);
    }
}
