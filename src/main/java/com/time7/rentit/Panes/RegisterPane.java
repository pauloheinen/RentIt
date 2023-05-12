package com.time7.rentit.Panes;

import com.time7.rentit.Controller.RegisterPaneController;
import com.time7.rentit.Entity.Employee;
import java.awt.Color;
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
    }

    public void close(){
        this.dispose();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        registerPaneContent = new javax.swing.JPanel();
        tittleLabel = new javax.swing.JLabel();
        registerIcon = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
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
        typeSelector = new java.awt.Choice();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exitButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel6.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1038, 524));
        setMinimumSize(new java.awt.Dimension(1038, 524));
        setUndecorated(true);
        setResizable(false);

        registerPaneContent.setBackground(new java.awt.Color(0, 129, 239));
        registerPaneContent.setMaximumSize(new java.awt.Dimension(1031, 489));
        registerPaneContent.setMinimumSize(new java.awt.Dimension(1031, 489));

        tittleLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        tittleLabel.setForeground(new java.awt.Color(255, 255, 255));
        tittleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittleLabel.setText("Registre-se");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Nome");

        nameTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameLabel.setText("Usuário");

        userNameTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Senha");

        passwordTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        confirmPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        confirmPasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmPasswordLabel.setText("Confirme a Senha");

        confirmPasswordTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        registerButton.setBackground(new java.awt.Color(0, 129, 239));
        registerButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Registrar");
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
        goBackButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        typeSelector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        typeSelector.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Classe");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Preencha os campos abaixo!");

        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitButton.setText("X");
        exitButton.setToolTipText("Sair");
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterPane.this.mouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseOver(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseExit(evt);
            }
        });

        javax.swing.GroupLayout registerPaneContentLayout = new javax.swing.GroupLayout(registerPaneContent);
        registerPaneContent.setLayout(registerPaneContentLayout);
        registerPaneContentLayout.setHorizontalGroup(
            registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPaneContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPaneContentLayout.createSequentialGroup()
                        .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tittleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registerIcon)
                        .addGap(54, 54, 54))
                    .addGroup(registerPaneContentLayout.createSequentialGroup()
                        .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPaneContentLayout.createSequentialGroup()
                                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(registerPaneContentLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(confirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPaneContentLayout.createSequentialGroup()
                                            .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(goBackButton)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPaneContentLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(typeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(registerPaneContentLayout.createSequentialGroup()
                                                    .addGap(150, 150, 150)
                                                    .addComponent(registerButton)))))
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(276, 276, 276)
                                .addComponent(pencilIcon1))
                            .addGroup(registerPaneContentLayout.createSequentialGroup()
                                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(userNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPaneContentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lockerIcon2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lockerIcon1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pencilIcon2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(registerPaneContentLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        registerPaneContentLayout.setVerticalGroup(
            registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPaneContentLayout.createSequentialGroup()
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPaneContentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tittleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(registerPaneContentLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(registerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(pencilIcon1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userNameLabel)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerPaneContentLayout.createSequentialGroup()
                        .addComponent(pencilIcon2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(registerPaneContentLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPasswordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPaneContentLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(typeSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(registerPaneContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(goBackButton)
                            .addComponent(registerButton)))
                    .addGroup(registerPaneContentLayout.createSequentialGroup()
                        .addComponent(lockerIcon1)
                        .addGap(98, 98, 98)
                        .addComponent(lockerIcon2)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RegisterImage.JPG"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1031, 489));
        jLabel2.setMinimumSize(new java.awt.Dimension(1031, 489));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPaneContent, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(registerPaneContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
       int type = Employee.EMPLOYEES_TYPES.admin;
       
       controller.registerEmployee(name, username, password, confirmPassword, type);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
        System.exit(0);
    }//GEN-LAST:event_mouseClicked

    private void mouseOver(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseOver
        exitButton.setForeground(Color.red);
    }//GEN-LAST:event_mouseOver

    private void mouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseExit
        exitButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_mouseExit

     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPasswordField confirmPasswordTextField;
    private javax.swing.JLabel exitButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lockerIcon1;
    private javax.swing.JLabel lockerIcon2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JLabel pencilIcon1;
    private javax.swing.JLabel pencilIcon2;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerIcon;
    private javax.swing.JPanel registerPaneContent;
    private javax.swing.JLabel tittleLabel;
    private java.awt.Choice typeSelector;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
