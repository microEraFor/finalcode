/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SYS_ManageRole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import userinterface.MainJFrame;
import static userinterface.MainJFrame.dB4OUtil;
import static userinterface.MainJFrame.system;
/**
 *
 * @author 16104
 */
public class MngEnterprise extends javax.swing.JPanel {

    /**
     * Creates new form MngDeli
     */
    private Network selectednetwork;
    JPanel userProcessContainer;


    public MngEnterprise(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
         this.selectednetwork=new Network();
        JTableHeader head = mngcus.getTableHeader(); // 创建表格标题对象
        head.setPreferredSize(new Dimension(head.getWidth(), 36));// 设置表头大小
        head.setFont(new Font("Times New Roman", Font.PLAIN, 36));// 设置表格字体
        
        populateCombo();
        
    }
    public void populateCombo(){
        b1.removeAllItems();
        for(Network nt:system.getNetworkDirectory().getNetworkList()){//把现有的network名字加到combox里面，因为要在network里面创建enterprise
            b1.addItem(nt.getName());  
        }
       
         populateTable();
    
    }
    
    public void populateTable(){
        //选择一个network
        if(system.getNetworkDirectory().getNetworkList().size()!=0){
        String networkname=(String) b1.getSelectedItem();
        for(Network nt:system.getNetworkDirectory().getNetworkList()){
            if(nt.getName().equals(networkname))
               selectednetwork=nt; 
        }
        //展示这个network里的所有enterprise
                
        DefaultTableModel model=(DefaultTableModel)mngcus.getModel();
        model.setRowCount(0);
        System.out.print(selectednetwork+"//");
        
        for(Enterprise enterprise:selectednetwork.getEnterpriseDirectory().getEnterpriseList()){
            Object row[]=new Object[5];
            row[0]=enterprise.getEnterpriseID();
            row[1]=enterprise;
            row[2]=enterprise.getEnterpriseManager().getUsername();
            row[3]=enterprise.getEnterpriseManager().getPassword();
            row[4]=enterprise.getEnterpriseType();
            
            
            model.addRow(row);
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

        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mngcus = new javax.swing.JTable();
        b1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(950, 800));

        jButton4.setFont(new java.awt.Font("Tekton Pro Ext", 1, 30)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tekton Pro Ext", 1, 30)); // NOI18N
        jButton6.setText("Add New Enterprise");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tekton Pro Ext", 0, 30)); // NOI18N
        jButton3.setText("View Detail");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tekton Pro Ext", 3, 48)); // NOI18N
        jLabel1.setText("Manage All Enterprise");

        jButton1.setFont(new java.awt.Font("Tekton Pro Ext", 1, 30)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mngcus.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        mngcus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Manager UName", "Manager PSW", "Type"
            }
        ));
        mngcus.setRowHeight(38);
        jScrollPane1.setViewportView(mngcus);

        b1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        b1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setText("Choose Network");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)
                        .addGap(65, 65, 65)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 198, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(189, 189, 189))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          int row=mngcus.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
       String networkname=(String) b1.getSelectedItem();
        for(Network nt:system.getNetworkDirectory().getNetworkList()){
            if(nt.getName().equals(networkname))
               selectednetwork=nt; 
        }
        Enterprise en=(Enterprise)mngcus.getValueAt(row, 1);    
        ViewEnterpriseDetail viewEnterpriseDetail=new ViewEnterpriseDetail(userProcessContainer,en,selectednetwork);
        userProcessContainer.add("viewEnterpriseDetail", viewEnterpriseDetail);
        CardLayout layout  = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
                  AddNewEnterprise addNewEnterprise = new AddNewEnterprise(userProcessContainer);
                userProcessContainer.add("addNewEnterprise", addNewEnterprise);
                CardLayout layout  = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                populateTable();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:back
        userProcessContainer.remove(this);
        
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:delete
         int row=mngcus.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
         
          
             int mesg = JOptionPane.showConfirmDialog(null, "Are you sure to delete this enterprise?", " WarningDialog!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if(mesg==JOptionPane.YES_OPTION){
          
               
                JOptionPane.showMessageDialog(null, "You have delete this enterprise successfully!");
                Enterprise deen=(Enterprise)mngcus.getValueAt(row, 1); 
                String networkname=(String) b1.getSelectedItem();
                for(Network nt:system.getNetworkDirectory().getNetworkList()){
                    if(nt.getName().equals(networkname))
                        selectednetwork=nt; 
                }
       
            UserAccount deenterManager=deen.getEnterpriseManager();
            system.getUserAccountDirectory().deleteUa(deenterManager.getUsername());
            for(Organization or:deen.getOrganizationDirectory().getOrganizationList()){
                for(UserAccount usa:or.getUserAccountDirectory().getUserAccountList())
                    system.getUserAccountDirectory().deleteUa(usa.getUsername());
                
            }
            selectednetwork.getEnterpriseDirectory().getEnterpriseList().remove(deen);
       
            populateTable();
            dB4OUtil.storeSystem(system);
            }
        
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_b1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> b1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mngcus;
    // End of variables declaration//GEN-END:variables
}
