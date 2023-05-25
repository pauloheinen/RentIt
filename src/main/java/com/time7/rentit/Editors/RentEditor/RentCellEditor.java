package com.time7.rentit.Editors.RentEditor;

import com.time7.rentit.Entity.Client;
import com.time7.rentit.Entity.Employee;
import com.time7.rentit.Entity.Rent;
import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Service.Client.ClientService;
import com.time7.rentit.Service.Rent.RentService;
import com.time7.rentit.Service.Vehicle.VehicleService;
import com.time7.rentit.Utilities.EmployeeUtilities;
import com.time7.rentit.Utilities.FormatUtilities.Formats;
import com.time7.rentit.Utilities.GenericObserver;
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

    private GenericObserver callback;
    Formats format = new Formats();
    
    public RentCellEditor(JFrame root, GenericObserver callback) {
        this.callback = callback;
        
        setLocationRelativeTo(root);
        initComponents();
        //Formats.formatDecimal(valueField);
        //Formats.formatDecimal(valueFineField);
        //Formats.adjustDateDMA(endRentDate.toString());
        //Formats.adjustDateDMA(estimatedDateRent.toString());
        //Formats.adjustDateDMA(initialDateRent.toString());
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
        valueFineField = new javax.swing.JFormattedTextField();
        initialDateRent = new com.toedter.calendar.JDateChooser();
        estimatedDateRent = new com.toedter.calendar.JDateChooser();
        endRentDate = new com.toedter.calendar.JDateChooser();
        valueField = new javax.swing.JFormattedTextField(NumberFormat.getCurrencyInstance());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        vehicleLabel.setText("Veículo");

        clientLabel.setText("Cliente");

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

        cancelButton.setText("Cancela");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelRentAction(evt);
            }
        });

        valueFineField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        valueField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        valueField.setFocusLostBehavior(javax.swing.JFormattedTextField.PERSIST);
        valueField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valueFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(initialDateRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estimatedDateRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endRentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valueFineField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vehicleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(vehicleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(employeeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(clientComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmButton)
                .addGap(209, 209, 209))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rentLabel)
                                    .addComponent(initialDateRent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(estimatedDateRent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valueField)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(valueFineField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cancelButton)
                            .addComponent(confirmButton)))
                    .addComponent(endRentDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
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
        
        endRentDate.setEnabled(false);
        
        showPane();
    }
    
    public void returnVehicle() {
        
        
        
        showPane();
    }
    
    private void confirmRentAction(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmRentAction
        try {
            Vehicle vehicle = (Vehicle) vehicleComboBox.getSelectedItem();
            if (vehicle != null) {
                Client client = (Client) clientComboBox.getSelectedItem();
                Employee employee = EmployeeUtilities.getActiveEmployee();

                Rent rent = new Rent();

                rent.setEmployeeId(employee.getId());
                rent.setClientId(client.getId());
                rent.setVehicleId(vehicle.getId());
                rent.setRentStartDt(initialDateRent.getDate());
                rent.setRentEndDt(endRentDate.getDate());
                rent.setRentExpectedEndDt(estimatedDateRent.getDate());
                rent.setRentValue((Double)valueField.getValue());
                rent.setRentValueFine((Double)valueFineField.getValue());
                rent.setStatus(Rent.STATUS_OPEN);

                RentService.getInstance().createRent(rent);

                callback.inform(rent);
                dispose();
            } else {
                Prompts.promptWarning(this, "Veículo não selecionado ou não há veículos disponíveis.");
            }
        } catch (Exception e) {
            Prompts.promptError(this, e);
        }
    }//GEN-LAST:event_confirmRentAction

    private void cancelRentAction(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelRentAction
        this.dispose();
    }//GEN-LAST:event_cancelRentAction

    private void valueFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueFieldKeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        
        try {           
            double parseDouble = Double.parseDouble(valueField.getText() + evt.getKeyChar() );
            System.out.println(parseDouble);            
        } catch (Exception e) {
            evt.consume();
        }
    }//GEN-LAST:event_valueFieldKeyTyped

    private void showPane() {
        setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<Object> clientComboBox;
    private javax.swing.JLabel clientLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JLabel employeeName;
    private com.toedter.calendar.JDateChooser endRentDate;
    private com.toedter.calendar.JDateChooser estimatedDateRent;
    private com.toedter.calendar.JDateChooser initialDateRent;
    private javax.swing.JLabel rentLabel;
    private javax.swing.JFormattedTextField valueField;
    private javax.swing.JFormattedTextField valueFineField;
    private javax.swing.JComboBox<Object> vehicleComboBox;
    private javax.swing.JLabel vehicleLabel;
    // End of variables declaration//GEN-END:variables
}