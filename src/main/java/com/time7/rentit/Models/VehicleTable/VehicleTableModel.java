package com.time7.rentit.Models.VehicleTable;

import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Panes.Prompts.Prompts;
import com.time7.rentit.Service.VehicleService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Paulo Henrique
 */
public class VehicleTableModel 
    extends
        AbstractTableModel {

    private final List<Vehicle> vehiclesList = new ArrayList<>();
    private final String[] columns = {"Posição", "Marca", "Modelo", "Ano", "Placa", "Tipo", "Status", "ID"};
    
    public VehicleTableModel() {
        loadData();
    }
    
    private void loadData() {        
        try {
            List<Vehicle> vehicles = VehicleService.getInstance().getVehicles();
            vehiclesList.addAll(vehicles);            
        } catch (Exception e) {
            Prompts.PromptError(null, e);
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
    
    private void refresh() {
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
                return rowIndex;
            case 1:
                return this.vehiclesList.get(rowIndex).getVehicleBrand();
            case 2:
                return this.vehiclesList.get(rowIndex).getVehicleModel();
            case 3:
                return this.vehiclesList.get(rowIndex).getVehicleYear();
            case 4:
                return this.vehiclesList.get(rowIndex).getVehiclePlate();
            case 5:
                return this.vehiclesList.get(rowIndex).getType();
            case 6:
                return this.vehiclesList.get(rowIndex).getStatus();
            case 7:
                return this.vehiclesList.get(rowIndex).getId();
            default:
                return this.vehiclesList.get(rowIndex);
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.columns[columnIndex];
    }
}