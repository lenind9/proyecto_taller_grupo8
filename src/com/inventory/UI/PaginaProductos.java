
package com.inventory.UI;

import com.inventory.DAO.ProductDAO;
import com.inventory.DAO.SupplierDAO;
import com.inventory.DTO.ProductDTO;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.border.MatteBorder;

import java.sql.SQLException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.table.DefaultTableCellRenderer;


public class PaginaProductos extends javax.swing.JPanel {
	  ProductDTO productDTO;
	    String username = null;
	    String supplier = null;
	    int userID;
	    Dashboard dashboard;
	    
	    
	    public PaginaProductos() {
	    }
	    
	    public PaginaProductos(String username, Dashboard dashboard){
	        initComponents();
	        this.username = username;
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
	    private void initComponents() {

	    	//ETIQUETAS
	    	labelProductos = new javax.swing.JLabel();
	        labelProductos.setBackground(new java.awt.Color(80, 77, 166));
	        labelProductos.setFont(new java.awt.Font("Impact", 0, 24));
	        labelProductos.setText("PRODUCTOS");
	        labelProductos.setForeground(new java.awt.Color(0, 0, 0));
	        
	    	labelBuscar = new javax.swing.JLabel();
		    labelBuscar.setForeground(new Color(0,0,0));
		    labelBuscar.setText("Buscar:");
		    labelBuscar.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        
	        LabelCodigoProducto = new javax.swing.JLabel();
	        LabelCodigoProducto.setText("Código producto:");
	        LabelCodigoProducto.setForeground(new Color(0, 0, 0));
	        LabelCodigoProducto.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        
	        labelNomProducto = new javax.swing.JLabel();
	        labelNomProducto.setText("Nombre Producto:");
	        labelNomProducto.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        labelNomProducto.setForeground(new Color(0, 0, 0));
	        
	        labelFecha = new javax.swing.JLabel();
	        labelFecha.setText("Fecha:");
	        labelFecha.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        labelFecha.setForeground(new Color(0, 0, 0));
	        
	        labelCantidad = new javax.swing.JLabel();
	        labelCantidad.setText("Cantidad:");
	        labelCantidad.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        labelCantidad.setToolTipText("");
	        labelCantidad.setForeground(new Color(0, 0, 0));
	        
	        labelPrecio = new javax.swing.JLabel();
	        labelPrecio.setText("Precio Costo:");
	        labelPrecio.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        labelPrecio.setForeground(new Color(0, 0, 0));
	        
	        labelPrecioVenta = new javax.swing.JLabel();
	        labelPrecioVenta.setText("Precio Venta:");
	        labelPrecioVenta.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        labelPrecioVenta.setForeground(new Color(0, 0, 0));
	        
	        labelMarca = new javax.swing.JLabel();
	        labelMarca.setText("Marca:");
	        labelMarca.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        labelMarca.setForeground(new Color(0, 0, 0));
	        
	        
	        //campos de texto a llenar
	   
	        buscarText = new javax.swing.JTextField();
	        buscarText.setBackground(new Color(255,255,255));
	        buscarText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        buscarText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
	        buscarText.setForeground(new Color(0,0,0));
	        
	        codigoText = new javax.swing.JTextField();
	        codigoText.setBackground(new Color(255,255,255));
	        codigoText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        codigoText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
	        codigoText.setForeground(new Color(0,0,0));
	        
	        nombreProductoText = new javax.swing.JTextField();
	        nombreProductoText.setBackground(new Color(255,255,255));
	        nombreProductoText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        nombreProductoText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
	        nombreProductoText.setForeground(new Color(0,0,0));
	        
	        cantidadText = new javax.swing.JTextField();
	        cantidadText.setBackground(new Color(255,255,255));
	        cantidadText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        cantidadText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
	        cantidadText.setForeground(new Color(0,0,0));
	        
	        costoText = new javax.swing.JTextField();
	        costoText.setBackground(new Color(255,255,255));
	        costoText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        costoText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
	        costoText.setForeground(new Color(0,0,0));
	        
	        precioVentaText = new javax.swing.JTextField();
	        precioVentaText.setBackground(new Color(255,255,255));
	        precioVentaText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        precioVentaText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
	        precioVentaText.setForeground(new Color(0,0,0));
	        
	        marcaText = new javax.swing.JTextField();
	        marcaText.setBackground(new Color(255,255,255));
	        marcaText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
	        marcaText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        marcaText.setForeground(new Color(0,0,0));
	        
	        
	        //BOTONES
	        
	        //boton añadir un nuevo proveedor
	        btnAniadirProveedor = new javax.swing.JButton();
	        btnAniadirProveedor.setForeground(new Color(255,255,255));
	        btnAniadirProveedor.setBackground(new Color(80, 77, 166));
	        btnAniadirProveedor.setText("Click para añadir un nuevo proveedor");
	        btnAniadirProveedor.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        btnAniadirProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        btnAniadirProveedor.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                addSuppButtonActionPerformed(evt);
	            }
	        });
	        
	        btnAniadir = new javax.swing.JButton();
	        btnEditar = new javax.swing.JButton();
	        btnEliminar = new javax.swing.JButton();
	        btnLimpiar = new javax.swing.JButton();
	        btnRefrescar = new javax.swing.JButton();
	        
	        jSeparator1 = new javax.swing.JSeparator();
	        entryPanel = new javax.swing.JPanel();
	        
	      //seleccionador de proveedores
	        itemsProveedores = new javax.swing.JComboBox<>();
	        itemsProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un proveedor" }));
	        itemsProveedores.setToolTipText("Seleccione un proveedor");
	        itemsProveedores.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        itemsProveedores.setForeground(new Color(255,255,255));
	        itemsProveedores.setBackground(Color.WHITE);
	        itemsProveedores.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                suppComboActionPerformed(evt);
	            }
	        });
	     
	        //text field FECHA
	        jDateChooser1 = new JDateChooser();
	        jDateChooser1.setBackground(new Color(255, 255, 255));

	        jScrollPane1 = new javax.swing.JScrollPane();
	        tablaProductos = new javax.swing.JTable();
	        tablaProductos.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        tablaProductos.setRowHeight(40);
	        setBackground(Color.WHITE);

	        
	        entryPanel.setBackground(new java.awt.Color(255,255,255));
	        entryPanel.setForeground(new Color (0,0,0));
	        entryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese los detalles del producto"));

	      
	        btnAniadir.setBackground(new java.awt.Color(80, 77, 166));
	        btnAniadir.setForeground(new java.awt.Color(255, 255, 255));
	        btnAniadir.setText("Añadir");
	        btnAniadir.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        btnAniadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        btnAniadir.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnAniadirActionPerformed(evt);
	            }
	        });

	        btnEditar.setBackground(new java.awt.Color(80, 77, 166));
	        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
	        btnEditar.setText("Editar");
	        btnEditar.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        btnEditar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                editButtonActionPerformed(evt);
	            }
	        });

	        btnEliminar.setBackground(new java.awt.Color(80, 77, 166));
	        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
	        btnEliminar.setText("Borrar");
	        btnEliminar.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnBorrarActionPerformed(evt);
	            }
	        });

	        btnLimpiar.setBackground(new java.awt.Color(80, 77, 166));
	        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
	        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
	        btnLimpiar.setText("Limpiar");
	        btnLimpiar.setFont(new Font("Roboto Light", Font.PLAIN, 15));
	        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnLimpiarActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout entryPanelLayout = new javax.swing.GroupLayout(entryPanel);
	        entryPanel.setLayout(entryPanelLayout);
	        entryPanelLayout.setHorizontalGroup(
	            entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(entryPanelLayout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(itemsProveedores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(btnAniadirProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addGroup(entryPanelLayout.createSequentialGroup()
	                        .addComponent(LabelCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(codigoText))
	                    .addGroup(entryPanelLayout.createSequentialGroup()
	                        .addComponent(labelNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(nombreProductoText))
	                    .addGroup(entryPanelLayout.createSequentialGroup()
	                        .addComponent(labelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(marcaText))
	                    .addGroup(entryPanelLayout.createSequentialGroup()
	                        .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                    .addGroup(entryPanelLayout.createSequentialGroup()
	                        .addComponent(labelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(cantidadText))
	                    .addGroup(entryPanelLayout.createSequentialGroup()
	                        .addComponent(labelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(costoText))
	                    .addGroup(entryPanelLayout.createSequentialGroup()
	                        .addComponent(labelPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(precioVentaText))
	                    .addGroup(entryPanelLayout.createSequentialGroup()
	                        .addComponent(btnAniadir)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
	                .addContainerGap())
	        );
	        entryPanelLayout.setVerticalGroup(
	            entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(entryPanelLayout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(itemsProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(btnAniadirProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(LabelCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(codigoText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(labelNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(nombreProductoText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
	                    .addComponent(labelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(labelCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(labelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(costoText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(labelPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(precioVentaText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(labelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(marcaText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(btnAniadir)
	                    .addComponent(btnEditar)
	                    .addComponent(btnEliminar))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(btnLimpiar)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

	        tablaProductos.setBackground(new java.awt.Color(255,255,255));
	        tablaProductos.setForeground(new java.awt.Color(0,0,0 ));
	        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
	        tablaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
	        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                productTableMouseClicked(evt);
	            }
	        });
	        jScrollPane1.setViewportView(tablaProductos);

	        
	        buscarText.addKeyListener(new java.awt.event.KeyAdapter() {
	            public void keyReleased(java.awt.event.KeyEvent evt) {
	                searchTextKeyReleased(evt);
	            }
	        });
	        
	        btnRefrescar.setBackground(new java.awt.Color(80, 77, 166));
	        //btnRefrescar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
	        btnRefrescar.setForeground(new java.awt.Color(255, 255, 255));
	        btnRefrescar.setText("Refrescar");
	        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                btnRefrescarActionPerformed(evt);
	            }
	        });

	       

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	        this.setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(labelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addComponent(labelBuscar)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(buscarText, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(btnRefrescar))
	                    .addComponent(jSeparator1)
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(entryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addComponent(labelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(buscarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(labelBuscar))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
	                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(entryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
	                .addGap(64, 64, 64))
	        );
	    }// </editor-fold>                        

	    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
	        if (tablaProductos.getSelectedRow()<0)
	            JOptionPane.showMessageDialog(null, "Seleccione el producto de la tabla.");
	        else{
	            productDTO = new ProductDTO();
	            if (nombreProductoText.getText().equals("") || costoText.getText().equals("")
	                    || precioVentaText.getText().equals("") || marcaText.getText().equals(""))
	                JOptionPane.showMessageDialog(null, "Por favor ingrese todos los detalles requeridos.");
	            else {
	                productDTO.setProdCode(codigoText.getText());
	                productDTO.setProdName(nombreProductoText.getText());
	                productDTO.setDate(jDateChooser1.getDateFormatString());
	                productDTO.setQuantity(Integer.parseInt(cantidadText.getText()));
	                productDTO.setCostPrice(Double.parseDouble(costoText.getText()));
	                productDTO.setSellPrice(Double.parseDouble(precioVentaText.getText()));
	                productDTO.setBrand(marcaText.getText());
	                productDTO.setUserID(userID);

	                new ProductDAO().editProdDAO(productDTO);
	            }
	            loadDataSet();
	        }
	    }                                          

	    private void btnAniadirActionPerformed(java.awt.event.ActionEvent evt) {                                          
	        productDTO = new ProductDTO();
	        if (nombreProductoText.getText().equals("") || costoText.getText().equals("")
	                || precioVentaText.getText().equals("") || marcaText.getText().equals(""))
	            JOptionPane.showMessageDialog(null, "Por favor ingrese todos los detalles requeridos.");
	        else {
	            productDTO.setProdCode(codigoText.getText());
	            productDTO.setProdName(nombreProductoText.getText());
	            productDTO.setDate(jDateChooser1.getDateFormatString());
	            productDTO.setQuantity(Integer.parseInt(cantidadText.getText()));
	            productDTO.setCostPrice(Double.parseDouble(costoText.getText()));
	            productDTO.setSellPrice(Double.parseDouble(precioVentaText.getText()));
	            productDTO.setBrand(marcaText.getText());
	            productDTO.setUserID(userID);

	            new ProductDAO().addProductDAO(productDTO);
	            loadDataSet();
	        }
	    }                                         

	    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                             
	        if (tablaProductos.getSelectedRow()<0)
	            JOptionPane.showMessageDialog(null, "Seleccione el producto de la tabla.");
	        else {
	            int opt = JOptionPane.showConfirmDialog(
	                    null,
	                    "¿Está seguro de que desea eliminar este producto?",
	                    "Confirmation",
	                    JOptionPane.YES_NO_OPTION);
	            if(opt==JOptionPane.YES_OPTION) {
	                new ProductDAO().deleteProductDAO(
	                        (String) tablaProductos.getValueAt(
	                                tablaProductos.getSelectedRow(),0));
	                loadDataSet();
	            }
	        }
	    }                                            

	    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                            
	        codigoText.setText("");
	        nombreProductoText.setText("");
	        jDateChooser1.setDate(null);
	        cantidadText.setText("");
	        costoText.setText("");
	        precioVentaText.setText("");
	        marcaText.setText("");
	        buscarText.setText("");
	    }                                           

	    //static String productName;
	    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {                                          
	        int row = tablaProductos.getSelectedRow();
	        int col = tablaProductos.getColumnCount();

	        Object[] data = new Object[col];
	        for (int i=0; i<col; i++)
	            data[i] = tablaProductos.getValueAt(row, i);

	        codigoText.setText(data[0].toString());
	        nombreProductoText.setText(data[1].toString());
	        costoText.setText(data[2].toString());
	        precioVentaText.setText(data[3].toString());
	        marcaText.setText(data[4].toString());

	       // productName = data[1].toString();

	    }                                         

	    private void addSuppButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        dashboard.addSuppPage();
	    }                                             

	    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        loadDataSet();
	        loadComboBox();
	        btnLimpiarActionPerformed(evt);  
	    }                                             

	    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {                                       
	        loadSearchData(buscarText.getText());
	    }                                      

	    private void suppComboActionPerformed(java.awt.event.ActionEvent evt) {                                          
	        // TODO add your handling code here:
	    }                                         

	    // Método para actualizar el cuadro combinado que contiene los nombres de los proveedores
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
	            tablaProductos.setModel(productDAO.buildTableModel(productDAO.getQueryResult()));
	            
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
	            for (int columnIndex = 0; columnIndex < tablaProductos.getColumnCount(); columnIndex++) {
	            	tablaProductos.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
	            }
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	    }

	    // Metodo para mostrar el resultado de la busqueda en la tabla
	    public void loadSearchData(String text) {
	        try {
	            ProductDAO productDAO = new ProductDAO();
	            tablaProductos.setModel(productDAO.buildTableModel(productDAO.getProductSearch(text)));

	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	    }

	    
	    //etiquetas de texto
	    private javax.swing.JLabel labelProductos;
	    private javax.swing.JLabel LabelCodigoProducto;
	    private javax.swing.JLabel labelNomProducto;
	    private javax.swing.JLabel labelFecha;
	    private javax.swing.JLabel labelCantidad;
	    private javax.swing.JLabel labelPrecio;
	    private javax.swing.JLabel labelPrecioVenta;
	    private javax.swing.JLabel labelMarca;
	    private javax.swing.JLabel labelBuscar;
	    
	    //botones
	    private javax.swing.JButton btnAniadir;
	    private javax.swing.JButton btnAniadirProveedor;
	    private javax.swing.JButton btnEliminar;
	    private javax.swing.JButton btnEditar;
	    private javax.swing.JButton btnLimpiar;
	    private javax.swing.JButton btnRefrescar;
	    
	    //campos de texto a llenar
	    private javax.swing.JTextField marcaText;
	    private javax.swing.JTextField codigoText;
	    private javax.swing.JTextField costoText;
	    private javax.swing.JTextField nombreProductoText;
	    private javax.swing.JTextField cantidadText;
	    private javax.swing.JTextField buscarText;
	    private javax.swing.JTextField precioVentaText;
	   
	    private javax.swing.JPanel entryPanel;
	    private com.toedter.calendar.JDateChooser jDateChooser1;//texto para llenar la fecha
	   
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JSeparator jSeparator1;
	  
	    private javax.swing.JTable tablaProductos;
	    private javax.swing.JComboBox<String> itemsProveedores;                       
}
