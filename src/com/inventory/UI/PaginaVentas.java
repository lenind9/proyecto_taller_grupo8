
package com.inventory.UI;

import com.inventory.DAO.CustomerDAO;
import com.inventory.DAO.ProductDAO;
import com.inventory.DTO.ProductDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import java.awt.Component;

public class PaginaVentas extends javax.swing.JPanel {

    String username;
    Dashboard dashboard;
    int quantity;
    String prodCode;
    
    public PaginaVentas(String username, Dashboard dashboard) {
    	setBackground(new Color(153,179,254));
        initComponents();
        this.username = username;
        this.dashboard = dashboard;
        custNameLabel.setVisible(false);
        prodNameLabel.setVisible(false);
        loadDataSet();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(0, 0, 0));
        jSeparator1 = new javax.swing.JSeparator();
        sellPanel = new javax.swing.JPanel();
        sellPanel.setForeground(new Color(0, 0, 0));
        sellPanel.setBackground(new Color(153, 179, 254));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(new Color(0, 0, 0));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setForeground(new Color(0, 0, 0));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setForeground(new Color(0, 0, 0));
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setForeground(new Color(0, 0, 0));
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setForeground(new Color(0, 0, 0));
        custCodeText = new javax.swing.JTextField();
        custCodeText.setForeground(new Color(0, 0, 0));
        custCodeText.setBackground(new Color(255, 255, 255));
        prodCodeText = new javax.swing.JTextField();
        prodCodeText.setForeground(new Color(0, 0, 0));
        prodCodeText.setBackground(new Color(255, 255, 255));
        priceText = new javax.swing.JTextField();
        priceText.setForeground(new Color(0, 0, 0));
        priceText.setBackground(new Color(255, 255, 255));
        quantityText = new javax.swing.JTextField();
        quantityText.setForeground(new Color(0, 0, 0));
        quantityText.setBackground(new Color(255, 255, 255));
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser1.getCalendarButton().setBackground(new Color(255, 255, 255));
        jDateChooser1.getCalendarButton().setForeground(new Color(255, 255, 255));
        jDateChooser1.setForeground(new Color(0, 0, 0));
        jDateChooser1.setBackground(new Color(255, 255, 255));
        sellButton = new javax.swing.JButton();
        sellButton.setForeground(new Color(255, 255, 255));
        sellButton.setBackground(new Color(0, 0, 96));
        deleteButton = new javax.swing.JButton();
        deleteButton.setForeground(new Color(255, 255, 255));
        deleteButton.setBackground(new Color(0, 0, 96));
        clearButton = new javax.swing.JButton();
        clearButton.setForeground(new Color(255, 255, 255));
        clearButton.setBackground(new Color(0, 0, 96));
        addCustButton = new javax.swing.JButton();
        addCustButton.setBackground(new Color(0, 0, 96));
        addCustButton.setForeground(new Color(255, 255, 255));
        custNameLabel = new javax.swing.JLabel();
        prodNameLabel = new javax.swing.JLabel();
        
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setBackground(new Color(255,255,255));
        jScrollPane1.setForeground(new Color(0,0,0));
        
        tablaVentas = new javax.swing.JTable();
        tablaVentas.setForeground(new Color(255, 255, 255));
        tablaVentas.setBackground(new Color(0, 0, 96));
        searchText = new javax.swing.JTextField();
        searchText.setBackground(new Color(255, 255, 255));
        searchText.setForeground(new Color(0, 0, 0));
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setForeground(new Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("Ventas");

        sellPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Venta Producto"));

        jLabel2.setText("Código cliente:");

        jLabel3.setText("Codigo producto:");

        jLabel4.setText("Fecha:");

        jLabel5.setText("Precio venta:");

        jLabel6.setText("Cantidad:");

        custCodeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                custCodeTextKeyReleased(evt);
            }
        });

        prodCodeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                prodCodeTextKeyReleased(evt);
            }
        });

        sellButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sellButton.setText("VENDER PRODUCTO");
        sellButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Borrar");
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Limpiar");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        addCustButton.setText("Clic para añadir un cliente");
        addCustButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCustButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustButtonActionPerformed(evt);
            }
        });

        custNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custNameLabel.setLabelFor(custCodeText);

        prodNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prodNameLabel.setLabelFor(prodCodeText);

        javax.swing.GroupLayout sellPanelLayout = new javax.swing.GroupLayout(sellPanel);
        sellPanel.setLayout(sellPanelLayout);
        sellPanelLayout.setHorizontalGroup(
            sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prodNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(custNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addCustButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sellButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(custCodeText))
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prodCodeText))
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantityText))
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceText))
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        sellPanelLayout.setVerticalGroup(
            sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sellPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sellPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(custCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(custNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(addCustButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prodCodeText, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prodNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sellPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(clearButton))
                .addContainerGap())
        );

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVentas);

        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTextKeyReleased(evt);
            }
        });

        jLabel7.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sellPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (tablaVentas.getSelectedRow()<0)
            JOptionPane.showMessageDialog(this, "Seleccione una entrada de la tabla que desea eliminar.");
        else {
            int opt = JOptionPane.showConfirmDialog(
                    this,
                    "¿Está seguro de que desea eliminar esta venta de la base de datos?",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION);
            if (opt == JOptionPane.YES_OPTION) {
                new ProductDAO().deleteSaleDAO(Integer.parseInt(
                        tablaVentas.getValueAt(tablaVentas.getSelectedRow(),0).toString()));
                new ProductDAO().editSoldStock(
                        tablaVentas.getValueAt(tablaVentas.getSelectedRow(),1).toString(), quantity);
                loadDataSet();
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        custCodeText.setText("");
        custNameLabel.setText("");
        custNameLabel.setVisible(false);
        prodCodeText.setText("");
        prodNameLabel.setText("");
        prodNameLabel.setVisible(false);
        jDateChooser1.setDate(null);
        priceText.setText("");
        quantityText.setText("");
        loadDataSet();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void addCustButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustButtonActionPerformed
        dashboard.addCustPage();
    }//GEN-LAST:event_addCustButtonActionPerformed

    private void sellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellButtonActionPerformed
        if (custCodeText.getText().equals("") || prodCodeText.getText().equals("")
                || jDateChooser1.getDate()==null || quantityText.getText().equals("") || priceText.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos requeridos.");
        else {
            try {
                ResultSet resultSet = new CustomerDAO().getCustName(custCodeText.getText());
                if (resultSet.next()) {
                    ProductDTO productDTO = new ProductDTO();
                    productDTO.setCustCode(custCodeText.getText());
                    productDTO.setDate(jDateChooser1.getDate().toString());
                    productDTO.setProdCode(prodCodeText.getText());
                    Double sellPrice = Double.parseDouble(priceText.getText());
                    Double totalRevenue = sellPrice * Integer.parseInt(quantityText.getText());
                    productDTO.setTotalRevenue(totalRevenue);
                    productDTO.setQuantity(Integer.parseInt(quantityText.getText()));
                    new ProductDAO().sellProductDAO(productDTO, username);
                    loadDataSet();
                } else
                    JOptionPane.showMessageDialog(this, "Este cliente no existe.\n" +
                            "Agregue un nuevo cliente o use un código de cliente válido.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_sellButtonActionPerformed

    private void salesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesTableMouseClicked
        int row = tablaVentas.getSelectedRow();
        int col = tablaVentas.getColumnCount();
        Object[] data = new Object[col];
        for (int i=0; i<col; i++)
            data[i] = tablaVentas.getValueAt(row, i);
        quantity = Integer.parseInt(data[3].toString());
        prodCode = data[1].toString();
    }//GEN-LAST:event_salesTableMouseClicked

    private void custCodeTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custCodeTextKeyReleased
        try {
            ResultSet resultSet = new CustomerDAO().getCustName(custCodeText.getText());
            if (resultSet.next())
                custNameLabel.setText("Name: "
                        +resultSet.getString("fullname")
                        + " | Location: "
                        +resultSet.getString("location"));
            else
                custNameLabel.setText("||   El cliente no existe en la base de datos.   ||");
            custNameLabel.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_custCodeTextKeyReleased

    private void prodCodeTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prodCodeTextKeyReleased
        try {
            ResultSet resultSet = new CustomerDAO().getProdName(prodCodeText.getText());
            if (resultSet.next()) {
                prodNameLabel.setText("Name: "
                        + resultSet.getString("productname")
                        + " | Available quantity: "
                        + resultSet.getString("quantity"));
                Double sellPrice = new ProductDAO().getProdSell(prodCodeText.getText());
                priceText.setText(sellPrice.toString());
            } else
                prodNameLabel.setText("||   El producto no existe en el inventario.  ||");
            prodNameLabel.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_prodCodeTextKeyReleased

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
        loadSearchData(searchText.getText());
    }//GEN-LAST:event_searchTextKeyReleased

    // Method to load data into table
    public void loadDataSet() {
        try {
            ProductDAO productDAO = new ProductDAO();
            tablaVentas.setModel(productDAO.buildTableModel(productDAO.getSalesInfo()));
            
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
            for (int columnIndex = 0; columnIndex < tablaVentas.getColumnCount(); columnIndex++) {
            	tablaVentas.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to display search result in table
    public void loadSearchData(String text) {
        try {
            ProductDAO productDAO = new ProductDAO();
            tablaVentas.setModel(productDAO.buildTableModel(productDAO.getSalesSearch(text)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField custCodeText;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JButton deleteButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField priceText;
    private javax.swing.JTextField prodCodeText;
    private javax.swing.JLabel prodNameLabel;
    private javax.swing.JTextField quantityText;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton sellButton;
    private javax.swing.JPanel sellPanel;
    // End of variables declaration//GEN-END:variables
}
