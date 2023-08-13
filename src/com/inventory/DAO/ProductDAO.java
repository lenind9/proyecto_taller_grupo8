package com.inventory.DAO;

import com.inventory.DTO.ProductDTO;
import com.inventory.Database.ConnectionFactory;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Locale;
import java.util.Vector;

/**
 *
 * @author asjad
 */

// Data Access Object para Products, Purchase, Stock y Sales
public class ProductDAO {

	 Connection conn = null;
	    PreparedStatement prepStatement = null;
	    PreparedStatement prepStatement2 = null;
	    Statement statement = null;
	    Statement statement2 = null;
	    ResultSet resultSet = null;

	    public ProductDAO() {
	        try {
	            conn = new ConnectionFactory().getConn();
	            statement = conn.createStatement();
	            statement2 = conn.createStatement();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }

	    public ResultSet getSuppInfo() {
	        try {
	            String query = "SELECT * FROM suppliers";
	            resultSet = statement.executeQuery(query);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return resultSet;
	    }

	    public ResultSet getCustInfo() {
	        try {
	            String query = "SELECT * FROM clientes";
	            resultSet = statement.executeQuery(query);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return resultSet;
	    }

	    public ResultSet getProdStock() {
	        try {
	            String query = "SELECT * FROM currentstock";
	            resultSet = statement.executeQuery(query);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return resultSet;
	    }

	    public ResultSet getProdInfo() {
	        try {
	            String query = "SELECT * FROM products";
	            resultSet = statement.executeQuery(query);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return resultSet;
	    }

	    public Double getProdCost(String prodCode) {
	        Double costPrice = null;
	        try {
	            String query = "SELECT costprice FROM products WHERE productcode='" +prodCode+ "'";
	            resultSet = statement.executeQuery(query);
	            if (resultSet.next())
	                costPrice = resultSet.getDouble("costprice");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return costPrice;
	    }

	    public Double getProdSell(String prodCode) {
	        Double sellPrice = null;
	        try {
	            String query = "SELECT sellprice FROM products WHERE productcode='" +prodCode+ "'";
	            resultSet = statement.executeQuery(query);
	            if (resultSet.next())
	                sellPrice = resultSet.getDouble("sellprice");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return sellPrice;
	    }

	    String suppCode;
	    public String getSuppCode(String suppName) {
	        try {
	            String query = "SELECT codigo_proveedor FROM suppliers WHERE nombre='" +suppName+ "'";
	            resultSet = statement.executeQuery(query);
	            while (resultSet.next()) {
	                suppCode = resultSet.getString("codigo_proveedor");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return suppCode;
	    }

	    String prodCode;
	    public String getProdCode(String prodName) {
	        try {
	            String query = "SELECT productcode FROM products WHERE productname='" +prodName+ "'";
	            resultSet = statement.executeQuery(query);
	            while (resultSet.next()) {
	                suppCode = resultSet.getString("productcode");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return prodCode;
	    }

	    String custCode;
	    public String getCodigoCliente(String nombreCliente) {
	        try {
	            String query = "SELECT codigo_cliente FROM clientes WHERE nombre='" +nombreCliente+ "'";
	            resultSet = statement.executeQuery(query);
	            while (resultSet.next()) {
	            	custCode = resultSet.getString("codigo_cliente");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return custCode;
	    }

	    // Metodo para comprobar la disponibilidad de stock en Inventario
	    boolean flag = false;
	    public boolean checkStock(String prodCode) {
	        try {
	            String query = "SELECT * FROM currentstock WHERE productcode='" +prodCode+ "'";
	            resultSet = statement.executeQuery(query);
	            while (resultSet.next()) {
	                flag = true;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return flag;
	    }

	    // Metodos para agregar un nuevo producto
	    public void addProductDAO(ProductDTO productDTO) {
	        try {
	            String query = "SELECT * FROM products WHERE productname='"
	                    + productDTO.getProdName()
	                    + "' AND costprice='"
	                    + productDTO.getCostPrice()
	                    + "' AND sellprice='"
	                    + productDTO.getSellPrice()
	                    + "' AND brand='"
	                    + productDTO.getBrand()
	                    + "'";
	            resultSet = statement.executeQuery(query);
	            if (resultSet.next())
	                JOptionPane.showMessageDialog(null, "El producto ya ha sido agregado.");
	            else
	                addFunction(productDTO);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    public void addFunction(ProductDTO productDTO) {
	        try {
	            String query = "INSERT INTO products VALUES(null,?,?,?,?,?)";
	            prepStatement = (PreparedStatement) conn.prepareStatement(query);
	            prepStatement.setString(1, productDTO.getProdCode());
	            prepStatement.setString(2, productDTO.getProdName());
	            prepStatement.setDouble(3, productDTO.getCostPrice());
	            prepStatement.setDouble(4, productDTO.getSellPrice());
	            prepStatement.setString(5, productDTO.getBrand());

	            String query2 = "INSERT INTO currentstock VALUES(?,?)";
	            prepStatement2 = conn.prepareStatement(query2);
	            prepStatement2.setString(1, productDTO.getProdCode());
	            prepStatement2.setInt(2, productDTO.getQuantity());

	            prepStatement.executeUpdate();
	            prepStatement2.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Producto agregado y listo para la venta.");
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	    }

	    // Metodo para agregar una nueva transaccion de compra
	    public void addPurchaseDAO(ProductDTO productDTO) {
	        try {
	            String query = "INSERT INTO purchaseinfo VALUES(null,?,?,?,?,?)";
	            prepStatement = conn.prepareStatement(query);
	            prepStatement.setString(1, productDTO.getSuppCode());
	            prepStatement.setString(2, productDTO.getProdCode());
	            prepStatement.setString(3, productDTO.getDate());
	            prepStatement.setInt(4, productDTO.getQuantity());
	            prepStatement.setDouble(5, productDTO.getTotalCost());

	            prepStatement.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Registro de compras agregado.");
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }

	        String prodCode = productDTO.getProdCode();
	        if(checkStock(prodCode)) {
	            try {
	                String query = "UPDATE currentstock SET quantity=quantity+? WHERE productcode=?";
	                prepStatement = conn.prepareStatement(query);
	                prepStatement.setInt(1, productDTO.getQuantity());
	                prepStatement.setString(2, prodCode);

	                prepStatement.executeUpdate();
	            } catch (SQLException throwables) {
	                throwables.printStackTrace();
	            }
	        }
	        else if (!checkStock(prodCode)) {
	            try {
	                String query = "INSERT INTO currentstock VALUES(?,?)";
	                prepStatement = (PreparedStatement) conn.prepareStatement(query);
	                prepStatement.setString(1, productDTO.getProdCode());
	                prepStatement.setInt(2, productDTO.getQuantity());

	                prepStatement.executeUpdate();
	            } catch (SQLException throwables) {
	                throwables.printStackTrace();
	            }
	        }
	        deleteStock();
	    }

	    // Metodo para actualizar los detalles del producto existente
	    public void editProdDAO(ProductDTO productDTO) {
	        try {
	            String query = "UPDATE products SET productname=?,costprice=?,sellprice=?,brand=? WHERE productcode=?";
	            prepStatement = (PreparedStatement) conn.prepareStatement(query);
	            prepStatement.setString(1, productDTO.getProdName());
	            prepStatement.setDouble(2, productDTO.getCostPrice());
	            prepStatement.setDouble(3, productDTO.getSellPrice());
	            prepStatement.setString(4, productDTO.getBrand());
	            prepStatement.setString(5, productDTO.getProdCode());

	            String query2 = "UPDATE currentstock SET quantity=? WHERE productcode=?";
	            prepStatement2 = conn.prepareStatement(query2);
	            prepStatement2.setInt(1, productDTO.getQuantity());
	            prepStatement2.setString(2, productDTO.getProdCode());

	            prepStatement.executeUpdate();
	            prepStatement2.executeUpdate();
	            JOptionPane.showMessageDialog(null, "Detalles del producto actualizados.");
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	    }

	    // Metodos para manejar la actualizacion de existencias en Inventario ante cualquier transaccion realizada
	    public void editPurchaseStock(String code, int quantity) {
	        try {
	            String query = "SELECT * FROM currentstock WHERE productcode='" +code+ "'";
	            resultSet = statement.executeQuery(query);
	            if(resultSet.next()) {
	                String query2 = "UPDATE currentstock SET quantity=quantity-? WHERE productcode=?";
	                prepStatement = conn.prepareStatement(query2);
	                prepStatement.setInt(1, quantity);
	                prepStatement.setString(2, code);
	                prepStatement.executeUpdate();
	            }
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	    }
	    public void editSoldStock(String code, int quantity) {
	        try {
	            String query = "SELECT * FROM currentstock WHERE productcode='" +code+ "'";
	            resultSet = statement.executeQuery(query);
	            if(resultSet.next()) {
	                String query2 = "UPDATE currentstock SET quantity=quantity+? WHERE productcode=?";
	                prepStatement = conn.prepareStatement(query2);
	                prepStatement.setInt(1, quantity);
	                prepStatement.setString(2, code);
	                prepStatement.executeUpdate();
	            }
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	    }
	    public void deleteStock() {
	        try {
	            String query = "DELETE FROM currentstock WHERE productcode NOT IN(SELECT productcode FROM purchaseinfo)";
	            String query2 = "DELETE FROM salesinfo WHERE productcode NOT IN(SELECT productcode FROM products)";
	            statement.executeUpdate(query);
	            statement.executeUpdate(query2);
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	    }

	    // Metodo para eliminar permanentemente un producto del inventario
	    public void deleteProductDAO(String code) {
	        try {
	            String query = "DELETE FROM products WHERE productcode=?";
	            prepStatement = conn.prepareStatement(query);
	            prepStatement.setString(1, code);

	            String query2 = "DELETE FROM currentstock WHERE productcode=?";
	            prepStatement2 = conn.prepareStatement(query2);
	            prepStatement2.setString(1, code);

	            prepStatement.executeUpdate();
	            prepStatement2.executeUpdate();

	            JOptionPane.showMessageDialog(null, "Producto eliminado");
	        } catch (SQLException e){
	            e.printStackTrace();
	        }
	        deleteStock();
	    }

	    public void deletePurchaseDAO(int ID){
	        try {
	            String query = "DELETE FROM purchaseinfo WHERE purchaseID=?";
	            prepStatement = conn.prepareStatement(query);
	            prepStatement.setInt(1, ID);
	            prepStatement.executeUpdate();

	            JOptionPane.showMessageDialog(null, "La transacción ha sido eliminada.");
	        } catch (SQLException e){
	            e.printStackTrace();
	        }
	        deleteStock();
	    }

	    public void deleteSaleDAO(int ID) {
	        try {
	            String query = "DELETE FROM salesinfo WHERE salesID=?";
	            prepStatement = conn.prepareStatement(query);
	            prepStatement.setInt(1, ID);
	            prepStatement.executeUpdate();

	            JOptionPane.showMessageDialog(null, "La transacción ha sido eliminada.");
	        } catch (SQLException e){
	            e.printStackTrace();
	        }
	        deleteStock();
	    }

	    // Manejo de transacciones de ventas
	    public void sellProductDAO(ProductDTO productDTO, String username) {
	        int quantity = 0;
	        String prodCode = null;
	        try {
	            String query = "SELECT * FROM currentstock WHERE productcode='" +productDTO.getProdCode()+ "'";
	            resultSet = statement.executeQuery(query);
	            while (resultSet.next()) {
	                prodCode = resultSet.getString("productcode");
	                quantity = resultSet.getInt("quantity");
	            }
	            if (productDTO.getQuantity()>quantity)
	                JOptionPane.showMessageDialog(null, "Stock insuficiente para este producto.");
	            else if (productDTO.getQuantity()<=0)
	                JOptionPane.showMessageDialog(null, "Introduzca una cantidad válida");
	            else {
	                String stockQuery = "UPDATE currentstock SET quantity=quantity-'"
	                        +productDTO.getQuantity()
	                        +"' WHERE productcode='"
	                        +productDTO.getProdCode()
	                        +"'";
	                String salesQuery = "INSERT INTO salesinfo(date,productcode,customercode,quantity,revenue,soldby)" +
	                        "VALUES('"+productDTO.getDate()+"','"+productDTO.getProdCode()+"','"+productDTO.getCustCode()+
	                        "','"+productDTO.getQuantity()+"','"+productDTO.getTotalRevenue()+"','"+username+"')";
	                statement.executeUpdate(stockQuery);
	                statement.executeUpdate(salesQuery);
	                JOptionPane.showMessageDialog(null, "Producto vendido.");
	            }
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	    }

	    // Conjuntos de datos de productos para visualizacion
	    public ResultSet getQueryResult() {
	        try {
	            String query = "SELECT productcode,productname,costprice,sellprice,brand FROM products ORDER BY pid";
	            resultSet = statement.executeQuery(query);
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	        return resultSet;
	    }

	    // Conjunto de datos de la tabla de compras
	    public ResultSet getPurchaseInfo() {
	        try {
	            String query = "SELECT PurchaseID,purchaseinfo.ProductCode,ProductName,Quantity,Totalcost " +
	                    "FROM purchaseinfo INNER JOIN products " +
	                    "ON products.productcode=purchaseinfo.productcode ORDER BY purchaseid;";
	            resultSet = statement.executeQuery(query);
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	        return resultSet;
	    }

	    // Conjunto de datos de la tabla de existencias
	    public ResultSet getCurrentStockInfo() {
	        try {
	            String query = """
	                    SELECT currentstock.ProductCode,products.ProductName,
	                    currentstock.Quantity,products.CostPrice,products.SellPrice
	                    FROM currentstock INNER JOIN products
	                    ON currentstock.productcode=products.productcode;
	                    """;
	            resultSet = statement.executeQuery(query);
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	        return resultSet;
	    }

	    // Conjunto de datos de la tabla de ventas
	    public ResultSet getSalesInfo() {
	        try {
	            String query = """
	                    SELECT salesid,salesinfo.productcode,productname,
	                    salesinfo.quantity,revenue,users.name AS Sold_by
	                    FROM salesinfo INNER JOIN products
	                    ON salesinfo.productcode=products.productcode
	                    INNER JOIN users
	                    ON salesinfo.soldby=users.username;
	                    """;
	            resultSet = statement.executeQuery(query);
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	        return resultSet;
	    }

	    // Metodo de busqueda de productos
	    public ResultSet getProductSearch(String text) {
	        try {
	            String query = "SELECT productcode,productname,costprice,sellprice,brand FROM products " +
	                    "WHERE productcode LIKE '%"+text+"%' OR productname LIKE '%"+text+"%' OR brand LIKE '%"+text+"%'";
	            resultSet = statement.executeQuery(query);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return resultSet;
	    }

	    public ResultSet getProdFromCode(String text) {
	        try {
	            String query = "SELECT productcode,productname,costprice,sellprice,brand FROM products " +
	                    "WHERE productcode='" +text+ "' LIMIT 1";
	            resultSet = statement.executeQuery(query);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return resultSet;
	    }

	    // Metodo de busqueda de ventas
	    public ResultSet getSalesSearch(String text) {
	        try {
	            String query = "SELECT salesid,salesinfo.productcode,productname,\n" +
	                    "                    salesinfo.quantity,revenue,users.name AS Sold_by\n" +
	                    "                    FROM salesinfo INNER JOIN products\n" +
	                    "                    ON salesinfo.productcode=products.productcode\n" +
	                    "                    INNER JOIN users\n" +
	                    "                    ON salesinfo.soldby=users.username\n" +
	                    "                    INNER JOIN clientes\n" +
	                    "                    ON clientes.codigo_cliente=salesinfo.customercode\n" +
	                    "WHERE salesinfo.productcode LIKE '%"+text+"%' OR productname LIKE '%"+text+"%' " +
	                    "OR users.name LIKE '%"+text+"%' OR clientes.nombre LIKE '%"+text+"%' ORDER BY salesid;";
	            resultSet = statement.executeQuery(query);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return resultSet;
	    }

	    // Metodo de busqueda de registros de compra
	    public ResultSet getPurchaseSearch(String text) {
	        try {
	            String query = "SELECT PurchaseID,purchaseinfo.productcode,products.productname,quantity,totalcost " +
	                    "FROM purchaseinfo INNER JOIN products ON purchaseinfo.productcode=products.productcode " +
	                    "INNER JOIN suppliers ON purchaseinfo.suppliercode=suppliers.codigo_proveedor" +
	                    "WHERE PurchaseID LIKE '%"+text+"%' OR productcode LIKE '%"+text+"%' OR productname LIKE '%"+text+"%' " +
	                    "OR suppliers.nombre LIKE '%"+text+"%' OR purchaseinfo.suppliercode LIKE '%"+text+"%' " +
	                    "OR date LIKE '%"+text+"%' ORDER BY purchaseid";
	            resultSet = statement.executeQuery(query);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return resultSet;
	    }

	    public ResultSet getProdName(String code) {
	        try {
	            String query = "SELECT productname FROM products WHERE productcode='" +code+ "'";
	            resultSet = statement.executeQuery(query);
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	        return resultSet;
	    }

	    public String getSuppName(int ID) {
	        String name = null;
	        try {
	            String query = "SELECT nombre FROM suppliers " +
	                    "INNER JOIN purchaseinfo ON suppliers.codigo_proveedor=purchaseinfo.suppliercode " +
	                    "WHERE purchaseid='" +ID+ "'";
	            resultSet = statement.executeQuery(query);
	            if (resultSet.next())
	                name = resultSet.getString("nombre");
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	        return name;
	    }

	    public String getCustName(int ID) {
	        String name = null;
	        try {
	            String query = "SELECT nombre FROM clientes " +
	                    "INNER JOIN salesinfo ON clientes.codigo_cliente=salesinfo.customercode " +
	                    "WHERE salesid='" +ID+ "'";
	            resultSet = statement.executeQuery(query);
	            if (resultSet.next())
	                name = resultSet.getString("nombre");
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	        return name;
	    }

	    public String getPurchaseDate(int ID) {
	        String date = null;
	        try {
	            String query = "SELECT date FROM purchaseinfo WHERE purchaseid='" +ID+ "'";
	            resultSet = statement.executeQuery(query);
	            if (resultSet.next())
	                date = resultSet.getString("date");
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	        return date;
	    }
	    public String getSaleDate(int ID) {
	        String date = null;
	        try {
	            String query = "SELECT date FROM salesinfo WHERE salesid='" +ID+ "'";
	            resultSet = statement.executeQuery(query);
	            if (resultSet.next())
	                date = resultSet.getString("date");
	        } catch (SQLException throwables) {
	            throwables.printStackTrace();
	        }
	        return date;
	    }


	    // Metodo para mostrar el conjunto de datos relacionados con el producto en forma tabular
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