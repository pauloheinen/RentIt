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
    
    @Id
    private Long id;
    @Column(name = "client_id", nullable = false)
    private Long client_id;
    @Column(name = "vehicle_id", nullable = false)
    private Long vehicle_id;
    @Column(name = "rent_start_dt", nullable = false)
    private Date rent_start_dt;
    @Column(name = "rent_end_dt", nullable = false)
    private Date rent_end_dt;
    @Column(name = "rent_expected_end_date", nullable = false)
    private Date rent_expected_end_dt;
    @Column(name = "rent_value", nullable = false)
    private double rent_value;
    @Column(name = "rent_value_fine", nullable = false)
    private double rent_value_fine;
    @Column(name = "status", nullable = false)
    private int status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public Long getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(Long vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public Date getRent_start_dt() {
        return rent_start_dt;
    }

    public void setRent_start_dt(Date rent_start_date) {
        this.rent_start_dt = rent_start_date;
    }

    public Date getRent_end_dt() {
        return rent_end_dt;
    }

    public void setRent_end_dt(Date rent_end_date) {
        this.rent_end_dt = rent_end_date;
    }

    public Date getRent_expected_end_dt() {
        return rent_expected_end_dt;
    }

    public void setRent_expected_end_dt(Date rent_expected_end_date) {
        this.rent_expected_end_dt = rent_expected_end_date;
    }

    public double getRent_value() {
        return rent_value;
    }

    public void setRent_value(double rent_value) {
        this.rent_value = rent_value;
    }

    public double getRent_value_fine() {
        return rent_value_fine;
    }

    public void setRent_value_fine(double rent_value_fine) {
        this.rent_value_fine = rent_value_fine;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}