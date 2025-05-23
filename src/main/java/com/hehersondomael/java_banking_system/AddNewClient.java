/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hehersondomael.java_banking_system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Heherson Domael
 */
public class AddNewClient extends javax.swing.JInternalFrame {

    MY_CONNECTION my_connection = new MY_CONNECTION();

    /**
     * Creates new form AddNewClient
     */
    public AddNewClient() {
        initComponents();
        GenerateClientID();
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
        jPanelAddNewClient = new javax.swing.JPanel();
        jLabelClientID = new javax.swing.JLabel();
        jTextFieldClientID = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelGenderAtBirth = new javax.swing.JLabel();
        jLabelMiddleName = new javax.swing.JLabel();
        jLabelDateOfBirth = new javax.swing.JLabel();
        jLabelCivilStatus = new javax.swing.JLabel();
        jLabelHomeAddress = new javax.swing.JLabel();
        jLabelMobileNo = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldMiddleName = new javax.swing.JTextField();
        jComboBoxGenderAtBirth = new javax.swing.JComboBox<>();
        jComboBoxCivilStatus = new javax.swing.JComboBox<>();
        jTextFieldHomeAddress = new javax.swing.JTextField();
        jTextFieldMobileNo = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonClearFields = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jDateChooserDateOfBirth = new com.toedter.calendar.JDateChooser();
        jComboBoxBranch = new javax.swing.JComboBox<>();
        jLabelBranch = new javax.swing.JLabel();
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

        jPanelAddNewClient.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add New Client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabelClientID.setText("Client ID:");

        jTextFieldClientID.setEditable(false);
        jTextFieldClientID.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldClientID.setFocusable(false);

        jLabelLastName.setText("Last Name:");

        jLabelFirstName.setText("First Name:");

        jLabelGenderAtBirth.setText("Gender at Birth:");

        jLabelMiddleName.setText("Middle Name:");

        jLabelDateOfBirth.setText("Date of Birth:");

        jLabelCivilStatus.setText("Civil Status:");

        jLabelHomeAddress.setText("Home Address:");

        jLabelMobileNo.setText("Mobile No.:");

        jLabelEmail.setText("Email:");

        jButton1.setText("Add Client");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxGenderAtBirth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBoxGenderAtBirth.setSelectedIndex(-1);

        jComboBoxCivilStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Separated", "Divorced", "Widowed" }));
        jComboBoxCivilStatus.setSelectedIndex(-1);

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

        jComboBoxBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manila", "Makati", "Muntinlupa", "Pasig", "Quezon City", "San Juan", "Taguig" }));
        jComboBoxBranch.setSelectedIndex(-1);

        jLabelBranch.setText("Branch:");

        javax.swing.GroupLayout jPanelAddNewClientLayout = new javax.swing.GroupLayout(jPanelAddNewClient);
        jPanelAddNewClient.setLayout(jPanelAddNewClientLayout);
        jPanelAddNewClientLayout.setHorizontalGroup(
            jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddNewClientLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddNewClientLayout.createSequentialGroup()
                        .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddNewClientLayout.createSequentialGroup()
                                .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelClientID)
                                    .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabelLastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelAddNewClientLayout.createSequentialGroup()
                                .addComponent(jLabelMiddleName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(29, 29, 29)))
                        .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(jTextFieldMiddleName)
                            .addComponent(jTextFieldClientID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldLastName)))
                    .addGroup(jPanelAddNewClientLayout.createSequentialGroup()
                        .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelDateOfBirth, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCivilStatus, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxCivilStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserDateOfBirth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelAddNewClientLayout.createSequentialGroup()
                        .addComponent(jLabelGenderAtBirth)
                        .addGap(29, 29, 29)
                        .addComponent(jComboBoxGenderAtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelAddNewClientLayout.createSequentialGroup()
                        .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelHomeAddress)
                            .addComponent(jLabelMobileNo)
                            .addComponent(jLabelBranch))
                        .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAddNewClientLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonClearFields, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExit)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddNewClientLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldHomeAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldMobileNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxBranch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(40, 40, 40))
        );
        jPanelAddNewClientLayout.setVerticalGroup(
            jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddNewClientLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldClientID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMiddleName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGenderAtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGenderAtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooserDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCivilStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCivilStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHomeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHomeAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMobileNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddNewClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonExit)
                        .addComponent(jButtonClearFields))
                    .addComponent(jButton1))
                .addGap(33, 33, 33))
        );

        jLabelDescription1.setText("Your bank transactions are all set in this system!");

        jLabelDescription2.setText("Add your most valued clients to your records by");

        jLabelDescription3.setText("filling up the form on the left.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanelAddNewClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelDescription2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDescription1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDescription3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(175, Short.MAX_VALUE))
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
                        .addGap(157, 157, 157)
                        .addComponent(jLabelDescription1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDescription2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDescription3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanelAddNewClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String clientID = jTextFieldClientID.getText();
        String lastName = jTextFieldLastName.getText();
        String firstName = jTextFieldFirstName.getText();
        String middleName = jTextFieldMiddleName.getText();
        String genderAtBirth = "";
        String civilStatus = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateOfBirth = "";
        String homeAddress = jTextFieldHomeAddress.getText();
        String mobile = jTextFieldMobileNo.getText().trim();          
        String email = jTextFieldEmail.getText();
        String branch = "";

        boolean genderAtBirthPointer;
        boolean civilStatusPointer;
        boolean dateOfBirthPointer;
        boolean branchPointer;

        try {
            genderAtBirthPointer = false;
            genderAtBirth = jComboBoxGenderAtBirth.getSelectedItem().toString();
        } catch(NullPointerException ex) {
            genderAtBirthPointer = true;
        }
        try {
            civilStatusPointer = false;
            civilStatus = jComboBoxCivilStatus.getSelectedItem().toString();
        } catch(NullPointerException ex) {
            civilStatusPointer = true;
        }
        try {
            dateOfBirthPointer = false;
            dateOfBirth = dateFormat.format(jDateChooserDateOfBirth.getDate()).trim();
        } catch(NullPointerException ex) {
            dateOfBirthPointer = true;
        }
        try {
            branchPointer = false;
            branch = jComboBoxBranch.getSelectedItem().toString();
        } catch(NullPointerException ex) {
            branchPointer = true;
        }

        // Include NumericPointerException for Mobile No.

        if(jTextFieldLastName.getText().trim().equals("") || jTextFieldFirstName.getText().trim().equals("") || 
                jTextFieldMiddleName.getText().trim().equals("") || genderAtBirthPointer ||
                dateOfBirthPointer || civilStatusPointer || jTextFieldHomeAddress.getText().trim().equals("") ||
                jTextFieldMobileNo.getText().trim().equals("") || jTextFieldEmail.getText().trim().equals("") || branchPointer)
            JOptionPane.showMessageDialog(rootPane, "Please fill up the form completetely.", "All fields required", JOptionPane.ERROR_MESSAGE);
        else
        {
            long mobileNo = Long.valueOf(mobile);
            PreparedStatement ps;
            String query = "INSERT INTO clients (clientID, lastName, firstName, middleName, genderAtBirth, dateOfBirth, civilStatus,"
                    + "homeAddress, mobileNo, email, branch) VALUES (?,?,?,?,?,?,?,?,?,?,?)"; 

            try {
                ps = my_connection.createConnection().prepareStatement(query);
                ps.setString(1, clientID.trim());
                ps.setString(2, lastName.trim());
                ps.setString(3, firstName.trim());
                ps.setString(4, middleName.trim());
                ps.setString(5, genderAtBirth.trim());
                ps.setString(6, dateOfBirth.trim());
                ps.setString(7, civilStatus.trim());
                ps.setString(8, homeAddress.trim());
                ps.setLong(9, mobileNo);
                ps.setString(10, email.trim());
                ps.setString(11, branch.trim());

                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(this, "Client added successfully.");
                    GenerateClientID();
                    ClearFields();
                }
                else
                    JOptionPane.showMessageDialog(this, "Client NOT added successfully.");
            } catch (SQLException ex) {
                    Logger.getLogger(AddNewClient.class.getName()).log(Level.SEVERE, null, ex);
              }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldsActionPerformed
        GenerateClientID();
        ClearFields();
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

    private void GenerateClientID()
    {
        try {
            PreparedStatement ps;
            ResultSet rs;
            String selectQuery = "SELECT Max(clientID) FROM clients";

            ps = my_connection.createConnection().prepareStatement(selectQuery);
            rs = ps.executeQuery();
            rs.next();
            rs.getString("Max(clientID)");

            if(rs.getString("Max(clientID)")==null)
                jTextFieldClientID.setText("C0001");
            else
            {
                long id = Long.parseLong(rs.getString("Max(clientID)").substring(2,rs.getString("Max(clientID)").length()));
                id++;
                jTextFieldClientID.setText("C" + String.format("%04d",id));
            }
        }  catch (SQLException ex) {
            Logger.getLogger(AddNewClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void ClearFields()
    {
        jTextFieldLastName.setText("");
        jTextFieldFirstName.setText("");
        jTextFieldMiddleName.setText("");
        jComboBoxGenderAtBirth.setSelectedIndex(-1);
        jDateChooserDateOfBirth.setDate(null);
        jComboBoxCivilStatus.setSelectedIndex(-1);
        jTextFieldHomeAddress.setText("");
        jTextFieldMobileNo.setText("");
        jTextFieldEmail.setText("");
        jComboBoxBranch.setSelectedIndex(-1);
        jTextFieldLastName.requestFocus();
    }

//    IN CASE SELECT BOX ITEMS ARE TO BE RETRIEVED IN THE DATABASE
//    public void GetBankBranches()
//    {
//        try {
//            PreparedStatement ps;
//            ResultSet rs;
//            String selectQuery = "SELECT * FROM branch";
//            ps = my_connection.createConnection().prepareStatement(selectQuery);
//            rs = ps.executeQuery();
//
//            while (rs.next())
//                jComboBoxBranch.addItem(rs.getString(2));
//        }  catch (SQLException ex) {
//            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonClearFields;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JComboBox<String> jComboBoxBranch;
    private javax.swing.JComboBox<String> jComboBoxCivilStatus;
    private javax.swing.JComboBox<String> jComboBoxGenderAtBirth;
    private com.toedter.calendar.JDateChooser jDateChooserDateOfBirth;
    private javax.swing.JLabel jLabelBanking;
    private javax.swing.JLabel jLabelBranch;
    private javax.swing.JLabel jLabelCivilStatus;
    private javax.swing.JLabel jLabelClientID;
    private javax.swing.JLabel jLabelDateOfBirth;
    private javax.swing.JLabel jLabelDescription1;
    private javax.swing.JLabel jLabelDescription2;
    private javax.swing.JLabel jLabelDescription3;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelGenderAtBirth;
    private javax.swing.JLabel jLabelHomeAddress;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelManagement;
    private javax.swing.JLabel jLabelMiddleName;
    private javax.swing.JLabel jLabelMobileNo;
    private javax.swing.JLabel jLabelSystem;
    private javax.swing.JLabel jLabelTheHBankLogo;
    private javax.swing.JLabel jLabelTheHBankText;
    private javax.swing.JPanel jPanelAddNewClient;
    private javax.swing.JTextField jTextFieldClientID;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldHomeAddress;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldMiddleName;
    private javax.swing.JTextField jTextFieldMobileNo;
    // End of variables declaration//GEN-END:variables
}
