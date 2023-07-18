/**
 * 
 */
package com.jmfv.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.jmfv.projectjsf.entity.Empleado;

/**
 * @author jmfer
 * Clase que permite realizar la logica de negocio para empleados
 */
public class EmpleadoService {
	
	/**
	 * Metodo que permite consultar la lista de empleado de empresas de TI
	 * @return ({@link Empleado}) lista de empleados.
	 */
	public List<Empleado> consultarEmpleados() {
		
		List <Empleado> empleados = new ArrayList<Empleado>();
	
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Jose Manuel");
		empleadoIBM.setPrimerApellido("Fernandez");
		empleadoIBM.setSegundoApellido("Vizcaino");
		empleadoIBM.setPuesto("Junior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Luis");
		empleadoMicrosoft.setPrimerApellido("López");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Jesús");
		empleadoApple.setPrimerApellido("Ruiz");
		empleadoApple.setSegundoApellido("Fernandez");
		empleadoApple.setPuesto("Senior Developer Java");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
	}
	
}
