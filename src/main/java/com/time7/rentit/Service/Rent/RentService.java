package com.time7.rentit.Service.Rent;

import com.time7.rentit.Database.Database;
import com.time7.rentit.Entity.Rent;
import com.time7.rentit.Service.Interface.Rent.RentServiceInterface;
import java.util.List;

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
    public void createRent(Rent rent) throws Exception {
        Database database = Database.getInstance();
        
        database.add(rent);
    }
    
    @Override
    public void updateRent(Rent rent) throws Exception {
        Database database = Database.getInstance();
        
        Rent find = database.findById(Rent.class, rent.getId());
        
        find.setClientId(rent.getClientId());
        find.setVehicleId(rent.getVehicleId());
        find.setRentStartDt(rent.getRentStartDt());
        find.setRentEndDt(rent.getRentEndDt());
        find.setRentExpectedEndDt(rent.getRentExpectedEndDt());
        find.setRentValue(rent.getRentValue());
        find.setStatus(rent.getStatus());
        
        database.update(find);
    }
    
    @Override
    public void deleteRent(Rent rent) throws Exception {
        Database database = Database.getInstance();
        
        database.delete(rent);
    }
    
    @Override
    public List<Rent> getRents() throws Exception {
        Database database = Database.getInstance();
        
        String sql = "select r from rents r";
        
        return database.findAllBySql(Rent.class, sql);
    }
}