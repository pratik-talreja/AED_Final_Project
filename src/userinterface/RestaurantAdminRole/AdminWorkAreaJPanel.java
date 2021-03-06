package userinterface.RestaurantAdminRole;

import Business.Chef.ChefDirectory;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Donation.DonationDirectory;
import Business.EcoSystem;
import Business.HeadChef.HeadChefDirectory;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.RestaurantTable.RestaurantTableDirectory;
import Business.Server.ServerDirectory;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.HeadChefRole.HeadChefWorkAreaJPanel;
import userinterface.SupplierAdminWorkArea.RestaurantInventoryJPanel;

/**
 *
 * @author Talre
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private CustomerDirectory customerDirectory;
    private RestaurantDirectory restaurantDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private MenuDirectory menuDirectory;
    private OrderDirectory orderDirectory;
    private ChefDirectory chefDirectory;
    private ServerDirectory serverDirectory;
    private HeadChefDirectory headChefDirectory;
    private RestaurantTableDirectory restaurantTableDirectory;
    private DonationDirectory donationDirectory;
    private SupplierDirectory supplierDirectory;
    
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, 
            CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, 
            DeliveryManDirectory deliveryManDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory, ChefDirectory chefDirectory, ServerDirectory serverDirectory,HeadChefDirectory headChefDirectory, RestaurantTableDirectory restaurantTableDirectory, DonationDirectory donationDirectory, SupplierDirectory supplierDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.customerDirectory = ecoSystem.getCustomerDirectory();
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        this.deliveryManDirectory = ecoSystem.getDeliveryManDirectory();
        this.menuDirectory = ecoSystem.getMenuDirectory();
        this.orderDirectory = ecoSystem.getOrderDirectory();
        this.chefDirectory = ecoSystem.getChefDirectory();
        this.serverDirectory = ecoSystem.getServerDirectory();
        this.headChefDirectory = ecoSystem.getHeadChefDirectory();
        this.restaurantTableDirectory = ecoSystem.getRestaurantTableDirectory();
        this.donationDirectory = ecoSystem.getDonationDirectory();
        this.supplierDirectory = ecoSystem.getSupplierDirectory();
        
        Restaurant res = ecoSystem.getRestaurantDirectory().getRestaurant(account.getEmployee().getName());
        
        valueLabel.setText(account.getEmployee().getName());
        
        for(Restaurant restaurant : ecoSystem.getRestaurantDirectory().getRestaurantDirectory()){
            if(restaurant.getRestaurantName().equals(account.getEmployee().getName())){
                if(restaurant.getIsDineInAvailable() == false){
                    manageServers.setEnabled(false);
                }
            }
        }
        
 
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        manageServers = new javax.swing.JButton();
        manageHeadChef = new javax.swing.JButton();
        manageTables = new javax.swing.JButton();
        manageInventory = new javax.swing.JButton();
        manageDonation = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area - Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 440, 30));

        userJButton.setBackground(new java.awt.Color(255, 255, 255));
        userJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        userJButton.setText("Manage Restaurant Info");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 260, 50));

        manageEmployeeJButton.setBackground(new java.awt.Color(255, 255, 255));
        manageEmployeeJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageEmployeeJButton.setText("Manage Menu");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 260, 50));

        manageOrganizationJButton.setBackground(new java.awt.Color(255, 255, 255));
        manageOrganizationJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageOrganizationJButton.setText("Manage Orders");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 260, 50));

        enterpriseLabel.setFont(new java.awt.Font("Optima", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant Name:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 160, 30));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 210, 30));

        manageServers.setBackground(new java.awt.Color(255, 255, 255));
        manageServers.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageServers.setText("Manage Servers");
        manageServers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageServersActionPerformed(evt);
            }
        });
        add(manageServers, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 260, 50));

        manageHeadChef.setBackground(new java.awt.Color(255, 255, 255));
        manageHeadChef.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageHeadChef.setText("Manage Head Chef");
        manageHeadChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHeadChefActionPerformed(evt);
            }
        });
        add(manageHeadChef, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 260, 50));

        manageTables.setBackground(new java.awt.Color(255, 255, 255));
        manageTables.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageTables.setText("Manage Tables");
        manageTables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageTablesActionPerformed(evt);
            }
        });
        add(manageTables, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 260, 50));

        manageInventory.setBackground(new java.awt.Color(255, 255, 255));
        manageInventory.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageInventory.setText("Manage Inventory");
        manageInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageInventoryActionPerformed(evt);
            }
        });
        add(manageInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 260, 50));

        manageDonation.setBackground(new java.awt.Color(255, 255, 255));
        manageDonation.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageDonation.setText("Manage Donation");
        manageDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDonationActionPerformed(evt);
            }
        });
        add(manageDonation, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 260, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageRestaurantInfoJPanel mrijp = new ManageRestaurantInfoJPanel(userProcessContainer,account, ecoSystem, restaurantDirectory);
        userProcessContainer.add("manageMenuJPanel",mrijp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageMenuJPanel manageMenuJPanel = new ManageMenuJPanel(userProcessContainer,account, ecoSystem, restaurantDirectory,menuDirectory);
        userProcessContainer.add("manageMenuJPanel",manageMenuJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrderJPanel manageOrderJPanel = new ManageOrderJPanel(userProcessContainer,account, ecoSystem, restaurantDirectory,menuDirectory, orderDirectory);
        userProcessContainer.add("ManageOrderJPanel",manageOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageServersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageServersActionPerformed
        // TODO add your handling code here:
        ManageServerJPanel manageServerJPanel = new ManageServerJPanel(userProcessContainer,account, ecoSystem, restaurantDirectory,serverDirectory);
        userProcessContainer.add("ManageOrderJPanel",manageServerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageServersActionPerformed

    private void manageHeadChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHeadChefActionPerformed
        ManageHeadChefJPanel manageHeadChefJPanel = new ManageHeadChefJPanel(userProcessContainer,account, ecoSystem, restaurantDirectory, headChefDirectory);
        userProcessContainer.add("headChefWorkAreaJPanel",manageHeadChefJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageHeadChefActionPerformed

    private void manageTablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageTablesActionPerformed
        ManageTablesJPanel mtjp = new ManageTablesJPanel(userProcessContainer,account, ecoSystem, restaurantDirectory, headChefDirectory, restaurantTableDirectory);
        userProcessContainer.add("ManageTablesJPanel",mtjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageTablesActionPerformed

    private void manageInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageInventoryActionPerformed
        RestaurantInventoryJPanel rIJP = new RestaurantInventoryJPanel(userProcessContainer,account, ecoSystem);
        userProcessContainer.add("ManageTablesJPanel",rIJP);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageInventoryActionPerformed

    private void manageDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDonationActionPerformed
        // TODO add your handling code here:
        ManageDonationJPanel mdjp = new ManageDonationJPanel(userProcessContainer,account, ecoSystem, restaurantDirectory, menuDirectory, restaurantTableDirectory, donationDirectory);
        userProcessContainer.add("ManageDonationJPanel",mdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDonationActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageDonation;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageHeadChef;
    private javax.swing.JButton manageInventory;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton manageServers;
    private javax.swing.JButton manageTables;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
