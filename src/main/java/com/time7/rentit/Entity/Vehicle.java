package com.time7.rentit.Entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Daniel
 */
@Entity(name = "vehicles")
public class Vehicle
    implements 
        Serializable {
    
    public static class TYPES {
        public static final int CAR = 1;
        public static final int MOTORCYCLE = 2;
        public static final int VAN = 3;
    }
    
    public static class STATUS {
        public static final int RENT = 1;
        public static final int DISPONIBLE = 2;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "vehicle_brand", nullable = false, length = 20)
    private String vehicleBrand;
    @Column(name = "vehicle_model", nullable = false, length = 120)
    private String vehicleModel;
    @Column(name = "vehicle_year", nullable = false, length = 4)
    private String vehicleYear;
    @Column(name = "vehicle_plate", nullable = false, length = 10)
    private String vehiclePlate;
    @Column(name = "type", nullable = false)
    private int type;
    @Column(name = "status", nullable = false)
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

    public String getVehicleYear() {
        return vehicleYear;
    }

    public void setVehicleYear(String vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate( String vehiclePlate ) {
        this.vehiclePlate = vehiclePlate;
    }

    public int getType() {
        return type;
    }

    public void setType( int type ) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus( boolean status ) {
        this.status = status;
    }  
}