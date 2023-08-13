
package com.inventory.UI;

import com.inventory.DAO.CustomerDAO;
import com.inventory.DTO.CustomerDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

import java.sql.SQLException;
import java.awt.Color;
import java.awt.Component;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.border.MatteBorder;


public class PaginaClientes extends javax.swing.JPanel {

   
    public PaginaClientes() {
    	setForeground(new Color(0, 0, 0));
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
        entryPanel = new javax.swing.JPanel();
        entryPanel.setFont(new Font("Roboto Light", Font.PLAIN, 11));
        entryPanel.setForeground(new Color(0, 0, 0));
        entryPanel.setBackground(Color.WHITE);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        jLabel2.setForeground(new Color(0, 0, 0));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        jLabel3.setForeground(new Color(0, 0, 0));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        jLabel4.setForeground(new Color(0, 0, 0));
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        jLabel5.setForeground(new Color(0, 0, 0));
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new Font("Roboto", Font.PLAIN, 14));
        jLabel6.setForeground(new Color(0, 0, 0));
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        jLabel7.setForeground(new Color(0, 0, 0));
        phoneText = new javax.swing.JTextField();
        phoneText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
        phoneText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        phoneText.setForeground(new Color(0, 0, 0));
        phoneText.setBackground(new Color(255, 255, 255));
        locationText = new javax.swing.JTextField();
        locationText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
        locationText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        locationText.setForeground(new Color(0, 0, 0));
        locationText.setBackground(new Color(255, 255, 255));
        codeText = new javax.swing.JTextField();
        codeText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
        codeText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        codeText.setForeground(new Color(0, 0, 0));
        codeText.setBackground(new Color(255, 255, 255));
        nameText = new javax.swing.JTextField();
        nameText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
        nameText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        nameText.setForeground(new Color(0, 0, 0));
        nameText.setBackground(new Color(255, 255, 255));
        creditText = new javax.swing.JTextField();
        creditText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
        creditText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        creditText.setForeground(new Color(0, 0, 0));
        creditText.setBackground(new Color(255, 255, 255));
        debitText = new javax.swing.JTextField();
        debitText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
        debitText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        debitText.setForeground(new Color(0, 0, 0));
        debitText.setBackground(new Color(255, 255, 255));
        addButton = new javax.swing.JButton();
        addButton.setBorderPainted(false);
        addButton.setBorder(null);
        addButton.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        addButton.setForeground(new Color(255, 255, 255));
        addButton.setBackground(new Color(80, 77, 166));
        editButton = new javax.swing.JButton();
        editButton.setBorderPainted(false);
        editButton.setBorder(null);
        editButton.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        editButton.setForeground(new Color(255, 255, 255));
        editButton.setBackground(new Color(80, 77, 166));
        deleteButton = new javax.swing.JButton();
        deleteButton.setBorderPainted(false);
        deleteButton.setBorder(null);
        deleteButton.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        deleteButton.setBackground(new Color(80, 77, 166));
        deleteButton.setForeground(new Color(255, 255, 255));
        clearButton = new javax.swing.JButton();
        clearButton.setBorderPainted(false);
        clearButton.setBorder(null);
        clearButton.setForeground(new Color(255, 255, 255));
        clearButton.setBackground(new Color(80, 77, 166));
        jScrollPane1 = new javax.swing.JScrollPane();
        custTable = new javax.swing.JTable();
        custTable.setRowHeight(50);
        custTable.setFont(new Font("Roboto", Font.PLAIN, 15));
        custTable.setBackground(Color.WHITE);
        custTable.setForeground(Color.BLACK);
        searchText = new javax.swing.JTextField();
        searchText.setForeground(new Color(0, 0, 0));
        searchText.setBackground(new Color(255, 255, 255));
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        jLabel8.setForeground(new Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("CLIENTES");

        entryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Introducir Datos del Cliente"));

        jLabel2.setText("Codigo cliente:");

        jLabel3.setText("Nombre completo:");

        jLabel4.setText("Dirección:");

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

        editButton.setText("Editar");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Borrar");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new Font("Roboto Light", Font.PLAIN, 15)); // NOI18N
        clearButton.setText("LIMPIAR");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout entryPanelLayout = new javax.swing.GroupLayout(entryPanel);
        entryPanelLayout.setHorizontalGroup(
        	entryPanelLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(entryPanelLayout.createSequentialGroup()
        			.addGroup(entryPanelLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(entryPanelLayout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(entryPanelLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(entryPanelLayout.createSequentialGroup()
        							.addGroup(entryPanelLayout.createParallelGroup(Alignment.LEADING)
        								.addGroup(entryPanelLayout.createSequentialGroup()
        									.addGroup(entryPanelLayout.createParallelGroup(Alignment.LEADING)
        										.addComponent(jLabel3)
        										.addComponent(jLabel6)
        										.addComponent(jLabel5)
        										.addComponent(jLabel4)
        										.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
        									.addPreferredGap(ComponentPlacement.RELATED))
        								.addGroup(entryPanelLayout.createSequentialGroup()
        									.addComponent(jLabel2)
        									.addGap(41)))
        							.addGroup(entryPanelLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(nameText, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        								.addComponent(locationText, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        								.addComponent(phoneText, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        								.addGroup(entryPanelLayout.createParallelGroup(Alignment.TRAILING, false)
        									.addComponent(debitText, Alignment.LEADING)
        									.addComponent(creditText, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
        								.addComponent(codeText, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
        						.addComponent(clearButton, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)))
        				.addGroup(entryPanelLayout.createSequentialGroup()
        					.addGap(39)
        					.addComponent(addButton, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(editButton, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        entryPanelLayout.setVerticalGroup(
        	entryPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(entryPanelLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(entryPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        				.addComponent(codeText, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
        			.addGap(34)
        			.addGroup(entryPanelLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(entryPanelLayout.createSequentialGroup()
        					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        					.addGap(36)
        					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        					.addGap(35)
        					.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        					.addGap(35)
        					.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
        				.addGroup(entryPanelLayout.createSequentialGroup()
        					.addComponent(nameText, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        					.addGap(36)
        					.addComponent(locationText, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        					.addGap(35)
        					.addComponent(phoneText, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        					.addGap(35)
        					.addComponent(debitText, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
        			.addGap(33)
        			.addGroup(entryPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        				.addComponent(creditText, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
        			.addGroup(entryPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(addButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        				.addComponent(editButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(clearButton, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        entryPanel.setLayout(entryPanelLayout);

        custTable.setModel(new javax.swing.table.DefaultTableModel(
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
        custTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(custTable);

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
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
        					.addComponent(jLabel8)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(searchText, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(entryPanel, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(searchText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel8))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jScrollPane1)
        				.addComponent(entryPanel, GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
        			.addContainerGap(48, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (codeText.getText().equals("") || nameText.getText().equals("")
                || locationText.getText().equals("") || phoneText.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Please enter all the required details.");
        else {
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setCustCode(codeText.getText());
            customerDTO.setFullName(nameText.getText());
            customerDTO.setLocation(locationText.getText());
            customerDTO.setPhone(phoneText.getText());
            new CustomerDAO().addCustomerDAO(customerDTO);
            loadDataSet();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (custTable.getSelectedRow()<0)
            JOptionPane.showMessageDialog(this, "Seleccione un cliente de la tabla.");
        else {
            if (codeText.getText().equals("") || nameText.getText().equals("")
                    || locationText.getText().equals("") || phoneText.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Por favor ingrese todos los detalles requeridos.");
            else {
                CustomerDTO customerDTO = new CustomerDTO();
                customerDTO.setCustCode(codeText.getText());
                customerDTO.setFullName(nameText.getText());
                customerDTO.setLocation(locationText.getText());
                customerDTO.setPhone(phoneText.getText());
                new CustomerDAO().editCustomerDAO(customerDTO);
                loadDataSet();
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (custTable.getSelectedRow()<0)
            JOptionPane.showMessageDialog(this, "Seleccione un cliente de la tabla.");
        else {
            int opt = JOptionPane.showConfirmDialog(
                    this,
                    "¿Está seguro de eliminar este cliente?",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION);
            if (opt==JOptionPane.YES_OPTION) {
                new CustomerDAO().deleteCustomerDAO(custTable.getValueAt(custTable.getSelectedRow(),0).toString());
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

    private void custTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custTableMouseClicked
        int row = custTable.getSelectedRow();
        int col = custTable.getColumnCount();
        Object[] data = new Object[col];

        for (int i=0; i<col; i++)
            data[i] = custTable.getValueAt(row, i);
        codeText.setText((String) data[0]);
        nameText.setText((String) data[1]);
        locationText.setText((String) data[2]);
        phoneText.setText((String) data[3]);
    }//GEN-LAST:event_custTableMouseClicked

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
        loadSearchData(searchText.getText());
    }//GEN-LAST:event_searchTextKeyReleased

    public void loadDataSet() {
        try {
            CustomerDAO customerDAO = new CustomerDAO();
            custTable.setModel(customerDAO.buildTableModel(customerDAO.getQueryResult()));
            
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
            for (int columnIndex = 0; columnIndex < custTable.getColumnCount(); columnIndex++) {
                custTable.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void loadSearchData(String text) {
        try {
            CustomerDAO customerDAO = new CustomerDAO();
            custTable.setModel(customerDAO.buildTableModel(customerDAO.getCustomerSearch(text)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Declaracion de variables - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField codeText;
    private javax.swing.JTextField creditText;
    private javax.swing.JTable custTable;
    private javax.swing.JTextField debitText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel entryPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField locationText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JTextField searchText;
    // Fin de declaracion de variables//GEN-END:variables
}
