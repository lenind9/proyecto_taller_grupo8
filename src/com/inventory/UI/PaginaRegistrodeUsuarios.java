
package com.inventory.UI;

import com.inventory.DAO.UserDAO;

import java.sql.SQLException;
import java.awt.Color;
import java.awt.Component;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableCellRenderer;


public class PaginaRegistrodeUsuarios extends javax.swing.JPanel {

    public PaginaRegistrodeUsuarios() {
    	setBackground(new Color(153,179,254));
        initComponents();
        loadDataSet();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(0, 0, 0));
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistros = new javax.swing.JTable();
        tablaRegistros.setBackground(new Color(0, 0, 96));
        tablaRegistros.setForeground(new Color(255, 255, 255));
        refreshButton = new javax.swing.JButton();
        refreshButton.setForeground(new Color(255, 255, 255));
        refreshButton.setBackground(new Color(0, 0, 96));
        searchText = new javax.swing.JTextField();
        searchText.setForeground(new Color(0, 0, 0));
        searchText.setBackground(new Color(255, 255, 255));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(new Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("REGISTROS DE USUARIO ");

        tablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaRegistros);

        refreshButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        refreshButton.setText("RECARGAR");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextKeyReleased(evt);
            }
        });

        jLabel2.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        					.addGap(18)
        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(searchText, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(refreshButton, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(refreshButton)
        						.addComponent(searchText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2))
        					.addGap(21)
        					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 407, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
    }//GEN-LAST:event_searchTextKeyReleased

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        loadDataSet();
    }//GEN-LAST:event_refreshButtonActionPerformed


    public void loadDataSet() {
        try {
            UserDAO userDAO = new UserDAO();
            tablaRegistros.setModel(userDAO.buildTableModel(userDAO.getUserLogsDAO()));
            
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer() {
                @Override
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                    Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);


                    // Centrar el texto en todas las celdas
                    setHorizontalAlignment(javax.swing.JLabel.CENTER);

                    return cellComponent;
                }
            };

            // Aplicar el renderizador personalizado a todas las columnas de la tabla
            for (int columnIndex = 0; columnIndex < tablaRegistros.getColumnCount(); columnIndex++) {
            	tablaRegistros.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Declaracion de variables - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaRegistros;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField searchText;
    // Fin de declaracion de variables//GEN-END:variables
}
