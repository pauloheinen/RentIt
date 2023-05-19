package com.time7.rentit.Editors.ClientEditor;

import com.time7.rentit.Entity.Client;
import com.time7.rentit.Utilities.GenericObserver;
import java.awt.Component;

/**
 *
 * @author Paulo Henrique
 */
public class ClientCellEditor
    extends 
        javax.swing.JFrame {
    
    private final GenericObserver callback;
    private Client source;
    
    public ClientCellEditor(Component root, GenericObserver callback) {
        this.callback = callback;
        
        initComponents();
        
        setLocationRelativeTo(root);
    }

    public void showPane() {
        setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        phoneTextEditor = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        nameTextEditor = new javax.swing.JTextField();
        emailTextEditor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        phoneTextEditor.setText("Celular");

        confirmButton.setText("Confirmar");
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButton(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButton(evt);
            }
        });

        nameTextEditor.setText("Nome");

        emailTextEditor.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emailTextEditor, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(phoneTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameTextEditor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButton
        Client client;

        if (source != null) {
            client = source;
            client.setId(source.getId());
        }
        else {
            client = new Client();
        }

        client.setName(nameTextEditor.getText());
        client.setEmail(emailTextEditor.getText());
        client.setPhone(Integer.valueOf(phoneTextEditor.getText()));
        
        callback.inform(client);
        dispose();
    }//GEN-LAST:event_confirmButton

    private void cancelButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButton
        this.dispose();
    }//GEN-LAST:event_cancelButton

    public void editClient(Client client) {
        source = client;
        
        nameTextEditor.setText(source.getName());
        emailTextEditor.setText(source.getEmail());
        phoneTextEditor.setText(String.valueOf(source.getPhone()));
                
        showPane();
    }
    
    public void addClient() {
        showPane();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField emailTextEditor;
    private javax.swing.JTextField nameTextEditor;
    private javax.swing.JTextField phoneTextEditor;
    // End of variables declaration//GEN-END:variables
}
