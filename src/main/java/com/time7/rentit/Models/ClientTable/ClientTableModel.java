package com.time7.rentit.Models.ClientTable;

import com.time7.rentit.Entity.Client;
import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Service.Client.ClientService;
import com.time7.rentit.Utilities.FormatUtilities.Formats;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Paulo Henrique
 */
public class ClientTableModel 
    extends
        AbstractTableModel {
      
    private List<Client> clientsList = new ArrayList<>();
    private String[] columns = {"Código", "Nome", "Email", "Celular", "Linha"};
    Formats format = new Formats();
    
    public ClientTableModel() {
        loadData();
    }
    
    private void loadData() {        
        try {
            List<Client> clients = ClientService.getInstance().getClients();
            clientsList.addAll(clients);            
        } catch (Exception e) {
            Prompts.promptError(null, e);
        }
    }
    
    public void insertClient(Client client) {
        this.clientsList.add(client);
        
        refresh();
    }
    
    public void removeClient(int rowIndex) {
        this.clientsList.remove(rowIndex);
        
        refresh();
    }
    
    public void editClient(int rowIndex, Client client) {
        this.clientsList.set(rowIndex, client);
        
        refresh();
    }
    
    public Client getClient(int rowIndex) {
        return this.clientsList.get(rowIndex);
    }
    
    private void refresh() {
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return this.clientsList.size();
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return this.clientsList.get(rowIndex).getId();
            case 1:
                return this.clientsList.get(rowIndex).getName();
            case 2:
                return this.clientsList.get(rowIndex).getEmail();
            case 3:
                return format.getTelephone (this.clientsList.get(rowIndex).getPhone());
            case 4:
                return rowIndex + 1;
            default:
                return this.clientsList.get(rowIndex);
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return this.columns[columnIndex];
    }
}