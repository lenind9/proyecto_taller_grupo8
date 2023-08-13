/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.UI;

import com.inventory.DAO.SupplierDAO;
import com.inventory.DTO.SupplierDTO;

import javax.swing.*;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Component;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Font;
import javax.swing.border.MatteBorder;


public class PaginaProveedores extends javax.swing.JPanel {

   
    public PaginaProveedores() {
    	setBackground(Color.WHITE);
        initComponents();
        loadDataSet();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(0, 0, 0));
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setForeground(new Color(0, 0, 0));
        jPanel1.setBackground(Color.WHITE);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        jLabel2.setForeground(new Color(0, 0, 0));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        jLabel3.setForeground(new Color(0, 0, 0));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        jLabel4.setForeground(new Color(0, 0, 0));
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        jLabel5.setForeground(new Color(0, 0, 0));
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        jLabel6.setForeground(new Color(0, 0, 0));
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        jLabel7.setForeground(new Color(0, 0, 0));
        creditText = new javax.swing.JTextField();
        creditText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        creditText.setFont(new Font("Tahoma", Font.PLAIN, 15));
        creditText.setForeground(new Color(0, 0, 0));
        creditText.setBackground(new Color(255, 255, 255));
        codeText = new javax.swing.JTextField();
        codeText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        codeText.setFont(new Font("Tahoma", Font.PLAIN, 15));
        codeText.setForeground(new Color(0, 0, 0));
        codeText.setBackground(new Color(255, 255, 255));
        nameText = new javax.swing.JTextField();
        nameText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        nameText.setFont(new Font("Tahoma", Font.PLAIN, 15));
        nameText.setForeground(new Color(0, 0, 0));
        nameText.setBackground(new Color(255, 255, 255));
        phoneText = new javax.swing.JTextField();
        phoneText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        phoneText.setForeground(new Color(0, 0, 0));
        phoneText.setBackground(new Color(255, 255, 255));
        locationText = new javax.swing.JTextField();
        locationText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        locationText.setFont(new Font("Tahoma", Font.PLAIN, 15));
        locationText.setBackground(new Color(255, 255, 255));
        locationText.setForeground(new Color(0, 0, 0));
        debitText = new javax.swing.JTextField();
        debitText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        debitText.setForeground(new Color(0, 0, 0));
        debitText.setBackground(new Color(255, 255, 255));
        addButton = new javax.swing.JButton();
        addButton.setBackground(new Color(80, 77, 166));
        addButton.setForeground(new Color(255, 255, 255));
        deleteButton = new javax.swing.JButton();
        deleteButton.setForeground(new Color(255, 255, 255));
        deleteButton.setBackground(new Color(80, 77, 166));
        editButton = new javax.swing.JButton();
        editButton.setForeground(new Color(255, 255, 255));
        editButton.setBackground(new Color(80, 77, 166));
        clearButton = new javax.swing.JButton();
        clearButton.setBackground(new Color(80, 77, 166));
        clearButton.setForeground(new Color(255, 255, 255));
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        tablaProveedores.setRowHeight(50);
        tablaProveedores.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        tablaProveedores.setForeground(Color.BLACK);
        tablaProveedores.setBackground(Color.WHITE);
        searchText = new javax.swing.JTextField();
        searchText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        searchText.setBackground(new Color(255, 255, 255));
        searchText.setForeground(new Color(0, 0, 0));
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        jLabel8.setForeground(new Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("Proveedores");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresa detalles del proveedor"));

        jLabel2.setText("Código proveedor:");

        jLabel3.setText("Nombre \r\ncompleto:");

        jLabel4.setText("Ubicación:");

        jLabel5.setText("Contacto:");

        jLabel6.setText("Importe débito:");

        jLabel7.setText("Importe crédito:");

        addButton.setText("Agregar");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Borrar");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setText("Actualizar");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearButton.setText("Limpiar");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(codeText, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(nameText, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(locationText, GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
        				.addComponent(clearButton, GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(addButton, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(editButton, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        					.addGap(32))
        				.addGroup(Alignment.LEADING, jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        					.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        						.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(phoneText))
        					.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        						.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(creditText))
        					.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(debitText, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(codeText, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addGap(31)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
        				.addComponent(nameText, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addGap(31)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(locationText, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addGap(33)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(phoneText, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addGap(38)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(debitText, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addGap(33)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(creditText, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addGap(42)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(editButton, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
        				.addComponent(addButton, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
        				.addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(clearButton)
        			.addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProveedores);

        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextKeyReleased(evt);
            }
        });

        jLabel8.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel1)
        					.addPreferredGap(ComponentPlacement.RELATED, 408, Short.MAX_VALUE)
        					.addComponent(jLabel8)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(searchText, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
        				.addComponent(searchText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel8))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
        			.addContainerGap())
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    private void suppTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppTableMouseClicked
        int row = tablaProveedores.getSelectedRow();
        int col = tablaProveedores.getColumnCount();
        Object[] data = new Object[col];

        for (int i=0; i<col; i++)
            data[i] = tablaProveedores.getValueAt(row, i);
        codeText.setText((String) data[0]);
        nameText.setText((String) data[1]);
        locationText.setText((String) data[2]);
        phoneText.setText((String) data[3]);
    }//GEN-LAST:event_suppTableMouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (codeText.getText().equals("") || nameText.getText().equals("")
                || locationText.getText().equals("") || phoneText.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Por favor ingrese todos los detalles requeridos.");
        else {
            SupplierDTO supplierDTO = new SupplierDTO();
            supplierDTO.setSuppCode(codeText.getText());
            supplierDTO.setFullName(nameText.getText());
            supplierDTO.setLocation(locationText.getText());
            supplierDTO.setPhone(phoneText.getText());
            new SupplierDAO().addSupplierDAO(supplierDTO);
            loadDataSet();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (tablaProveedores.getSelectedRow()<0)
            JOptionPane.showMessageDialog(this, "Seleccione una entrada para editar de la tabla.");
        else {
            if (codeText.getText().equals("") || nameText.getText().equals("")
                    || locationText.getText().equals("") || phoneText.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Por favor ingrese todos los detalles requeridos.");
            else {
                SupplierDTO supplierDTO = new SupplierDTO();
                supplierDTO.setSuppCode(codeText.getText());
                supplierDTO.setFullName(nameText.getText());
                supplierDTO.setLocation(locationText.getText());
                supplierDTO.setPhone(phoneText.getText());
                new SupplierDAO().editSupplierDAO(supplierDTO);
                loadDataSet();
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (tablaProveedores.getSelectedRow()<0)
            JOptionPane.showMessageDialog(this, "Seleccione una entrada de la tabla para eliminarla.");
        else {
            int opt = JOptionPane.showConfirmDialog(
                    this,
                    "¿Está seguro de que desea eliminar este proveedor?",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION);
            if (opt==JOptionPane.YES_OPTION) {
                new SupplierDAO().deleteSupplierDAO(tablaProveedores.getValueAt(tablaProveedores.getSelectedRow(),0).toString());
                loadDataSet();
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        codeText.setText("");
        nameText.setText("");
        locationText.setText("");
        phoneText.setText("");
        searchText.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
        String text = searchText.getText();
        loadSearchData(text);
    }//GEN-LAST:event_searchTextKeyReleased


    // Metodo para cargar datos en la tabla
    public void loadDataSet() {
        try {
            SupplierDAO supplierDAO = new SupplierDAO();
            tablaProveedores.setModel(supplierDAO.buildTableModel(supplierDAO.getQueryResult()));
            
            // Configura el renderizador personalizado para centrar y aplicar color
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
            for (int columnIndex = 0; columnIndex < tablaProveedores.getColumnCount(); columnIndex++) {
            	tablaProveedores.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metodo para mostrar el resultado de la busqueda en la tabla
    public void loadSearchData(String text) {
        try {
            SupplierDAO supplierDAO = new SupplierDAO();
            tablaProveedores.setModel(supplierDAO.buildTableModel(supplierDAO.getSearchResult(text)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Declaracion de variables - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField codeText;
    private javax.swing.JTextField creditText;
    private javax.swing.JTextField debitText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField locationText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JTextField searchText;
    private javax.swing.JTable tablaProveedores;
    // Fin de declaracion de variables//GEN-END:variables
}
