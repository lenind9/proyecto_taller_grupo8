
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
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;


public class PaginaUsuarios extends javax.swing.JPanel {

    public PaginaUsuarios() {
    	setBackground(Color.WHITE);
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
            c.setBackground(new Color(80, 77, 166));  // Cambia el color de fondo
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
        entryPanel.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        entryPanel.setForeground(new Color(0, 0, 0));
        entryPanel.setBackground(Color.WHITE);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        jLabel2.setForeground(new Color(0, 0, 0));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        jLabel3.setForeground(new Color(0, 0, 0));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        jLabel4.setForeground(new Color(0, 0, 0));
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        jLabel5.setForeground(new Color(0, 0, 0));
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        jLabel6.setForeground(new Color(0, 0, 0));
        nameText = new javax.swing.JTextField();
        nameText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        nameText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        nameText.setForeground(new Color(0, 0, 0));
        nameText.setBackground(new Color(255, 255, 255));
        locationText = new javax.swing.JTextField();
        locationText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        locationText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        locationText.setForeground(new Color(0, 0, 0));
        locationText.setBackground(new Color(255, 255, 255));
        phoneText = new javax.swing.JTextField();
        phoneText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        phoneText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        phoneText.setForeground(new Color(0, 0, 0));
        phoneText.setBackground(new Color(255, 255, 255));
        usernameText = new javax.swing.JTextField();
        usernameText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        usernameText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        usernameText.setForeground(new Color(0, 0, 0));
        usernameText.setBackground(new Color(255, 255, 255));
        passText = new javax.swing.JPasswordField();
        passText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        passText.setForeground(new Color(0, 0, 0));
        passText.setBackground(new Color(255, 255, 255));
        
        tipoUsuario = new javax.swing.JComboBox<>();
        tipoUsuario.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        tipoUsuario.setBackground(new Color(80, 77, 166));
        tipoUsuario.setForeground(new Color(255, 255, 255));
        tipoUsuario.setBounds(getVisibleRect());
        
        addButton = new javax.swing.JButton();
        addButton.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        addButton.setBackground(new Color(80, 77, 166));
        addButton.setForeground(new Color(255, 255, 255));
        
        deleteButton = new javax.swing.JButton();
        deleteButton.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        deleteButton.setForeground(new Color(255, 255, 255));
        deleteButton.setBackground(new Color(80, 77, 166));
        
        clearButton = new javax.swing.JButton();
        clearButton.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        clearButton.setForeground(new Color(255, 255, 255));
        clearButton.setBackground(new Color(80, 77, 166));
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        tablaUsuarios = new javax.swing.JTable();
        tablaUsuarios.setAutoCreateRowSorter(true);
        tablaUsuarios.setRowHeight(40);
        tablaUsuarios.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        tablaUsuarios.setBackground(Color.WHITE);//azul

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("USUARIOS");

        entryPanel.setBorder(new TitledBorder(null, "Ingrese los detalles del usuario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Ubicación:");

        jLabel4.setText("Contacto:");

        jLabel5.setText("Usuario:");

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
        entryPanelLayout.setHorizontalGroup(
        	entryPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(entryPanelLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(entryPanelLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(tipoUsuario, 0, 322, Short.MAX_VALUE)
        				.addGroup(entryPanelLayout.createSequentialGroup()
        					.addGroup(entryPanelLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        						.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
        						.addComponent(jLabel5, 0, 0, Short.MAX_VALUE)
        						.addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(passText, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
        				.addGroup(Alignment.TRAILING, entryPanelLayout.createSequentialGroup()
        					.addComponent(jLabel2, 0, 0, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(entryPanelLayout.createParallelGroup(Alignment.LEADING)
        						.addGroup(entryPanelLayout.createParallelGroup(Alignment.TRAILING, false)
        							.addComponent(usernameText, Alignment.LEADING)
        							.addComponent(phoneText, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        						.addGroup(entryPanelLayout.createParallelGroup(Alignment.TRAILING, false)
        							.addComponent(nameText, Alignment.LEADING)
        							.addComponent(locationText, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))))
        				.addGroup(entryPanelLayout.createSequentialGroup()
        					.addComponent(addButton)
        					.addGap(28)
        					.addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
        					.addComponent(clearButton, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
        			.addGap(10))
        );
        entryPanelLayout.setVerticalGroup(
        	entryPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(entryPanelLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(entryPanelLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(nameText, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        			.addGap(33)
        			.addGroup(entryPanelLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(locationText, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
        			.addGap(28)
        			.addGroup(entryPanelLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(phoneText, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
        			.addGap(31)
        			.addGroup(entryPanelLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(usernameText, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(entryPanelLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(passText, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
        			.addGap(30)
        			.addComponent(tipoUsuario, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(entryPanelLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(addButton)
        				.addComponent(clearButton)
        				.addComponent(deleteButton))
        			.addContainerGap(54, Short.MAX_VALUE))
        );
        entryPanel.setLayout(entryPanelLayout);

       // tablaUsuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaUsuarios.setForeground(Color.BLACK);
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
        tablaUsuarios.setShowGrid(false);
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
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap(10, Short.MAX_VALUE)
        					.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(entryPanel, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel1)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(4)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(41)
        					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(entryPanel, GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        					.addContainerGap())))
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
