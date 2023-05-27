package com.time7.rentit.Panes.HomePane;

import com.time7.rentit.Controller.HomeController.RegisterPaneController;
/**
 *
 * @author José Augusto Scherer
 */
public class RegisterPane 
    extends 
        javax.swing.JFrame {
    
    RegisterPaneController controller = new RegisterPaneController(this);
    
    public RegisterPane() {
        initComponents();
        
        nameTextField.setEditable(false);
        userNameTextField.setEditable(false);
        passwordTextField.setEditable(false);
        confirmPasswordTextField.setEditable(false);
        
        getRootPane().setDefaultButton(registerButton);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        registerPaneContent = new javax.swing.JPanel();
        registerIcon = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        userNameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordTextField = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();
        pencilIcon1 = new javax.swing.JLabel();
        pencilIcon2 = new javax.swing.JLabel();
        lockerIcon1 = new javax.swing.JLabel();
        lockerIcon2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tittleLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel6.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 129, 239));
        setMaximumSize(null);
        setMinimumSize(null);
        setUndecorated(true);
        setResizable(false);

        registerPaneContent.setBackground(new java.awt.Color(0, 129, 239));
        registerPaneContent.setMaximumSize(null);
        registerPaneContent.setMinimumSize(null);
        registerPaneContent.setVerifyInputWhenFocusTarget(false);

        nameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameTextField.setText("Nome");
        nameTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameTextFieldMouseClicked(evt);
            }
        });

        userNameTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userNameTextField.setText("Usuário");
        userNameTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameTextFieldMouseClicked(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passwordLabel.setText("Senha");

        passwordTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordTextField.setText("1234567891");
        passwordTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passwordTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTextFieldMouseClicked(evt);
            }
        });

        confirmPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        confirmPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        confirmPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        confirmPasswordLabel.setText("Confirme a Senha");

        confirmPasswordTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmPasswordTextField.setText("123456789+");
        confirmPasswordTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirmPasswordTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmPasswordTextFieldMouseClicked(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(0, 129, 239));
        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Registrar");
        registerButton.setBorder(null);
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        goBackButton.setBackground(new java.awt.Color(0, 129, 239));
        goBackButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        goBackButton.setForeground(new java.awt.Color(255, 255, 255));
        goBackButton.setText("Voltar");
        goBackButton.setBorder(null);
        goBackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBackButton.setPreferredSize(null);
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Preencha os campos abaixo!");

        tittleLabel.setBackground(new java.awt.Color(0, 129, 239));
        tittleLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        tittleLabel.setForeground(new java.awt.Color(255, 255, 255));
        tittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittleLabel.setText("Registre-se");

        javax.swing.GroupLayout registerPaneContentLayout = new javax.swing.GroupLayout(registerPaneContent);
        registerPaneContent.setLayout(registerPaneContentLayout);
        registerPaneContentLayout.setHorizontalGroup(
            registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPaneContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPaneContentLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(registerPaneContentLayout.createSequentialGroup()
                        .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(registerPaneContentLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lockerIcon2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerPaneContentLayout.createSequentialGroup()
                                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerPaneContentLayout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(pencilIcon1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerPaneContentLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pencilIcon2)
                                            .addGroup(registerPaneContentLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(confirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerPaneContentLayout.createSequentialGroup()
                                        .addGap(349, 349, 349)
                                        .addComponent(lockerIcon1)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(registerIcon)
                .addGap(54, 54, 54))
            .addGroup(registerPaneContentLayout.createSequentialGroup()
                .addComponent(tittleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(registerPaneContentLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goBackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerPaneContentLayout.setVerticalGroup(
            registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPaneContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tittleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPaneContentLayout.createSequentialGroup()
                        .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerPaneContentLayout.createSequentialGroup()
                                .addComponent(registerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(pencilIcon1))
                            .addGroup(registerPaneContentLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pencilIcon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(registerPaneContentLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPaneContentLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lockerIcon1))
                    .addGroup(registerPaneContentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmPasswordLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerButton)
                .addGap(18, 18, 18)
                .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(lockerIcon2)
                .addContainerGap())
        );

        jLabel2.setBackground(new java.awt.Color(0, 129, 239));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RegisterImage.JPG"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1031, 489));
        jLabel2.setMinimumSize(new java.awt.Dimension(1031, 489));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPaneContent, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(registerPaneContent, javax.swing.GroupLayout.PREFERRED_SIZE, 465, Short.MAX_VALUE)
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

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
       String name = nameTextField.getText();
       String username = userNameTextField.getText();
       String password = passwordTextField.getText();
       String confirmPassword = confirmPasswordTextField.getText();
              
       controller.registerEmployee(name, username, password, confirmPassword);
       
       nameTextField.setText("");
       userNameTextField.setText("");
       passwordTextField.setText("");
       confirmPasswordTextField.setText("");
    }//GEN-LAST:event_registerButtonActionPerformed

    private void nameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameTextFieldMouseClicked
        nameTextField.setText("");
        nameTextField.setEditable(true);
        nameTextField.setFocusable(true);
    }//GEN-LAST:event_nameTextFieldMouseClicked

    private void userNameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameTextFieldMouseClicked
        userNameTextField.setText("");
        userNameTextField.setEditable(true);
        userNameTextField.setFocusable(true);
    }//GEN-LAST:event_userNameTextFieldMouseClicked

    private void passwordTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextFieldMouseClicked
        passwordTextField.setText("");
        passwordTextField.setEditable(true);
        passwordTextField.setFocusable(true);
    }//GEN-LAST:event_passwordTextFieldMouseClicked

    private void confirmPasswordTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmPasswordTextFieldMouseClicked
        confirmPasswordTextField.setText("");
        confirmPasswordTextField.setEditable(true);
        confirmPasswordTextField.setFocusable(true);
    }//GEN-LAST:event_confirmPasswordTextFieldMouseClicked

    private void close(){
        this.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPasswordField confirmPasswordTextField;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lockerIcon1;
    private javax.swing.JLabel lockerIcon2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel pencilIcon1;
    private javax.swing.JLabel pencilIcon2;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerIcon;
    private javax.swing.JPanel registerPaneContent;
    private javax.swing.JLabel tittleLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
