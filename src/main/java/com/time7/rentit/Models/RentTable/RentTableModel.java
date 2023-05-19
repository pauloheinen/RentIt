package com.time7.rentit.Models.RentTable;

import com.time7.rentit.Entity.Rent;
import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Service.Rent.RentService;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Paulo Henrique
 */
public class RentTableModel
    extends
        AbstractTableModel {

    private final List<Rent> rentsList = new ArrayList<>();
    private final String[] columns = {"Posição", "Usuário", "Cliente", "Veículo", "Início", "Fim", "Fim estimado", "Valor", "Multa", "Status", "Código"};
    
    public RentTableModel() {
        loadData();
    }
    
    private void loadData() {        
        try {
            List<Rent> rents = RentService.getInstance().getRents();
            rentsList.addAll(rents);            
        } catch (Exception e) {
            Prompts.promptError(null, e);
        }
    }
    
    public void insertRent(Rent client) {
        this.rentsList.add(client);
        
        refresh();
    }
    
    public void removeRent(int rowIndex) {
        this.rentsList.remove(rowIndex);
        
        refresh();
    }
    
    public void editRent(int rowIndex, Rent client) {
        this.rentsList.set(rowIndex, client);
        
        refresh();
    }
    
    public Rent getRent(int rowIndex) {
        return this.rentsList.get(rowIndex);
    }
    
    private void refresh() {
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return this.rentsList.size();
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
                return this.rentsList.get(rowIndex).getEmployeeId();
            case 2:
                return this.rentsList.get(rowIndex).getClientId();
            case 3:
                return this.rentsList.get(rowIndex).getVehicleId();
            case 4:
                return this.rentsList.get(rowIndex).getRentStartDt();
            case 5:
                return this.rentsList.get(rowIndex).getRentEndDt();
            case 6:
                return this.rentsList.get(rowIndex).getRentExpectedEndDt();
            case 7:
                return this.rentsList.get(rowIndex).getRentValue();
            case 8:
                return this.rentsList.get(rowIndex).getRentValueFine();
            case 9:
                return this.rentsList.get(rowIndex).getStatus();
            case 10:
                return this.rentsList.get(rowIndex).getId();
            default:
                return this.rentsList.get(rowIndex);
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.columns[columnIndex];
    }
}