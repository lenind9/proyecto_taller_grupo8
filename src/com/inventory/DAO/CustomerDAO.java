package com.inventory.DAO;

import com.inventory.DTO.CustomerDTO;
import com.inventory.Database.ConnectionFactory;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Locale;
import java.util.Vector;

// Data Access Object para Customers
public class CustomerDAO {
    Connection conn = null;
    PreparedStatement prepStatement= null;
    Statement statement = null;
    ResultSet resultSet = null;

    public CustomerDAO() {
        try {
            conn = new ConnectionFactory().getConn();
            statement = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metodos para añadir un nuevo customer
    public void addCustomerDAO(CustomerDTO customerDTO) {
        try {
            String query = "SELECT * FROM customers WHERE fullname='"
                    +customerDTO.getFullName()
                    + "' AND location='"
                    +customerDTO.getLocation()
                    + "' AND phone='"
                    +customerDTO.getPhone()
                    + "'";
            resultSet = statement.executeQuery(query);
            if (resultSet.next())
                JOptionPane.showMessageDialog(null, "Cliente ya existe.");
            else
                addFunction(customerDTO);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addFunction(CustomerDTO customerDTO) {
        try {
            String query = "INSERT INTO customers VALUES(null,?,?,?,?)";
            prepStatement = conn.prepareStatement(query);
            prepStatement.setString(1, customerDTO.getCustCode());
            prepStatement.setString(2, customerDTO.getFullName());
            prepStatement.setString(3, customerDTO.getLocation());
            prepStatement.setString(4, customerDTO.getPhone());
            prepStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nuevo cliente se ha agregado.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // Metodo para editar detalles de customer existente
    public  void editCustomerDAO(CustomerDTO customerDTO) {
        try {
            String query = "UPDATE customers SET fullname=?,location=?,phone=? WHERE customercode=?";
            prepStatement = conn.prepareStatement(query);
            prepStatement.setString(1, customerDTO.getFullName());
            prepStatement.setString(2, customerDTO.getLocation());
            prepStatement.setString(3, customerDTO.getPhone());
            prepStatement.setString(4, customerDTO.getCustCode());
            prepStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han actualizado los detalles de cliente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metodo para eliminar customer existente
    public void deleteCustomerDAO(String custCode) {
        try {
            String query = "DELETE FROM customers WHERE customercode='" +custCode+ "'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Cliente eliminado.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metodo para recuperar los datos a mostrar
    public ResultSet getQueryResult() {
        try {
            String query = "SELECT customercode,fullname,location,phone FROM customers";
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    // Metodo para recuperar datos de busqueda
    public ResultSet getCustomerSearch(String text) {
        try {
            String query = "SELECT customercode,fullname,location,phone FROM customers " +
                    "WHERE customercode LIKE '%"+text+"%' OR fullname LIKE '%"+text+"%' OR " +
                    "location LIKE '%"+text+"%' OR phone LIKE '%"+text+"%'";
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public ResultSet getCustName(String custCode) {
        try {
            String query = "SELECT * FROM customers WHERE customercode='" +custCode+ "'";
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
