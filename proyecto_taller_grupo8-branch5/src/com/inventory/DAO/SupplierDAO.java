package com.inventory.DAO;

import com.inventory.DTO.SupplierDTO;
import com.inventory.Database.ConnectionFactory;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Locale;
import java.util.Vector;

// Data Access Object para Proveedor(Supplier)
public class SupplierDAO {

    Connection conn = null;
    Statement statement = null;
    PreparedStatement prepStatement = null;
    ResultSet resultSet = null;

    public SupplierDAO() {
        try {
            conn = new ConnectionFactory().getConn();
            statement = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metodos para añadir un nuevo supplier
    public void addSupplierDAO(SupplierDTO supplierDTO) {
        try {
            String query = "SELECT * FROM suppliers WHERE nombre='"
                    +supplierDTO.getFullName()
                    + "' AND ubicacion='"
                    +supplierDTO.getLocation()
                    + "' AND telefono='"
                    +supplierDTO.getPhone()
                    + "'";
            resultSet = statement.executeQuery(query);
            if (resultSet.next())
                JOptionPane.showMessageDialog(null, "El proveedor ya existe.");
            else
                addFunction(supplierDTO);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addFunction(SupplierDTO supplierDTO) {
        try {
            String query = "INSERT INTO suppliers VALUES(null,?,?,?,?)";
            prepStatement = conn.prepareStatement(query);
            prepStatement.setString(1, supplierDTO.getSuppCode());
            prepStatement.setString(2, supplierDTO.getFullName());
            prepStatement.setString(3, supplierDTO.getLocation());
            prepStatement.setString(4, supplierDTO.getPhone());
            prepStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo proveedor con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metodo para editar detalles de supplier existente
    public void editSupplierDAO(SupplierDTO supplierDTO) {
        try {
            String query = "UPDATE suppliers SET nombre=?,ubicacion=?,telefono=? WHERE codigo_proveedor=?";
            prepStatement = conn.prepareStatement(query);
            prepStatement.setString(1, supplierDTO.getFullName());
            prepStatement.setString(2, supplierDTO.getLocation());
            prepStatement.setString(3, supplierDTO.getPhone());
            prepStatement.setString(4, supplierDTO.getSuppCode());
            prepStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Los detalles del proveedor han sido actualizados.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metodo para eliminar un supplier existente
    public void deleteSupplierDAO(String suppCode) {
        try {
            String query = "DELETE FROM suppliers WHERE codigo_proveedor='" +suppCode+ "'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Proveedor eliminado.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metodo de recuperacion de conjunto de datos supplier
    public ResultSet getQueryResult() {
        try {
            String query = "SELECT codigo_proveedor, nombre, ubicacion, telefono FROM suppliers";
            resultSet = statement.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    // Metodo para buscar
    public ResultSet getSearchResult(String searchText) {
        try {
            String query = "SELECT codigo_proveedor, nombre, ubicacion, telefono FROM suppliers " +
                    "WHERE codigo_proveedor LIKE '%"+searchText+"%' OR ubicacion LIKE '%"+searchText+"%' " +
                    "OR nombre LIKE '%"+searchText+"%' OR telefono LIKE '%"+searchText+"%'";
            resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    // Metodo para actualizar supplier combo box
    public DefaultComboBoxModel<String> setComboItems(ResultSet resultSet) throws SQLException {
        Vector<String> suppNames = new Vector<>();
        while (resultSet.next()){
            suppNames.add(resultSet.getString("nombre"));
        }
        return new DefaultComboBoxModel<>(suppNames);
    }

    // Metodo para mostrar el conjunto de datos recuperados en forma tabular
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
