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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Heherson Domael
 */
public class AboutTheSystem extends javax.swing.JInternalFrame {

    /**
     * Creates new form AboutTheSystem
     */
    public AboutTheSystem() {
        initComponents();
        jLabelToAccessGitHub.setText("<html>here.</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAboutMe = new javax.swing.JLabel();
        jLabelTheHBankLogo = new javax.swing.JLabel();
        jLabelTheHBank = new javax.swing.JLabel();
        jLabelBanking = new javax.swing.JLabel();
        jLabelManagement = new javax.swing.JLabel();
        jLabelSystem = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelToAccessGitHub = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1051, 571));

        jLabelAboutMe.setText("<html><p>\nThe H Bank Banking Management System (BMS) is the customized digital solution for the business operation of The H Bank. This desktop application provides access to client and account information, monitors banking transactions through client credentials account balance reports, and stores banking data in a reliable and convenient database administrator.\n</p></html>");

        jLabelTheHBankLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTheHBankLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Heherson Domael\\Pictures\\Downloaded\\Logos\\H.png")); // NOI18N
        jLabelTheHBankLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelTheHBank.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTheHBank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTheHBank.setText("THE H BANK");

        jLabelBanking.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabelBanking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBanking.setText("BANKING");

        jLabelManagement.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabelManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelManagement.setText("MANAGEMENT");

        jLabelSystem.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabelSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSystem.setText("SYSTEM");

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabel1.setText("<html><p>\nThis system is written in Java SE programming language via Netbeans IDE. Meanwhile, the database was managed using the PHPMyAdmin database tool via MySQL. With strong openness towards collaborative work, this BMS project is publicly available for viewing and  enhancements at GitHub repository manager.\n</p></html>");

        jLabel2.setText("To access the GitHub repository of The H Bank BMS, click");

        jLabelToAccessGitHub.setForeground(new java.awt.Color(0, 51, 204));
        jLabelToAccessGitHub.setText("here.");
        jLabelToAccessGitHub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelToAccessGitHub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelToAccessGitHubMouseClicked(evt);
            }
        });

        jLabel6.setText("<html><p>\nThe H Bank was founded during the imposition of Enhanced Community Quarantine (ECQ) in the Philippines. Conceptualized as a service-oriented bank, The H Bank is currently the leading hypothetical financial institution in the country. Today, the ever-rising bank commits to bring inclusive financial stability for the Philippines and the Filipino people.\n</p></html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(483, 483, 483)
                        .addComponent(jButtonExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAboutMe, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(3, 3, 3)
                                .addComponent(jLabelToAccessGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTheHBankLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelBanking)
                                    .addComponent(jLabelManagement)
                                    .addComponent(jLabelTheHBank)
                                    .addComponent(jLabelSystem)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
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
                        .addGap(8, 8, 8))
                    .addComponent(jLabelAboutMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelToAccessGitHub)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jButtonExit)
                .addGap(21, 21, 21))
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

    private void jLabelToAccessGitHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToAccessGitHubMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/hehersondomael/Java_Banking_System"));
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(AboutTheSystem.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jLabelToAccessGitHubMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAboutMe;
    private javax.swing.JLabel jLabelBanking;
    private javax.swing.JLabel jLabelManagement;
    private javax.swing.JLabel jLabelSystem;
    private javax.swing.JLabel jLabelTheHBank;
    private javax.swing.JLabel jLabelTheHBankLogo;
    private javax.swing.JLabel jLabelToAccessGitHub;
    // End of variables declaration//GEN-END:variables
}
