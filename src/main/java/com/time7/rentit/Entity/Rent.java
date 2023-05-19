package com.time7.rentit.Entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

/**
 *
 * @author Daniel
 */
@Entity(name = "rents")
public class Rent
    implements
        Serializable {
    
    public static final int TYPE_CAR = 0;
    public static final int TYPE_VAN = 1;
    
    public static String[] STATUS = new String[] {
        "Em aberto",
        "Encerrada"
    };
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "client_id", nullable = false)
    private Long clientId;
    @Column(name = "vehicle_id", nullable = false)
    private Long vehicleId;
    @Column(name = "rent_start_dt", nullable = false)
    private Date rentStartDt;
    @Column(name = "rent_end_dt", nullable = false)
    private Date rentEndDt;
    @Column(name = "rent_expected_end_date", nullable = false)
    private Date rentExpectedEndDt;
    @Column(name = "rent_value", nullable = false)
    private double rentValue;
    @Column(name = "rent_value_fine", nullable = false)
    private double rentValueFine;
    @Column(name = "status", nullable = false)
    private int status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Date getRentStartDt() {
        return rentStartDt;
    }

    public void setRentStartDt(Date rentStartDt) {
        this.rentStartDt = rentStartDt;
    }

    public Date getRentEndDt() {
        return rentEndDt;
    }

    public void setRentEndDt(Date rentEndDt) {
        this.rentEndDt = rentEndDt;
    }

    public Date getRentExpectedEndDt() {
        return rentExpectedEndDt;
    }

    public void setRentExpectedEndDt(Date rentExpectedEndDt) {
        this.rentExpectedEndDt = rentExpectedEndDt;
    }

    public double getRentValue() {
        return rentValue;
    }

    public void setRentValue(double rentValue) {
        this.rentValue = rentValue;
    }

    public double getRentValueFine() {
        return rentValueFine;
    }

    public void setRentValueFine(double rentValueFine) {
        this.rentValueFine = rentValueFine;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getRentStatusLabel() {
        return Rent.STATUS[this.status];
    }
}