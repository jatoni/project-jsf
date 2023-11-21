package com.devpredator.projects.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.projects.entity.empleado;
import com.devpredator.projects.services.EmpleadoService;

/*
 * Clase controller que se encarga de procesar la informacion para la pantalla principal
 */

@ManagedBean
@ViewScoped
public class PrincipalController {

	private List<empleado> empleados;
	private EmpleadoService empleadoService = new EmpleadoService();

	/*
	 * Metodo que se encarga de inicializar la informacion de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}

	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleados();
	}

	public List<empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<empleado> empleados) {
		this.empleados = empleados;
	}

}
