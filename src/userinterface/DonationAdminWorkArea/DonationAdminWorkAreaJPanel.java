/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DonationAdminWorkArea;

import Business.Chef.ChefDirectory;
import Business.Donation.DonatedItem;
import Business.Donation.Donation;
import Business.Donation.DonationDirectory;
import Business.EcoSystem;
import Business.HeadChef.HeadChefDirectory;
import Business.Menu.MenuDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccount;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author talre
 */
public class DonationAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonationAdminWorkAreaJPanel
     */
     private JPanel userProcessContainer;
    UserAccount account;
    private EcoSystem ecoSystem;
    private RestaurantDirectory restaurantDirectory;
    private HeadChefDirectory headChefDirectory;
    private ChefDirectory chefDirectory;
    private MenuDirectory menuDirectory;
    private DonationDirectory donationDirectory;
    private SupplierDirectory supplierDirectory;
    

    public DonationAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, RestaurantDirectory restaurantDirectory, HeadChefDirectory headChefDirectory, ChefDirectory chefDirectory, MenuDirectory menuDirectory, DonationDirectory donationDirectory, SupplierDirectory supplierDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        this.headChefDirectory = ecoSystem.getHeadChefDirectory();
        this.donationDirectory = ecoSystem.getDonationDirectory();
        this.supplierDirectory = ecoSystem.getSupplierDirectory();
        populateTable();
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonation = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Optima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Head Chef");

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Optima", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Manage Donation Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 22, 680, -1));

        tblDonation.setBackground(new java.awt.Color(204, 204, 204));
        tblDonation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Restaurant Name", "Item Name", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDonation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDonationMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDonation);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 96, 584, 170));
    }// </editor-fold>//GEN-END:initComponents

    private void tblDonationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDonationMouseClicked
        // TODO add your handling code here:

        
    }//GEN-LAST:event_tblDonationMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDonation;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDonation.getModel();
        dtm.setRowCount(0);
        String donationName = account.getEmployee().getName();
        
        for(Donation donation : ecoSystem.getDonationDirectory().getDonationDirectory()){
            if(donation.getDonationName().equals(donationName)){
                List<DonatedItem> list = donation.getDonationList();
                Object [] row = new Object[3];
                for(int i=0;i<list.size();i++){
                row[0] = list.get(i).getRestaurantName();
                row[1] = list.get(i).getItemName();
                row[2] = list.get(i).getItemQuantity();
                
                dtm.addRow(row);
            }
        }
         
    }
    }
}
