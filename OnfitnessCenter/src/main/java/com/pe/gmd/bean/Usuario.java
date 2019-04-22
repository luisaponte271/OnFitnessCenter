package com.pe.gmd.bean;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped; 
import javax.servlet.http.HttpSession;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.MenuModel;

import com.pe.gmd.dao.UsuarioDAO;
import com.pe.gmd.jsf.util.SessionUtils;

import lombok.Getter;
import lombok.Setter;

@ManagedBean
@SessionScoped
@Getter
@Setter
public class Usuario implements Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 6660551594309496028L;
	/**
	 * 
	 */

 
	private String codigo;
	private String contraseña;
	private String msg;
	private List<Permiso> listaPermisos;
	MenuModel model = new DefaultMenuModel();
	 
	
    public String validateCorreoPassword() {
			boolean valid = UsuarioDAO.validate(codigo, contraseña);
			if (valid) {
				HttpSession session = SessionUtils.getSession();
				session.setAttribute("codigoSession", codigo);
				
				listaPermisos = UsuarioDAO.listarPermisos(codigo);
				 Iterator<Permiso> itr = listaPermisos.iterator();
				
				while(itr.hasNext()) {
				 Permiso per = itr.next();
				  
					 DefaultMenuItem item = new DefaultMenuItem(per.getMenu());
					 item.setUrl(per.getUrl());
					 model.addElement(item);
				}
				  
				return "index";
			} else {
			
				return "login";
			}
		}

		
		public String logout() {
			HttpSession session = SessionUtils.getSession();
			session.invalidate();
			return "login";
		}
	
}
