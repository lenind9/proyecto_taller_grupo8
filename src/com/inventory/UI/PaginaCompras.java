
package com.inventory.UI;

import com.inventory.DAO.ProductDAO;
import com.inventory.DAO.SupplierDAO;
import com.inventory.DTO.ProductDTO;


import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.MatteBorder;

public class PaginaCompras extends javax.swing.JPanel {

    ProductDTO productDTO;
    String username = null;
    String supplier = null;
    Dashboard dashboard;
    int quantity;
    String prodCode = null;
    
   
    
    public PaginaCompras(Dashboard dashboard) {
    	setBackground(Color.WHITE);
    	setForeground(new Color(147, 201, 255));
        initComponents();
        this.dashboard = dashboard;
        // Personaliza el renderizado de los elementos en el JComboBox (items de proveedores
        itemsProveedores.setRenderer(new CustomComboBoxRenderer());
        loadComboBox();
        loadDataSet();
    }

    // Clase interna para personalizar el renderizado de los elementos en el JComboBox
    private static class CustomComboBoxRenderer extends DefaultListCellRenderer {
        // Personaliza la apariencia de cada elemento en el combo
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            c.setForeground(Color.white);  // Cambia el color de la fuente
            c.setBackground(new Color(80, 77, 166));  // Cambia el color de fondo
            return c;
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(0, 0, 0));
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        jPanel1.setForeground(new Color(0, 0, 0));
        jPanel1.setBackground(Color.WHITE);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        jLabel2.setForeground(new Color(0, 0, 0));
        
        itemsProveedores = new javax.swing.JComboBox<>();
        itemsProveedores.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        itemsProveedores.setBackground(new Color(80, 77, 166));
        itemsProveedores.setForeground(new Color(255, 255, 255));
        
        addSuppButton = new javax.swing.JButton();
        addSuppButton.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        addSuppButton.setForeground(new Color(255, 255, 255));
        addSuppButton.setBackground(new Color(80, 77, 166));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        jLabel3.setForeground(new Color(0, 0, 0));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setToolTipText("nombre pproducto\r\n");
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
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        jLabel8.setForeground(new Color(0, 0, 0));
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        jLabel9.setForeground(new Color(0, 0, 0));
        codeText = new javax.swing.JTextField();
        codeText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        codeText.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        codeText.setForeground(new Color(0, 0, 0));
        codeText.setBackground(new Color(255, 255, 255));
        nameText = new javax.swing.JTextField();
        nameText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        nameText.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        nameText.setForeground(new Color(0, 0, 0));
        nameText.setBackground(new Color(255, 255, 255));
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser1.getCalendarButton().setForeground(new Color(255, 255, 255));
        jDateChooser1.setForeground(new Color(0, 0, 0));
        jDateChooser1.setBackground(new Color(255, 255, 255));
        quantityText = new javax.swing.JTextField();
        quantityText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        quantityText.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        quantityText.setForeground(new Color(0, 0, 0));
        quantityText.setBackground(new Color(255, 255, 255));
        costText = new javax.swing.JTextField();
        costText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        costText.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        costText.setForeground(new Color(0, 0, 0));
        costText.setBackground(new Color(255, 255, 255));
        sellText = new javax.swing.JTextField();
        sellText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        sellText.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        sellText.setForeground(new Color(0, 0, 0));
        sellText.setBackground(new Color(255, 255, 255));
        brandText = new javax.swing.JTextField();
        brandText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        brandText.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        brandText.setForeground(new Color(0, 0, 0));
        brandText.setBackground(new Color(255, 255, 255));
        purchaseButton = new javax.swing.JButton();
        purchaseButton.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        purchaseButton.setForeground(new Color(255, 255, 255));
        purchaseButton.setBackground(new Color(80, 77, 166));
        deleteButton = new javax.swing.JButton();
        deleteButton.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        deleteButton.setForeground(new Color(255, 255, 255));
        deleteButton.setBackground(new Color(80, 77, 166));
        clearButton = new javax.swing.JButton();
        clearButton.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        clearButton.setForeground(new Color(255, 255, 255));
        clearButton.setBackground(new Color(80, 77, 166));
        jScrollPane1 = new javax.swing.JScrollPane();
        purchaseTable = new javax.swing.JTable();
        purchaseTable.setRowHeight(40);
        purchaseTable.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        purchaseTable.setForeground(Color.BLACK);
        purchaseTable.setBackground(Color.WHITE);
        refreshButton = new javax.swing.JButton();
        refreshButton.setForeground(new Color(255, 255, 255));
        refreshButton.setBackground(new Color(80, 77, 166));
        searchText = new javax.swing.JTextField();
        searchText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        searchText.setBackground(new Color(255, 255, 255));
        searchText.setForeground(new Color(0, 0, 0));
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        jLabel10.setForeground(new Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("COMPRAS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Purchase Product"));

        jLabel2.setText("Proveedor:");

        itemsProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addSuppButton.setText("Clic para agregar un nuevo proveedor");
        addSuppButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSuppButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo producto:");

        jLabel4.setText("Nombre producto:");

        jLabel5.setText("Fecha:");

        jLabel6.setText("Cantidad:");

        jLabel7.setText("Precio costo:");

        jLabel8.setText("Precio venta:");

        jLabel9.setText("Marca:");

        codeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codeTextKeyReleased(evt);
            }
        });

        purchaseButton.setText("Comprar");
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Borrar");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Limpiar");
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
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(itemsProveedores, 0, 287, Short.MAX_VALUE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
        					.addGap(0, 225, Short.MAX_VALUE))
        				.addComponent(addSuppButton, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(codeText, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(nameText, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jDateChooser1, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(sellText, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(brandText, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(purchaseButton, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(deleteButton, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
        				.addComponent(clearButton, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        					.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        						.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(costText))
        					.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        						.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(quantityText, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(24)
        			.addComponent(jLabel2)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(itemsProveedores, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        			.addGap(38)
        			.addComponent(addSuppButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(codeText, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
        			.addGap(29)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(nameText, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jDateChooser1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        			.addGap(28)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(quantityText, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(costText, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
        			.addGap(27)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(sellText, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
        			.addGap(26)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(brandText, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        				.addComponent(purchaseButton, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(clearButton)
        			.addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        purchaseTable.setModel(new javax.swing.table.DefaultTableModel(
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
        purchaseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(purchaseTable);

        refreshButton.setFont(new Font("Roboto Light", Font.PLAIN, 15)); // NOI18N
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

        jLabel10.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 519, Short.MAX_VALUE)
        					.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(searchText, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(refreshButton, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        				.addComponent(refreshButton)
        				.addComponent(searchText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel10))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        loadDataSet();
        loadComboBox();
        clearButtonActionPerformed(evt); 
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addSuppButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSuppButtonActionPerformed
        dashboard.addSuppPage();
    }//GEN-LAST:event_addSuppButtonActionPerformed

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        productDTO = new ProductDTO();
        if (codeText.getText().equals("") || jDateChooser1.getDate()==null
                || quantityText.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Por favor ingrese todos los detalles requeridos.");
        else {
            productDTO.setSuppCode(new ProductDAO().getSuppCode(itemsProveedores.getSelectedItem().toString()));
            productDTO.setProdCode(codeText.getText());
            try {
                ResultSet resultSet = new ProductDAO().getProdName(codeText.getText());
                if (resultSet.next()) {
                    //productDTO.setProdName(nameText.getText());
                    productDTO.setDate(jDateChooser1.getDate().toString());
                    productDTO.setQuantity(Integer.parseInt(quantityText.getText()));
                    //productDTO.setCostPrice(Double.parseDouble(costText.getText()));
                    //productDTO.setSellPrice(Double.parseDouble(sellText.getText()));
                    //productDTO.setBrand(brandText.getText());
                    Double costPrice = Double.parseDouble(costText.getText());
                    Double totalCost = costPrice * Integer.parseInt(quantityText.getText());
                    productDTO.setTotalCost(totalCost);

                    new ProductDAO().addPurchaseDAO(productDTO);
                    loadDataSet();
                } else
                    JOptionPane.showMessageDialog(null, "Esto parece ser un nuevo producto." +
                            " que aún no se ha añadido.\nPor favor agregue este producto en el \"Products\"  sección antes de continuar.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (purchaseTable.getSelectedRow()<0)
            JOptionPane.showMessageDialog(null, "Seleccione una transacción de la tabla.");
        else {
            int opt = JOptionPane.showConfirmDialog(
                    null,
                    "¿Seguro que quiere eliminar esta compra?",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION);
            if(opt==JOptionPane.YES_OPTION) {
                new ProductDAO().deletePurchaseDAO((int) purchaseTable.getValueAt(purchaseTable.getSelectedRow(),0));
                new ProductDAO().editPurchaseStock(prodCode, quantity);
                loadDataSet();
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        codeText.setText("");
        nameText.setText("");
        jDateChooser1.setDate(null);
        quantityText.setText("");
        costText.setText("");
        sellText.setText("");
        brandText.setText("");
        searchText.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
        loadSearchData(searchText.getText());
    }//GEN-LAST:event_searchTextKeyReleased

    private void purchaseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseTableMouseClicked
        int row = purchaseTable.getSelectedRow();
        int col = purchaseTable.getColumnCount();

        Object[] data = new Object[col];
        for (int i=0; i<col; i++)
            data[i] = purchaseTable.getValueAt(row, i);
        
        quantity = Integer.parseInt(data[3].toString());
        prodCode = data[1].toString();
    }//GEN-LAST:event_purchaseTableMouseClicked

    private void codeTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeTextKeyReleased
        try {
            ResultSet resultSet = new ProductDAO().getProdFromCode(codeText.getText());
            if (resultSet.next()) {
                nameText.setText(resultSet.getString("productname"));
                costText.setText(String.valueOf(resultSet.getDouble("costprice")));
                sellText.setText(String.valueOf(resultSet.getDouble("sellprice")));
                brandText.setText(resultSet.getString("brand"));
            } else {
                nameText.setText("");
                costText.setText("");
                sellText.setText("");
                brandText.setText("");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_codeTextKeyReleased

    // Metodo para cargar y actualizar el combo box que contiene los nombres de los proveedores
    public void loadComboBox() {
        try {
            SupplierDAO supplierDAO = new SupplierDAO();
            itemsProveedores.setModel(supplierDAO.setComboItems(supplierDAO.getQueryResult()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metodo para cargar datos en la tabla
    public void loadDataSet() {
        try {
            ProductDAO productDAO = new ProductDAO();
            purchaseTable.setModel(productDAO.buildTableModel(productDAO.getPurchaseInfo()));
            
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
            for (int columnIndex = 0; columnIndex < purchaseTable.getColumnCount(); columnIndex++) {
            	purchaseTable.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    // Metodo para mostrar el resultado de la busqueda en la tabla
    public void loadSearchData(String text) {
        try {
            ProductDAO productDAO = new ProductDAO();
            purchaseTable.setModel(productDAO.buildTableModel(productDAO.getPurchaseSearch(text)));
            
          
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

    // Declaracion de variables - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSuppButton;
    private javax.swing.JTextField brandText;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField codeText;
    private javax.swing.JTextField costText;
    private javax.swing.JButton deleteButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JTable purchaseTable;
    private javax.swing.JTextField quantityText;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField searchText;
    private javax.swing.JTextField sellText;
    private javax.swing.JComboBox<String> itemsProveedores;
    // Fin de declaracion de variables//GEN-END:variables
}
