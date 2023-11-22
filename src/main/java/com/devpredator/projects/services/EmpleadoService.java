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
		empleado empleadoNetflix = new empleado();
		empleado empleadoAmazon = new empleado();
		empleado empleadoHP = new empleado();
		empleado empleadoOracle = new empleado();
		empleado empleadoDeloite = new empleado();
		empleado empleadoDisney = new empleado();

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

		// ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

		empleadoNetflix.setNombre("Jessica");
		empleadoNetflix.setPrimerApellido("Martinex");
		empleadoNetflix.setSegundoApellido("Torres");
		empleadoNetflix.setPuesto("Developer Jr");
		empleadoNetflix.setEstatus(true);

		empleadoAmazon.setNombre("Martin");
		empleadoAmazon.setPrimerApellido("Castro");
		empleadoAmazon.setSegundoApellido("Lopez");
		empleadoAmazon.setPuesto("Data Analytics");
		empleadoAmazon.setEstatus(true);

		empleadoHP.setNombre("Arturo");
		empleadoHP.setPrimerApellido("Garcia");
		empleadoHP.setSegundoApellido("Montez");
		empleadoHP.setPuesto("Architect");
		empleadoHP.setEstatus(true);

		// ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

		empleadoOracle.setNombre("Luisa");
		empleadoOracle.setPrimerApellido("Antonio");
		empleadoOracle.setSegundoApellido("Torres");
		empleadoOracle.setPuesto("Senior Developer Java");
		empleadoOracle.setEstatus(true);

		empleadoDeloite.setNombre("Lupita");
		empleadoDeloite.setPrimerApellido("Perez");
		empleadoDeloite.setSegundoApellido("Lopez");
		empleadoDeloite.setPuesto("CEO");
		empleadoDeloite.setEstatus(true);

		empleadoDisney.setNombre("Carlos");
		empleadoDisney.setPrimerApellido("Garcia");
		empleadoDisney.setSegundoApellido("Montez");
		empleadoDisney.setPuesto("Architect");
		empleadoDisney.setEstatus(true);

		empleados.add(empleadoIBM);
		empleados.add(empleadoApple);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHP);
		empleados.add(empleadoOracle);
		empleados.add(empleadoDeloite);
		empleados.add(empleadoDisney);

		return empleados;

	}
}
