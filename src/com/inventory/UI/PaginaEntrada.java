
package com.inventory.UI;


import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme;
import com.inventory.DTO.UserDTO;
import com.inventory.Database.ConnectionFactory;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Font;
import java.awt.Image;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.Canvas;
import java.awt.Insets;
import java.awt.ComponentOrientation;

public class PaginaEntrada extends javax.swing.JFrame {

    UserDTO userDTO;
    LocalDateTime inTime;

    // Constructor
    public PaginaEntrada() {
    	setPreferredSize(new Dimension(1000, 800));
    	setIgnoreRepaint(true);
    	getContentPane().setMaximumSize(new Dimension(800, 600));
    	getContentPane().setMinimumSize(new Dimension(800, 600));
    	setLocationByPlatform(true);
    	setFont(new Font("Roboto Thin", Font.PLAIN, 19));
    	setIconImage(Toolkit.getDefaultToolkit().getImage(PaginaEntrada.class.getResource("/com/inventory/UI/Icons/logomin.png")));
    	getContentPane().setBackground(new Color(153,179,254));
        initComponents();
        userDTO = new UserDTO();
        rolUsuario.setRenderer(new CustomComboBoxRenderer());
    }

 // Clase interna para personalizar el renderizado de los elementos en el JComboBox
    private static class CustomComboBoxRenderer extends DefaultListCellRenderer {
        // Personaliza la apariencia de cada elemento en el combo
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            c.setForeground(Color.white);  // Cambia el color de la fuente
            c.setBackground(new Color(138, 204, 204));  // Cambia el color de fondo
            return c;
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setAutoscrolls(true);
        jLabel1.setForeground(Color.BLACK);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setAutoscrolls(true);
        jLabel2.setForeground(Color.BLACK);
        userText = new javax.swing.JTextField();
        userText.setHorizontalAlignment(SwingConstants.CENTER);
        userText.setMargin(new Insets(2, 2, 0, 2));
        userText.setFont(new Font("Roboto Light", Font.PLAIN, 25));
        userText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        userText.setForeground(new Color(0, 0, 0));
        userText.setBackground(new Color(153,179,254));
        passText = new javax.swing.JPasswordField();
        passText.setHorizontalAlignment(SwingConstants.CENTER);
        passText.setMargin(new Insets(1, 1, 0, 1));
        passText.setFont(new Font("Roboto Light", Font.PLAIN, 25));
        passText.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.GRAY));
        passText.setForeground(new Color(0, 0, 0));
        passText.setBackground(new Color(153,179,254));
        rolUsuario = new javax.swing.JComboBox<>();
        rolUsuario.setAutoscrolls(true);
        rolUsuario.setBorder(null);
        rolUsuario.setForeground(Color.BLACK);
        rolUsuario.setBackground(new Color(138, 204, 204));
        loginButton = new javax.swing.JButton();
        loginButton.setBorder(null);
        loginButton.setBackground(new Color(138, 204, 204));
        loginButton.setForeground(Color.BLACK);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(153,179,254));
        setBounds(new java.awt.Rectangle(500, 100, 0, 0));
        setName("loginFrame"); // NOI18N

        jLabel1.setFont(new Font("Roboto Light", Font.BOLD, 20)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new Font("Roboto Light", Font.BOLD, 20)); // NOI18N
        jLabel2.setText("Contrase\u00F1a:");

        passText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTextActionPerformed(evt);
            }
        });

        rolUsuario.setModel(new DefaultComboBoxModel(new String[] {"ADMINISTRADOR", "EMPLEADO"}));

        loginButton.setText("ENTRAR");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        
        ImageIcon originalImage = new ImageIcon(PaginaEntrada.class.getResource("/com/inventory/UI/Icons/logomin.png"));
        Integer alt = originalImage.getIconHeight();
        Integer anch = originalImage.getIconWidth();
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setIcon(new ImageIcon(PaginaEntrada.class.getResource("/com/inventory/UI/Icons/logomin.png")));
        //lblNewLabel.setPreferredSize(new Dimension(200,));
        
        
        
        
        
        
    
        
        
        
       
        
        
        
      
       
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(26)
        					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 932, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(419)
        					.addComponent(rolUsuario, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(246)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
        					.addGap(4)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(passText)
        						.addComponent(userText, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(388)
        					.addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(userText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(38)
        							.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(52)
        							.addComponent(passText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGap(18)
        					.addComponent(rolUsuario, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
        			.addGap(36)
        			.addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        			.addGap(154))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private String encryptPass(String pass){
        String encPass = null;
        if(pass == null) return null;
        
        try{
            MessageDigest mDigest = MessageDigest.getInstance("MD5");
            mDigest.update(pass.getBytes(), 0, pass.length());
            encPass = new BigInteger(1, mDigest.digest()).toString(16);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        
        return encPass;
    }
    
    String tipoUsuario;
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String usuario = userText.getText();
        String clave = passText.getText();
        //TODO Password encryption to be added later:
        //String password = encryptPass(pass);
        tipoUsuario = (String)rolUsuario.getSelectedItem();

        if (new ConnectionFactory().checkLogin(usuario, clave, tipoUsuario)){
            inTime = LocalDateTime.now();
            userDTO.setInTime(String.valueOf(inTime));
            dispose();
            new Dashboard(usuario, tipoUsuario, userDTO);
        } else {
           JOptionPane.showMessageDialog(
                   null,
                   "usuario o clave invÃ¡lida.");
        }
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTextActionPerformed
        // TODO add your handling code here:
        loginButtonActionPerformed(evt);
    }//GEN-LAST:event_passTextActionPerformed

    
    // Metodo del controlador
    // **AQUÃ� SE COMIENZA A EJECUTAR LA APP**
    public static void main(String[] args) {
        // Configuracion del tema de la interfaz de usuario y LookAndFeel de la app
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatMaterialDarkerIJTheme());
            } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(PaginaEntrada.class.getName()).log(Level.SEVERE, null, ex);
        } 
       
        /* Crear y mostrar el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaEntrada().setVisible(true);
            }
        });
    }
    private javax.swing.JComboBox<String> rolUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passText;
    private javax.swing.JTextField userText;
	public Color getJLabel1Background() {
		return jLabel1.getBackground();
	}
	public void setJLabel1Background(Color background) {
		jLabel1.setBackground(background);
	}
}
