
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Talre
 */

public class RequestLabTestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    
    private UserAccount userAccount;
  
    public RequestLabTestJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        
        this.userAccount = account;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(102, 102, 102));
        setLayout(null);

        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton);
        requestTestJButton.setBounds(210, 119, 97, 23);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Message");
        jLabel1.setPreferredSize(new java.awt.Dimension(82, 14));
        add(jLabel1);
        jLabel1.setBounds(112, 73, 82, 14);
        add(messageJTextField);
        messageJTextField.setBounds(170, 70, 143, 20);

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(100, 119, 71, 23);

        valueLabel.setForeground(new java.awt.Color(204, 204, 204));
        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(140, 30, 130, 20);

        enterpriseLabel.setFont(new java.awt.Font("Optima", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(204, 204, 204));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(20, 20, 120, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
        
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaJPanel dwjp = (CustomerAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
