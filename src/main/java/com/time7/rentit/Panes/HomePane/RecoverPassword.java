package com.time7.rentit.Panes.HomePane;

import com.time7.rentit.Controller.HomeController.RecoverPasswordController;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Daniel
 */
public class RecoverPassword 
    extends 
        javax.swing.JFrame {

    RecoverPasswordController controller = new RecoverPasswordController(this);
            
    public RecoverPassword() {
        initComponents();
        
        usernameTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (usernameTextField.getText().equals("Usuário")) {
                    usernameTextField.setText("");
                    usernameTextField.setForeground(Color.WHITE);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (usernameTextField.getText().isEmpty()) {
                    usernameTextField.setForeground(Color.WHITE);
                    usernameTextField.setText("Usuário");
                }
            }
        });
        
        newPasswordTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (newPasswordTextField.getText().equals("12345678")) {
                    newPasswordTextField.setText("");
                    newPasswordTextField.setForeground(Color.WHITE);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (newPasswordTextField.getText().isEmpty()) {
                    newPasswordTextField.setForeground(Color.WHITE);
                    newPasswordTextField.setText("12345678");
                }
            }
        });

        confirmPasswordTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (confirmPasswordTextField.getText().equals("12345678")) {
                    confirmPasswordTextField.setText("");
                    confirmPasswordTextField.setForeground(Color.WHITE);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (confirmPasswordTextField.getText().isEmpty()) {
                    confirmPasswordTextField.setForeground(Color.WHITE);
                    confirmPasswordTextField.setText("12345678");
                }
            }
        });
                
    }
    
    public void close(){
        this.dispose();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        usernameTextField = new javax.swing.JTextField();
        changePasswordButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();
        newPasswordTextField = new javax.swing.JPasswordField();
        confirmPasswordTextField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 129, 239));
        setMaximumSize(new java.awt.Dimension(556, 325));
        setMinimumSize(new java.awt.Dimension(556, 325));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 129, 239));

        jPanel1.setBackground(new java.awt.Color(0, 129, 239));

        usernameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameTextField.setText("Usuário");
        usernameTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usernameTextField.setPreferredSize(new java.awt.Dimension(64, 31));
        usernameTextField.setSelectedTextColor(new java.awt.Color(0, 116, 255));

        changePasswordButton.setBackground(new java.awt.Color(0, 129, 239));
        changePasswordButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        changePasswordButton.setForeground(new java.awt.Color(255, 255, 255));
        changePasswordButton.setText("Alterar");
        changePasswordButton.setBorder(null);
        changePasswordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });

        goBackButton.setBackground(new java.awt.Color(0, 129, 239));
        goBackButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        goBackButton.setForeground(new java.awt.Color(255, 255, 255));
        goBackButton.setText("Voltar");
        goBackButton.setBorder(null);
        goBackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        newPasswordTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newPasswordTextField.setText("12345678");
        newPasswordTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        confirmPasswordTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmPasswordTextField.setText("12345678");
        confirmPasswordTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nova Senha");
        jLabel3.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confirme a Senha");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Redefinir Senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(changePasswordButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(goBackButton))
                            .addComponent(confirmPasswordTextField)
                            .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newPasswordTextField)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changePasswordButton)
                    .addComponent(goBackButton))
                .addGap(34, 34, 34))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/benefits2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(584, 584, 584))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        close();

        LoginPane loginPane = new LoginPane();
        loginPane.setLocationRelativeTo(this);
        loginPane.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        String userName = usernameTextField.getText();
        String newPass = newPasswordTextField.getText();
        String retryPassword = confirmPasswordTextField.getText();

        controller.recoverPassword(userName, newPass, retryPassword);
        changePasswordButton.requestFocus();
        
        usernameTextField.setText("");
        newPasswordTextField.setText("");
        confirmPasswordTextField.setText("");
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JPasswordField confirmPasswordTextField;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField newPasswordTextField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
