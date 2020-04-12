/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hehersondomael.java_banking_system;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Heherson Domael
 */
public class TransferFund extends javax.swing.JInternalFrame {

    MY_CONNECTION my_connection = new MY_CONNECTION();

    /**
     * Creates new form TransferFund
     */
    public TransferFund() {
        initComponents();
        //Color redColor = new Color(255,0,0);
        //jLabelClientIDNotFound.setForeground(redColor);
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
        jPanelTransferFund = new javax.swing.JPanel();
        jLabelSourceAccountType = new javax.swing.JLabel();
        jLabelDestinationBalanceInPHP = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonFindSource = new javax.swing.JButton();
        jLabelDestinationAccountID = new javax.swing.JLabel();
        jLabelSourceBalanceInPHP = new javax.swing.JLabel();
        jLabelTodayIs = new javax.swing.JLabel();
        jLabelTodayIsDate = new javax.swing.JLabel();
        jTextFieldDestinationAccountType = new javax.swing.JTextField();
        jLabelClientIDNotFound = new javax.swing.JLabel();
        jTextFieldSourceAccountID = new javax.swing.JTextField();
        jTextFieldSourceClientID = new javax.swing.JTextField();
        jTextFieldSourceAccountType = new javax.swing.JTextField();
        jTextFieldBalanceInPHP = new javax.swing.JTextField();
        jTextFieldDestinationFullName = new javax.swing.JTextField();
        jLabelSourceFullName = new javax.swing.JLabel();
        jTextFieldSourceFullName = new javax.swing.JTextField();
        jTextFieldlDestinationBalanceInPHP = new javax.swing.JTextField();
        jLabelAmountToBeTransferred = new javax.swing.JLabel();
        jLabelDestinationAccountIDNotFound = new javax.swing.JLabel();
        jButtonFindDestination = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldDestinationAccountID = new javax.swing.JTextField();
        jTextFieldAmountToBeTransferred = new javax.swing.JTextField();
        jLabelDestinationFullName = new javax.swing.JLabel();
        jLabelAccountType = new javax.swing.JLabel();
        jLabelSourceClientID = new javax.swing.JLabel();
        jLabelDestinationClientID = new javax.swing.JLabel();
        jTextFieldDestinationClientID = new javax.swing.JTextField();
        jLabelDescription1 = new javax.swing.JLabel();
        jLabelDescription2 = new javax.swing.JLabel();
        jLabelDescription3 = new javax.swing.JLabel();
        jLabelDescription4 = new javax.swing.JLabel();
        jLabelDescription5_1 = new javax.swing.JLabel();
        jLabelDescription5_2 = new javax.swing.JLabel();
        jLabelDescription5_3 = new javax.swing.JLabel();
        jLabelDescription5_4 = new javax.swing.JLabel();
        jLabelDescription5 = new javax.swing.JLabel();

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

        jPanelTransferFund.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transfer Fund (Account to Account)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabelSourceAccountType.setText("Account Type:");

        jLabelDestinationBalanceInPHP.setText("Balance (in PHP):");

        jButton1.setText("Transfer");

        jButton2.setText("Clear Fields");

        jButton3.setText("Exit");

        jButtonFindSource.setText("Find");

        jLabelDestinationAccountID.setText("Destination Account ID:");

        jLabelSourceBalanceInPHP.setText("Balance (in PHP):");

        jLabelTodayIs.setText("Today is:");

        jLabelTodayIsDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTodayIsDate.setText(" Dec. 31, 1999");

        jTextFieldDestinationAccountType.setEditable(false);
        jTextFieldDestinationAccountType.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldDestinationAccountType.setFocusable(false);

        jLabelClientIDNotFound.setForeground(new java.awt.Color(220, 220, 220));
        jLabelClientIDNotFound.setText("Client ID not found.");

        jTextFieldSourceClientID.setEditable(false);
        jTextFieldSourceClientID.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldSourceClientID.setFocusable(false);

        jTextFieldSourceAccountType.setEditable(false);
        jTextFieldSourceAccountType.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldSourceAccountType.setFocusable(false);

        jTextFieldBalanceInPHP.setEditable(false);
        jTextFieldBalanceInPHP.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldBalanceInPHP.setFocusable(false);

        jTextFieldDestinationFullName.setEditable(false);
        jTextFieldDestinationFullName.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldDestinationFullName.setFocusable(false);

        jLabelSourceFullName.setText("Full Name:");

        jTextFieldSourceFullName.setEditable(false);
        jTextFieldSourceFullName.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldSourceFullName.setFocusable(false);

        jTextFieldlDestinationBalanceInPHP.setEditable(false);
        jTextFieldlDestinationBalanceInPHP.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldlDestinationBalanceInPHP.setFocusable(false);

        jLabelAmountToBeTransferred.setText("Amount to be Transferred:");

        jLabelDestinationAccountIDNotFound.setForeground(new java.awt.Color(220, 220, 220));
        jLabelDestinationAccountIDNotFound.setText("Client ID not found.");

        jButtonFindDestination.setText("Find");

        jLabel26.setText("Source Account ID:");

        jLabelDestinationFullName.setText("Full Name:");

        jLabelAccountType.setText("Account Type:");

        jLabelSourceClientID.setText("Client ID:");

        jLabelDestinationClientID.setText("Client ID:");

        jTextFieldDestinationClientID.setEditable(false);
        jTextFieldDestinationClientID.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldDestinationClientID.setFocusable(false);

        javax.swing.GroupLayout jPanelTransferFundLayout = new javax.swing.GroupLayout(jPanelTransferFund);
        jPanelTransferFund.setLayout(jPanelTransferFundLayout);
        jPanelTransferFundLayout.setHorizontalGroup(
            jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransferFundLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTransferFundLayout.createSequentialGroup()
                        .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDestinationBalanceInPHP)
                            .addComponent(jLabelAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDestinationFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDestinationAccountID)
                            .addComponent(jLabelSourceBalanceInPHP)
                            .addComponent(jLabelSourceAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSourceFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTransferFundLayout.createSequentialGroup()
                        .addComponent(jLabelAmountToBeTransferred)
                        .addGap(18, 18, 18))
                    .addGroup(jPanelTransferFundLayout.createSequentialGroup()
                        .addComponent(jLabelTodayIs, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldDestinationFullName)
                    .addComponent(jTextFieldDestinationAccountType)
                    .addComponent(jTextFieldSourceFullName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldlDestinationBalanceInPHP, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSourceAccountType, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldBalanceInPHP, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTransferFundLayout.createSequentialGroup()
                        .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTodayIsDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTransferFundLayout.createSequentialGroup()
                                .addComponent(jLabelClientIDNotFound)
                                .addGap(78, 78, 78)
                                .addComponent(jLabelSourceClientID))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTransferFundLayout.createSequentialGroup()
                                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelTransferFundLayout.createSequentialGroup()
                                        .addComponent(jTextFieldDestinationAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonFindDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelDestinationAccountIDNotFound))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDestinationClientID)
                                    .addComponent(jTextFieldDestinationClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldAmountToBeTransferred)
                    .addGroup(jPanelTransferFundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelTransferFundLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelTransferFundLayout.createSequentialGroup()
                                .addComponent(jTextFieldSourceAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonFindSource, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSourceClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(55, 55, 55))
        );
        jPanelTransferFundLayout.setVerticalGroup(
            jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransferFundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTodayIsDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTodayIs, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClientIDNotFound)
                    .addComponent(jLabelSourceClientID))
                .addGap(1, 1, 1)
                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFindSource)
                    .addComponent(jTextFieldSourceAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSourceClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSourceFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSourceFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSourceAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSourceAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBalanceInPHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSourceBalanceInPHP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDestinationAccountIDNotFound, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDestinationClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelTransferFundLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonFindDestination)
                            .addComponent(jLabelDestinationAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDestinationAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDestinationClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDestinationFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDestinationFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDestinationAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldlDestinationBalanceInPHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDestinationBalanceInPHP, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAmountToBeTransferred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAmountToBeTransferred))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelTransferFundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jLabelDescription1.setText("Your bank transactions are all set in this system!");

        jLabelDescription2.setText("Transfer fund from your client's account to another");

        jLabelDescription3.setText("filling up the form on the left.");

        jLabelDescription4.setText("When transferring fund from one account to another,");

        jLabelDescription5_1.setText("Homogenous transfer (e.g. Savings to Savings): PHP 100.00");

        jLabelDescription5_2.setText("Savings to Fixed & Savings to Current (or vice versa): PHP 200.00");

        jLabelDescription5_3.setText("Fixed to Current: PHP 300.00");

        jLabelDescription5_4.setText("Current to Fixed: PHP 500.00");

        jLabelDescription5.setText("the following transfer fees are imposed:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanelTransferFund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescription4)
                    .addComponent(jLabelDescription3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelDescription1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelDescription2))
                    .addComponent(jLabelDescription5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescription5_1)
                            .addComponent(jLabelDescription5_2)
                            .addComponent(jLabelDescription5_3)
                            .addComponent(jLabelDescription5_4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTheHBankLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBanking)
                            .addComponent(jLabelManagement)
                            .addComponent(jLabelSystem)
                            .addComponent(jLabelTheHBank))))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanelTransferFund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
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
                        .addGap(99, 99, 99)
                        .addComponent(jLabelDescription1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDescription2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDescription3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDescription4)
                        .addGap(3, 3, 3)
                        .addComponent(jLabelDescription5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDescription5_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDescription5_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDescription5_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDescription5_4)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonFindDestination;
    private javax.swing.JButton jButtonFindSource;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabelAccountType;
    private javax.swing.JLabel jLabelAmountToBeTransferred;
    private javax.swing.JLabel jLabelBanking;
    private javax.swing.JLabel jLabelClientIDNotFound;
    private javax.swing.JLabel jLabelDescription1;
    private javax.swing.JLabel jLabelDescription2;
    private javax.swing.JLabel jLabelDescription3;
    private javax.swing.JLabel jLabelDescription4;
    private javax.swing.JLabel jLabelDescription5;
    private javax.swing.JLabel jLabelDescription5_1;
    private javax.swing.JLabel jLabelDescription5_2;
    private javax.swing.JLabel jLabelDescription5_3;
    private javax.swing.JLabel jLabelDescription5_4;
    private javax.swing.JLabel jLabelDestinationAccountID;
    private javax.swing.JLabel jLabelDestinationAccountIDNotFound;
    private javax.swing.JLabel jLabelDestinationBalanceInPHP;
    private javax.swing.JLabel jLabelDestinationClientID;
    private javax.swing.JLabel jLabelDestinationFullName;
    private javax.swing.JLabel jLabelManagement;
    private javax.swing.JLabel jLabelSourceAccountType;
    private javax.swing.JLabel jLabelSourceBalanceInPHP;
    private javax.swing.JLabel jLabelSourceClientID;
    private javax.swing.JLabel jLabelSourceFullName;
    private javax.swing.JLabel jLabelSystem;
    private javax.swing.JLabel jLabelTheHBank;
    private javax.swing.JLabel jLabelTheHBankLogo;
    private javax.swing.JLabel jLabelTodayIs;
    private javax.swing.JLabel jLabelTodayIsDate;
    private javax.swing.JPanel jPanelTransferFund;
    private javax.swing.JTextField jTextFieldAmountToBeTransferred;
    private javax.swing.JTextField jTextFieldBalanceInPHP;
    private javax.swing.JTextField jTextFieldDestinationAccountID;
    private javax.swing.JTextField jTextFieldDestinationAccountType;
    private javax.swing.JTextField jTextFieldDestinationClientID;
    private javax.swing.JTextField jTextFieldDestinationFullName;
    private javax.swing.JTextField jTextFieldSourceAccountID;
    private javax.swing.JTextField jTextFieldSourceAccountType;
    private javax.swing.JTextField jTextFieldSourceClientID;
    private javax.swing.JTextField jTextFieldSourceFullName;
    private javax.swing.JTextField jTextFieldlDestinationBalanceInPHP;
    // End of variables declaration//GEN-END:variables
}
