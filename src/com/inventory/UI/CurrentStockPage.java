package com.inventory.UI;

import com.inventory.DAO.ProductDAO;

import java.sql.SQLException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CurrentStockPage extends javax.swing.JPanel {


    String username;
    /**
     * Crea nuevo form CurrentStockPage
     */
    
    public CurrentStockPage(String username) {
        initComponents();
        this.username = username;
        loadDataSet();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); 
        jLabel1.setText("STOCK DISPONIBLE");
        jLabel1.setToolTipText("");

        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(stockTable);

        refreshButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        refreshButton.setText("RECARGAR");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
        					.addComponent(refreshButton)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(refreshButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        loadDataSet();
    }//GEN-LAST:event_refreshButtonActionPerformed

    // Metodo para cargar datos en la tabla
    public void loadDataSet() {
        try {
            ProductDAO productDAO = new ProductDAO();
            stockTable.setModel(productDAO.buildTableModel(productDAO.getCurrentStockInfo()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTable stockTable;
}
