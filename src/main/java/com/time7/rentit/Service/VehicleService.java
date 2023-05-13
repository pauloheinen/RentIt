package com.time7.rentit.Service;

import com.time7.rentit.Database.Database;
import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Service.Interface.VehicleServiceInterface;
import java.util.List;

/**
 *
 * @author Paulo Henrique
 */
public class VehicleService
    implements
        VehicleServiceInterface {

    private static VehicleService vehicleService;
        
    private VehicleService() {}
    
    public static VehicleService getInstance() {
        if (vehicleService == null) {
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
        
        Vehicle find = database.findById(Vehicle.class, vehicle.getId());
        
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
    public Vehicle getVehicleById(Long id) throws Exception {
        Database database = Database.getInstance();
        
        return database.findById(Vehicle.class, id);
    }

    @Override
    public List<Vehicle> getVehicles() throws Exception {
        Database database = Database.getInstance();
        
        String sql = "select v from vehicles v";
        
        return database.findAllBySql(Vehicle.class, sql);
    }   
}
