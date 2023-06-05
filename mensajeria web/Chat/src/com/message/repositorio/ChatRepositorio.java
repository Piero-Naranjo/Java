package com.message.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.message.dominio.Chat;
import com.message.dominio.Msj;
import com.message.dominio.Usuario;

public class ChatRepositorio {
	
	private UsuarioRepositorio usuario; private MsjRepositorio mensaje;
	
	public ChatRepositorio() {
		usuario = new UsuarioRepositorio();
		mensaje = new MsjRepositorio();
	}

	public UsuarioRepositorio getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioRepositorio usuario) {
		this.usuario = usuario;
	}

	public MsjRepositorio getMensaje() {
		return mensaje;
	}

	public void setMensaje(MsjRepositorio mensaje) {
		this.mensaje = mensaje;
	}
	
	public List<Chat> getChat(int userId){
		List<Chat> contactMsj = new ArrayList<Chat>();
		List<Usuario> contactos = usuario.getUsuarios();
		
		for(Usuario l: contactos) {
			if(l.getId() == userId)
				continue;
			
			Msj ultimoMsj = mensaje.getUltimoMsj(userId, l.getId());
			
			if(ultimoMsj == null)
				continue;
			
			Usuario contacto = usuario.userId(l.getId());
			
			contactMsj.add(new Chat(contacto, ultimoMsj));
		}		
		return contactMsj;
	}

}
