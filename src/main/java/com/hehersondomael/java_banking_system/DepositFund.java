/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hehersondomael.java_banking_system;

import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Heherson Domael
 */
public class DepositFund extends javax.swing.JInternalFrame {

    MY_CONNECTION my_connection = new MY_CONNECTION();
    Date date = new Date();
    String storedAccountID = "";

    /**
     * Creates new form Customer
     */
    public DepositFund() {
        initComponents();
        jLabelClientIDNotFound.setText(" ");
        SimpleDateFormat format_1 = new SimpleDateFormat("MMM. dd, yyyy");
        jLabelTodayIsDate.setText(format_1.format(date));
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
        jLabelTheHBank = new javax.swing.JLabel();
        jPanelDepositFund = new javax.swing.JPanel();
        jLabelFullName = new javax.swing.JLabel();
        jLabelBranch = new javax.swing.JLabel();
        jLabelAmountToBeDeposited = new javax.swing.JLabel();
        jButtonDeposit = new javax.swing.JButton();
        jButtonClearFields = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonFind = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabelAccountType = new javax.swing.JLabel();
        jLabelBalanceInPHP = new javax.swing.JLabel();
        jLabelTodayIs = new javax.swing.JLabel();
        jLabelTodayIsDate = new javax.swing.JLabel();
        jTextFieldAmountToBeDeposited = new javax.swing.JTextField();
        jLabelClientIDNotFound = new javax.swing.JLabel();
        jTextFieldAccountID = new javax.swing.JTextField();
        jTextFieldClientID = new javax.swing.JTextField();
        jTextFieldBranch = new javax.swing.JTextField();
        jTextFieldAccountType = new javax.swing.JTextField();
        jTextFieldBalanceInPHP = new javax.swing.JTextField();
        jLabelClientID = new javax.swing.JLabel();
        jTextFieldFullName = new javax.swing.JTextField();
        jLabelThisWillBeDeducted = new javax.swing.JLabel();
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

        jLabelTheHBank.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTheHBank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTheHBank.setText("THE H BANK");

        jPanelDepositFund.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deposit Fund", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabelFullName.setText("Full Name:");

        jLabelBranch.setText("Branch:");

        jLabelAmountToBeDeposited.setText("Amount to be Deposited:");

        jButtonDeposit.setText("Deposit");
        jButtonDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositActionPerformed(evt);
            }
        });

        jButtonClearFields.setText("Clear Fields");
        jButtonClearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearFieldsActionPerformed(evt);
            }
        });

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonFind.setText("Find");
        jButtonFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindActionPerformed(evt);
            }
        });

        jLabel20.setText("Account ID:");

        jLabelAccountType.setText("Account Type:");

        jLabelBalanceInPHP.setText("Balance (in PHP):");

        jLabelTodayIs.setText("Today is:");

        jLabelTodayIsDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTodayIsDate.setText(" Dec. 31, 1999");
        jLabelTodayIsDate.setFocusable(false);

        jLabelClientIDNotFound.setForeground(new java.awt.Color(255, 0, 0));
        jLabelClientIDNotFound.setText("Account ID not found.");

        jTextFieldAccountID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldAccountIDKeyPressed(evt);
            }
        });

        jTextFieldClientID.setEditable(false);
        jTextFieldClientID.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldClientID.setFocusable(false);

        jTextFieldBranch.setEditable(false);
        jTextFieldBranch.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldBranch.setFocusable(false);

        jTextFieldAccountType.setEditable(false);
        jTextFieldAccountType.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldAccountType.setFocusable(false);

        jTextFieldBalanceInPHP.setEditable(false);
        jTextFieldBalanceInPHP.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldBalanceInPHP.setFocusable(false);

        jLabelClientID.setText("Client ID:");

        jTextFieldFullName.setEditable(false);
        jTextFieldFullName.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldFullName.setFocusable(false);

        jLabelThisWillBeDeducted.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabelThisWillBeDeducted.setText("This will be added to the account's balance.");

        javax.swing.GroupLayout jPanelDepositFundLayout = new javax.swing.GroupLayout(jPanelDepositFund);
        jPanelDepositFund.setLayout(jPanelDepositFundLayout);
        jPanelDepositFundLayout.setHorizontalGroup(
            jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDepositFundLayout.createSequentialGroup()
                .addGroup(jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDepositFundLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelThisWillBeDeducted))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDepositFundLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDepositFundLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTodayIs, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelBranch)
                                    .addComponent(jLabelClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelBalanceInPHP)
                            .addComponent(jLabelAccountType)
                            .addComponent(jLabelAmountToBeDeposited, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDepositFundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonClearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldClientID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldBranch, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldAccountType, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldBalanceInPHP, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldAmountToBeDeposited, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDepositFundLayout.createSequentialGroup()
                                .addComponent(jTextFieldAccountID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonFind))
                            .addComponent(jTextFieldFullName)
                            .addGroup(jPanelDepositFundLayout.createSequentialGroup()
                                .addGroup(jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelClientIDNotFound, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTodayIsDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(51, 51, 51))
        );
        jPanelDepositFundLayout.setVerticalGroup(
            jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDepositFundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTodayIsDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTodayIs, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelClientIDNotFound)
                .addGap(1, 1, 1)
                .addGroup(jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFind)
                    .addComponent(jTextFieldAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAccountType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBalanceInPHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBalanceInPHP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAmountToBeDeposited, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAmountToBeDeposited, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelThisWillBeDeducted, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelDepositFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDeposit)
                    .addComponent(jButtonClearFields)
                    .addComponent(jButtonExit))
                .addGap(53, 53, 53))
        );

        jLabelDescription1.setText("Your bank transactions are all set in this system!");

        jLabelDescription2.setText("Deposit fund from your client's account");

        jLabelDescription3.setText("filling up the form on the left.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanelDepositFund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabelTheHBankLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBanking)
                            .addComponent(jLabelManagement)
                            .addComponent(jLabelSystem)
                            .addComponent(jLabelTheHBank)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescription3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelDescription1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelDescription2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(174, Short.MAX_VALUE))
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
                                .addComponent(jLabelTheHBank)
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
                        .addComponent(jLabelDescription3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanelDepositFund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindActionPerformed
        String accountID = jTextFieldAccountID.getText().trim().toUpperCase();
        storedAccountID = jTextFieldAccountID.getText().trim().toUpperCase();

        try {
            PreparedStatement ps;
            ResultSet rs;
            String query = "SELECT c.clientID,c.lastName,c.firstName,c.middleName,c.branch,a.accountType,a.currentBalance FROM clients c, accounts a WHERE c.clientID=a.clientID AND a.accountID=?";

            ps = my_connection.createConnection().prepareStatement(query);

            ps.setString(1, accountID);
            rs = ps.executeQuery();

            if(!rs.next())
            {
                jLabelClientIDNotFound.setText("Account ID not found.");
                jButtonFind.requestFocus();
                ClearFields();
            }
            else
            {
                jLabelClientIDNotFound.setText(" ");
                String clientID = rs.getString(1);
                String lastName = rs.getString(2);
                String firstName = rs.getString(3);
                String middleName = rs.getString(4).trim();
                String branch = rs.getString(5);
                String accountType = rs.getString(6);
                Double balance = rs.getDouble(7);
                jTextFieldClientID.setText(clientID.trim());
                jTextFieldFullName.setText(lastName.trim() + ", " + firstName.trim() + " " + middleName.substring(0,1) + ".");
                jTextFieldBranch.setText(branch.trim());
                jTextFieldAccountType.setText(accountType.trim());
                jTextFieldBalanceInPHP.setText(String.format("%.2f", balance).trim());
                jTextFieldAmountToBeDeposited.requestFocus();
            }
        } catch (SQLException ex) {
                    Logger.getLogger(DepositFund.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jButtonFindActionPerformed

    private void jButtonDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositActionPerformed
        try {
            String accountID = jTextFieldAccountID.getText().trim().toUpperCase();
            String clientID = jTextFieldClientID.getText().trim();
            SimpleDateFormat format_2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timestamp = format_2.format(date).trim();

            if(accountID.equals("") || clientID.equals("") || jTextFieldBalanceInPHP.getText().trim().equals("") ||
                    jTextFieldAmountToBeDeposited.getText().trim().equals(""))
                JOptionPane.showMessageDialog(rootPane, "Please fill up the form completetely.", "All fields required", JOptionPane.ERROR_MESSAGE);
            else
            {
                if(IsAccountIDReplaced())
                    JOptionPane.showMessageDialog(rootPane, "Account ID has been modified!", "Credentials matching error", JOptionPane.ERROR_MESSAGE);
                else
                {
                    // check if input balances are nonnumeric
                    double previousBalance = Double.valueOf(jTextFieldBalanceInPHP.getText().trim());
                    double amountDeposited = Double.valueOf(jTextFieldAmountToBeDeposited.getText());

                    if (amountDeposited <= 0)
                        JOptionPane.showMessageDialog(rootPane, "Invalid input Amount to be Deposited.", 
                                "Input amount error", JOptionPane.ERROR_MESSAGE);
                    else
                    {
                        if (previousBalance+amountDeposited > 1000000.0)
                            JOptionPane.showMessageDialog(rootPane, "New balance cannot exceed"
                                    + " PHP 1,000,000.00!", "Input amount error", JOptionPane.ERROR_MESSAGE);
                        else
                        {
                            try {
                                PreparedStatement ps;
                                String query = "INSERT INTO deposit (accountID, clientID, timestamp,"
                                        + "previousBalance, amountDeposited, newBalance) VALUES (?,?,?,?,?,?)";

                                ps = my_connection.createConnection().prepareStatement(query);

                                ps.setString(1, accountID);
                                ps.setString(2, clientID.trim());
                                ps.setString(3, timestamp.trim());
                                ps.setDouble(4, previousBalance);
                                ps.setDouble(5, amountDeposited);
                                ps.setDouble(6, previousBalance+amountDeposited);

                                if(ps.executeUpdate() > 0)
                                {
                                    PreparedStatement ps_update;

                                    String query_update = "UPDATE accounts SET currentBalance=? WHERE accountID=?";
                                    ps_update = my_connection.createConnection().prepareStatement(query_update);

                                    ps_update.setDouble(1, previousBalance+amountDeposited);
                                    ps_update.setString(2, accountID);

                                    if(ps_update.executeUpdate() > 0)
                                    {
                                        JOptionPane.showMessageDialog(this, "Deposit successful.");
                                        jTextFieldAccountID.setText("");
                                        jTextFieldAccountID.requestFocus();
                                        ClearFields();
                                    }
                                }
                                else
                                    JOptionPane.showMessageDialog(this, "Deposit unsuccessful.");
                            } catch (SQLException ex) {
                                Logger.getLogger(DepositFund.class.getName()).log(Level.SEVERE, null, ex);
                              }
                        }
                    }
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Please enter a valid amount to be deposited!", "Input amount error", JOptionPane.ERROR_MESSAGE);   
          }
    }//GEN-LAST:event_jButtonDepositActionPerformed

    private void jButtonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldsActionPerformed
        jTextFieldAccountID.setText("");
        jTextFieldAccountID.requestFocus();
        ClearFields();
    }//GEN-LAST:event_jButtonClearFieldsActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are you sure you want to leave?", "Close Frame", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            setVisible(false);
            dispose();
        }
        else
        {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            jTextFieldAccountID.requestFocus();
        }
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextFieldAccountIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAccountIDKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
            jButtonFind.doClick();
    }//GEN-LAST:event_jTextFieldAccountIDKeyPressed

    private boolean IsAccountIDReplaced()
    {
        return !jTextFieldAccountID.getText().trim().toUpperCase().equals(storedAccountID);
    }
    
    private void ClearFields()
    {
        jTextFieldClientID.setText("");
        jTextFieldFullName.setText("");
        jTextFieldBranch.setText("");
        jTextFieldAccountType.setText("");
        jTextFieldBalanceInPHP.setText("");
        jTextFieldAmountToBeDeposited.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClearFields;
    private javax.swing.JButton jButtonDeposit;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonFind;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabelAccountType;
    private javax.swing.JLabel jLabelAmountToBeDeposited;
    private javax.swing.JLabel jLabelBalanceInPHP;
    private javax.swing.JLabel jLabelBanking;
    private javax.swing.JLabel jLabelBranch;
    private javax.swing.JLabel jLabelClientID;
    private javax.swing.JLabel jLabelClientIDNotFound;
    private javax.swing.JLabel jLabelDescription1;
    private javax.swing.JLabel jLabelDescription2;
    private javax.swing.JLabel jLabelDescription3;
    private javax.swing.JLabel jLabelFullName;
    private javax.swing.JLabel jLabelManagement;
    private javax.swing.JLabel jLabelSystem;
    private javax.swing.JLabel jLabelTheHBank;
    private javax.swing.JLabel jLabelTheHBankLogo;
    private javax.swing.JLabel jLabelThisWillBeDeducted;
    private javax.swing.JLabel jLabelTodayIs;
    private javax.swing.JLabel jLabelTodayIsDate;
    private javax.swing.JPanel jPanelDepositFund;
    private javax.swing.JTextField jTextFieldAccountID;
    private javax.swing.JTextField jTextFieldAccountType;
    private javax.swing.JTextField jTextFieldAmountToBeDeposited;
    private javax.swing.JTextField jTextFieldBalanceInPHP;
    private javax.swing.JTextField jTextFieldBranch;
    private javax.swing.JTextField jTextFieldClientID;
    private javax.swing.JTextField jTextFieldFullName;
    // End of variables declaration//GEN-END:variables
}
