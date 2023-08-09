
package com.inventory.UI;

import com.inventory.DAO.UserDAO;
import com.inventory.DTO.UserDTO;

import javax.swing.*;
import java.sql.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableCellRenderer;

import java.awt.Color;
import java.awt.Component;


public class PaginaUsuarios extends javax.swing.JPanel {

    public PaginaUsuarios() {
    	setBackground(new Color(153,179,254));
        initComponents();
        loadDataSet();
        tipoUsuario.setRenderer(new CustomComboBoxRenderer());
    }

 // Clase interna para personalizar el renderizado de los elementos en el JComboBox
    private static class CustomComboBoxRenderer extends DefaultListCellRenderer {
        // Personaliza la apariencia de cada elemento en el combo
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            c.setForeground(Color.white);  // Cambia el color de la fuente
            c.setBackground(new Color(0, 0, 96));  // Cambia el color de fondo
            return c;
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(0, 0, 0));
        jLabel1.setBackground(new Color(147, 201, 255));
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator1.setForeground(new Color(0, 0, 0));
        jSeparator1.setBackground(new Color(255, 255, 255));
        entryPanel = new javax.swing.JPanel();
        entryPanel.setForeground(new Color(0, 0, 0));
        entryPanel.setBackground(new Color(153, 179, 254));
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
        nameText = new javax.swing.JTextField();
        nameText.setForeground(new Color(0, 0, 0));
        nameText.setBackground(new Color(255, 255, 255));
        locationText = new javax.swing.JTextField();
        locationText.setForeground(new Color(0, 0, 0));
        locationText.setBackground(new Color(255, 255, 255));
        phoneText = new javax.swing.JTextField();
        phoneText.setForeground(new Color(0, 0, 0));
        phoneText.setBackground(new Color(255, 255, 255));
        usernameText = new javax.swing.JTextField();
        usernameText.setForeground(new Color(0, 0, 0));
        usernameText.setBackground(new Color(255, 255, 255));
        passText = new javax.swing.JPasswordField();
        passText.setForeground(new Color(0, 0, 0));
        passText.setBackground(new Color(255, 255, 255));
        
        tipoUsuario = new javax.swing.JComboBox<>();
        tipoUsuario.setBackground(new Color(0, 0, 96));
        tipoUsuario.setForeground(new Color(255, 255, 255));
        tipoUsuario.setBounds(getVisibleRect());
        
        addButton = new javax.swing.JButton();
        addButton.setBackground(new Color(0, 0, 96));
        addButton.setForeground(new Color(255, 255, 255));
        
        deleteButton = new javax.swing.JButton();
        deleteButton.setForeground(new Color(255, 255, 255));
        deleteButton.setBackground(new Color(0, 0, 96));
        
        clearButton = new javax.swing.JButton();
        clearButton.setForeground(new Color(255, 255, 255));
        clearButton.setBackground(new Color(0, 0, 96));
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        tablaUsuarios.setBackground(new Color(0, 0, 96));//azul

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("USUARIOS");

        entryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter User Details"));

        jLabel2.setText("Nombre completo:");

        jLabel3.setText("Ubicación:");

        jLabel4.setText("Contacto:");

        jLabel5.setText("Nombre usuario:");

        jLabel6.setText("Constraseña:");

        tipoUsuario.setModel(new DefaultComboBoxModel(new String[] {"ADMINISTRADOR", "EMPLEADO"}));

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

        clearButton.setText("Limpiar");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout entryPanelLayout = new javax.swing.GroupLayout(entryPanel);
        entryPanel.setLayout(entryPanelLayout);
        entryPanelLayout.setHorizontalGroup(
            entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(entryPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameText))
                    .addGroup(entryPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(locationText))
                    .addGroup(entryPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneText))
                    .addGroup(entryPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passText))
                    .addGroup(entryPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameText)))
                .addContainerGap())
            .addGroup(entryPanelLayout.createSequentialGroup()
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        entryPanelLayout.setVerticalGroup(
            entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(entryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(deleteButton)
                    .addComponent(clearButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

       // tablaUsuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaUsuarios.setForeground(new Color(255, 255, 255));
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaUsuarios.setName("Users"); // NOI18N
        tablaUsuarios.setShowGrid(true);
        tablaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jSeparator1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(entryPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jLabel1))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(46)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(entryPanel, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        			.addGap(95))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        nameText.setText("");
        locationText.setText("");
        phoneText.setText("");
        usernameText.setText("");
        passText.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    String userType;
    
    //BOTON AGREGAR
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        UserDTO userDTO = new UserDTO();

        if (nameText.getText().equals("") || locationText.getText().equals("") || phoneText.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos requeridos.");
        else {
            userType = (String) tipoUsuario.getSelectedItem();
            userDTO.setFullName(nameText.getText());
            userDTO.setLocation(locationText.getText());
            userDTO.setPhone(phoneText.getText());
            userDTO.setUsername(usernameText.getText());
            userDTO.setPassword(passText.getText());
            userDTO.setUserType(userType);
            new UserDAO().addUserDAO(userDTO, userType);
            loadDataSet();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    //BOTON BORRAR
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (tablaUsuarios.getSelectedRow()<0)
            JOptionPane.showMessageDialog(null, "Por favor seleccione una entrada de la tabla");
        else{
            int opt = JOptionPane.showConfirmDialog(
                    null,
                    "¿Está seguro de eliminar este usuario?",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION);
            if(opt==JOptionPane.YES_OPTION) {
                new UserDAO().deleteUserDAO(
                        String.valueOf(
                                tablaUsuarios.getValueAt
                                        (tablaUsuarios.getSelectedRow(), 4)));
                loadDataSet();
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    String username;
    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        int row = tablaUsuarios.getSelectedRow();
        int col = tablaUsuarios.getColumnCount();
        Object[] val = new Object[col];

        for(int i=0; i<col; i++) {
            val[i] = tablaUsuarios.getValueAt(row, i);
        }
        nameText.setText(val[1].toString());
        locationText.setText(val[2].toString());
        phoneText.setText(val[3].toString());
        usernameText.setText(val[4].toString());
        tipoUsuario.setSelectedItem(val[6].toString());
    }//GEN-LAST:event_userTableMouseClicked

    public void loadDataSet() {
        try {
        	UserDAO userDAO = new UserDAO();
            tablaUsuarios.setModel(userDAO.buildTableModel(userDAO.getQueryResult()));
            
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
            for (int columnIndex = 0; columnIndex < tablaUsuarios.getColumnCount(); columnIndex++) {
            	tablaUsuarios.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Declaracion de variables - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel entryPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField locationText;
    private javax.swing.JTextField nameText;
    private javax.swing.JPasswordField passText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JComboBox<String> tipoUsuario;
    private javax.swing.JTextField usernameText;
    // Fin de declaracion de variables//GEN-END:variables
}
