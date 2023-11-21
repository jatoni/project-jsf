/**
 * 
 */
package com.devpredator.projects.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.projects.entity.empleado;

/**
 * Clase que permite realizar la logica del negocio para empleados
 */
public class EmpleadoService {

	/*
	 * 
	 * Metodo que permite consultar la lista de empleados de empresas de TI.
	 * 
	 * @return {@link Empleado} lista de empleados
	 * 
	 */
	public List<empleado> consultarEmpleados() {
		List<empleado> empleados = new ArrayList<empleado>();
		empleado empleadoIBM = new empleado();
		empleado empleadoMicrosoft = new empleado();
		empleado empleadoApple = new empleado();

		empleadoIBM.setNombre("Juan");
		empleadoIBM.setPrimerApellido("Antonio");
		empleadoIBM.setSegundoApellido("Torres");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);

		empleadoMicrosoft.setNombre("Luis");
		empleadoMicrosoft.setPrimerApellido("Perez");
		empleadoMicrosoft.setSegundoApellido("Lopez");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);

		empleadoApple.setNombre("Javier");
		empleadoApple.setPrimerApellido("Garcia");
		empleadoApple.setSegundoApellido("Montez");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setEstatus(true);

		empleados.add(empleadoIBM);
		empleados.add(empleadoApple);
		empleados.add(empleadoMicrosoft);

		return empleados;

	}
}
