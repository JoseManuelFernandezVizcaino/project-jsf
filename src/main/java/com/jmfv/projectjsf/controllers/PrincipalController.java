/**
 * 
 */
package com.jmfv.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.jmfv.projectjsf.entity.Empleado;
import com.jmfv.projectjsf.services.EmpleadoService;

/**
 * @author jmfer
 * Clasae controller que se encarga de procesar informacion para la pantalla principal
 */
@ManagedBean
@ViewScoped
public class PrincipalController {
	/**
	 * Lista de emmpleados para la tabla
	 */
	private List<Empleado> empleados;
	
	/**
	 * Servicio con los metodos que realizan la logica de negocio de empleados
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
	
	/**
	 * Metodo que se encarga de inicializar la informacion de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	/**
	 * Metodo que consulta la lista de empleados
	 */
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
} 
