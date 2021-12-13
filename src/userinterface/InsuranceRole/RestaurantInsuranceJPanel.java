/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceRole;

/**
 *
 * @author talre
 */
public class RestaurantInsuranceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantInsuranceJPanel
     */
    public RestaurantInsuranceJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxSupplier = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        txtItemQuantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boxSupplier.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        boxSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSupplierActionPerformed(evt);
            }
        });
        add(boxSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 140, -1));

        jLabel2.setText("Insurance Company");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel3.setText("Problem Title");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel4.setText("Problem Description");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        txtItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNameActionPerformed(evt);
            }
        });
        add(txtItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 100, -1));
        add(txtItemQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 100, -1));

        jButton1.setText("Place Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void boxSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxSupplierActionPerformed

    private void txtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int itemQuantity = 0;
        try {
            itemQuantity = Integer.parseInt(txtItemQuantity.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Quantity must have 0-9 integers only");
            return;
        }

        String itemName = txtItemName.getText();

        if(itemName.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please select a item to donate. :) ");
            return;
        }
        else if(itemQuantity <= 0){
            JOptionPane.showMessageDialog(null, "Please donate atleast 1 item :) ");
            return;
        }
        else if(boxSupplier.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Please select a supplier.");
        }
        else{
            String supplierName = boxSupplier.getSelectedItem().toString();
            String restaurantName = account.getEmployee().getName();

            String status = "Open";
            ecoSystem.getSupplierOrderDirectory().newSupplierOrders(restaurantName, supplierName, itemName, itemQuantity, status);
            JOptionPane.showMessageDialog(null, "Sent the order to supplier.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxSupplier;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemQuantity;
    // End of variables declaration//GEN-END:variables
}
