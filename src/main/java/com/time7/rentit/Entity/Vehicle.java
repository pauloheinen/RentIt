package com.time7.rentit.Entity;

import java.sql.Date;

/**
 *
 * @author Daniel
 */
public class Vehicle {
    
    private Long id;
    private String vehicleBrand;
    private String vehicleModel;
    private Date vehicleYear;
    private String vehiclePlate;
    private String type;
    private boolean status;

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand( String vehicleBrand ) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel( String vehicleModel ) {
        this.vehicleModel = vehicleModel;
    }

    public Date getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear( Date vehicleYear ) {
        this.vehicleYear = vehicleYear;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate( String vehiclePlate ) {
        this.vehiclePlate = vehiclePlate;
    }

    public String getType() {
        return type;
    }

    public void setType( String type ) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus( boolean status ) {
        this.status = status;
    }  
}