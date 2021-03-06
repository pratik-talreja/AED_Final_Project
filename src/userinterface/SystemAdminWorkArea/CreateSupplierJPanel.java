/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Donation.DonationDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.DonationRole;
import Business.Role.SupplierRole;
import Business.Supplier.Supplier;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Harshit
 */
public class CreateSupplierJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private SupplierDirectory supplierDirectory;

    /**
     * Creates new form CreateSupplierJPanel
     */
    public CreateSupplierJPanel() {
    }

    CreateSupplierJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, SupplierDirectory supplierDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.supplierDirectory = ecoSystem.getSupplierDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnCreate1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDonationName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Optima", 1, 36)); // NOI18N
        jLabel1.setText("Add Supplier ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Phone Number*:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 207, -1, 20));
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 209, 165, -1));

        jLabel3.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Address*:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 170, 121, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 169, 165, -1));

        btnCreate1.setBackground(new java.awt.Color(255, 255, 255));
        btnCreate1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnCreate1.setText("Submit");
        btnCreate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreate1ActionPerformed(evt);
            }
        });
        add(btnCreate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 122, 60));

        jLabel8.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Username*:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 247, -1, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 248, 165, -1));

        jLabel2.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Supplier Name*:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 158, -1));

        jLabel9.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Password*:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 286, 86, -1));
        add(txtDonationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 131, 165, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 287, 165, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FoodSupplier.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this); 
        Component[] componentArray = userProcessContainer.getComponents(); 
        Component component = componentArray[componentArray.length - 1]; 
        ManageSupplierJPanel msjp = (ManageSupplierJPanel) component; 
        msjp.populateTable(); 
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreate1ActionPerformed
        // TODO add your handling code here:
        if(txtDonationName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtPhoneNumber.getText().isEmpty() ||
            txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
            return;
        }

        String supplierName = txtDonationName.getText();

        boolean flag ;

        flag = supplierName.matches("^[a-zA-Z0-9 ,.'-]+$");

        if(flag == false) {
            JOptionPane.showMessageDialog(null, "Invalid Supplier name. Name can only contain alphabets, numbers and some special characters (,'-). )");
            return;
        }

        String phoneNumber = txtPhoneNumber.getText();

        if(phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "Phone Number must be of 10 digits");
            return;
        }
        flag = phoneNumber.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have 0-9 digits only");
            return;
        }

        for(Supplier supplier : supplierDirectory.getSupplierDirectory()) {
            if(supplier.getPhoneNumber().equals(phoneNumber)) {
                JOptionPane.showMessageDialog(null, "Phone Number already exists.");
                return;
            }
        }

        String address = txtAddress.getText();
        String userName = txtUsername.getText();
        String password = txtPassword.getText();

        for(UserAccount account : ecoSystem.getUserAccountDirectory().getUserAccountList()) {
            if(account.getUsername().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                return;
            }
        }

        System.out.println("Eco" + ecoSystem.getSupplierDirectory().getSupplierDirectory().size());
        ecoSystem.getSupplierDirectory().newSupplier(supplierName, userName, address, phoneNumber);

        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee(supplierName);
        UserAccount userAccount = ecoSystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new SupplierRole());

        JOptionPane.showMessageDialog(null, "New Supplier added successfully");

        // Empty All Fields
        txtDonationName.setText("");
        txtPhoneNumber.setText("");
        txtAddress.setText("");
        txtPassword.setText("");
        txtUsername.setText("");
    }//GEN-LAST:event_btnCreate1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDonationName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
