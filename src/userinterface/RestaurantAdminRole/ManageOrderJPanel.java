
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Talre
 */
public class ManageOrderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private RestaurantDirectory restaurantDirectory;
    private MenuDirectory menuDirectory;
    private OrderDirectory orderDirectory;
    /**
     * Creates new form ManageOrderJPanel
     */
    public ManageOrderJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem ecoSystem, RestaurantDirectory restaurantDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.account = account;
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        this.menuDirectory = ecoSystem.getMenuDirectory();
        this.orderDirectory = ecoSystem.getOrderDirectory();
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        dtm.setRowCount(0);
        
        for(Order order : ecoSystem.getOrderDirectory().getOrderDirectory()) {
            System.out.println(" Rest  " + account.getEmployee().getName() + "  " + order.getRestaurant().getRestaurantName());
            if(account.getEmployee().getName().equals(order.getRestaurant().getRestaurantName())) {
                Object [] row = new Object[6];
                row[0] = order;
                row[1] = order.getCustomer().getName();
                row[2] = order.getMenu().getItemName();
                row[3] = order.getQuantity();
                row[4] = order.getQuantity() * order.getMenu().getPrice();
                row[5] = order.getOrderStatus();
                dtm.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnCompleted = new javax.swing.JButton();
        btnAccepted = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrder.setBackground(new java.awt.Color(204, 204, 204));
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer Name", "Item Name", "Quantity", "Price", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 171, 822, 131));

        btnCompleted.setBackground(new java.awt.Color(255, 255, 255));
        btnCompleted.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnCompleted.setText("Completed");
        btnCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletedActionPerformed(evt);
            }
        });
        add(btnCompleted, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 369, -1, 54));

        btnAccepted.setBackground(new java.awt.Color(255, 255, 255));
        btnAccepted.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnAccepted.setText("Accepted");
        btnAccepted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptedActionPerformed(evt);
            }
        });
        add(btnAccepted, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 367, 146, 58));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Optima", 1, 48)); // NOI18N
        jLabel1.setText("Manage Orders");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 24, -1, -1));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 15, 120, 54));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletedActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row to proceed.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)tblOrder.getValueAt(selectedRow, 0);
        if(order.getOrderStatus().equals("Order Accepted")) {
            order.setOrderStatus("Order is ready for pick up.");
            order.setAssign(true);
        }
        
        else if(order.getOrderStatus().equals("Order Placed")) {
            JOptionPane.showMessageDialog(null, "Order is should be accepted first");
            return;
        }
        
        else if(order.getOrderStatus().equals("Delivered")){
            JOptionPane.showMessageDialog(null, "Order has been delivered");
            return;
        }
    else {
            JOptionPane.showMessageDialog(null, "Invalid attempt. Try again.");
        }
        
        populateTable();
        
    }//GEN-LAST:event_btnCompletedActionPerformed

    private void btnAcceptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptedActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row to proceed.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)tblOrder.getValueAt(selectedRow, 0);
        if(order.getOrderStatus().equals("Order Placed")) {
            order.setOrderStatus("Order Accepted");
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Order is already accepted or completed");
            return;
        }
        
        populateTable();
        
    }//GEN-LAST:event_btnAcceptedActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccepted;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCompleted;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrder;
    // End of variables declaration//GEN-END:variables
}
