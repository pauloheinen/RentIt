package com.time7.rentit.Fetchers;

import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Schemas.QueryResult;

public class VehicleFetcher<T>
    extends 
        AbstractFetcher<Vehicle> {

    @Override
    public Vehicle fetch( QueryResult qr ) throws Exception {
        Vehicle v = new Vehicle();

        v.setId( qr.getLong() );
        v.setVehicleBrand( qr.getString() );
        v.setVehicleModel( qr.getString() );
        v.setVehicleYear( qr.getDate() );
        v.setVehiclePlate( qr.getString() );
        v.setType( qr.getInt() );
        v.setStatus( qr.getBoolean() );
       
        return v;
    }
}