package com.time7.rentit.Models.RentTable;

import com.time7.rentit.Entity.Client;
import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Entity.Rent;
import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Service.Client.ClientService;
import com.time7.rentit.Service.Employee.EmployeeService;
import com.time7.rentit.Service.Rent.RentService;
import com.time7.rentit.Utilities.FormatUtilities.Formats;
import static java.lang.Math.toIntExact;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    private final String[] columns = {"Código","Usuário", "Cliente", "Cód Veículo", "Início", "Fim", "Fim estimado", "Valor", "Status", "Linha"};
    
    Formats format = new Formats();
    
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
    
    public void returnRent(int rowIndex, Rent client) {
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
        String date, name;
        int status, idSearch;
        Long id;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        switch (columnIndex) {
            case 0:
                return this.rentsList.get(rowIndex).getId();
            case 1:
                id = this.rentsList.get(rowIndex).getEmployeeId();
                idSearch = toIntExact(id);
                try {
                   Employee employee = EmployeeService.getInstance().getEmployeeById(idSearch);
                    return employee.getName();
                } catch (Exception e) {
                   Prompts.promptError(null, e); 
                }
            case 2:
                id = this.rentsList.get(rowIndex).getClientId();
                idSearch = toIntExact(id);
                try {
                    Client client = ClientService.getInstance().getClientById(idSearch);
                    return client.getName();
                } catch (Exception e) {
                    Prompts.promptError(null, e);
                }                
            case 3:
                return this.rentsList.get(rowIndex).getVehicleId();
            case 4:
                return date = sdf.format(this.rentsList.get(rowIndex).getRentStartDt());
            case 5:
                Date endDate = this.rentsList.get(rowIndex).getRentEndDt();
                if (endDate == null) {
                    return endDate;
                } else if (endDate != null) {
                    return sdf.format(endDate);
                }
                
            case 6:
                return date = sdf.format(this.rentsList.get(rowIndex).getRentExpectedEndDt());
            case 7:
                return format.formatDoubleDecimal(this.rentsList.get(rowIndex).getRentValue());
            case 8:
                return this.rentsList.get(rowIndex).getRentStatusLabel();
            case 9:
                return rowIndex + 1;    
            default:
                return this.rentsList.get(rowIndex);
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.columns[columnIndex];
    }
}