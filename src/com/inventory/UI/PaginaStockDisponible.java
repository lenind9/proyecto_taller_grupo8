
package com.inventory.UI;

import com.inventory.DAO.ProductDAO;

import java.sql.SQLException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.LineBorder;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class PaginaStockDisponible extends javax.swing.JPanel {


    String username;
   
    public PaginaStockDisponible(String username) {
    	setBackground(new Color(153,179,254));
        initComponents();
        this.username = username;
        loadDataSet();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(0, 0, 0));
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setBackground(new Color(255, 255, 255));
        jScrollPane1.setForeground(new Color(0, 0, 96));
        
        tablaStockDisponible = new javax.swing.JTable();
        tablaStockDisponible.setBackground(new Color(0, 0, 96));//azul
        tablaStockDisponible.setForeground(new Color(255, 255, 255));//blanco
        
        refreshButton = new javax.swing.JButton();
        refreshButton.setForeground(new Color(255, 255, 255));
        refreshButton.setBackground(new Color(0, 0, 128));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("STOCK DISPONIBLE");
        jLabel1.setToolTipText("");

        tablaStockDisponible.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaStockDisponible);

        refreshButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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

    // Method to load data into the table
    public void loadDataSet() {
        try {
            ProductDAO productDAO = new ProductDAO();
           tablaStockDisponible.setModel(productDAO.buildTableModel(productDAO.getCurrentStockInfo()));
          
           // Configura el renderizador personalizado para las celdas
           DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
               @Override
               public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                   Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                   // Cambia el color de las divisiones entre celdas
                   cellComponent.setBackground(Color.LIGHT_GRAY);

                   return cellComponent;
               }
           };
           tablaStockDisponible.setDefaultRenderer(Object.class, renderer);

           // Configura el centrado del texto en las celdas
           DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
           centerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);
           for (int columnIndex = 0; columnIndex < tablaStockDisponible.getColumnCount(); columnIndex++) {
               tablaStockDisponible.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTable tablaStockDisponible;
    // End of variables declaration//GEN-END:variables
}
