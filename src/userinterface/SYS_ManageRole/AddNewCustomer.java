/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SYS_ManageRole;


import Business.Employee.Employee;
import Business.Role.BS_CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static userinterface.MainJFrame.dB4OUtil;
import static userinterface.MainJFrame.system;

/**
 *
 * @author AEDSpring2019
 */
public class AddNewCustomer extends javax.swing.JPanel {

    /**
     * Creates new form AdminScreen
     */
    
    private JPanel userProcessContainer;
    
    public AddNewCustomer(JPanel userProcessContainer) {
        initComponents();
        this. userProcessContainer =  userProcessContainer;
      
    }
    private boolean checkusername(){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]{6,}$");
        Matcher m=p.matcher(txtUser.getText());
        boolean b=m.matches();
        System.out.println(b+"name");
        return b;
    
    }
    private boolean checkpassword(){//>=6 >=1 upper case letter >=1 lower case letter one digit .
        

        Pattern p0=Pattern.compile("^(?![a-z0-9]+$)(?![A-Za-z]+$)(?![A-Z0-9]+$)[a-zA-Z0-9]{6,}$");
        Matcher m0=p0.matcher(txtPword.getText());
        boolean b0=m0.matches();
        System.out.println(b0);
         if(!b0){
              jLabel2.setForeground(Color.red);
              JOptionPane.showMessageDialog(null,"The password format is incorrect!","warning",JOptionPane.WARNING_MESSAGE);
            
            return false;
        }
       
       
        return true;
        
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnCreate = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPword = new javax.swing.JTextField();
        txtRePword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(950, 800));

        btnCreate.setFont(new java.awt.Font("Tekton Pro Ext", 1, 30)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtUser.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N

        txtPword.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N

        txtRePword.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel2.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel3.setText(" Re-enter Password:");

        btnBack.setFont(new java.awt.Font("Tekton Pro Ext", 1, 30)); // NOI18N
        btnBack.setText("< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tekton Pro Ext", 3, 42)); // NOI18N
        jLabel6.setText("Please Register Your New Account");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel5.setText("At least 6 characters and must contain uppercase, lowercase, number");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel7.setText("At least 6 characters and can contain letters and numbers");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel8.setText("Address:");

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel7))
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBack)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel8))
                                                .addGap(108, 108, 108))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(105, 105, 105)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtPword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                            .addComponent(txtUser, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRePword)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING))))))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel6)
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnBack))
                .addGap(82, 82, 82)
                .addComponent(jLabel4))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if(!(txtRePword.getText().equals(txtPword.getText()))){
            jLabel2.setForeground(Color.red);
            jLabel3.setForeground(Color.red);
            
        
                JOptionPane.showMessageDialog(null,"The two passwords are different !","warning",JOptionPane.WARNING_MESSAGE);
            
        }
        else if( !checkusername()){
            jLabel2.setForeground(Color.black);
            jLabel3.setForeground(Color.black);
            
             jLabel1.setForeground(Color.red);
             JOptionPane.showMessageDialog(null,"The username format is incorrect","warning",JOptionPane.WARNING_MESSAGE);
             
        
        }
        else if(!checkpassword()){
           jLabel1.setForeground(Color.black); jLabel3.setForeground(Color.black);
           jLabel2.setForeground(Color.red);
        }
        else if(!(system.getUserAccountDirectory().checkIfUsernameIsUnique(txtUser.getText()))){
             JOptionPane.showMessageDialog(null,"The username already exists","warning",JOptionPane.WARNING_MESSAGE);
             
            jLabel1.setForeground(Color.red);
            jLabel3.setForeground(Color.black);
            jLabel2.setForeground(Color.black);
        }
        else{
            jLabel1.setForeground(Color.black);
            jLabel2.setForeground(Color.black);
            jLabel3.setForeground(Color.black);
        
        BS_CustomerRole bS_CustomerRole  =new BS_CustomerRole();
        Employee emplo=new Employee();
        UserAccount ua=system.getUserAccountDirectory().createUserAccount(txtUser.getText(), txtPword.getText(), emplo,bS_CustomerRole,txtAddress.getText());
       
        JOptionPane.showMessageDialog(null, "Create Useraccount Successfully!", "Successfully", JOptionPane.INFORMATION_MESSAGE);
        dB4OUtil.storeSystem(system);
        
        }


        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        userProcessContainer.remove(this);
        Component[] coms=userProcessContainer.getComponents();
        Component c=(Component)coms[coms.length-1];
        MngCus jp=(MngCus)c;
        jp.populateTable();
        CardLayout l=(CardLayout)userProcessContainer.getLayout();
        l.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtPword;
    private javax.swing.JTextField txtRePword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
