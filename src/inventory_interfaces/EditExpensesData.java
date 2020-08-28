/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import mycode.db;

/**
 *
 * @author Kasun
 */
public class EditExpensesData extends javax.swing.JFrame {

    /**
     * Creates new form EditExpensesData
     */
    public EditExpensesData() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        namebox = new javax.swing.JTextField();
        quantitybox = new javax.swing.JTextField();
        totalpricebox = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        unitpricebox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Expenses Details");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Packing Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Quantity");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Unit Price");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Total Price");

        namebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameboxActionPerformed(evt);
            }
        });
        namebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameboxKeyTyped(evt);
            }
        });

        quantitybox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityboxKeyTyped(evt);
            }
        });

        totalpricebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalpriceboxKeyTyped(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        unitpricebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitpriceboxActionPerformed(evt);
            }
        });
        unitpricebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unitpriceboxKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalpricebox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unitpricebox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantitybox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateBtn)
                        .addGap(28, 28, 28))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantitybox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitpricebox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalpricebox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameboxActionPerformed

    private void nameboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameboxKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isLetter(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_SPACE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nameboxKeyTyped

    private void quantityboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityboxKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isLetter(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_SPACE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_quantityboxKeyTyped

    private void totalpriceboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalpriceboxKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_PERIOD))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_totalpriceboxKeyTyped

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        
        
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        namebox.setText("");
        quantitybox.setText("");
        totalpricebox.setText("");
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void unitpriceboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitpriceboxKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_unitpriceboxKeyTyped

    private void unitpriceboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitpriceboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitpriceboxActionPerformed

    public void update(String id){
        db databaseCon = new db();
        Connection dbconnect = db.dbconnect();
        
        String exID = id;
        int intID = Integer.parseInt(exID);
        String Name = namebox.getText();
        String quantity = quantitybox.getText();
        double unitprice = Double.parseDouble(unitpricebox.getText());
        String totalprice = totalpricebox.getText();

        if(Name.equals("")||quantity.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please fill out the empty fields !");
        } else {
            try{
                Connection con = databaseCon.dbconnect();
                ResultSet rs = null;
                PreparedStatement pst = null;
                pst = con.prepareStatement("UPDATE packing_items SET Name = ?, Quantity = ?, UnitPrice = ?, TotalPrice = ? WHERE StockNo = ?");
                pst.setString(1,Name);
                pst.setString(2,quantity);
                pst.setDouble(3,unitprice);
                pst.setString(4,totalprice);
                pst.setInt(5,intID);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Changes Saved !");

            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
    
    public void delete(String id){
        db databaseCon = new db();
        Connection dbconnect = db.dbconnect();
        
        String exID = id;
        int intID = Integer.parseInt(exID);
        boolean flag = false;

            try{
                Connection con = databaseCon.dbconnect();
                PreparedStatement pst = con.prepareStatement("DELETE from packing_items WHERE StockNo = ?");
                pst.setInt(1,intID);
                pst.executeUpdate(); 
                /*String Query = "DELETE from expenses WHERE id = ?";
                pst.setInt(1,intID);
                pst = con.prepareStatement(Query);
                pst.execute();*/
                JOptionPane.showMessageDialog(rootPane, "Record Deleted !");
            }catch (Exception e){
                System.out.println(e);
            }
        
    }
    
    
    public void updateRawItems(String id){
        db databaseCon = new db();
        Connection dbconnect = db.dbconnect();
        
        String exID = id;
        int intID = Integer.parseInt(exID);
        String Name = namebox.getText();
        String quantity = quantitybox.getText();
        double unitprice = Double.parseDouble(unitpricebox.getText());
        String totalprice = totalpricebox.getText();

        if(Name.equals("")||quantity.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please fill out the empty fields !");
        } else {
            try{
                Connection con = databaseCon.dbconnect();
                ResultSet rs = null;
                PreparedStatement pst = null;
                pst = con.prepareStatement("UPDATE raw_items SET Name = ?, Quantity = ?, UnitPrice = ?, TotalPrice = ? WHERE StockNo = ?");
                pst.setString(1,Name);
                pst.setString(2,quantity);
                pst.setDouble(3,unitprice);
                pst.setString(4,totalprice);
                pst.setInt(5,intID);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(rootPane, "Changes Saved !");

            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
    
    
    public void deleteRawItems(String id){
        db databaseCon = new db();
        Connection dbconnect = db.dbconnect();
        
        String exID = id;
        int intID = Integer.parseInt(exID);
        boolean flag = false;

            try{
                Connection con = databaseCon.dbconnect();
                PreparedStatement pst = con.prepareStatement("DELETE from raw_items WHERE StockNo = ?");
                pst.setInt(1,intID);
                pst.executeUpdate(); 
                /*String Query = "DELETE from expenses WHERE id = ?";
                pst.setInt(1,intID);
                pst = con.prepareStatement(Query);
                pst.execute();*/
                JOptionPane.showMessageDialog(rootPane, "Record Deleted !");
            }catch (Exception e){
                System.out.println(e);
            }
        
    }
    
     public void packingitemsActionPerformed(String id){
            updateBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                  update(id);
                }
            });
    }
    
    public void packingitemsDeleteActionPerformed(String id){
            deleteBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                  delete(id);
                }
            });
    }
    
    
     public void rawitemsActionPerformed(String id){
            updateBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                  updateRawItems(id);
                }
            });
            
    }
    
     public void rawitemsDeleteActionPerformed(String id){
            deleteBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    deleteRawItems(id);
                }
            });
            
    }
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditExpensesData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditExpensesData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditExpensesData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditExpensesData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditExpensesData().setVisible(true);
            }
        });
        
       /* updateBtn.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent e) { 
                    update();
            } 
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField namebox;
    public javax.swing.JTextField quantitybox;
    public javax.swing.JTextField totalpricebox;
    public javax.swing.JTextField unitpricebox;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
