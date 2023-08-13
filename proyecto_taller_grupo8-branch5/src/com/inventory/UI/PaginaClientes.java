
package com.inventory.UI;

import com.inventory.DAO.ClienteDAO;
import com.inventory.DTO.ClienteDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

import java.sql.SQLException;
import java.awt.Color;
import java.awt.Component;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;


public class PaginaClientes extends javax.swing.JPanel {

   
    public PaginaClientes() {
    	setForeground(new Color(0, 0, 0));
    	setBackground(Color.WHITE);
        initComponents();
        loadDataSet();
    }

      @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(0, 0, 0));
        jSeparator1 = new javax.swing.JSeparator();
        entryPanel = new javax.swing.JPanel();
        entryPanel.setFont(new Font("Roboto Light", Font.PLAIN, 11));
        entryPanel.setForeground(new Color(0, 0, 0));
        entryPanel.setBackground(Color.WHITE);
        codigoClienteEtiqueta = new javax.swing.JLabel();
        codigoClienteEtiqueta.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        codigoClienteEtiqueta.setForeground(new Color(0, 0, 0));
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
        telefonoText = new javax.swing.JTextField();
        telefonoText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
        telefonoText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        telefonoText.setForeground(new Color(0, 0, 0));
        telefonoText.setBackground(new Color(255, 255, 255));
        direccionText = new javax.swing.JTextField();
        direccionText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
        direccionText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        direccionText.setForeground(new Color(0, 0, 0));
        direccionText.setBackground(new Color(255, 255, 255));
        codigoClienteText = new javax.swing.JTextField();
        codigoClienteText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
        codigoClienteText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        codigoClienteText.setForeground(new Color(0, 0, 0));
        codigoClienteText.setBackground(new Color(255, 255, 255));
        nombreText = new javax.swing.JTextField();
        nombreText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
        nombreText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        nombreText.setForeground(new Color(0, 0, 0));
        nombreText.setBackground(new Color(255, 255, 255));
        creditoText = new javax.swing.JTextField();
        creditoText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
        creditoText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        creditoText.setForeground(new Color(0, 0, 0));
        creditoText.setBackground(new Color(255, 255, 255));
        debitoText = new javax.swing.JTextField();
        debitoText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.LIGHT_GRAY));
        debitoText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        debitoText.setForeground(new Color(0, 0, 0));
        debitoText.setBackground(new Color(255, 255, 255));
        
        btnAgregar = new javax.swing.JButton();
        btnAgregar.setBorderPainted(false);
        btnAgregar.setBorder(null);
        btnAgregar.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        btnAgregar.setForeground(new Color(255, 255, 255));
        btnAgregar.setBackground(new Color(80, 77, 166));
        
        btnEditar = new javax.swing.JButton();
        btnEditar.setBorderPainted(false);
        btnEditar.setBorder(null);
        btnEditar.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        btnEditar.setForeground(new Color(255, 255, 255));
        btnEditar.setBackground(new Color(80, 77, 166));
        btnBorrar = new javax.swing.JButton();
        btnBorrar.setBorderPainted(false);
        btnBorrar.setBorder(null);
        btnBorrar.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        btnBorrar.setBackground(new Color(80, 77, 166));
        btnBorrar.setForeground(new Color(255, 255, 255));
        btnLimpiar = new javax.swing.JButton();
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setBorder(null);
        btnLimpiar.setForeground(new Color(255, 255, 255));
        btnLimpiar.setBackground(new Color(80, 77, 166));
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

        entryPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Escriba los datos del cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

        codigoClienteEtiqueta.setText("Codigo cliente:");

        jLabel3.setText("Nombre completo:");

        jLabel4.setText("Dirección:");

        jLabel5.setText("Contacto:");

        jLabel6.setText("Importe débito:");

        jLabel7.setText("Importe crédito:");

        btnAgregar.setText("Agregar");
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new Font("Roboto Light", Font.PLAIN, 15)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
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
        										.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
        									.addPreferredGap(ComponentPlacement.RELATED))
        								.addGroup(entryPanelLayout.createSequentialGroup()
        									.addComponent(codigoClienteEtiqueta)
        									.addGap(41)))
        							.addGroup(entryPanelLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(nombreText, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        								.addComponent(direccionText, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        								.addComponent(telefonoText, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        								.addComponent(codigoClienteText, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        								.addComponent(debitoText, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        								.addComponent(creditoText, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)))
        						.addComponent(btnLimpiar, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)))
        				.addGroup(entryPanelLayout.createSequentialGroup()
        					.addGap(39)
        					.addComponent(btnAgregar, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnBorrar, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        entryPanelLayout.setVerticalGroup(
        	entryPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(entryPanelLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(entryPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(codigoClienteEtiqueta, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        				.addComponent(codigoClienteText, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
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
        					.addComponent(nombreText, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        					.addGap(36)
        					.addComponent(direccionText, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        					.addGap(35)
        					.addComponent(telefonoText, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        					.addGap(35)
        					.addComponent(debitoText, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
        			.addGap(33)
        			.addGroup(entryPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        				.addComponent(creditoText, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
        			.addGroup(entryPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnAgregar, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnEditar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnBorrar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
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
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (codigoClienteText.getText().equals("") || nombreText.getText().equals("")
                || direccionText.getText().equals("") || telefonoText.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Por favor ingrese todos los datos requeridos.");
        else {
            ClienteDTO clienteDTO = new ClienteDTO();
            clienteDTO.setCodigoCliente(codigoClienteText.getText());
            clienteDTO.setNombreCliente(nombreText.getText());
            clienteDTO.setUbicacion(direccionText.getText());
            clienteDTO.setTelefono(telefonoText.getText());
            new ClienteDAO().agregarClienteDAO(clienteDTO);
            loadDataSet();
        }
    }

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (custTable.getSelectedRow()<0)
            JOptionPane.showMessageDialog(this, "Seleccione un cliente de la tabla.");
        else {
            if (codigoClienteText.getText().equals("") || nombreText.getText().equals("")
                    || direccionText.getText().equals("") || telefonoText.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Por favor ingrese todos los detalles requeridos.");
            else {
                ClienteDTO customerDTO = new ClienteDTO();
                customerDTO.setCodigoCliente(codigoClienteText.getText());
                customerDTO.setNombreCliente(nombreText.getText());
                customerDTO.setUbicacion(direccionText.getText());
                customerDTO.setTelefono(telefonoText.getText());
                new ClienteDAO().editarClienteDAO(customerDTO);
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
                new ClienteDAO().eliminarClienteDAO(custTable.getValueAt(custTable.getSelectedRow(),0).toString());
                loadDataSet();
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        codigoClienteText.setText("");
        nombreText.setText("");
        direccionText.setText("");
        telefonoText.setText("");
        searchText.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void custTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custTableMouseClicked
        int row = custTable.getSelectedRow();
        int col = custTable.getColumnCount();
        Object[] data = new Object[col];

        for (int i=0; i<col; i++)
            data[i] = custTable.getValueAt(row, i);
        codigoClienteText.setText((String) data[0]);
        nombreText.setText((String) data[1]);
        direccionText.setText((String) data[2]);
        telefonoText.setText((String) data[3]);
    }//GEN-LAST:event_custTableMouseClicked

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
        loadSearchData(searchText.getText());
    }//GEN-LAST:event_searchTextKeyReleased

    public void loadDataSet() {
        try {
            ClienteDAO customerDAO = new ClienteDAO();
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
            ClienteDAO customerDAO = new ClienteDAO();
            custTable.setModel(customerDAO.buildTableModel(customerDAO.buscarCliente(text)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Declaracion de variables - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField codigoClienteText;
    private javax.swing.JTextField creditoText;
    private javax.swing.JTable custTable;
    private javax.swing.JTextField debitoText;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JPanel entryPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel codigoClienteEtiqueta;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField direccionText;
    private javax.swing.JTextField nombreText;
    private javax.swing.JTextField telefonoText;
    private javax.swing.JTextField searchText;
    // Fin de declaracion de variables//GEN-END:variables
}
