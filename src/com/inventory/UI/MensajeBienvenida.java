
package com.inventory.UI;

import com.inventory.DAO.UserDAO;
import com.inventory.DTO.UserDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MensajeBienvenida extends javax.swing.JPanel {

    
    public MensajeBienvenida(String username) {
    	setBackground(new Color(153, 179, 254));
        initComponents();
        UserDTO userDTO = new UserDTO();
        new UserDAO().getFullName(userDTO, username);
        welcomeLabel.setText("Bienvenido,  " + userDTO.getFullName() + ".");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        welcomeLabel.setForeground(new Color(0, 0, 0));
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(0, 0, 0));

        welcomeLabel.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        welcomeLabel.setText("Bienvenido");

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Gestione su inventario, transacciones y personal, todo en un solo lugar.<br><br>Clic en el men\u00FA para iniciar.<html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(54)
        			.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        			.addContainerGap(62, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(welcomeLabel, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(12)
        			.addComponent(welcomeLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(101, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents


    // Declaracion de variables - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel welcomeLabel;
    // Fin de declaracion de variables//GEN-END:variables
}
