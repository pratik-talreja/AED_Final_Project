/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.HeadChef.HeadChefDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.RestaurantTable.RestaurantTableDirectory;
import Business.RestaurantTable.Table;
import Business.Server.Server;
import Business.Server.ServerDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author talre
 */
public class ManageTablesJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecoSystem;
    private RestaurantDirectory restaurantDirectory;
    private ServerDirectory serverDirectory;
    private Restaurant restaurant;
    private RestaurantTableDirectory restaurantTableDirectory;
    

    ManageTablesJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem, RestaurantDirectory restaurantDirectory, HeadChefDirectory headChefDirectory, RestaurantTableDirectory restaurantTableDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.serverDirectory = ecoSystem.getServerDirectory();
        this.restaurantDirectory = ecoSystem.getRestaurantDirectory();
        this.restaurantTableDirectory = ecoSystem.getRestaurantTableDirectory();
        populateTable();
    }

    /**
     * Creates new form ManageTablesJPanel
     */
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableOfTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableOfTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Table Number", "Available", "Capacity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableOfTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 601, 170));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableOfTable;
    // End of variables declaration//GEN-END:variables

    
        public void populateTable() {
        String restaurantName = account.getEmployee().getName();
        DefaultTableModel dtm = (DefaultTableModel) tableOfTable.getModel();
        dtm.setRowCount(0);

        for(Table table: ecoSystem.getRestaurantTableDirectory().getRestaurantTableDirectory()){

            if(table.getRestaurantName().equals(restaurantName)){
                Object [] row = new Object[3];
                row[0] = table;
                row[1] = table.isIsAvailable();
                row[2] = table.getCapacity();
                dtm.addRow(row);
            }


            }
        }
    
}