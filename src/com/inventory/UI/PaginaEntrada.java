
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

public class PaginaEntrada extends javax.swing.JFrame {

    UserDTO userDTO;
    LocalDateTime inTime;

    // Constructor
    public PaginaEntrada() {
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
            c.setBackground(new Color(0, 0, 96));  // Cambia el color de fondo
            return c;
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(0, 0, 0));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(new Color(0, 0, 0));
        userText = new javax.swing.JTextField();
        userText.setForeground(new Color(0, 0, 0));
        userText.setBackground(new Color(255, 255, 255));
        passText = new javax.swing.JPasswordField();
        passText.setForeground(new Color(0, 0, 0));
        passText.setBackground(new Color(255, 255, 255));
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setForeground(new Color(255, 255, 255));
        rolUsuario = new javax.swing.JComboBox<>();
        rolUsuario.setForeground(new Color(255, 255, 255));
        rolUsuario.setBackground(new Color(0, 0, 96));
        loginButton = new javax.swing.JButton();
        loginButton.setBackground(new Color(0, 0, 96));
        loginButton.setForeground(new Color(255, 255, 255));
        clearButton = new javax.swing.JButton();
        clearButton.setBackground(new Color(0, 0, 96));
        clearButton.setForeground(new Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(102, 102, 102));
        setBounds(new java.awt.Rectangle(500, 100, 0, 0));
        setName("loginFrame"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Contrase\u00F1a:");

        passText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poor Richard", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("STOCK TRACK");

        rolUsuario.setModel(new DefaultComboBoxModel(new String[] {"ADMINISTRADOR", "EMPLEADO"}));

        loginButton.setText("ENTRAR");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        clearButton.setText("LIMPIAR");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userText))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passText))
                    .addComponent(rolUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userText, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addComponent(rolUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

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
                   "usuario o clave inválida.");
        }
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        userText.setText("");
        passText.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void passTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTextActionPerformed
        // TODO add your handling code here:
        loginButtonActionPerformed(evt);
    }//GEN-LAST:event_passTextActionPerformed

    
    // Metodo del controlador
    // **AQUÍ SE COMIENZA A EJECUTAR LA APP**
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox<String> rolUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passText;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
