package application;

import java.sql.*;

public class BaseDeDatos {
	String nombre="fct";
	public String Proveedores() {
		String resultado="";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+nombre,"root","");
			Statement sentencia =conexion.createStatement();
			String sql="SELECT CIF_PROVEEDOR,FEC_HOMOLOGACIÓN FROM prov_comp";
			
			ResultSet resul =sentencia.executeQuery(sql);
			while(resul.next()) {
				resultado=resultado+ resul.getString(1)+"  "+resul.getTimestamp(2)+"/n";
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(resultado);
		return resultado;
		
	}
	public String Facturas() {
		String resultado="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion =DriverManager.getConnection("jdbc:mysql://localhost:3306/"+nombre,"root","");
			Statement sentencia =conexion.createStatement();
			String sql="SELECT CIF_PROVEEDOR,FEC_VENCIMIENTO FROM `fact_prov` WHERE `CIF_PROVEEDOR` LIKE '130g'";
			
			ResultSet resul =sentencia.executeQuery(sql);
			while(resul.next()) {
				resultado=resultado+ resul.getString(1)+"  "+resul.getTimestamp(2)+"/n";
			}
			System.out.println(resultado);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultado;
		
	}
}
