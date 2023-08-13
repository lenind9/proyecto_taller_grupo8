
package com.inventory.UI;

import com.inventory.DAO.UserDAO;
import com.inventory.DTO.UserDTO;
import com.inventory.Database.ConnectionFactory;

import javax.swing.*;
import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Toolkit;


public class Dashboard extends javax.swing.JFrame {

    CardLayout layout;
    String userSelect;
    String username;
    String fullName;
    UserDTO userDTO;
    LocalDateTime outTime;
   
    public Dashboard(String username, String userType, UserDTO userDTO) {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Dashboard.class.getResource("/com/inventory/UI/Icons/logomin.png")));
        initComponents();

        navPanel.setVisible(false);
        menuPanel.setVisible(true);
        layout = new CardLayout();
        userSelect = userType;
        this.username = username;
        this.userDTO = userDTO;
        if("EMPLEADO".equalsIgnoreCase(userType))
            notForEmployee();
        currentUserSession();

        // Panel Layout set to Card Layout to allow switching between different sections
        displayPanel.setLayout(layout);
        MensajeBienvenida homePage = new  MensajeBienvenida(username);
        homePage.setForeground(new Color(0, 0, 0));
        displayPanel.add("Home", homePage);
        displayPanel.add("Users", new PaginaUsuarios());
        displayPanel.add("Customers", new PaginaClientes());
        displayPanel.add("Products", new PaginaProductos(username, this));
        displayPanel.add("Suppliers", new PaginaProveedores());
        displayPanel.add("Current Stock", new PaginaStockDisponible(username));
        displayPanel.add("Sales", new PaginaVentas(username, this));
        displayPanel.add("Purchase", new PaginaCompras(this));
        displayPanel.add("Logs", new PaginaRegistrodeUsuarios());

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                outTime = LocalDateTime.now();
                userDTO.setOutTime(String.valueOf(outTime));
                userDTO.setUsername(username);
                new UserDAO().addUserLogin(userDTO);
                super.windowClosing(e);
            }
        });

        setTitle("STOCK TRACK");
        setVisible(true);
    }

    // Metodos para mostrar diferentes secciones en el mainframe
    public void addHomePage(){
        layout.show(displayPanel, "Home");
    }
    public void addUsersPage() {
        layout.show(displayPanel, "Users");
    }
    public void addCustPage() {
        layout.show(displayPanel, "Customers");
    }
    public void addProdPage() {
        layout.show(displayPanel, "Products");
    }
    public void addSuppPage() {
        layout.show(displayPanel, "Suppliers");
    }
    public void addStockPage() {
        layout.show(displayPanel, "Current Stock");
    }
    public void addSalesPage() {
        layout.show(displayPanel, "Sales");
    }
    public void addPurchasePage() {
        layout.show(displayPanel, "Purchase");
    }
    public void addLogsPage() {
        layout.show(displayPanel, "Logs");
    }
	private void hoverButtons() {
		prodButton.setBackground(new Color(80, 77, 166));
		stockButton.setBackground(new Color(80, 77, 166));	
		custButton.setBackground(new Color(80, 77, 166));
		suppButton.setBackground(new Color(80, 77, 166));
		salesButton.setBackground(new Color(80, 77, 166));
		custButton.setBackground(new Color(80, 77, 166));
		usersButton.setBackground(new Color(80, 77, 166));
		purchaseButton.setBackground(new Color(80, 77, 166));
		logsButton.setBackground(new Color(80, 77, 166));
		
	
	}
	
	private void hoverButtonsLetras() {
		prodButton.setForeground(Color.WHITE);
		stockButton.setForeground(Color.WHITE);	
		salesButton.setForeground(Color.WHITE);
		custButton.setForeground(Color.WHITE);
		suppButton.setForeground(Color.WHITE);
		usersButton.setForeground(Color.WHITE);
		purchaseButton.setForeground(Color.WHITE);
		logsButton.setForeground(Color.WHITE);
	}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    	
        mainPanel = new javax.swing.JPanel();
        mainPanel.setBackground(new Color(255, 255, 255));
        menuPanel = new javax.swing.JPanel();
        menuButton = new javax.swing.JButton();
        menuButton.setBorder(null);
        menuButton.setBorderPainted(false);
        menuButton.setForeground(new Color(0, 0, 0));
        menuButton.setBackground(new Color(80, 77, 166));
        navPanel = new javax.swing.JPanel();
        navPanel.setBackground(new Color(80, 77, 166));
        homeButton = new javax.swing.JButton();
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.setBackground(new Color(80, 77, 166));
        prodButton = new javax.swing.JButton();
        prodButton.setHorizontalAlignment(SwingConstants.LEFT);
        prodButton.setIcon(new ImageIcon(Dashboard.class.getResource("/com/inventory/UI/Icons/producto_icon.png")));
        prodButton.setFont(new Font("Roboto Light", Font.BOLD, 15));

        prodButton.setBorderPainted(false);
        prodButton.setBackground(new Color(80, 77, 166));
        prodButton.setForeground(Color.WHITE);
        prodButton.setBorder(new EmptyBorder(0, 14, 0, 0));
        stockButton = new javax.swing.JButton();
        stockButton.setIcon(new ImageIcon(Dashboard.class.getResource("/com/inventory/UI/Icons/in_stock.png")));
        stockButton.setHorizontalAlignment(SwingConstants.LEFT);
        stockButton.setFont(new Font("Roboto Light", Font.BOLD, 15));
        stockButton.setBorder(new EmptyBorder(0, 14, 0, 0));
        stockButton.setBorderPainted(false);
        stockButton.setBackground(new Color(80, 77, 166));
        stockButton.setForeground(Color.WHITE);
        stockButton.setText("  Stock \r\ndisponible");
        custButton = new javax.swing.JButton();
        custButton.setIcon(new ImageIcon(Dashboard.class.getResource("/com/inventory/UI/Icons/cliente_icon.png")));
        custButton.setHorizontalAlignment(SwingConstants.LEFT);
        custButton.setFont(new Font("Roboto Light", Font.BOLD, 15));
        custButton.setBorder(new EmptyBorder(0, 14, 0, 0));
        custButton.setBorderPainted(false);
        custButton.setBackground(new Color(80, 77, 166));
        custButton.setForeground(Color.WHITE);
        suppButton = new javax.swing.JButton();
        suppButton.setIcon(new ImageIcon(Dashboard.class.getResource("/com/inventory/UI/Icons/proveedor.png")));
        suppButton.setHorizontalAlignment(SwingConstants.LEFT);
        suppButton.setFont(new Font("Roboto Light", Font.BOLD, 15));
        suppButton.setBorder(new EmptyBorder(0, 14, 0, 0));
        suppButton.setBorderPainted(false);
        suppButton.setForeground(Color.WHITE);
        suppButton.setBackground(new Color(80, 77, 166));
        salesButton = new javax.swing.JButton();
        salesButton.setIcon(new ImageIcon(Dashboard.class.getResource("/com/inventory/UI/Icons/ventas.png")));
        salesButton.setHorizontalAlignment(SwingConstants.LEFT);
        salesButton.setFont(new Font("Roboto Light", Font.BOLD, 15));
        salesButton.setBorder(new EmptyBorder(0, 14, 0, 0));
        salesButton.setBorderPainted(false);
        salesButton.setForeground(Color.WHITE);
        salesButton.setBackground(new Color(80, 77, 166));
        usersButton = new javax.swing.JButton();
        usersButton.setIcon(new ImageIcon(Dashboard.class.getResource("/com/inventory/UI/Icons/ususario_aniadir.png")));
        usersButton.setHorizontalAlignment(SwingConstants.LEFT);
        usersButton.setFont(new Font("Roboto Light", Font.BOLD, 15));
        usersButton.setBorder(new EmptyBorder(0, 14, 0, 0));
        usersButton.setBorderPainted(false);
        usersButton.setForeground(Color.WHITE);
        usersButton.setBackground(new Color(80, 77, 166));
        purchaseButton = new javax.swing.JButton();
        purchaseButton.setIcon(new ImageIcon(Dashboard.class.getResource("/com/inventory/UI/Icons/agregar-producto.png")));
        purchaseButton.setHorizontalAlignment(SwingConstants.LEFT);
        purchaseButton.setFont(new Font("Roboto Light", Font.BOLD, 15));
        purchaseButton.setBorderPainted(false);
        purchaseButton.setBorder(new EmptyBorder(0, 14, 0, 0));
        purchaseButton.setForeground(new Color(255, 255, 255));
        purchaseButton.setBackground(new Color(80, 77, 166));
        logsButton = new javax.swing.JButton();
        logsButton.setIcon(new ImageIcon(Dashboard.class.getResource("/com/inventory/UI/Icons/administrador.png")));
        logsButton.setHorizontalAlignment(SwingConstants.LEFT);
        logsButton.setFont(new Font("Roboto Light", Font.BOLD, 15));
        logsButton.setBorder(new EmptyBorder(0, 14, 0, 0));
        logsButton.setBorderPainted(false);
        logsButton.setForeground(Color.WHITE);
        logsButton.setBackground(new Color(80, 77, 166));
        displayPanel = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();
        userPanel.setBackground(Color.WHITE);
        nameLabel = new javax.swing.JLabel();
        nameLabel.setForeground(new Color(0, 0, 0));
        nameLabel.setBackground(new Color(153, 179, 254));
        logoutButton = new javax.swing.JButton();
        logoutButton.setBorderPainted(false);
        logoutButton.setFont(new Font("Roboto Light", Font.BOLD, 18));
        logoutButton.setForeground(Color.WHITE);
        logoutButton.setBackground(new Color(80, 77, 166));
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Manager");
        setBounds(new java.awt.Rectangle(400, 100, 0, 0));

        menuPanel.setPreferredSize(new java.awt.Dimension(120, 26));

        menuButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/UI/Icons/menu_icon_150667.png"))); // NOI18N
        menuButton.setText("MENU");
        menuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanelLayout.setHorizontalGroup(
        	menuPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(menuButton, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
        	menuPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(menuPanelLayout.createSequentialGroup()
        			.addComponent(menuButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanel.setLayout(menuPanelLayout);

        navPanel.setBorder(null);

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/UI/Icons/homepages_home_house_icon_150665.png"))); // NOI18N
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        prodButton.setText("  Productos");
        prodButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodButtonActionPerformed(evt);
            }
        });
        stockButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockButtonActionPerformed(evt);
            }
        });

        custButton.setText("  Clientes");
        custButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        custButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custButtonActionPerformed(evt);
            }
        });

        suppButton.setText("  Proveedores");
        suppButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suppButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppButtonActionPerformed(evt);
            }
        });

        salesButton.setText("  Ventas");
        salesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesButtonActionPerformed(evt);
            }
        });

        usersButton.setText("  Usuarios");
        usersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        usersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersButtonActionPerformed(evt);
            }
        });

        purchaseButton.setText("  Comprar");
        purchaseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        logsButton.setText("  Registrar usuarios");
        logsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navPanelLayout = new javax.swing.GroupLayout(navPanel);
        navPanelLayout.setHorizontalGroup(
        	navPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(homeButton, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
        		.addGroup(navPanelLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(navPanelLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(logsButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        				.addComponent(usersButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        				.addComponent(purchaseButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        				.addComponent(salesButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        				.addComponent(suppButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        				.addComponent(custButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        				.addComponent(stockButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        				.addComponent(prodButton, GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)))
        );
        navPanelLayout.setVerticalGroup(
        	navPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(navPanelLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(homeButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(prodButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(stockButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(custButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(suppButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(salesButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(purchaseButton, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(usersButton, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(logsButton, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(332, Short.MAX_VALUE))
        );
        navPanel.setLayout(navPanelLayout);

        displayPanel.setLayout(new java.awt.CardLayout());

        nameLabel.setFont(new Font("Roboto Light", Font.BOLD | Font.ITALIC, 18)); // NOI18N
        nameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/UI/Icons/user_icon_150670.png"))); // NOI18N
        nameLabel.setText("Usuario: ");

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/UI/Icons/log-out_icon-icons.com_50106.png"))); // NOI18N
        logoutButton.setText("Salir");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanelLayout.setHorizontalGroup(
        	userPanelLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(userPanelLayout.createSequentialGroup()
        			.addContainerGap(504, Short.MAX_VALUE)
        			.addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 454, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(logoutButton))
        );
        userPanelLayout.setVerticalGroup(
        	userPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(logoutButton, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        		.addGroup(userPanelLayout.createSequentialGroup()
        			.addGap(4)
        			.addComponent(nameLabel, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );
        userPanel.setLayout(userPanelLayout);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanelLayout.setHorizontalGroup(
        	mainPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(mainPanelLayout.createSequentialGroup()
        			.addGroup(mainPanelLayout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(menuPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(navPanel, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
        			.addGap(18)
        			.addGroup(mainPanelLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(displayPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(userPanel, GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)))
        );
        mainPanelLayout.setVerticalGroup(
        	mainPanelLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(mainPanelLayout.createSequentialGroup()
        			.addGroup(mainPanelLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(userPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(menuPanel, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(mainPanelLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(navPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(displayPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        mainPanel.setLayout(mainPanelLayout);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        int opt = JOptionPane.showConfirmDialog(
                null,
                "<html>¿Está seguro de cerrar sesión?<br>Tendrás que iniciar sesión de nuevo.<html>",
                "Confirmation",
                JOptionPane.YES_NO_OPTION);
        if (opt==JOptionPane.YES_OPTION){
            outTime = LocalDateTime.now();
            userDTO.setOutTime(String.valueOf(outTime));
            userDTO.setUsername(username);
            new UserDAO().addUserLogin(userDTO);
            dispose();
            PaginaEntrada logPage = new PaginaEntrada();
            logPage.setVisible(true);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void usersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersButtonActionPerformed
    	this.hoverButtons();
    	this.hoverButtonsLetras();
    	usersButton.setBackground(Color.WHITE);
    	usersButton.setForeground(new Color (80, 77, 166));
    	addUsersPage();
    }//GEN-LAST:event_usersButtonActionPerformed

    private void salesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesButtonActionPerformed
    	this.hoverButtons();
    	this.hoverButtonsLetras();
    	salesButton.setBackground(Color.WHITE);
    	salesButton.setForeground(new Color (80, 77, 166));
    	addSalesPage();
    }//GEN-LAST:event_salesButtonActionPerformed

    private void suppButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppButtonActionPerformed
    	this.hoverButtons();
    	this.hoverButtonsLetras();
    	suppButton.setBackground(Color.WHITE);
    	suppButton.setForeground(new Color (80, 77, 166));
    	addSuppPage();
    }//GEN-LAST:event_suppButtonActionPerformed

    private void custButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custButtonActionPerformed
    	
    	this.hoverButtons();
    	this.hoverButtonsLetras();
    	custButton.setBackground(Color.WHITE);
    	custButton.setForeground(new Color (80, 77, 166));
    	addCustPage();
    }//GEN-LAST:event_custButtonActionPerformed

    private void stockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockButtonActionPerformed
    	this.hoverButtons();
    	this.hoverButtonsLetras();
    	stockButton.setBackground(Color.WHITE);
    	stockButton.setForeground(new Color (80, 77, 166));
        addStockPage();
    }//GEN-LAST:event_stockButtonActionPerformed

    private void prodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodButtonActionPerformed
    	this.hoverButtons();
    	this.hoverButtonsLetras();
    	prodButton.setBackground(Color.WHITE);
    	prodButton.setForeground(new Color (80, 77, 166));
        addProdPage();
    }//GEN-LAST:event_prodButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        //dispose();
    	
        addHomePage();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        navPanel.setVisible(!navPanel.isVisible());
    }//GEN-LAST:event_menuButtonActionPerformed

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
    	this.hoverButtons();
    	this.hoverButtonsLetras();
    	purchaseButton.setBackground(Color.WHITE);
    	purchaseButton.setForeground(new Color (80, 77, 166));
    	addPurchasePage();
    }//GEN-LAST:event_purchaseButtonActionPerformed

    private void logsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logsButtonActionPerformed
    	this.hoverButtons();
    	this.hoverButtonsLetras();
    	logsButton.setBackground(Color.WHITE);
    	logsButton.setForeground(new Color (80, 77, 166));
    	addLogsPage();
    }//GEN-LAST:event_logsButtonActionPerformed

    // Metodo para mostrar el usuario actualmente conectado
    public void currentUserSession() {
        UserDTO userDTO = new UserDTO();
        new UserDAO().getFullName(userDTO, username);
        nameLabel.setText("Usuario: " + userDTO.getFullName() + " ("+userSelect+")");
    }

    // Permite que solo el usuario de tipo ADMINISTRADOR vea y manipule 'Users' y 'User Logs'
    public void notForEmployee(){
        navPanel.remove(usersButton);
        navPanel.remove(logsButton);
        //navPanel.remove(salesButton);
    }

    // Declaracion de variables - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton custButton;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton logsButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton menuButton;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel navPanel;
    private javax.swing.JButton prodButton;
    private javax.swing.JButton purchaseButton;
    private javax.swing.JButton salesButton;
    private javax.swing.JButton stockButton;
    private javax.swing.JButton suppButton;
    private javax.swing.JPanel userPanel;
    private javax.swing.JButton usersButton;
}
