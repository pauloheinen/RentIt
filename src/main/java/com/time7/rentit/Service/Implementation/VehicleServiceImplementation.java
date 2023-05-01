package com.time7.rentit.Service.Implementation;

import com.time7.rentit.Database.Database;
import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Service.VehicleService;
import jdk.jshell.spi.ExecutionControl;

/**
 *
 * @author Paulo Henrique
 */
public class VehicleServiceImplementation 
    implements
        VehicleService {

    final private Database db = Database.getInstance();
    
    @Override
    public Vehicle createVehicle( Vehicle vehicle ) throws Exception {
        throw new ExecutionControl.NotImplementedException( "not implemented" );
    }

    @Override
    public void updateVehicle( Vehicle vehicle ) throws Exception {
        throw new ExecutionControl.NotImplementedException( "not implemented" );
    }

    @Override
    public void deleteVehicle( Vehicle vehicle ) throws Exception {
        throw new ExecutionControl.NotImplementedException( "not implemented" );            
    }
    
}
