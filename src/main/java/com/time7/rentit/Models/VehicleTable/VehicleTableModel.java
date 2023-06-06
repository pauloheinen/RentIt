package com.time7.rentit.Models.VehicleTable;

import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Service.Vehicle.VehicleService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Paulo Henrique
 */
public class VehicleTableModel 
    extends
        AbstractTableModel {

    private final List<Vehicle> vehiclesList = new ArrayList<>();
    private final String[] columns = {"Código", "Marca", "Modelo", "Ano", "Placa", "Tipo", "Status", "Linha"};
    
    public VehicleTableModel() {
        loadData();
    }
    
    public void loadData() {        
        try {
            List<Vehicle> vehicles = VehicleService.getInstance().getVehicles();
            vehiclesList.addAll(vehicles);            
        } catch (Exception e) {
            Prompts.promptError(null, e);
        }
    }
    
    public void insertVehicle(Vehicle vehicle) {
        this.vehiclesList.add(vehicle);
        
        refresh();
    }
    
    public void removeVehicle(int rowIndex) {
        this.vehiclesList.remove(rowIndex);
        
        refresh();
    }
    
    public void editVehicle(int rowIndex, Vehicle vehicle) {
        this.vehiclesList.set(rowIndex, vehicle);
        
        refresh();
    }
    
    public Vehicle getVehicle(int rowIndex) {
        return this.vehiclesList.get(rowIndex);
    }
    
    public void refresh() {
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return this.vehiclesList.size();
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return this.vehiclesList.get(rowIndex).getId();
            case 1:
                return this.vehiclesList.get(rowIndex).getVehicleBrand();
            case 2:
                return this.vehiclesList.get(rowIndex).getVehicleModel();
            case 3:
                return this.vehiclesList.get(rowIndex).getVehicleYear();
            case 4:
                return this.vehiclesList.get(rowIndex).getVehiclePlate();
            case 5:
                return this.vehiclesList.get(rowIndex).getVehicleTypeName();
            case 6:
                return this.vehiclesList.get(rowIndex).getVehicleStatusLabel();
            case 7:
                return rowIndex + 1;
            default:
                return this.vehiclesList.get(rowIndex);
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.columns[columnIndex];
    }
}