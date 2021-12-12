
package userinterface.SystemAdminWorkArea;

import Business.Chef.ChefDirectory;
import Business.Customer.Customer;
import Business.EcoSystem;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;

import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Server.ServerDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Talre
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

   
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    CustomerDirectory customerDirectory;
    RestaurantDirectory restaurantDirectory;
    DeliveryManDirectory deliveryManDirectory;
    ChefDirectory chefDirectory;
    ServerDirectory serverDirectory;
    UserAccount account;


    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory,ChefDirectory chefDirectory, ServerDirectory serverDirectory) {
    
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        this.customerDirectory = ecosystem.getCustomerDirectory();
        this.deliveryManDirectory = ecosystem.getDeliveryManDirectory();
        this.restaurantDirectory = ecosystem.getRestaurantDirectory();
        this.chefDirectory = ecosystem.getChefDirectory();
        this.serverDirectory = ecosystem.getServerDirectory();

        populateTree();
        
        }

    public void populateTree() {
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();

       
        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Admin");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        ArrayList<Customer> customerList = ecosystem.getCustomerDirectory().getCustomerDirectory();
        ArrayList<DeliveryMan> deliveryList = ecosystem.getDeliveryManDirectory().getDeliveryManDirectory();
        ArrayList<Restaurant> restaurantList = ecosystem.getRestaurantDirectory().getRestaurantDirectory();

        Customer customer;
        DeliveryMan deliveryMan;
        Restaurant restaurant;

        DefaultMutableTreeNode customerListNode = new DefaultMutableTreeNode("Customers");
        DefaultMutableTreeNode deliveryManListNode = new DefaultMutableTreeNode("Delivery Man");
        DefaultMutableTreeNode restaurantListNode = new DefaultMutableTreeNode("Restaurants");
        networks.insert(customerListNode, 0);
        networks.insert(deliveryManListNode, 1);
        networks.insert(restaurantListNode, 2);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;

        for (int i = 0; i < customerList.size(); i++) {
            customer = customerList.get(i);
            networkNode = new DefaultMutableTreeNode(customer.getName());
            customerListNode.insert(networkNode, i);

        }
        for (int j = 0; j < deliveryList.size(); j++) {
            deliveryMan = deliveryList.get(j);
            enterpriseNode = new DefaultMutableTreeNode(deliveryMan.getName());
            deliveryManListNode.insert(enterpriseNode, j);
        }

        for (int k = 0; k < restaurantList.size(); k++) {
            restaurant = restaurantList.get(k);
            organizationNode = new DefaultMutableTreeNode(restaurant.getRestaurantName());
            restaurantListNode.insert(organizationNode, k);
        }

        model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnCustomer = new javax.swing.JButton();
        btnRestaurant = new javax.swing.JButton();
        btnDelivery = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jSplitPane.setDividerLocation(200);
        jSplitPane.setDividerSize(2);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "EXPLORER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Optima", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Selected Node:");

        lblSelectedNode.setFont(new java.awt.Font("Optima", 1, 14)); // NOI18N
        lblSelectedNode.setForeground(new java.awt.Color(204, 204, 204));
        lblSelectedNode.setText("<View_selected_node>");

        btnCustomer.setText("Manage All Customers");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        btnRestaurant.setText("Manage Restaurants");
        btnRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurantActionPerformed(evt);
            }
        });

        btnDelivery.setText("Manage Delivery Persons");
        btnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectedNode))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRestaurant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSelectedNode))
                .addGap(18, 18, 18)
                .addComponent(btnCustomer)
                .addGap(18, 18, 18)
                .addComponent(btnRestaurant)
                .addGap(18, 18, 18)
                .addComponent(btnDelivery)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed

        ManageCustomerJPanel mCustJPnl = new ManageCustomerJPanel(userProcessContainer, ecosystem, customerDirectory);
        userProcessContainer.add("ManageCustomersJPanel", mCustJPnl);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurantActionPerformed
        ManageRestaurantJPanel mRestJPnl = new ManageRestaurantJPanel(userProcessContainer, account, ecosystem, restaurantDirectory, serverDirectory);
        userProcessContainer.add("ManageRestaurantJPanel", mRestJPnl);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRestaurantActionPerformed

    private void btnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryActionPerformed
        ManageDeliveryManJPanel mDMJPnl = new ManageDeliveryManJPanel(userProcessContainer, ecosystem, deliveryManDirectory);
        userProcessContainer.add("ManageDeliveryManJPanel", mDMJPnl);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDeliveryActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged

        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDelivery;
    private javax.swing.JButton btnRestaurant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
