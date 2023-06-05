package com.message.dominio;

public class Chat {
	
	private Usuario usuario;
	private Msj mensaje;
	
	public Chat(Usuario usuario, Msj mensaje) {
		this.usuario = usuario;
		this.mensaje = mensaje;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Msj getMensaje() {
		return mensaje;
	}

	public void setMensaje(Msj mensaje) {
		this.mensaje = mensaje;
	}

}
