package com.time7.rentit.Editors.RentEditor;

import com.time7.rentit.Entity.Client;
import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Entity.Rent;
import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Service.Client.ClientService;
import com.time7.rentit.Service.Employee.EmployeeService;
import com.time7.rentit.Service.Rent.RentService;
import com.time7.rentit.Service.Vehicle.VehicleService;
import com.time7.rentit.Utilities.EmployeeUtilities;
import com.time7.rentit.Utilities.FormatUtilities.Formats;
import com.time7.rentit.Utilities.GenericObserver;
import java.text.NumberFormat;
import java.sql.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

/**
 *
 * @author Paulo Henrique
 */
public class RentCellEditor
    extends 
        javax.swing.JFrame {

    private GenericObserver callback;
    private Rent source;
       
    public RentCellEditor(JFrame root, GenericObserver callback) {
        this.callback = callback;
        
        setLocationRelativeTo(root);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vehicleLabel = new javax.swing.JLabel();
        clientLabel = new javax.swing.JLabel();
        vehicleComboBox = new javax.swing.JComboBox<>();
        clientComboBox = new javax.swing.JComboBox<>();
        rentLabel = new javax.swing.JLabel();
        employeeLabel = new javax.swing.JLabel();
        employeeName = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        initialDateRent = new com.toedter.calendar.JDateChooser();
        estimatedDateRent = new com.toedter.calendar.JDateChooser();
        endDateRent = new com.toedter.calendar.JDateChooser();
        valueField = new javax.swing.JFormattedTextField(NumberFormat.getCurrencyInstance());
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        vehicleLabel.setText("Veículo");

        clientLabel.setText("Cliente");

        rentLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rentLabel.setText("Locação");

        employeeLabel.setText("Funcionário");

        employeeName.setMaximumSize(new java.awt.Dimension(5, 5));
        employeeName.setMinimumSize(new java.awt.Dimension(5, 5));
        employeeName.setPreferredSize(new java.awt.Dimension(5, 5));

        confirmButton.setText("Confirma");
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmRentAction(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelRentAction(evt);
            }
        });

        valueField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        valueField.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        valueField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valueFieldKeyTyped(evt);
            }
        });

        jLabel1.setText("Data inicial locação");

        jLabel2.setText("Data prevista devolução");

        jLabel3.setText("Data da devolução");

        jLabel4.setText("Valor total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(vehicleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(vehicleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(clientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(clientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(employeeLabel)
                            .addGap(28, 28, 28)
                            .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rentLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(valueField)
                                .addComponent(estimatedDateRent, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(initialDateRent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(endDateRent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirmButton)
                                .addGap(18, 18, 18)
                                .addComponent(cancelButton)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vehicleLabel)
                    .addComponent(vehicleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientLabel)
                    .addComponent(clientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(employeeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(employeeName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rentLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(initialDateRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(estimatedDateRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(endDateRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void rentVehicle() {       
        try {
            Object[] clients = ClientService.getInstance().getClients().toArray();
            clientComboBox.setModel(new DefaultComboBoxModel<>(clients));

            Object[] vehicles = VehicleService.getInstance().getDisponibleVehicles().toArray();
            vehicleComboBox.setModel(new DefaultComboBoxModel<>(vehicles));
        } catch (Exception e) {
            Prompts.promptError(this, e);
        }
        
        employeeName.setText(EmployeeUtilities.getActiveEmployee().getName());
        
        endDateRent.setEnabled(false);
        
        showPane();
    }
    
    public void returnVehicle() {
        
        showPane();
    }
    
    private void confirmRentAction(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmRentAction
        
        Date initialDate = new java.sql.Date(initialDateRent.getDate().getTime());
        Date estimatedDate = new java.sql.Date(estimatedDateRent.getDate().getTime());
        Date endDate = new java.sql.Date(endDateRent.getDate().getTime());
        String value = valueField.getText();
                
        if (initialDate == null || estimatedDate == null || value.equals("")) {
            Prompts.promptWarning(this, "Preencha as datas e o valor da locação.");
            return;
        } else {
            try {
            Vehicle vehicle = (Vehicle) vehicleComboBox.getSelectedItem();
            if (vehicle != null) {
                Client client = (Client) clientComboBox.getSelectedItem();
                Employee employee = EmployeeUtilities.getActiveEmployee();

                Rent rent = new Rent();
                
                if (endDate != null) {

                    rent.setEmployeeId(employee.getId());
                    rent.setClientId(client.getId());
                    rent.setVehicleId(vehicle.getId());
                    rent.setRentStartDt(initialDate);
                    rent.setRentEndDt(estimatedDate);
                    rent.setRentExpectedEndDt(endDate);
                    rent.setRentValue(Double.parseDouble(valueField.getText()));
                    rent.setStatus(Rent.STATUS_CLOSED);
                    vehicle.setStatus(0);
                    
                    RentService.getInstance().updateRent(rent);
                    VehicleService.getInstance().updateVehicle(vehicle);
                    callback.inform(rent);
                } else {
                    rent.setEmployeeId(employee.getId());
                    rent.setClientId(client.getId());
                    rent.setVehicleId(vehicle.getId());
                    rent.setRentStartDt(new java.sql.Date(initialDateRent.getDate().getTime()));
                    rent.setRentEndDt(new java.sql.Date(endDateRent.getDate().getTime()));
                    rent.setRentExpectedEndDt(new java.sql.Date(estimatedDateRent.getDate().getTime()));
                    rent.setRentValue(Double.parseDouble(valueField.getText()));
                    rent.setStatus(Rent.STATUS_OPEN);
                    vehicle.setStatus(1);
                    
                    RentService.getInstance().createRent(rent);
                    VehicleService.getInstance().updateVehicle(vehicle);
                    callback.inform(rent);
                }
                dispose();
            } else {
                Prompts.promptWarning(this, "Veículo não selecionado ou não há veículos disponíveis.");
            }
        } catch (Exception e) {
            Prompts.promptError(this, e);
        }
        }    
    }//GEN-LAST:event_confirmRentAction

    public void editRent(Rent rent) {
        source = rent;
        
        try {
            Long employeeLongId = source.getEmployeeId();
            int employeeId = (int) (long) employeeLongId;
            EmployeeService employeeService = EmployeeService.getInstance();
            Employee employee = new Employee();
            employee = employeeService.getEmployeeById(employeeId);
            employeeName.setText(employee.getName());
            
            vehicleComboBox.setEnabled(false);
            Object[] vehicles = VehicleService.getInstance().getRentsVehicles().toArray();
            vehicleComboBox.setModel(new DefaultComboBoxModel<>(vehicles));
            Long vehicleLongId = source.getVehicleId();
            Vehicle vehicle = VehicleService.getInstance().getVehicleById(vehicleLongId);
            vehicleComboBox.setSelectedItem(vehicle);
            
            clientComboBox.setEnabled(false);
            Object[] clients = ClientService.getInstance().getClients().toArray();
            clientComboBox.setModel(new DefaultComboBoxModel<>(clients));
            Long clientLongId = source.getClientId();
            String idClientString = clientLongId.toString();
            int idClient = Integer.parseInt(idClientString);
            Client client = ClientService.getInstance().getClientById(idClient);
            clientComboBox.setSelectedItem(client);
            
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
    
    private void cancelRentAction(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelRentAction
        this.dispose();
    }//GEN-LAST:event_cancelRentAction

    
    
    private void valueFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueFieldKeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        
        try {           
            double parseDouble = Double.parseDouble(valueField.getText() + evt.getKeyChar() );
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_valueFieldKeyTyped

    private void showPane() {
        setVisible(true);
    }
    
    private void formatFields() {
        if (!valueField.getText().isEmpty()) {
            Formats.formatDecimal(valueField);
        }
                
        //Formats.adjustDateDMA(endRentDate.toString());
        //Formats.adjustDateDMA(estimatedDateRent.toString());
        //Formats.adjustDateDMA(initialDateRent.toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<Object> clientComboBox;
    private javax.swing.JLabel clientLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JLabel employeeName;
    private com.toedter.calendar.JDateChooser endDateRent;
    private com.toedter.calendar.JDateChooser estimatedDateRent;
    private com.toedter.calendar.JDateChooser initialDateRent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel rentLabel;
    private javax.swing.JFormattedTextField valueField;
    private javax.swing.JComboBox<Object> vehicleComboBox;
    private javax.swing.JLabel vehicleLabel;
    // End of variables declaration//GEN-END:variables
}