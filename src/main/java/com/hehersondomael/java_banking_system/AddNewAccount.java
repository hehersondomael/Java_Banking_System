/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hehersondomael.java_banking_system;

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
public class AddNewAccount extends javax.swing.JInternalFrame {

    MY_CONNECTION my_connection = new MY_CONNECTION();

    /**
     * Creates new form AddNewAccount
     */
    public AddNewAccount() {
        initComponents();
        jLabelClientIDNotFound.setText(" ");
        GenerateAccountID();
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
        jLabelBalanceInPHP = new javax.swing.JLabel();
        jLabelAccountType = new javax.swing.JLabel();
        jButtonAddAccount = new javax.swing.JButton();
        jComboBoxAccountType = new javax.swing.JComboBox<>();
        jButtonClearFields = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonFindClientID = new javax.swing.JButton();
        jLabelAccountID = new javax.swing.JLabel();
        jLabelMiddleName = new javax.swing.JLabel();
        jLabelBranch = new javax.swing.JLabel();
        jTextFieldBalanceInPHP = new javax.swing.JTextField();
        jLabelClientIDNotFound = new javax.swing.JLabel();
        jTextFieldAccountID = new javax.swing.JTextField();
        jTextFieldClientID = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldMiddleName = new javax.swing.JTextField();
        jTextFieldBranch = new javax.swing.JTextField();
        jLabelDescription1 = new javax.swing.JLabel();
        jLabelDescription2 = new javax.swing.JLabel();
        jLabelDescription3 = new javax.swing.JLabel();

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

        jPanelAddNewAccount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add New Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanelAddNewAccount.setPreferredSize(new java.awt.Dimension(450, 429));

        jLabelClientID.setText("Client ID:");

        jLabelLastName.setText("Last Name:");

        jLabelFirstName.setText("First Name:");

        jLabelBalanceInPHP.setText("Balance (in PHP):");

        jLabelAccountType.setText("Account Type:");

        jButtonAddAccount.setText("Add Account");
        jButtonAddAccount.setFocusable(false);
        jButtonAddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAccountActionPerformed(evt);
            }
        });

        jComboBoxAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Savings", "Fixed", "Current" }));
        jComboBoxAccountType.setSelectedIndex(-1);

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

        jButtonFindClientID.setText("Find");
        jButtonFindClientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindClientIDActionPerformed(evt);
            }
        });

        jLabelAccountID.setText("Account ID:");

        jLabelMiddleName.setText("Middle Name:");

        jLabelBranch.setText("Branch:");

        jLabelClientIDNotFound.setForeground(new java.awt.Color(255, 0, 0));
        jLabelClientIDNotFound.setText("Client ID not found.");

        jTextFieldAccountID.setEditable(false);
        jTextFieldAccountID.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldAccountID.setFocusable(false);

        jTextFieldLastName.setEditable(false);
        jTextFieldLastName.setBackground(new java.awt.Color(204, 204, 204));

        jTextFieldFirstName.setEditable(false);
        jTextFieldFirstName.setBackground(new java.awt.Color(204, 204, 204));

        jTextFieldMiddleName.setEditable(false);
        jTextFieldMiddleName.setBackground(new java.awt.Color(204, 204, 204));

        jTextFieldBranch.setEditable(false);
        jTextFieldBranch.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanelAddNewAccountLayout = new javax.swing.GroupLayout(jPanelAddNewAccount);
        jPanelAddNewAccount.setLayout(jPanelAddNewAccountLayout);
        jPanelAddNewAccountLayout.setHorizontalGroup(
            jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddNewAccountLayout.createSequentialGroup()
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddNewAccountLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBranch)
                            .addComponent(jLabelAccountType)
                            .addGroup(jPanelAddNewAccountLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelFirstName)
                                    .addComponent(jLabelClientID)))
                            .addComponent(jLabelMiddleName)
                            .addComponent(jLabelBalanceInPHP)))
                    .addGroup(jPanelAddNewAccountLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldBalanceInPHP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxAccountType, javax.swing.GroupLayout.Alignment.LEADING, 0, 263, Short.MAX_VALUE)
                            .addComponent(jTextFieldBranch, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMiddleName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldAccountID, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldLastName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelClientIDNotFound)
                            .addGroup(jPanelAddNewAccountLayout.createSequentialGroup()
                                .addComponent(jButtonAddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonClearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAddNewAccountLayout.createSequentialGroup()
                                .addComponent(jTextFieldClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonFindClientID)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanelAddNewAccountLayout.setVerticalGroup(
            jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddNewAccountLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAccountID)
                    .addComponent(jTextFieldAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelClientIDNotFound)
                .addGap(1, 1, 1)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFindClientID)
                    .addComponent(jLabelClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMiddleName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBalanceInPHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBalanceInPHP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAddNewAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddAccount)
                    .addComponent(jButtonClearFields)
                    .addComponent(jButtonExit))
                .addGap(195, 195, 195))
        );

        jLabelDescription1.setText("Your bank transactions are all set in this system!");

        jLabelDescription2.setText("Setup an account for your valued clients by");

        jLabelDescription3.setText("filling up the form on the left.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanelAddNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabelTheHBankLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBanking)
                            .addComponent(jLabelManagement)
                            .addComponent(jLabelSystem)
                            .addComponent(jLabelTheHBankText)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescription3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelDescription1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelDescription2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGap(157, 157, 157)
                .addComponent(jLabelDescription1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescription2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDescription3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanelAddNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAccountActionPerformed
        String accountID = jTextFieldAccountID.getText();
        String clientID = jTextFieldClientID.getText().toUpperCase();
        String accountType = "";
        String balance = jTextFieldBalanceInPHP.getText();

        boolean accountTypePointer;

        try {
            accountTypePointer = false;
            accountType = jComboBoxAccountType.getSelectedItem().toString();
        } catch(NullPointerException ex) {
            accountTypePointer = true;
          }

        // Include NumericPointerException for Mobile No.

        if(jTextFieldLastName.getText().trim().equals("") || jTextFieldFirstName.getText().trim().equals("") || 
                jTextFieldMiddleName.getText().trim().equals("") || jTextFieldBranch.getText().trim().equals("") ||
                accountTypePointer || jTextFieldBalanceInPHP.getText().trim().equals(""))
            JOptionPane.showMessageDialog(rootPane, "Please fill up the form completetely.", "All fields required", JOptionPane.ERROR_MESSAGE);
        else
        {
            if(IsClientIDReplaced())
                JOptionPane.showMessageDialog(rootPane, "Client ID has been modified!", "Credentials matching error", JOptionPane.ERROR_MESSAGE);
            else
            {
                double currentBalance = Double.valueOf(balance);
                if (OwnsAccountOfType(clientID, accountType))
                {
                    JOptionPane.showMessageDialog(rootPane, "Client already owns an account of the input Account Type!", "Account type ownership limit reached", JOptionPane.ERROR_MESSAGE);
                    jComboBoxAccountType.requestFocus();
                }
                else
                {
                    if (currentBalance <= 10000)
                        JOptionPane.showMessageDialog(rootPane, "Balance cannot be lower than PHP 10,000.00!", "Minimum balance required", JOptionPane.ERROR_MESSAGE);
                    else
                    {
                        PreparedStatement ps;
                        String insertQuery = "INSERT INTO accounts (accountID, clientID, accountType, currentBalance) VALUES (?,?,?,?)"; 

                        try {
                            ps = my_connection.createConnection().prepareStatement(insertQuery);
                            ps.setString(1, accountID.trim());
                            ps.setString(2, clientID.trim());
                            ps.setString(3, accountType.trim());
                            ps.setDouble(4, currentBalance);

                            if(ps.executeUpdate() > 0)
                            {
                                JOptionPane.showMessageDialog(this, "Account added successfully.");
                                GenerateAccountID();
                                jTextFieldClientID.setText("");
                                jTextFieldLastName.setText("");
                                jTextFieldFirstName.setText("");
                                jTextFieldMiddleName.setText("");
                                jTextFieldBranch.setText("");
                                jComboBoxAccountType.setSelectedIndex(-1);
                                jTextFieldBalanceInPHP.setText("");
                                jTextFieldClientID.requestFocus();
                            }
                            else
                                JOptionPane.showMessageDialog(this, "Account NOT added successfully.");
                        } catch (SQLException ex) {
                            Logger.getLogger(AddNewAccount.class.getName()).log(Level.SEVERE, null, ex);
                          }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonAddAccountActionPerformed

    private void jButtonFindClientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindClientIDActionPerformed
        String clientID = jTextFieldClientID.getText().trim().toUpperCase();

        try {
            PreparedStatement ps;
            ResultSet rs;
            String query = "SELECT * FROM clients WHERE clientID=?";

            ps = my_connection.createConnection().prepareStatement(query);
            ps.setString(1,clientID);

            rs = ps.executeQuery();

            if(!rs.next())
            {
                jLabelClientIDNotFound.setText("Client ID not found.");
                jTextFieldLastName.setText("");
                jTextFieldFirstName.setText("");
                jTextFieldMiddleName.setText("");
                jTextFieldBranch.setText("");
            }
            else
            {
                try {
                    PreparedStatement ps_count;
                    ResultSet rs_count;
                    String countQuery = "SELECT COUNT(clientID) FROM accounts WHERE clientID=?";

                    ps_count = my_connection.createConnection().prepareStatement(countQuery);
                    ps_count.setString(1,clientID);

                    rs_count = ps_count.executeQuery();
                    rs_count.next();

                    if (rs_count.getInt("COUNT(clientID)")>=3)
                    {
                        jLabelClientIDNotFound.setText("Client already owns an account!");
                        jTextFieldLastName.setText("");
                        jTextFieldFirstName.setText("");
                        jTextFieldMiddleName.setText("");
                        jTextFieldBranch.setText("");
                        jComboBoxAccountType.setSelectedIndex(-1);
                        jTextFieldBalanceInPHP.setText("");             
                    }
                    else
                    {
                        jLabelClientIDNotFound.setText(" ");
                        jTextFieldLastName.setText(rs.getString("lastName"));
                        jTextFieldFirstName.setText(rs.getString("firstName"));
                        jTextFieldMiddleName.setText(rs.getString("middleName"));
                        jTextFieldBranch.setText(rs.getString("branch"));
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AddNewAccount.class.getName()).log(Level.SEVERE, null, ex);
                  }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddNewAccount.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jButtonFindClientIDActionPerformed

    private void jButtonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldsActionPerformed
        GenerateAccountID();
        jTextFieldClientID.setText("");
        jTextFieldLastName.setText("");
        jTextFieldFirstName.setText("");
        jTextFieldMiddleName.setText("");
        jTextFieldBranch.setText("");
        jComboBoxAccountType.setSelectedIndex(-1);
        jTextFieldBalanceInPHP.setText("");
        jLabelClientIDNotFound.setText(" ");
        jTextFieldClientID.requestFocus();
    }//GEN-LAST:event_jButtonClearFieldsActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to leave?", "Close Frame", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            setVisible(false);
            dispose();
        }
        else
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void GenerateAccountID() {
        try {
            PreparedStatement ps;
            ResultSet rs;
            String selectQuery = "SELECT Max(accountID) FROM accounts";
            long id;

            ps = my_connection.createConnection().prepareStatement(selectQuery);
            rs = ps.executeQuery();
            rs.next();

            if(rs.getString("Max(accountID)")==null)
                jTextFieldAccountID.setText("A0001");
            else
            {
                id = Long.parseLong(rs.getString("Max(accountID)").substring(2,rs.getString("Max(accountID)").length()));
                id++;
                jTextFieldAccountID.setText("A" + String.format("%04d",id));
            }
        }  catch (SQLException ex) {
            Logger.getLogger(AddNewAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean IsClientIDReplaced()
    {
            PreparedStatement ps_select;
            ResultSet rs_select;
            String selectedClientID = "";
            String selectQuery = "SELECT clientID FROM clients WHERE lastName=? AND firstName=? AND middleName=?;";

            try {
                ps_select = my_connection.createConnection().prepareStatement(selectQuery);

                ps_select.setString(1, jTextFieldLastName.getText().trim());
                ps_select.setString(2, jTextFieldFirstName.getText().trim());
                ps_select.setString(3, jTextFieldMiddleName.getText().trim());                    
                rs_select = ps_select.executeQuery();
                rs_select.next();
                selectedClientID = rs_select.getString("clientID").trim();
            } catch (SQLException ex) {
                Logger.getLogger(AddNewAccount.class.getName()).log(Level.SEVERE, null, ex);
              }

            return !selectedClientID.equals(jTextFieldClientID.getText().trim().toUpperCase());
    }

    private boolean OwnsAccountOfType(String clientID, String accountType)
    {
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM clients WHERE clientID=? AND accountType=?";
        try {
        ps = my_connection.createConnection().prepareStatement(query);
        ps.setString(1,clientID);
        ps.setString(2, accountType);
        rs = ps.executeQuery();
        rs.next();

        return rs.getRow() != 0;
        } catch(SQLException ex) {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddAccount;
    private javax.swing.JButton jButtonClearFields;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonFindClientID;
    private javax.swing.JComboBox<String> jComboBoxAccountType;
    private javax.swing.JLabel jLabelAccountID;
    private javax.swing.JLabel jLabelAccountType;
    private javax.swing.JLabel jLabelBalanceInPHP;
    private javax.swing.JLabel jLabelBanking;
    private javax.swing.JLabel jLabelBranch;
    private javax.swing.JLabel jLabelClientID;
    private javax.swing.JLabel jLabelClientIDNotFound;
    private javax.swing.JLabel jLabelDescription1;
    private javax.swing.JLabel jLabelDescription2;
    private javax.swing.JLabel jLabelDescription3;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelManagement;
    private javax.swing.JLabel jLabelMiddleName;
    private javax.swing.JLabel jLabelSystem;
    private javax.swing.JLabel jLabelTheHBankLogo;
    private javax.swing.JLabel jLabelTheHBankText;
    private javax.swing.JPanel jPanelAddNewAccount;
    private javax.swing.JTextField jTextFieldAccountID;
    private javax.swing.JTextField jTextFieldBalanceInPHP;
    private javax.swing.JTextField jTextFieldBranch;
    private javax.swing.JTextField jTextFieldClientID;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldMiddleName;
    // End of variables declaration//GEN-END:variables
}
