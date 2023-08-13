
package com.inventory.UI;

import com.inventory.DAO.UserDAO;

import java.sql.SQLException;
import java.awt.Color;
import java.awt.Component;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;


public class PaginaRegistrodeUsuarios extends javax.swing.JPanel {

    public PaginaRegistrodeUsuarios() {
    	setBackground(Color.WHITE);
        initComponents();
        loadDataSet();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setForeground(new Color(0, 0, 0));
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setFont(new Font("Roboto Light", Font.PLAIN, 14));
        tablaRegistros = new javax.swing.JTable();
        tablaRegistros.setRowHeight(40);
        tablaRegistros.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        tablaRegistros.setBackground(Color.WHITE);
        tablaRegistros.setForeground(Color.BLACK);
        refreshButton = new javax.swing.JButton();
        refreshButton.setForeground(new Color(255, 255, 255));
        refreshButton.setBackground(new Color(80, 77, 166));
         
        searchText = new javax.swing.JTextField();
        searchText.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        searchText.setForeground(new Color(0, 0, 0));
        searchText.setBackground(new Color(255, 255, 255));
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Roboto Light", Font.PLAIN, 15));
        jLabel2.setForeground(new Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setText("REGISTROS DE USUARIO ");

        tablaRegistros.setModel(new DefaultTableModel(
        	new Object[][] {
        		{"Trial Admin", "root", "2021-09-01T05:02:43.010014", "2021-09-01T05:02:50.224787400", "Local"},
        		{"Trial Admin", "root", "2021-09-01T05:05:12.269897600", "2021-09-01T05:05:16.866792500", "Local"},
        		{"Trial Admin", "root", "2021-09-01T05:10:08.728527600", "2021-09-01T05:10:16.926883100", "Local"},
        		{"Trial Admin", "root", "2021-09-01T06:19:09.326477200", "2021-09-01T06:19:21.641620900", "Local"},
        		{"Trial Employee", "emp1", "2021-09-01T06:19:34.536411800", "2021-09-01T06:19:43.517392100", "Local"},
        		{"Trial Admin", "root", "2021-09-01T06:19:46.811400900", "2021-09-01T06:20:10.879660700", "Local"},
        		{"Trial Admin", "root", "2021-09-01T14:59:48.661066400", "2021-09-01T15:02:09.761864900", "Local"},
        		{"Trial Admin", "root", "2021-09-01T15:09:02.964317400", "2021-09-01T15:09:14.141324800", "Local"},
        		{"Trial Admin", "root", "2021-09-01T15:09:27.889908500", "2021-09-01T15:09:48.262387", "Local"},
        		{"Trial Admin", "root", "2021-09-01T15:38:48.557639300", "2021-09-01T15:40:00.527183800", "Local"},
        		{"Trial Admin", "root", "2021-09-01T15:40:22.622326", "2021-09-01T15:41:06.461438500", "Local"},
        		{"Trial Admin", "root", "2021-09-01T15:44:26.195028100", "2021-09-01T15:44:33.071448800", "Local"},
        		{"Trial Admin", "root", "2021-09-02T01:42:52.417989900", "2021-09-02T01:42:55.226675900", "Local"},
        		{"Trial Admin", "root", "2021-09-02T01:43:12.226339400", "2021-09-02T01:43:15.818776", "Local"},
        		{"Trial Admin", "root", "2023-08-11T17:23:25.341221", "2023-08-11T17:23:32.949508100", "Local"},
        		{"Trial Admin", "root", "2023-08-11T17:38:29.958956100", "2023-08-11T17:39:27.286706900", "Local"},
        		{"Trial Admin", "root", "2023-08-11T23:43:32.550624500", "2023-08-11T23:44:00.181583400", "Local"},
        		{"Trial Admin", "root", "2023-08-11T23:44:41.124453700", "2023-08-11T23:44:52.907590", "Local"},
        		{"Trial Admin", "root", "2023-08-11T23:46:43.822715900", "2023-08-11T23:46:55.992861300", "Local"},
        		{"Trial Admin", "root", "2023-08-11T23:51:48.091867900", "2023-08-11T23:51:53.176364", "Local"},
        		{"Trial Admin", "root", "2023-08-12T00:12:40.331605700", "2023-08-12T00:12:45.830606900", "Local"},
        		{"Trial Admin", "root", "2023-08-12T00:44:48.560651200", "2023-08-12T00:45:31.033380400", "Local"},
        		{"Trial Admin", "root", "2023-08-12T00:50:05.455087600", "2023-08-12T00:50:25.961509600", "Local"},
        		{"Trial Admin", "root", "2023-08-12T00:52:23.007485600", "2023-08-12T00:52:29.574520200", "Local"},
        		{"Trial Admin", "root", "2023-08-12T00:54:27.559533100", "2023-08-12T00:54:35.588608700", "Local"},
        		{"Trial Admin", "root", "2023-08-12T00:46:08.562184900", "2023-08-12T01:01:50.674620100", "Local"},
        		{"Trial Admin", "root", "2023-08-12T01:03:45.045612300", "2023-08-12T01:03:54.792851500", "Local"},
        		{"Trial Admin", "root", "2023-08-12T01:06:19.158577800", "2023-08-12T01:06:34.538725800", "Local"},
        		{"Trial Admin", "root", "2023-08-12T01:18:53.176038600", "2023-08-12T01:25:25.652773400", "Local"},
        		{"Trial Admin", "root", "2023-08-12T01:26:18.967865900", "2023-08-12T01:26:31.212130900", "Local"},
        		{"Trial Admin", "root", "2023-08-12T01:25:31.549416300", "2023-08-12T01:29:17.782533800", "Local"},
        		{"Trial Admin", "root", "2023-08-12T01:18:19.995481", "2023-08-12T01:29:20.326621900", "Local"},
        		{"Trial Admin", "root", "2023-08-12T01:13:08.734677100", "2023-08-12T01:29:22.679613", "Local"},
        		{"Trial Admin", "root", "2023-08-12T01:33:56.542392100", "2023-08-12T01:34:36.720945800", "Local"},
        		{"Trial Admin", "root", "2023-08-12T01:43:01.496458700", "2023-08-12T01:43:10.609391300", "Local"},
        		{"Trial Admin", "root", "2023-08-12T01:43:36.882231400", "2023-08-12T01:43:46.733732200", "Local"},
        		{"Trial Admin", "root", "2023-08-12T01:39:50.385836200", "2023-08-12T01:43:53.926865400", "Local"},
        		{"Trial Admin", "root", "2023-08-12T01:46:05.426269800", "2023-08-12T01:46:41.584354600", "Local"},
        		{"Trial Admin", "root", "2023-08-12T01:48:38.784856800", "2023-08-12T01:49:01.343663300", "Local"},
        		{"Trial Admin", "root", "2023-08-12T16:15:57.532743400", "2023-08-12T16:16:08.827912", "Local"},
        		{"Trial Admin", "root", "2023-08-12T13:29:16.765787600", "2023-08-12T16:20:18.814443100", "Local"},
        		{"Trial Admin", "root", "2023-08-12T16:20:22.307324600", "2023-08-12T16:21:37.135356800", "Local"},
        		{"Trial Admin", "root", "2023-08-12T17:21:17.250563100", "2023-08-12T17:22:36.499152", "Local"},
        		{"Trial Admin", "root", "2023-08-12T17:25:42.785741200", "2023-08-12T17:47:36.453138700", "Local"},
        		{"Trial Admin", "root", "2023-08-12T17:46:48.988652200", "2023-08-12T17:52:25.548507400", "Local"},
        		{"Trial Admin", "root", "2023-08-12T18:03:03.394120900", "2023-08-12T18:03:48.375780900", "Local"},
        	},
        	new String[] {
        		"Nombre", "Usuario", "Entrada", "Salida", "Ubicacion"
        	}
        ) {
        	boolean[] columnEditables = new boolean[] {
        		false, true, true, true, true
        	};
        	public boolean isCellEditable(int row, int column) {
        		return columnEditables[column];
        	}
        });
        tablaRegistros.getColumnModel().getColumn(1).setPreferredWidth(55);
        tablaRegistros.getColumnModel().getColumn(2).setPreferredWidth(110);
        tablaRegistros.getColumnModel().getColumn(3).setPreferredWidth(116);
        tablaRegistros.getColumnModel().getColumn(4).setPreferredWidth(65);
        jScrollPane1.setViewportView(tablaRegistros);

        refreshButton.setFont(new Font("Roboto Light", Font.BOLD, 15)); // NOI18N
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

        jLabel2.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(searchText, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(refreshButton)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(refreshButton)
        						.addComponent(searchText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2))
        					.addGap(21)
        					.addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 407, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(79, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyReleased
    }//GEN-LAST:event_searchTextKeyReleased

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        loadDataSet();
    }//GEN-LAST:event_refreshButtonActionPerformed


    public void loadDataSet() {
        try {
            UserDAO userDAO = new UserDAO();
            tablaRegistros.setModel(userDAO.buildTableModel(userDAO.getUserLogsDAO()));
            
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
            for (int columnIndex = 0; columnIndex < tablaRegistros.getColumnCount(); columnIndex++) {
            	tablaRegistros.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Declaracion de variables - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaRegistros;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField searchText;
    // Fin de declaracion de variables//GEN-END:variables
}
