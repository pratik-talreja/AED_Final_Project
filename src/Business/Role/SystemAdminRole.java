/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Chef.ChefDirectory;
import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.HeadChef.HeadChefDirectory;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.RestaurantTable.RestaurantTableDirectory;
import Business.Server.ServerDirectory;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import Business.Donation.DonationDirectory;
import Business.Supplier.SupplierDirectory;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory,ChefDirectory chefDirectory, ServerDirectory serverDirectory, HeadChefDirectory headChefDirectory, RestaurantTableDirectory restaurantTableDirectory, DonationDirectory donationDirectory, SupplierDirectory supplierDirectory) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, account, business, customerDirectory, restaurantDirectory, deliveryManDirectory, chefDirectory, serverDirectory, donationDirectory, supplierDirectory);
    }

    @Override
    public JPanel createWorkArea1(JPanel userProcessContainer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
