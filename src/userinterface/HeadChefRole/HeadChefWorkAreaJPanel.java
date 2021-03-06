/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HeadChefRole;

import Business.Chef.ChefDirectory;
import Business.Customer.CustomerDirectory;
import Business.Donation.DonationDirectory;
import Business.EcoSystem;
import Business.HeadChef.HeadChefDirectory;
import Business.Menu.MenuDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Supplier.SupplierDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import static java.awt.SystemColor.menu;
import javax.swing.JPanel;
import userinterface.RestaurantAdminRole.ModifyServerJPanel;

/**
 *
 * @author talre
 */
public class HeadChefWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HeadChefWorkAreaJPanel
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
    
    public HeadChefWorkAreaJPanel() {
        
    }

    public HeadChefWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, RestaurantDirectory restaurantDirectory,HeadChefDirectory headChefDirectory, ChefDirectory chefDirectory, MenuDirectory menuDirectory, DonationDirectory donationDirectory, SupplierDirectory supplierDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        this.headChefDirectory = ecoSystem.getHeadChefDirectory();
        this.chefDirectory = ecoSystem.getChefDirectory();
        this.menuDirectory = ecoSystem.getMenuDirectory();
        this.donationDirectory = ecoSystem.getDonationDirectory();
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

        manageChefButton = new javax.swing.JButton();
        manageMenuButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageChefButton.setBackground(new java.awt.Color(255, 255, 255));
        manageChefButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        manageChefButton.setText("Manage Chefs");
        manageChefButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageChefButtonActionPerformed(evt);
            }
        });
        add(manageChefButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 170, 60));

        manageMenuButton.setBackground(new java.awt.Color(255, 255, 255));
        manageMenuButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageMenuButton.setText("Manage Menu Ingredients");
        manageMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMenuButtonActionPerformed(evt);
            }
        });
        add(manageMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 220, 60));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Optima", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Head Chef Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 580, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ChefIngredients.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 360, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void manageChefButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageChefButtonActionPerformed
        ManageChefJPanel mchp = new ManageChefJPanel(userProcessContainer, account, ecoSystem, restaurantDirectory, headChefDirectory, chefDirectory);
        userProcessContainer.add("ManageChefJPanel", mchp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageChefButtonActionPerformed

    private void manageMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMenuButtonActionPerformed
        // TODO add your handling code here:
        
        ManageMenuIngredientsJPanel manageIngredients = new ManageMenuIngredientsJPanel(userProcessContainer, account, ecoSystem, menuDirectory, headChefDirectory);
        userProcessContainer.add("ManageIngredientsJPanel",manageIngredients);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        
    }//GEN-LAST:event_manageMenuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageChefButton;
    private javax.swing.JButton manageMenuButton;
    // End of variables declaration//GEN-END:variables
}
