package com.inventory.Database;

import java.sql.SQLException;

public class EjecutarConexion {

	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		ConnectionFactory conectar = new ConnectionFactory();
		conectar.getConn();
		
	}

}
