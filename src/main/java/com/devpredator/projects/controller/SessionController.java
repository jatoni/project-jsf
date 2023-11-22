package com.devpredator.projects.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.devpredator.projects.dto.UsuarioDto;

/*
 * clase que se encarga de mantener la informacion del usuario que ingresa al aplicativo en session
 */

@ManagedBean
@SessionScoped
public class SessionController {
	/*
	 * Usuario que se mantendra en session
	 */
	private UsuarioDto usuarioDto;

	@PostConstruct
	public void init() {
		System.out.println("Cargando informacion del usuario en la sesion");
	}

	/**
	 * @return the usuarioDto
	 */
	public UsuarioDto getUsuarioDto() {
		return usuarioDto;
	}

	/**
	 * @param usuarioDto the usuarioDto to set
	 */
	public void setUsuarioDto(UsuarioDto usuarioDto) {
		this.usuarioDto = usuarioDto;
	}

}
