package com.message.repositorio;

import java.util.ArrayList;
import java.util.List;

import com.message.dominio.Usuario;

public class UsuarioRepositorio {

private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public UsuarioRepositorio() {
		usuarios.add(new Usuario(1,
				"Piero", "Naranjo", "piero2023", 
				"https://pps.whatsapp.net/v/t61.24694-24/321232915_729467285305113_8775103543417671506_n.jpg?ccb=11-4&oh=01_AdTIh3GRCtb69kkack5FLYQKjGfFqpqVyn2HettE61lJtw&oe=63F6344A",
				"piero2023", "Desconectado"));
		usuarios.add(new Usuario(2,
				"Andres", "Jaramillo", "andres2023",
				"https://pps.whatsapp.net/v/t61.24694-24/294504075_451560630173635_5302435537072338939_n.jpg?ccb=11-4&oh=01_AdRTubCW7Znn2qC52Xh0N4hVGXhmlH--Pb7W4EUyKj-Z0w&oe=63F69D00",
				"andres2023", "Desconectado"));
		usuarios.add(new Usuario(3, 
				"Michael", "Chango", "michael2023",
				"https://pps.whatsapp.net/v/t61.24694-24/149790305_372702504305767_2543399615771940520_n.jpg?ccb=11-4&oh=01_AdTUkHofdnOFWmG29v8TA79YB_bchG9myXQhos9cJiCrog&oe=63F67EEC",
				"michael2023", "Desconectado"));
		usuarios.add(new Usuario(4,
				"Litsy", "Mejia", "litsy2023",
				"https://pps.whatsapp.net/v/t61.24694-24/322085534_204440905467033_8986740605007721321_n.jpg?ccb=11-4&oh=01_AdTf9SAzvaR7iBM1vJfLQXSVvpKUUlbLDeg6DKNV12-0vA&oe=63F67E23",
				"litsy2023", "En línea"));
		usuarios.add(new Usuario(5,
				"Paolo", "Leon", "paolo2023",
				"https://img.wattpad.com/015c4d6940cb1a8d07ef9781cafdfe07d8aa95fd/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f3242622d34676b367343445564413d3d2d3935353639303636302e3136333636653661373236323161323631313839363533373037342e6a7067",
				"paolo2023", "Desconectado"));
		usuarios.add(new Usuario(6,
				"Tomas", "Gutierrez", "tomas2023",
				"https://i.pinimg.com/474x/b4/20/88/b42088d759ad64736843e7e789e86726.jpg",
				"tomas2023", "En línea"));
		usuarios.add(new Usuario(7,
				"Andrea", "Pluas", "andrea2023",
				"https://tecnoandroid.net/wp-content/uploads/2022/02/fotos-boninas-para-perfil-whatsapp-gratis-sin-frase-261.jpg",
				"andrea2023", "Desonectado"));
		usuarios.add(new Usuario(8,
				"Roberta", "Delgado", "roberta2023",
				"https://tecnoandroid.net/wp-content/uploads/2022/02/fotos-boninas-para-perfil-whatsapp-gratis-sin-frase-193.jpg",
				"roberta2023", "En línea"));
	}
	
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public Usuario userId(int id) {
		for(Usuario user: usuarios) {
			if(user.getId() == id)
				return user;
		}
		return null;
	}
	
	public Usuario userName(String username) {
		for(Usuario user: usuarios) {
			if(user.getUsername().equals(username))
				return user;
		}
		return null;
	}
	
	public Usuario password(String username, String clave) {
		for(Usuario user: usuarios) {
			if(user.getUsername().equals(username) && user.getClave().equals(clave))
				return user;
		}
		return null;
	}
}
