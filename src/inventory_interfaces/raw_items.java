/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_interfaces;

import static inventory_interfaces.packing_items.packingItemsTable;
import static inventory_interfaces.raw_items.rawItemsTable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import mycode.db;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Anusha
 */
public class raw_items extends javax.swing.JInternalFrame {

    /**
     * Creates new form raw_items
     */
    public raw_items() {
        initComponents();
        db databaseCon = new db();
        Connection dbconnect = db.dbconnect();
        
        ArrayList data = new ArrayList();
        String selectQuery = "select * from raw_items";
        try{
                Connection con = databaseCon.dbconnect();
                ResultSet rs = null;
                PreparedStatement pst = null;
                pst = con.prepareStatement(selectQuery);
                rs = pst.executeQuery();
                
                rawItemsTable.setModel(DbUtils.resultSetToTableModel(rs));
                
                
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
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

        setTitle("Raw_Items");

        rawItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Batch Number", "Quantity", "Unit Price", "Total Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        rawItemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rawItemsTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rawItemsTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(rawItemsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        //EditExpensesData editData = new EditExpensesData();
    private void rawItemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rawItemsTableMouseClicked
        //this.dispose();
    }//GEN-LAST:event_rawItemsTableMouseClicked

    private void rawItemsTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rawItemsTableMousePressed
        materialsData edit = new materialsData();
        int index = rawItemsTable.getSelectedRow();
        TableModel model = rawItemsTable.getModel();
        
        String id = model.getValueAt(index, 0).toString();
        String pitemName = model.getValueAt(index, 1).toString();
        String pitemQuantity = model.getValueAt(index, 2).toString();
        String pitemUnitprice = model.getValueAt(index, 3).toString();
        String pitemTotalprice = model.getValueAt(index, 4).toString();
        
        
        
        edit.setVisible(true);
        //edit.pack();
        
        edit.namebox.setText(pitemName);
        edit.quantitybox.setText(pitemQuantity);
        edit.unitpricebox.setText(pitemUnitprice);
        edit.totalpricebox.setText(pitemTotalprice);
        
        edit.usageNameBox.setText(pitemName);
        edit.usageUnitPriceBox.setText(pitemUnitprice);
        
        edit.rawitemsActionPerformed(id);
        edit.rawitemsDeleteActionPerformed(id);
        edit.sendMail();
    }//GEN-LAST:event_rawItemsTableMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JTable rawItemsTable = new javax.swing.JTable();
    // End of variables declaration//GEN-END:variables
}