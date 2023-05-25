package com.time7.rentit.Editors.ClientEditor;

import com.time7.rentit.Entity.Client;
import com.time7.rentit.Utilities.FormatUtilities.Formats;
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
        Formats.formatTelephone(phoneTextEditor);
    }

    private void showPane() {
        setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        nameTextEditor = new javax.swing.JFormattedTextField();
        emailTextEditor = new javax.swing.JFormattedTextField();
        phoneTextEditor = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        confirmButton.setText("Confirmar");
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButton(evt);
            }
        });
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.setMaximumSize(new java.awt.Dimension(64, 24));
        cancelButton.setMinimumSize(new java.awt.Dimension(64, 24));
        cancelButton.setPreferredSize(new java.awt.Dimension(64, 24));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButton(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Email");

        jLabel3.setText("Celular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nameTextEditor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirmButton)
                                .addGap(18, 18, 18)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(phoneTextEditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButton
        Formats removeFormat = new Formats();
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
        client.setPhone(removeFormat.removeFormat(phoneTextEditor.getText()));
        
        callback.inform(client);
        dispose();
    }//GEN-LAST:event_confirmButton

    private void cancelButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButton
        this.dispose();
    }//GEN-LAST:event_cancelButton

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButtonActionPerformed

    public void editClient(Client client) {
        source = client;
        
        nameTextEditor.setText(source.getName());
        emailTextEditor.setText(source.getEmail());
        phoneTextEditor.setText(source.getPhone());
                
        showPane();
    }
    
    public void addClient() {
        showPane();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JFormattedTextField emailTextEditor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JFormattedTextField nameTextEditor;
    private javax.swing.JFormattedTextField phoneTextEditor;
    // End of variables declaration//GEN-END:variables
}
