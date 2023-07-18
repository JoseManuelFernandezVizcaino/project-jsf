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
		
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHP = new Empleado();
		
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoDeloitte = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
		empleadoIBM.setNombre("Jose Manuel");
		empleadoIBM.setPrimerApellido("Fernandez");
		empleadoIBM.setSegundoApellido("Vizcaino");
		empleadoIBM.setPuesto("Junior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Luis");
		empleadoMicrosoft.setPrimerApellido("López");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(false);
		
		empleadoApple.setNombre("Jesús");
		empleadoApple.setPrimerApellido("Ruiz");
		empleadoApple.setSegundoApellido("Fernandez");
		empleadoApple.setPuesto("Senior Developer Java");
		empleadoApple.setEstatus(true);
		
		//-----
		
		empleadoAmazon.setNombre("Cristian");
		empleadoAmazon.setPrimerApellido("Fernandez");
		empleadoAmazon.setSegundoApellido("Vizcaino");
		empleadoAmazon.setPuesto("Junior Developer Java");
		empleadoAmazon.setEstatus(true);
		
		empleadoDeloitte.setNombre("Luisa");
		empleadoDeloitte.setPrimerApellido("López");
		empleadoDeloitte.setSegundoApellido("Romero");
		empleadoDeloitte.setPuesto("CEO");
		empleadoDeloitte.setEstatus(false);
		
		empleadoHP.setNombre("Josefa");
		empleadoHP.setPrimerApellido("Ruiz");
		empleadoHP.setSegundoApellido("Fernandez");
		empleadoHP.setPuesto("Senior Developer Java");
		empleadoHP.setEstatus(false);
		
		empleadoNetflix.setNombre("Carlos");
		empleadoNetflix.setPrimerApellido("Fernandez");
		empleadoNetflix.setSegundoApellido("Vizcaino");
		empleadoNetflix.setPuesto("Junior Developer Java");
		empleadoNetflix.setEstatus(true);
		
		empleadoOracle.setNombre("Cesar");
		empleadoOracle.setPrimerApellido("López");
		empleadoOracle.setSegundoApellido("Romero");
		empleadoOracle.setPuesto("CEO");
		empleadoOracle.setEstatus(false);
		
		empleadoDisney.setNombre("Julian");
		empleadoDisney.setPrimerApellido("Ruiz");
		empleadoDisney.setSegundoApellido("Fernandez");
		empleadoDisney.setPuesto("Senior Developer Java");
		empleadoDisney.setEstatus(false);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		empleados.add(empleadoNetflix);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHP);
		
		empleados.add(empleadoOracle);
		empleados.add(empleadoDeloitte);
		empleados.add(empleadoDisney);
		
		return empleados;
	}
	
}
