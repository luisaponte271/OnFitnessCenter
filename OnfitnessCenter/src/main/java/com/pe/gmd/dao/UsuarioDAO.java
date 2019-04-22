package com.pe.gmd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pe.gmd.bean.Permiso;
import com.pe.gmd.jsf.config.DataConnect;

public class UsuarioDAO {

	public static boolean validate(String codigo, String password) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DataConnect.getConnection();
			ps = con.prepareStatement("Select codigo, contraseña from usuario where codigo = ? and contraseña = ?");
			ps.setString(1, codigo);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) { 
				return true;
			}
		} catch (SQLException ex) {
			System.out.println("Login error -->" + ex.getMessage());
			return false;
		} finally {
			DataConnect.close(con);
		}
		return false;
	}
	
	public static List<Permiso> listarPermisos(String codigo) {
		Connection con = null;
		PreparedStatement ps = null;
		
		List<Permiso> listaPermisos = new ArrayList<Permiso>();

		try {
		 con = DataConnect.getConnection();
		 ps = con.prepareStatement("Select menuID, menu from viewPermisosUsuario where codigo = ?");
		 ps.setString(1, codigo);
		 ResultSet rs = ps.executeQuery();
		  
         while ( rs.next() ) {
             Permiso permiso = new Permiso();
             
             permiso.setId(rs.getString("menuID"));
             permiso.setMenu(rs.getString("menu"));
        	 
             listaPermisos.add(permiso);
        	  
         	}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return listaPermisos; 
	}
}