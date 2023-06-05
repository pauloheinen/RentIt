package com.time7.rentit.Editors.RentEditor;

import com.time7.rentit.Entity.Client;
import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Entity.Rent;
import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Service.Client.ClientService;
import com.time7.rentit.Service.Employee.EmployeeService;
import com.time7.rentit.Service.Vehicle.VehicleService;
import com.time7.rentit.Utilities.EmployeeUtilities;
import com.time7.rentit.Utilities.GenericObserver;
import java.sql.Date;
import java.text.NumberFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

/**
 *
 * @author Paulo Henrique
 */
public class RentCellEditor
    extends 
        javax.swing.JFrame {

    private final GenericObserver callback;
    private Rent source;
       
    public RentCellEditor(JFrame root, GenericObserver callback) {
        this.callback = callback;
        
        initComponents();
        
        setLocationRelativeTo(root);
        this.setTitle("Manutenção de locações");
        
        initialDateRent.getDateEditor().setDateFormatString("dd/MM/yyyy");
        endDateRent.getDateEditor().setDateFormatString("dd/MM//yyyy");
        estimatedDateRent.getDateEditor().setDateFormatString("dd/MM//yyyy");
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contentPane = new javax.swing.JPanel();
        valueField = new javax.swing.JFormattedTextField(NumberFormat.getCurrencyInstance());
        vehicleComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        clientComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        rentLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        employeeName = new javax.swing.JLabel();
        rentButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        initialDateRent = new com.toedter.calendar.JDateChooser();
        estimatedDateRent = new com.toedter.calendar.JDateChooser();
        vehicleLabel = new javax.swing.JLabel();
        endDateRent = new com.toedter.calendar.JDateChooser();
        clientLabel = new javax.swing.JLabel();
        jLabelClientReturn = new javax.swing.JLabel();
        jLabelVehicleReturn = new javax.swing.JLabel();
        jLabelIdVehicle = new javax.swing.JLabel();
        jLabelIdClient = new javax.swing.JLabel();
        jLabelEmployeeId = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 129, 239));
        jPanel1.setMaximumSize(null);

        contentPane.setBackground(new java.awt.Color(0, 129, 239));

        valueField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        valueField.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);

        vehicleComboBox.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data inicial locação");

        clientComboBox.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data prevista devolução");

        rentLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rentLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rentLabel.setText("Locação");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data da devolução");

        employeeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        employeeLabel.setForeground(new java.awt.Color(255, 255, 255));
        employeeLabel.setText("Funcionário");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor total:                               R$");

        employeeName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        employeeName.setForeground(new java.awt.Color(255, 255, 255));
        employeeName.setMaximumSize(new java.awt.Dimension(5, 5));
        employeeName.setMinimumSize(new java.awt.Dimension(5, 5));
        employeeName.setPreferredSize(new java.awt.Dimension(5, 5));

        rentButton.setBackground(new java.awt.Color(0, 129, 239));
        rentButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rentButton.setForeground(new java.awt.Color(255, 255, 255));
        rentButton.setText("Alugar");
        rentButton.setBorder(null);
        rentButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmRentAction(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(0, 129, 239));
        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancelar");
        cancelButton.setBorder(null);
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelRentAction(evt);
            }
        });

        vehicleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vehicleLabel.setForeground(new java.awt.Color(255, 255, 255));
        vehicleLabel.setText("Código | Veículo");

        clientLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clientLabel.setForeground(new java.awt.Color(255, 255, 255));
        clientLabel.setText("Código | Cliente");

        jLabelClientReturn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelClientReturn.setForeground(new java.awt.Color(255, 255, 255));

        jLabelVehicleReturn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelVehicleReturn.setForeground(new java.awt.Color(255, 255, 255));

        jLabelIdVehicle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelIdVehicle.setForeground(new java.awt.Color(255, 255, 255));

        jLabelIdClient.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelIdClient.setForeground(new java.awt.Color(255, 255, 255));

        jLabelEmployeeId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelEmployeeId.setForeground(new java.awt.Color(255, 255, 255));

        returnButton.setBackground(new java.awt.Color(0, 129, 239));
        returnButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        returnButton.setForeground(new java.awt.Color(255, 255, 255));
        returnButton.setText("Devolver");
        returnButton.setBorder(null);
        returnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnButtonconfirmRentAction(evt);
            }
        });

        javax.swing.GroupLayout contentPaneLayout = new javax.swing.GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rentLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(rentButton)
                                .addGap(18, 18, 18)
                                .addComponent(returnButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(jLabelIdVehicle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelVehicleReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addComponent(jLabelIdClient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelClientReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(contentPaneLayout.createSequentialGroup()
                                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(estimatedDateRent, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(initialDateRent, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(endDateRent, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(valueField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(vehicleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vehicleLabel)
                                    .addComponent(clientLabel)
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addComponent(jLabelEmployeeId)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(employeeName, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                                            .addComponent(employeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPaneLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(vehicleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vehicleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelVehicleReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdVehicle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelClientReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdClient))
                .addGap(18, 18, 18)
                .addComponent(employeeLabel)
                .addGap(3, 3, 3)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmployeeId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rentLabel)
                .addGap(18, 18, 18)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(contentPaneLayout.createSequentialGroup()
                        .addComponent(initialDateRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(estimatedDateRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(endDateRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(110, 110, 110)
                .addGroup(contentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(rentButton)
                    .addComponent(returnButton))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(contentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(contentPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void rentVehicle() {
        endDateRent.setEnabled(false);
        jLabelVehicleReturn.setVisible(false);
        jLabelClientReturn.setVisible(false);
        jLabelIdVehicle.setVisible(false);
        jLabelIdClient.setVisible(false);
        returnButton.setVisible(false);
        
        try {
            Object[] clients = ClientService.getInstance().getClients().toArray();
            clientComboBox.setModel(new DefaultComboBoxModel<>(clients));

            Object[] vehicles = VehicleService.getInstance().getDisponibleVehicles().toArray();
            vehicleComboBox.setModel(new DefaultComboBoxModel<>(vehicles));
        } catch (Exception e) {
            Prompts.promptError(this, e);
        }
        
        employeeName.setText(EmployeeUtilities.getActiveEmployee().getName().toUpperCase());
        jLabelEmployeeId.setText(EmployeeUtilities.getActiveEmployee().getId().toString());
        
        showPane();
    }
    
    public void returnRent(Rent rent) {
        
        rentButton.setVisible(false);
        source = rent;
        try {
            Long employeeLongId = source.getEmployeeId();
            int employeeId = (int) (long) employeeLongId;
            EmployeeService employeeService = EmployeeService.getInstance();
            Employee employee = new Employee();
            employee = employeeService.getEmployeeById(employeeId);
            jLabelEmployeeId.setText(employee.getId().toString());
            employeeName.setText(employee.getName().toUpperCase());
            
            
            vehicleComboBox.setVisible(false);
            jLabelIdVehicle.setVisible(true);
            jLabelVehicleReturn.setVisible(true);
            VehicleService vehicleService = VehicleService.getInstance();
            Vehicle vehicle = vehicleService.getVehicleById(source.getVehicleId());
            jLabelVehicleReturn.setText(vehicle.getVehicleModel());
            jLabelIdVehicle.setText(vehicle.getId().toString());
            
            clientComboBox.setVisible(false);
            jLabelIdClient.setVisible(true);
            jLabelClientReturn.setVisible(true);
            int clientId = (int)(long) source.getClientId();
            ClientService clientService = ClientService.getInstance();
            Client client = clientService.getClientById(clientId);
            jLabelClientReturn.setText(client.getName());
            jLabelIdClient.setText(client.getId().toString());
            
                   
            initialDateRent.setEnabled(false);
            initialDateRent.setDate(source.getRentStartDt());

            estimatedDateRent.setEnabled(false);
            estimatedDateRent.setDate(source.getRentExpectedEndDt());

            endDateRent.setEnabled(true);
            endDateRent.setDate(source.getRentExpectedEndDt());

            valueField.setEnabled(true);
            Double value = source.getRentValue();
            String valueRent = value.toString();
            valueField.setText(valueRent);
        } catch (Exception e) {
            Prompts.promptError(this, e);
        }
        showPane();
    }
    
    private void confirmRentAction(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmRentAction
        if (initialDateRent.getDate() == null || estimatedDateRent.getDate() == null || valueField.getText().isEmpty() ) {
            Prompts.promptWarning(this, "Preencha as datas e o valor da locação.");
            return;
        }
        
        Date initialDate = new java.sql.Date(initialDateRent.getDate().getTime());    
        Date estimatedDate = new java.sql.Date(estimatedDateRent.getDate().getTime());
        String value = valueField.getText();
        
        try {
            Vehicle vehicle = (Vehicle) vehicleComboBox.getSelectedItem();
        
            Client client = (Client) clientComboBox.getSelectedItem();
            Employee employee = EmployeeUtilities.getActiveEmployee();

            Rent rent = new Rent();

            rent.setEmployeeId(employee.getId());
            rent.setClientId(client.getId());
            rent.setVehicleId(vehicle.getId());
            rent.setRentStartDt(initialDate);
            rent.setRentEndDt(null);
            rent.setRentExpectedEndDt(estimatedDate);
            rent.setRentValue(Double.parseDouble(value));
            rent.setStatus(Rent.STATUS_OPEN);
            
            vehicle.setStatus(Vehicle.STATUS_RENT);
            VehicleService.getInstance().updateVehicle(vehicle);
            
            callback.inform(rent);
            
            dispose();
        } catch (Exception e) {
            Prompts.promptError(this, e);
        }      
    }//GEN-LAST:event_confirmRentAction
   
    private void cancelRentAction(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelRentAction
        this.dispose();
    }//GEN-LAST:event_cancelRentAction

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
   
    }//GEN-LAST:event_returnButtonActionPerformed

    private void returnButtonconfirmRentAction(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonconfirmRentAction
                if (endDateRent.getDate() == null || valueField.getText().isEmpty() ) {
            Prompts.promptWarning(this, "Preencha a data de devolução e o valor!");
            return;
        }
        Rent rent;
        if (source != null ) {
            rent = source;
            rent.setId((source.getId()));
        }
        else {
            rent = new Rent();
        }
        try {
            Long idVehicle = Long.parseLong(jLabelIdVehicle.getText());
            VehicleService vehicleService = VehicleService.getInstance();
            Vehicle vehicle = vehicleService.getVehicleById(idVehicle);

            Long idClient = Long.parseLong(jLabelIdClient.getText());

            String idEmployeeString = jLabelEmployeeId.getText();  
            Long idEmployee = Long.parseLong(idEmployeeString);
            
            Date initialDate = new java.sql.Date(initialDateRent.getDate().getTime());    
            Date endDate = new java.sql.Date(endDateRent.getDate().getTime());    
            Date expectedDate = new java.sql.Date(estimatedDateRent.getDate().getTime());
            String value = valueField.getText();
            
            
            rent.setEmployeeId(idEmployee);
            rent.setClientId(idClient);
            rent.setVehicleId(idVehicle);
            rent.setRentStartDt(initialDate);
            rent.setRentEndDt(endDate);
            rent.setRentExpectedEndDt(expectedDate);
            rent.setRentValue(Double.parseDouble(value));
            rent.setStatus(rent.STATUS_CLOSED);

            vehicle.setStatus(Vehicle.STATUS_DISPONIBLE);
            vehicleService.updateVehicle(vehicle);
        } catch (Exception e) {
            Prompts.promptError(this, e);
        }
        callback.inform(rent);
        dispose();
    }//GEN-LAST:event_returnButtonconfirmRentAction

    private void showPane() {
        setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<Object> clientComboBox;
    private javax.swing.JLabel clientLabel;
    private javax.swing.JPanel contentPane;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JLabel employeeName;
    private com.toedter.calendar.JDateChooser endDateRent;
    private com.toedter.calendar.JDateChooser estimatedDateRent;
    private com.toedter.calendar.JDateChooser initialDateRent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelClientReturn;
    private javax.swing.JLabel jLabelEmployeeId;
    private javax.swing.JLabel jLabelIdClient;
    private javax.swing.JLabel jLabelIdVehicle;
    private javax.swing.JLabel jLabelVehicleReturn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rentButton;
    private javax.swing.JLabel rentLabel;
    private javax.swing.JButton returnButton;
    private javax.swing.JFormattedTextField valueField;
    private javax.swing.JComboBox<Object> vehicleComboBox;
    private javax.swing.JLabel vehicleLabel;
    // End of variables declaration//GEN-END:variables
}