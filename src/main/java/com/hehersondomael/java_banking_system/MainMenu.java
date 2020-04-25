/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hehersondomael.java_banking_system;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Heherson Domael
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();

        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to leave? You will be logged out.", "Close Window", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
//                {
//                    e.getWindow().dispose();
//                    LoginPage loginPage = new LoginPage();
//                    loginPage.setVisible(true);
//                    loginPage.pack();
//                    loginPage.setLocationRelativeTo(null);
//                }
//                else
//                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//            }
//        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItemAboutTheDeveloper = new javax.swing.JMenuItem();
        jMenuAddNew = new javax.swing.JMenu();
        jMenuItemClient = new javax.swing.JMenuItem();
        jMenuItemAccount = new javax.swing.JMenuItem();
        jMenuTransact = new javax.swing.JMenu();
        jMenuItemDeposit = new javax.swing.JMenuItem();
        jMenuItemWithdraw = new javax.swing.JMenuItem();
        jMenuItemTransferFund = new javax.swing.JMenuItem();
        jMenuView = new javax.swing.JMenu();
        jMenuItemClientCredentials = new javax.swing.JMenuItem();
        jMenuItemAccountBalance = new javax.swing.JMenuItem();
        jMenuSettings = new javax.swing.JMenu();
        jMenuItemChangePassword = new javax.swing.JMenuItem();
        jMenuItemLogOut = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setMinimumSize(new java.awt.Dimension(1051, 571));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1051, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );

        jMenu1.setText("Home");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem9.setText("About the System");
        jMenu1.add(jMenuItem9);

        jMenuItemAboutTheDeveloper.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemAboutTheDeveloper.setText("About the Developer");
        jMenuItemAboutTheDeveloper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAboutTheDeveloperActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAboutTheDeveloper);

        jMenuBar1.add(jMenu1);

        jMenuAddNew.setText("Add New");

        jMenuItemClient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemClient.setText("Client");
        jMenuItemClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientActionPerformed(evt);
            }
        });
        jMenuAddNew.add(jMenuItemClient);

        jMenuItemAccount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemAccount.setText("Account");
        jMenuItemAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAccountActionPerformed(evt);
            }
        });
        jMenuAddNew.add(jMenuItemAccount);

        jMenuBar1.add(jMenuAddNew);

        jMenuTransact.setText("Transact");

        jMenuItemDeposit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemDeposit.setText("Deposit");
        jMenuItemDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDepositActionPerformed(evt);
            }
        });
        jMenuTransact.add(jMenuItemDeposit);

        jMenuItemWithdraw.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemWithdraw.setText("Withdraw");
        jMenuItemWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemWithdrawActionPerformed(evt);
            }
        });
        jMenuTransact.add(jMenuItemWithdraw);

        jMenuItemTransferFund.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemTransferFund.setText("Transfer Fund");
        jMenuItemTransferFund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTransferFundActionPerformed(evt);
            }
        });
        jMenuTransact.add(jMenuItemTransferFund);

        jMenuBar1.add(jMenuTransact);

        jMenuView.setText("View");

        jMenuItemClientCredentials.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemClientCredentials.setText("Client Credentials");
        jMenuItemClientCredentials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientCredentialsActionPerformed(evt);
            }
        });
        jMenuView.add(jMenuItemClientCredentials);

        jMenuItemAccountBalance.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemAccountBalance.setText("Account Balance");
        jMenuItemAccountBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAccountBalanceActionPerformed(evt);
            }
        });
        jMenuView.add(jMenuItemAccountBalance);

        jMenuBar1.add(jMenuView);

        jMenuSettings.setText("Settings");

        jMenuItemChangePassword.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemChangePassword.setText("Change Password");
        jMenuItemChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemChangePasswordActionPerformed(evt);
            }
        });
        jMenuSettings.add(jMenuItemChangePassword);

        jMenuItemLogOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemLogOut.setText("Log Out");
        jMenuItemLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogOutActionPerformed(evt);
            }
        });
        jMenuSettings.add(jMenuItemLogOut);

        jMenuBar1.add(jMenuSettings);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientActionPerformed
        AddNewClient client = new AddNewClient();
        jDesktopPane1.add(client);
        client.setVisible(true);
    }//GEN-LAST:event_jMenuItemClientActionPerformed

    private void jMenuItemAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAccountActionPerformed
        AddNewAccount addNewAccount = new AddNewAccount();
        jDesktopPane1.add(addNewAccount);
        addNewAccount.setVisible(true);
    }//GEN-LAST:event_jMenuItemAccountActionPerformed

    private void jMenuItemDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDepositActionPerformed
        DepositFund depositFund = new DepositFund();
        jDesktopPane1.add(depositFund);
        depositFund.setVisible(true);
    }//GEN-LAST:event_jMenuItemDepositActionPerformed

    private void jMenuItemWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemWithdrawActionPerformed
        WithdrawFund withdrawFund = new WithdrawFund();
        jDesktopPane1.add(withdrawFund);
        withdrawFund.setVisible(true);
    }//GEN-LAST:event_jMenuItemWithdrawActionPerformed

    private void jMenuItemTransferFundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTransferFundActionPerformed
        TransferFund transferFund = new TransferFund();
        jDesktopPane1.add(transferFund);
        transferFund.setVisible(true);
    }//GEN-LAST:event_jMenuItemTransferFundActionPerformed

    private void jMenuItemClientCredentialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientCredentialsActionPerformed
        ViewClientCredentials viewClientCredentials = new ViewClientCredentials();
        jDesktopPane1.add(viewClientCredentials);
        viewClientCredentials.setVisible(true);
    }//GEN-LAST:event_jMenuItemClientCredentialsActionPerformed

    private void jMenuItemAccountBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAccountBalanceActionPerformed
        ViewAccountBalance viewAccountBalance = new ViewAccountBalance();
        jDesktopPane1.add(viewAccountBalance);
        viewAccountBalance.setVisible(true);
    }//GEN-LAST:event_jMenuItemAccountBalanceActionPerformed

    private void jMenuItemChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemChangePasswordActionPerformed
        ChangePassword changePassword = new ChangePassword();
        jDesktopPane1.add(changePassword);
        changePassword.setVisible(true);
    }//GEN-LAST:event_jMenuItemChangePasswordActionPerformed

    private void jMenuItemLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogOutActionPerformed

                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to leave? You will be logged out.", "Close Window", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
                {
                    dispose();
                    LoginPage loginPage = new LoginPage();
                    loginPage.setVisible(true);
                    loginPage.pack();
                    loginPage.setLocationRelativeTo(null);
                }
                else
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_jMenuItemLogOutActionPerformed

    private void jMenuItemAboutTheDeveloperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAboutTheDeveloperActionPerformed
        AboutTheDeveloper aboutTheDeveloper = new AboutTheDeveloper();
        jDesktopPane1.add(aboutTheDeveloper);
        aboutTheDeveloper.setVisible(true);
    }//GEN-LAST:event_jMenuItemAboutTheDeveloperActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAddNew;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemAboutTheDeveloper;
    private javax.swing.JMenuItem jMenuItemAccount;
    private javax.swing.JMenuItem jMenuItemAccountBalance;
    private javax.swing.JMenuItem jMenuItemChangePassword;
    private javax.swing.JMenuItem jMenuItemClient;
    private javax.swing.JMenuItem jMenuItemClientCredentials;
    private javax.swing.JMenuItem jMenuItemDeposit;
    private javax.swing.JMenuItem jMenuItemLogOut;
    private javax.swing.JMenuItem jMenuItemTransferFund;
    private javax.swing.JMenuItem jMenuItemWithdraw;
    private javax.swing.JMenu jMenuSettings;
    private javax.swing.JMenu jMenuTransact;
    private javax.swing.JMenu jMenuView;
    // End of variables declaration//GEN-END:variables
}
