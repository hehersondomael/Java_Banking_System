/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hehersondomael.java_banking_system;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Heherson Domael
 */
public class ChangePassword extends javax.swing.JInternalFrame {

    MY_CONNECTION my_connection = new MY_CONNECTION();

    /**
     * Creates new form AddNewAccount
     */
    public ChangePassword() {
        initComponents();
        jLabelClickMeHere.setText("<html><u>Click me here</u></html>");
        jLabelTheOldPassword.setText(" ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBanking = new javax.swing.JLabel();
        jLabelTheHBankLogo = new javax.swing.JLabel();
        jLabelManagement = new javax.swing.JLabel();
        jLabelSystem = new javax.swing.JLabel();
        jLabelTheHBankText = new javax.swing.JLabel();
        jPanelAddNewAccount = new javax.swing.JPanel();
        jLabelClientID = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jButtonUpdatePassword = new javax.swing.JButton();
        jButtonClearFields = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabelAccountID = new javax.swing.JLabel();
        jLabelAccountID1 = new javax.swing.JLabel();
        jPasswordFieldOldPassword = new javax.swing.JPasswordField();
        jPasswordFieldNewPassword = new javax.swing.JPasswordField();
        jPasswordFieldReTypeNewPassword = new javax.swing.JPasswordField();
        jLabelTheOldPassword = new javax.swing.JLabel();
        jLabelDescription1 = new javax.swing.JLabel();
        jLabelDescription2 = new javax.swing.JLabel();
        jLabelDescription3 = new javax.swing.JLabel();
        jLabelDescription4 = new javax.swing.JLabel();
        jLabelClickMeHere = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1051, 571));
        setPreferredSize(new java.awt.Dimension(1051, 571));

        jLabelBanking.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabelBanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBanking.setText("BANKING");

        jLabelTheHBankLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTheHBankLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Heherson Domael\\Pictures\\Downloaded\\Logos\\H.png")); // NOI18N
        jLabelTheHBankLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelManagement.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabelManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelManagement.setText("MANAGEMENT");

        jLabelSystem.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabelSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSystem.setText("SYSTEM");

        jLabelTheHBankText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTheHBankText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTheHBankText.setText("THE H BANK");

        jPanelAddNewAccount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanelAddNewAccount.setPreferredSize(new java.awt.Dimension(450, 429));

        jLabelClientID.setText("Type Old Password:");

        jLabelLastName.setText("Type New Password:");

        jLabelFirstName.setText("Re-type New Password:");

        jButtonUpdatePassword.setText("Update Password");
        jButtonUpdatePassword.setFocusable(false);
        jButtonUpdatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdatePasswordActionPerformed(evt);
            }
        });

        jButtonClearFields.setText("Clear Fields");
        jButtonClearFields.setFocusable(false);
        jButtonClearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearFieldsActionPerformed(evt);
            }
        });

        jButtonExit.setText("Exit");
        jButtonExit.setFocusable(false);
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabelAccountID.setText("Username:");

        jLabelAccountID1.setText("user");

        jLabelTheOldPassword.setForeground(new java.awt.Color(255, 0, 0));
        jLabelTheOldPassword.setText("Old password is incorrect.");

        javax.swing.GroupLayout jPanelAddNewAccountLayout = new javax.swing.GroupLayout(jPanelAddNewAccount);
        jPanelAddNewAccount.setLayout(jPanelAddNewAccountLayout);
        jPanelAddNewAccountLayout.setHorizontalGroup(
            jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddNewAccountLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelClientID)
                    .addComponent(jLabelLastName)
                    .addComponent(jLabelFirstName)
                    .addComponent(jLabelAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddNewAccountLayout.createSequentialGroup()
                        .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelAccountID1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPasswordFieldOldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                .addComponent(jPasswordFieldNewPassword)
                                .addComponent(jPasswordFieldReTypeNewPassword))
                            .addGroup(jPanelAddNewAccountLayout.createSequentialGroup()
                                .addComponent(jButtonUpdatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonClearFields, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExit)))
                        .addGap(42, 42, 42))
                    .addGroup(jPanelAddNewAccountLayout.createSequentialGroup()
                        .addComponent(jLabelTheOldPassword)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelAddNewAccountLayout.setVerticalGroup(
            jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddNewAccountLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAccountID)
                    .addComponent(jLabelAccountID1))
                .addGap(18, 18, 18)
                .addComponent(jLabelTheOldPassword)
                .addGap(3, 3, 3)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldReTypeNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExit)
                    .addComponent(jButtonClearFields)
                    .addComponent(jButtonUpdatePassword))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jLabelDescription1.setText("Personalize your password to make it easier for you to remember.");

        jLabelDescription2.setText("Make your password difficult for anyone else to crack in order");

        jLabelDescription3.setText("to secure your account. Have a secured and nice day ahead!");

        jLabelDescription4.setText("How can I choose a good password for my account?");

        jLabelClickMeHere.setForeground(new java.awt.Color(0, 51, 204));
        jLabelClickMeHere.setText("Click me here.");
        jLabelClickMeHere.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClickMeHere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClickMeHereMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanelAddNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jLabelTheHBankLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBanking)
                            .addComponent(jLabelManagement)
                            .addComponent(jLabelSystem)
                            .addComponent(jLabelTheHBankText)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(646, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelDescription1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDescription2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDescription3))))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabelDescription4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClickMeHere)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTheHBankLogo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTheHBankText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelBanking)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelManagement)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelSystem)
                                .addGap(8, 8, 8)))
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelAddNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDescription4)
                            .addComponent(jLabelClickMeHere))
                        .addGap(2, 2, 2)))
                .addComponent(jLabelDescription1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescription2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescription3)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to leave?", "Close Frame", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            setVisible(false);
            dispose();
        }
        else
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldsActionPerformed
        ClearFields();
    }//GEN-LAST:event_jButtonClearFieldsActionPerformed

    private void jButtonUpdatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdatePasswordActionPerformed
        String oldPasswordInput = String.valueOf(jPasswordFieldOldPassword.getPassword());
        String newPasswordInput = String.valueOf(jPasswordFieldNewPassword.getPassword());
        String reTypeNewPassword = String.valueOf(jPasswordFieldReTypeNewPassword.getPassword());

            PreparedStatement ps_select;
            ResultSet rs_select;
            String selectQuery = "SELECT * FROM users WHERE username='user'";

            try {
                ps_select = my_connection.createConnection().prepareStatement(selectQuery);
                rs_select = ps_select.executeQuery();
                rs_select.next();

                if (oldPasswordInput.equals("") || newPasswordInput.equals("") || reTypeNewPassword.equals(""))
                    JOptionPane.showMessageDialog(rootPane, "Please fill up the form completetely.", "All fields required", JOptionPane.ERROR_MESSAGE);
                else
                {
                    if(oldPasswordInput.equals(rs_select.getString("userPass")))
                    {
                        jLabelTheOldPassword.setText(" ");
                        if (!newPasswordInput.equals(reTypeNewPassword))
                            jLabelTheOldPassword.setText("New and re-typed password aren't the same!");
                        else
                        {
                            PreparedStatement ps;
                            String editQuery = "UPDATE users SET userPass=? WHERE username='user'";

                            try {
                                ps = my_connection.createConnection().prepareStatement(editQuery);
                                ps.setString(1, newPasswordInput);
                                if(ps.executeUpdate() > 0)
                                {
                                    JOptionPane.showMessageDialog(this, "Password changed successfully.");
                                    ClearFields();
                                }
                                else
                                    JOptionPane.showMessageDialog(this, "Password NOT changed successfully.");
                            } catch (SQLException ex) {
                                    Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
                              }                            
                        }
                    }
                    else
                        jLabelTheOldPassword.setText("Old password incorrect.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
              }
    }//GEN-LAST:event_jButtonUpdatePasswordActionPerformed

    private void jLabelClickMeHereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClickMeHereMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.bu.edu/tech/support/information-security/"));
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jLabelClickMeHereMouseClicked

    private void ClearFields()
    {
        jPasswordFieldOldPassword.setText("");
        jPasswordFieldNewPassword.setText("");
        jPasswordFieldReTypeNewPassword.setText("");
        jLabelTheOldPassword.setText(" ");
        jPasswordFieldOldPassword.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClearFields;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonUpdatePassword;
    private javax.swing.JLabel jLabelAccountID;
    private javax.swing.JLabel jLabelAccountID1;
    private javax.swing.JLabel jLabelBanking;
    private javax.swing.JLabel jLabelClickMeHere;
    private javax.swing.JLabel jLabelClientID;
    private javax.swing.JLabel jLabelDescription1;
    private javax.swing.JLabel jLabelDescription2;
    private javax.swing.JLabel jLabelDescription3;
    private javax.swing.JLabel jLabelDescription4;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelManagement;
    private javax.swing.JLabel jLabelSystem;
    private javax.swing.JLabel jLabelTheHBankLogo;
    private javax.swing.JLabel jLabelTheHBankText;
    private javax.swing.JLabel jLabelTheOldPassword;
    private javax.swing.JPanel jPanelAddNewAccount;
    private javax.swing.JPasswordField jPasswordFieldNewPassword;
    private javax.swing.JPasswordField jPasswordFieldOldPassword;
    private javax.swing.JPasswordField jPasswordFieldReTypeNewPassword;
    // End of variables declaration//GEN-END:variables
}
