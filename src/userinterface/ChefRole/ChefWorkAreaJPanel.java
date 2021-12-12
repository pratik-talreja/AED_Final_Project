/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.ChefRole;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Donation.DonationDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.RestaurantTable.RestaurantTableDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nirmitipatil
 */
public class ChefWorkAreaJPanel extends javax.swing.JPanel {

    /** Creates new form ChefWorkAreaJPanel */
    private JPanel userProcessContainer; 
    private UserAccount account; 
    private EcoSystem business; 
    private CustomerDirectory customerDirectory; 
    private RestaurantDirectory restaurantDirectory; 
    private DeliveryManDirectory deliveryManDirectory; 
    private MenuDirectory menuDirectory;
    private OrderDirectory orderDirectory; 
    private RestaurantTableDirectory RestaurantTableDirectory;
    private DonationDirectory donationDirectory;
    
    

    public ChefWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory, RestaurantTableDirectory restaurantTableDirectory, DonationDirectory donationDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer; 
        this.account = account; 
        this.business = business; 
        this.customerDirectory = customerDirectory; 
        this.restaurantDirectory = restaurantDirectory; 
        this.deliveryManDirectory = deliveryManDirectory; 
        this.menuDirectory = menuDirectory;
        this.orderDirectory = orderDirectory; 
        this.RestaurantTableDirectory = RestaurantTableDirectory;
        this.donationDirectory = donationDirectory;
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ChefWorkAreaTable = new javax.swing.JTable();
        AssignDishes = new javax.swing.JButton();
        Processed = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        ChefWorkAreaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order", "Dishes", "Assign", "Duration", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ChefWorkAreaTable);

        AssignDishes.setText("Assign to Self");
        AssignDishes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignDishesActionPerformed(evt);
            }
        });

        Processed.setText("Processed");
        Processed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessedActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("Assign Dishes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(AssignDishes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Processed)
                .addGap(163, 163, 163))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(169, 169, 169))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AssignDishes)
                    .addComponent(Processed))
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AssignDishesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignDishesActionPerformed
        // TODO add your handling code here:
        
        /*int selectedRow = ChefWorkAreaTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) ChefWorkAreaTable.getModel();
        
        
        ArrayList<Order> order = null;
        DeliveryMan get = null;
        for(int i=0;i<business.getDeliveryManDirectory().getDeliverymanList().size();i++){
        if(business.getDeliveryManDirectory().getDeliverymanList().get(i).getName().equals(userAccount.getEmployee().getName())){
            get = business.getDeliveryManDirectory().getDeliverymanList().get(i);
        }
        }
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Atleast one row should be selected");
            return;
        }else{
            String name = model.getValueAt(selectedRow, 0).toString();
            
            for(int i=0;i<get.getOrder().size();i++){
            if(get.getOrder().get(i).getOrderID().equals(name)){
                get.getOrder().get(i).setOrderstatus("Assigned to Self");
                order = get.getOrder().get(i).getCustomer().getOrder();
               

            }
        }
            for(int j=0;j<order.size();j++){
                if(order.get(j).getOrderID().equals(name)){
                    order.get(j).setOrderstatus("Assigned to Self");
                }
            }

        }
        
        populateDeliveryManOrders();*/
    }//GEN-LAST:event_AssignDishesActionPerformed

    private void ProcessedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessedActionPerformed
        // TODO add your handling code here:
        
        /*int selectedRow = ChefWorkAreaTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) ChefWorkAreaTable.getModel();
        
        Order current = null;
        ArrayList<Order> order = null;
        DeliveryMan get = null;
        for(int i=0;i<business.getDeliveryManDirectory().getDeliverymanList().size();i++){
        if(business.getDeliveryManDirectory().getDeliverymanList().get(i).getName().equals(userAccount.getEmployee().getName())){
            get = business.getDeliveryManDirectory().getDeliverymanList().get(i);
        }
        }
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Atleast one row should be selected");
            return;
        }else{
            String name = model.getValueAt(selectedRow, 0).toString();
            for(int i=0;i<get.getOrder().size();i++){
            if(get.getOrder().get(i).getOrderID().equals(name)){
                current = get.getOrder().get(i);
                get.getOrder().get(i).setOrderstatus("Ready to Serve");
                order = get.getOrder().get(i).getCustomer().getOrder();

            }
        }
            for(int j=0;j<order.size();j++){
                if(order.get(j).getOrderID().equals(name)){
                    order.get(j).setOrderstatus("Ready to Serve");
                }
            }
        }
        populateDeliveryManOrders();*/
    }//GEN-LAST:event_ProcessedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignDishes;
    private javax.swing.JTable ChefWorkAreaTable;
    private javax.swing.JButton Processed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
