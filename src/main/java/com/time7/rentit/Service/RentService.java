package com.time7.rentit.Service;

import com.time7.rentit.Database.Database;
import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Entity.Rent;
import com.time7.rentit.Service.Interface.RentServiceInterface;

/**
 *
 * @author Daniel
 */
public class RentService 
    implements 
        RentServiceInterface {
    
    private static RentService rentService;
    
    private RentService() {}
    
    public static RentService getInstance() {
        if (rentService == null) {
            rentService = new RentService();
        }
        
        return rentService;
    }
    
    @Override
    public void createRent (Rent rent) throws Exception {
        Database database = Database.getInstance();
        
        database.add(rent);
    }
    
    @Override
    public void updateRent(Rent rent) throws Exception {
        Database database = Database.getInstance();
        
        Rent find = database.findById(Rent.class, rent.getId());
        
        find.setClient_id(rent.getClient_id());
        find.setVehicle_id(rent.getVehicle_id());
        find.setRent_start_dt(rent.getRent_start_dt());
        find.setRent_end_dt(rent.getRent_end_dt());
        find.setRent_expected_end_dt(rent.getRent_expected_end_dt());
        find.setRent_value(rent.getRent_value());
        find.setRent_value_fine(rent.getRent_value_fine());
        find.setRent_value_fine(rent.getRent_value_fine());
        find.setStatus(rent.getStatus());
        
        database.update(find);
    }
    
    @Override
    public void deleteRent (Rent rent) throws Exception {
        Database database = Database.getInstance();
        
        database.delete(rent);
    }
}