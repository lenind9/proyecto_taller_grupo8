    package com.inventory.DAO;

import com.inventory.DTO.ClienteDTO;
import com.inventory.Database.ConnectionFactory;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Locale;
import java.util.Vector;



// Data Access Object para Clientes (customers)
public class ClienteDAO {
	   Connection conn = null;
	    PreparedStatement prepStatement= null;
	    Statement statement = null;
	    ResultSet resultSet = null;

	    public ClienteDAO() {
	        try {
	            conn = new ConnectionFactory().getConn();
	            statement = conn.createStatement();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // INSERTAR un nuevo Cliente
	    public void agregarClienteDAO(ClienteDTO clienteDTO) {
	        try {
	            String query = "SELECT * FROM clientes WHERE nombre='"
	                    +clienteDTO.getNombreCliente()
	                    + "' AND ubicacion='"
	                    +clienteDTO.getUbicacion()
	                    + "' AND telefono='"
	                    +clienteDTO.getTelefono()
	                    + "'";
	            resultSet = statement.executeQuery(query);
	            if (resultSet.next())
	                JOptionPane.showMessageDialog(null, "El cliente ya existe.");
	            else
	                insertarClienteDAO(clienteDTO);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    //INSERT
	    public void insertarClienteDAO(ClienteDTO clienteDTO) {
	        try {
	            String query = "INSERT INTO clientes VALUES(null,?,?,?,?)";
	            prepStatement = conn.prepareStatement(query);
	            prepStatement.setString(1, clienteDTO.getCodigoCliente());
	            prepStatement.setString(2, clienteDTO.getNombreCliente());
	            prepStatement.setString(3, clienteDTO.getUbicacion());
	            prepStatement.setString(4, clienteDTO.getTelefono());
	            prepStatement.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Nuevo cliente registrado.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	    }

	    // ACTUALIZAR detalles de CLIENTE existente
	    public  void editarClienteDAO(ClienteDTO clienteDTO) {
	        try {
	            String query = "UPDATE clientes SET nombre=?,ubicacion=?,telefono=? WHERE codigo_cliente=?";
	            prepStatement = conn.prepareStatement(query);
	            prepStatement.setString(1, clienteDTO.getNombreCliente());
	            prepStatement.setString(2, clienteDTO.getUbicacion());
	            prepStatement.setString(3, clienteDTO.getTelefono());
	            prepStatement.setString(4, clienteDTO.getCodigoCliente());
	            prepStatement.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Se han actualizado los detalles de cliente.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // ELIMINAR Cliente
	    public void eliminarClienteDAO(String codigoCliente) {
	        try {
	            String query = "DELETE FROM clientes WHERE codigo_cliente='" +codigoCliente+ "'";
	            statement.executeUpdate(query);
	            JOptionPane.showMessageDialog(null, "Cliente eliminado.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Metodo para recuperar los datos a mostrar
	    public ResultSet getQueryResult() {
	        try {
	            String query = "SELECT codigo_cliente,nombre,ubicacion,telefono FROM clientes";
	            resultSet = statement.executeQuery(query);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return resultSet;
	    }

	    // Metodo para recuperar datos de busqueda
	    public ResultSet buscarCliente(String texto) {
	        try {
	            String query = "SELECT codigo_cliente,nombre,ubicacion,telefono FROM clientes " +
	                    "WHERE codigo_cliente LIKE '%"+texto+"%' OR nombre LIKE '%"+texto+"%' OR " +
	                    "ubicacion LIKE '%"+texto+"%' OR telefono LIKE '%"+texto+"%'";
	            resultSet = statement.executeQuery(query);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return resultSet;
	    }

	    public ResultSet getCustName(String codigoCliente) {
	        try {
	            String query = "SELECT * FROM clientes WHERE codigo_cliente='" +codigoCliente+ "'";
	            resultSet = statement.executeQuery(query);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return resultSet;
	    }

	    public ResultSet getProdName(String prodCode) {
	        try {
	            String query = "SELECT productname,currentstock.quantity FROM products " +
	                    "INNER JOIN currentstock ON products.productcode=currentstock.productcode " +
	                    "WHERE currentstock.productcode='" +prodCode+ "'";
	            resultSet = statement.executeQuery(query);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return resultSet;
	    }

	    // Metodo para mostrar el conjunto de datos en forma tabular
	    public DefaultTableModel buildTableModel(ResultSet resultSet) throws SQLException {
	        ResultSetMetaData metaData = resultSet.getMetaData();
	        Vector<String> columnNames = new Vector<String>();
	        int colCount = metaData.getColumnCount();

	        for (int col=1; col <= colCount; col++){
	            columnNames.add(metaData.getColumnName(col).toUpperCase(Locale.ROOT));
	        }

	        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	        while (resultSet.next()) {
	            Vector<Object> vector = new Vector<Object>();
	            for (int col=1; col<=colCount; col++) {
	                vector.add(resultSet.getObject(col));
	            }
	            data.add(vector);
	        }
	        return new DefaultTableModel(data, columnNames);
	    }

}
