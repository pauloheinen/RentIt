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
    
    public static final int TYPE_CAR = 0;
    public static final int TYPE_VAN = 1;
    
    public static String[] TYPES = new String[] {
        "Carro",
        "Van"
    };
    
    public static final int STATUS_DISPONIBLE = 0;
    public static final int STATUS_RENT = 1;
    
    public static String[] STATUS = new String[] {
        "Disponível",
        "Alugado"
    };
    
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
    private int status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
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

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getVehicleTypeName() {
        return Vehicle.TYPES[this.type];
    }
    
    public String getVehicleStatusLabel() {
        return Vehicle.STATUS[this.status];
    }

    @Override
    public String toString() {
        return this.vehicleBrand + " " +
               this.vehicleModel + " " +
               this.vehiclePlate ;
    }
}