/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.HeadChef.HeadChefDirectory;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.RestaurantTable.RestaurantTableDirectory;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerDineInJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author talre
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private UserAccount account;
    private CustomerDirectory customerDirectory;
    private RestaurantDirectory restaurantDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private MenuDirectory menuDirectory;
    private OrderDirectory orderDirectory;
    private HeadChefDirectory headChefDirectory;
    private RestaurantTableDirectory restaurantTableDirectory;
   
    private static int count = 1;
    
    
    public CustomerWorkAreaJPanel() {
        
    }

    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory, RestaurantTableDirectory restaurantTableDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
       this.account = account;
       this.ecoSystem = ecoSystem;
       this.customerDirectory = ecoSystem.getCustomerDirectory();
       this.deliveryManDirectory = ecoSystem.getDeliveryManDirectory();
       this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
       this.restaurantTableDirectory = ecoSystem.getRestaurantTableDirectory();
       
       
        
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 270, 75));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DineIN.jpg"))); // NOI18N
        jButton1.setText("Dine-in ?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 200, 140));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delivery.png"))); // NOI18N
        jButton2.setText("Delivery?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 200, 160));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setText("DINE-IN");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel3.setText("DELIVERY");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CustomerDineInJPanel cdip = new CustomerDineInJPanel(userProcessContainer,account, ecoSystem, restaurantDirectory, restaurantTableDirectory);
        userProcessContainer.add("headChefWorkAreaJPanel",cdip);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CustomerDineInJPanel cdip = new CustomerDineInJPanel(userProcessContainer,account, ecoSystem, restaurantDirectory, restaurantTableDirectory);
        userProcessContainer.add("headChefWorkAreaJPanel",cdip);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
