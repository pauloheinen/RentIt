package com.time7.rentit.Service.Implementation;

import com.time7.rentit.Database.Database;
import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Schemas.Schema;
import com.time7.rentit.Schemas.Schema.Vehicles;
import com.time7.rentit.Service.VehicleService;
import java.sql.BatchUpdateException;
import java.sql.PreparedStatement;

/**
 *
 * @author Paulo Henrique
 */
public class VehicleServiceImplementation 
    implements
        VehicleService {
    
    @Override
    public void createVehicle( Vehicle vehicle ) throws Exception {
        Database db = Database.getInstance();
        db.setAutoCommit( false );
        
        Vehicles v = Vehicles.table;
        
        String sql = "insert"                       +
                     " into "                       +
                     v.name                         +
                     " ( "                          +
                     v.columns.VEHICLE_BRAND + ", " +
                     v.columns.VEHICLE_MODEL + ", " +
                     v.columns.VEHICLE_YEAR  + ", " +
                     v.columns.VEHICLE_PLATE + ", " +
                     v.columns.TYPE          + ", " +
                     v.columns.STATUS               + 
                     " ) values "                   +
                     "( ?, ?, ?, ?, ?, ? )"         ;
        
        try ( PreparedStatement ps = db.prepareStatement( sql ) ) {
            int i = 1;
            
            ps.setString( i++, vehicle.getVehicleBrand() );
            ps.setString( i++, vehicle.getVehicleModel() );
            ps.setDate( i++, vehicle.getVehicleYear() );
            ps.setString( i++, vehicle.getVehiclePlate() );
            ps.setInt( i++, vehicle.getType() );
            ps.setBoolean( i++, vehicle.isStatus() );
                        
            db.execute( ps );
        }
        
        catch ( BatchUpdateException e ) {
            db.rollback();

            throw e;
        }

        finally {
            db.setAutoCommit( true );
        }
    }

    @Override
    public void updateVehicle( Vehicle vehicle ) throws Exception {
        Database db = Database.getInstance();
        db.setAutoCommit( false );

        Vehicles v = Vehicles.table;
        
        String sql = "update "                          +
                     v.name                             + 
                     " set "                            +
                     v.columns.VEHICLE_BRAND + " = ?, " +
                     v.columns.VEHICLE_MODEL + " = ?, " +
                     v.columns.VEHICLE_YEAR  + " = ?, " +
                     v.columns.VEHICLE_PLATE + " = ?, " +
                     v.columns.TYPE          + " = ?, " +
                     v.columns.STATUS        + " = ?, " +
                     " where "                          +
                     v.columns.ID            + " = ?"   ;
        
        try ( PreparedStatement ps = db.prepareStatement( sql ) ) {
            int i = 1;
            
            ps.setString( i++, vehicle.getVehicleBrand() );
            ps.setString( i++, vehicle.getVehicleModel() );
            ps.setDate( i++, vehicle.getVehicleYear() );
            ps.setString( i++, vehicle.getVehiclePlate() );
            ps.setInt( i++, vehicle.getType() );
            ps.setBoolean( i++, vehicle.isStatus() );
                        
            ps.setLong( i++, vehicle.getId() );
                    
            db.execute( ps );
        }
        
        catch ( BatchUpdateException e ) {
            db.rollback();

            throw e;
        }

        finally {
            db.setAutoCommit( true );
        }
    }

    @Override
    public void deleteVehicle( Vehicle vehicle ) throws Exception {
        Database db = Database.getInstance();
        db.setAutoCommit( false );

        Vehicles v = Vehicles.table;

        String sql = " delete from "      +
                     v.name               +
                     " where "            +
                     v.columns.ID + " = ?";
        
        try ( PreparedStatement ps = db.prepareStatement( sql ) ) {
            int i = 1;
            
            ps.setLong( i++, vehicle.getId() );
                    
            db.execute( ps );
        }
        
        catch ( BatchUpdateException e ) {
            db.rollback();

            throw e;
        }

        finally {
            db.setAutoCommit( true );
        }
    }
    
    @Override
    public Vehicle getVehicleById( int id ) throws Exception {
        Database db = Database.getInstance();
        db.setAutoCommit( false );

        Vehicles v = Vehicles.table;

        String sql = v.select    +
                     " where "   +
                     v.columns.ID;
        
        return db.fetchOne( sql, Vehicles.fetcher );
    }
}
