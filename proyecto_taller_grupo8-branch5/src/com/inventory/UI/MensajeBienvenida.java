
package com.inventory.UI;

import com.inventory.DAO.UserDAO;
import com.inventory.DTO.UserDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class MensajeBienvenida extends javax.swing.JPanel {

    
    public MensajeBienvenida(String username) {
    	setBackground(Color.WHITE);
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

        welcomeLabel.setFont(new Font("Impact", Font.PLAIN, 46)); // NOI18N
        welcomeLabel.setText("Bienvenido");

        jLabel1.setFont(new Font("Impact", Font.PLAIN, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Gestione su inventario, transacciones y personal, todo en un solo lugar.<br><br>Clic en el men\u00FA para iniciar.<html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 548, GroupLayout.PREFERRED_SIZE)
        				.addComponent(welcomeLabel, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(12)
        			.addComponent(welcomeLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        			.addGap(31)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(146, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents


    // Declaracion de variables - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel welcomeLabel;
    // Fin de declaracion de variables//GEN-END:variables
}
