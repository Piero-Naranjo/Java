package com.message.repositorio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.message.dominio.Msj;
import com.message.dominio.Usuario;

public class MsjRepositorio {
	
	private List<Msj> mensajes = new ArrayList<Msj>();
	private UsuarioRepositorio usuario = new UsuarioRepositorio();
	
	public MsjRepositorio() {
		Usuario piero   = usuario.userId(1);
		Usuario andres  = usuario.userId(2);
		Usuario michael = usuario.userId(3);
		Usuario litsy   = usuario.userId(4);
		Usuario paolo   = usuario.userId(5);
		Usuario tomas   = usuario.userId(6);
		Usuario andrea  = usuario.userId(7);
		Usuario roberta = usuario.userId(8);
		
//chatpiero
		//andres-piero
		mensajes.add(new Msj(1, andres, piero, LocalDateTime.now(), "Hola Piero"));
		mensajes.add(new Msj(2, piero, andres, LocalDateTime.now(), "Que hay"));
		mensajes.add(new Msj(3, piero, andres, LocalDateTime.now(), "Como has estado bro"));
		mensajes.add(new Msj(4, andres, piero, LocalDateTime.now(), "Todo bien bro a los tiempos"));
		//michael-piero
		mensajes.add(new Msj(5, piero, michael, LocalDateTime.now(), "Oye cierto que el viernes hay un evento en la facultdad"));
		mensajes.add(new Msj(6, michael, piero, LocalDateTime.now(), "Sii es a las 10 es obligatorio ir"));
		mensajes.add(new Msj(7, piero, michael, LocalDateTime.now(), "Yo no iré, igualmente no darán nada"));
		mensajes.add(new Msj(8, michael, piero, LocalDateTime.now(), "Es verdad xd"));
		//litsy-piero
		mensajes.add(new Msj(9, piero, litsy, LocalDateTime.of(2022, 05, 16, 11, 10), "Hola perdida"));
		mensajes.add(new Msj(10, litsy, piero, LocalDateTime.of(2022, 05, 16, 11, 10), "kheee perdida yo xd"));
		mensajes.add(new Msj(11, piero, litsy, LocalDateTime.of(2022, 05, 16, 11, 10), "Si eres xd"));
		mensajes.add(new Msj(12, litsy, piero, LocalDateTime.of(2022, 05, 16, 11, 10), "No :v"));
		//tomas-piero
		mensajes.add(new Msj(13, tomas, piero, LocalDateTime.now(), "Que hay bro pilas el sabado vamos a jugar futbol"));
		mensajes.add(new Msj(14, piero, tomas, LocalDateTime.now(), "Ya de una confirma si van todos"));
		mensajes.add(new Msj(15, tomas, piero, LocalDateTime.now(), "Para ganarte como la otra vez"));
		mensajes.add(new Msj(16, piero, tomas, LocalDateTime.now(), "Pura suerte no más"));
		
		//piero-andrea
		mensajes.add(new Msj(13, andrea, piero, LocalDateTime.now(), "Holii te acuerdas de mi??? :)"));
		mensajes.add(new Msj(14, piero, andrea, LocalDateTime.now(), "hola que tal, este no como te llamas???"));
		mensajes.add(new Msj(15, andrea, piero, LocalDateTime.now(), "Te pierdes y ya no recuerdas, soy Andrea bobito jeje"));
		mensajes.add(new Msj(16, piero, andrea, LocalDateTime.now(), "Ahhhhhhh"));
		
//Chat tomas		
		//tomas-paolo
		mensajes.add(new Msj(17, tomas, paolo, LocalDateTime.now(), "Como vas con el proyecto de programacion"));
		mensajes.add(new Msj(18, paolo, tomas, LocalDateTime.now(), "Ya casi lo termino esta heavy jaja"));
		mensajes.add(new Msj(19, tomas, paolo, LocalDateTime.now(), "Tengo algunas dudas ¿Me puedes ayudar?"));
		mensajes.add(new Msj(20, paolo, tomas, LocalDateTime.now(), "Por supuesto bro"));

//chat andres
		//andres-michael
		mensajes.add(new Msj(33, andres, michael, LocalDateTime.now(), "Habla bro hay que hacer ese proyecto de programación"));
		mensajes.add(new Msj(34, michael, andres, LocalDateTime.now(), "Simón loco de una para hacer esa nota"));
		mensajes.add(new Msj(35, andres, michael, LocalDateTime.now(), "Pilas bro para tener todo al día"));
		mensajes.add(new Msj(36, michael, andres, LocalDateTime.now(), "Ya"));
		//andres-litsy
		mensajes.add(new Msj(37, andres, litsy, LocalDateTime.now(), "Oe te tengo un chisme"));
		mensajes.add(new Msj(38, litsy, andres, LocalDateTime.now(), "Aver cuenta cuenta xd"));
		mensajes.add(new Msj(39, andres, litsy, LocalDateTime.now(), "Sapa"));
		mensajes.add(new Msj(40, litsy, andres, LocalDateTime.now(), ":v"));
		//andres-tomas
		mensajes.add(new Msj(41, tomas, andres, LocalDateTime.now(), "Oe sacamos 10 en la exposición de contabilidad"));
		mensajes.add(new Msj(42, andres, tomas, LocalDateTime.now(), "Todos leímos xd"));
		mensajes.add(new Msj(43, tomas, andres, LocalDateTime.now(), "JAJAJAJAJJAJAJAJAJAJA simón"));
		mensajes.add(new Msj(44, andres, tomas, LocalDateTime.now(), "Ya está, easy"));
		//andres-paolo
		mensajes.add(new Msj(45, andres, paolo, LocalDateTime.now(), "A ti te toca realizar el ejercicio 5 de analisis"));
		mensajes.add(new Msj(46, paolo, andres, LocalDateTime.now(), "Ya hice todo la semana pasada :v"));
		mensajes.add(new Msj(47, andres, paolo, LocalDateTime.now(), "Verdad, ya le diré a Piero que haga"));
		mensajes.add(new Msj(48, paolo, andres, LocalDateTime.now(), "Como loco :v"));
		//andres-andrea
		mensajes.add(new Msj(49, andres, andrea, LocalDateTime.now(), "Oe puedes comprarle a la dulce brujita"));
		mensajes.add(new Msj(50, andrea, andres, LocalDateTime.now(), "Que es eso?"));
		mensajes.add(new Msj(51, andres, andrea, LocalDateTime.now(), "Una amiga que vende ricos postres"));
		mensajes.add(new Msj(52, andrea, andres, LocalDateTime.now(), "Ya le voy a comprar para ver que tal"));
		//andres-roberta
		mensajes.add(new Msj(53, roberta, andres, LocalDateTime.now(), "Regalale a tu novio un lindo cuadro con soleid_art"));
		mensajes.add(new Msj(54, andres, roberta, LocalDateTime.now(), "Y hace bonitos cuadros?"));
		mensajes.add(new Msj(55, roberta, andres, LocalDateTime.now(), "Simon, si los hace bien bacán"));
		mensajes.add(new Msj(56, andres, roberta, LocalDateTime.now(), "Ya me voy a contactar con ella"));
		
//chat michael
		//michael-litsy
		mensajes.add(new Msj(57, michael, litsy, LocalDateTime.now(), "Hola agg"));
		mensajes.add(new Msj(58, litsy, michael, LocalDateTime.now(), "Quien eres? xd"));
		mensajes.add(new Msj(59, michael, litsy, LocalDateTime.now(), "Soy Michael wera"));
		mensajes.add(new Msj(60, litsy, michael, LocalDateTime.now(), "Ya te agg xd"));
		//michael-tomas
		mensajes.add(new Msj(61, tomas, michael, LocalDateTime.now(), "Vamonos de la clase de contabilidad"));
		mensajes.add(new Msj(62, michael, tomas, LocalDateTime.now(), "No bro, nos pondrá falta"));
		mensajes.add(new Msj(63, tomas, michael, LocalDateTime.now(), "Miedoso"));
		mensajes.add(new Msj(64, michael, tomas, LocalDateTime.now(), "Si soy"));
		//michael-paolo
		mensajes.add(new Msj(65, michael, paolo, LocalDateTime.now(), "Hay que festejar carnaval a lo grande"));
		mensajes.add(new Msj(66, paolo, michael, LocalDateTime.now(), "Vamos a la playa con los muchachos"));
		mensajes.add(new Msj(67, michael, paolo, LocalDateTime.now(), "Que se arme los planes"));
		mensajes.add(new Msj(68, paolo, michael, LocalDateTime.now(), "Ya les aviso"));
		//michael-andrea
		mensajes.add(new Msj(69, michael, andrea, LocalDateTime.now(), "Hola vamos al supercines"));
		mensajes.add(new Msj(70, andrea, michael, LocalDateTime.now(), "Hola miche no puedo ir, estoy enferma"));
		mensajes.add(new Msj(71, michael, andrea, LocalDateTime.now(), "Que pena :c tenía ganas de verte"));
		mensajes.add(new Msj(72, andrea, michael, LocalDateTime.now(), "Yo muchísimo más..."));
		//michael-roberta
		mensajes.add(new Msj(73, roberta, michael, LocalDateTime.now(), "Hola pasa el archivo no seas hueso"));
		mensajes.add(new Msj(74, michael, roberta, LocalDateTime.now(), "Yo no lo tengo xd"));
		mensajes.add(new Msj(75, roberta, michael, LocalDateTime.now(), "No te creo nada :v"));
		mensajes.add(new Msj(76, michael, roberta, LocalDateTime.now(), "Como quieras xd"));
		
		
//chat litsy
		//litsy-tomas
		mensajes.add(new Msj(77, tomas, litsy, LocalDateTime.now(), "Hola ¿Como estás?"));
		mensajes.add(new Msj(78, litsy, tomas, LocalDateTime.now(), "Bien ¿Y tú?"));
		mensajes.add(new Msj(79, tomas, litsy, LocalDateTime.now(), "Bien amigo"));
		mensajes.add(new Msj(80, litsy, tomas, LocalDateTime.now(), "ª"));
		//litsy-paolo
		mensajes.add(new Msj(81, litsy, paolo, LocalDateTime.now(), "Holiiiis ayudame en programacion :c"));
		mensajes.add(new Msj(82, paolo, litsy, LocalDateTime.now(), "jaja dime en que quieres que te ayude"));
		mensajes.add(new Msj(83, litsy, paolo, LocalDateTime.now(), "Pasame el codigo del proyecto :c"));
		mensajes.add(new Msj(84, paolo, litsy, LocalDateTime.now(), "No"));
		//litsy-andrea
		mensajes.add(new Msj(85, litsy, andrea, LocalDateTime.now(), "Holis amiwoooo como estas"));
		mensajes.add(new Msj(86, andrea, litsy, LocalDateTime.now(), "Hola miche bien aqui trabajando y tu"));
		mensajes.add(new Msj(87, litsy, andrea, LocalDateTime.now(), "Deposita :3"));
		mensajes.add(new Msj(88, andrea, litsy, LocalDateTime.now(), "Loquita..."));
		//litsy-roberta	
		mensajes.add(new Msj(89, roberta, litsy, LocalDateTime.now(), "Holis bobita oye pasame el deber de estadistica"));
		mensajes.add(new Msj(90, litsy, roberta, LocalDateTime.now(), "hazlo tu sola xd"));
				
//chat tomas
		//tomas-paolo	
		mensajes.add(new Msj(47, tomas, andrea, LocalDateTime.now(), "Todo bien socio confirma donde andas"));
		mensajes.add(new Msj(48, andrea, tomas, LocalDateTime.now(), "Aqui en caleta viendo los partidos del mundial"));
		mensajes.add(new Msj(47, tomas, andrea, LocalDateTime.now(), "Vamos por unas bielas a ver el partido del idolosh"));
		mensajes.add(new Msj(48, andrea, tomas, LocalDateTime.now(), "De una my dog"));
				
		mensajes.add(new Msj(49, roberta, tomas, LocalDateTime.now(), "Holis vamos al cine"));
		mensajes.add(new Msj(50, tomas, roberta, LocalDateTime.now(), "Al fin tu y yo solos"));
		mensajes.add(new Msj(49, roberta, tomas, LocalDateTime.now(), "Va a ir mi novio"));
		mensajes.add(new Msj(50, tomas, roberta, LocalDateTime.now(), "Ohhh..."));
				
//chat paolo
		//paolo-andrea
		mensajes.add(new Msj(51, paolo, andrea, LocalDateTime.now(), "Quieres salir conmigo mañana al cine??"));
		mensajes.add(new Msj(52, andrea, paolo, LocalDateTime.now(), "Claro Paolo"));
		mensajes.add(new Msj(52, andrea, paolo, LocalDateTime.now(), "Me gustaria salir contigo"));
		mensajes.add(new Msj(52, andrea, paolo, LocalDateTime.now(), "Llevo falda?"));
		mensajes.add(new Msj(51, paolo, andrea, LocalDateTime.now(), "No entendí..."));
		//paolo-roberta
		mensajes.add(new Msj(53, roberta, paolo, LocalDateTime.now(), "Holaaaaaaaa perdidoooooo"));
		mensajes.add(new Msj(54, paolo, roberta, LocalDateTime.now(), "Holaaaa perdida"));
		mensajes.add(new Msj(53, roberta, paolo, LocalDateTime.now(), "Te amo"));
		mensajes.add(new Msj(54, paolo, roberta, LocalDateTime.now(), "Yo más"));
		mensajes.add(new Msj(53, roberta, paolo, LocalDateTime.now(), "Te amordido un perro?"));
		mensajes.add(new Msj(54, paolo, roberta, LocalDateTime.now(), "Yo masticaba chicle xd"));
				
//chat roberta
		//roberta-andrea
		mensajes.add(new Msj(55, roberta, andrea, LocalDateTime.now(), "Holi nena como te va"));
		mensajes.add(new Msj(56, andrea, roberta, LocalDateTime.now(), "Aqui cansada haciendo tareas y tu??"));
		mensajes.add(new Msj(55, roberta, andrea, LocalDateTime.now(), "No hay tareas si no ingresas al Moodle"));
		mensajes.add(new Msj(56, andrea, roberta, LocalDateTime.now(), "Tienes razón, eso haré..."));		
	}
	
	public List<Msj> getMensajes(){
		return mensajes;
	}
	
	public List<Msj> conversaciones(int usuario1, int usuario2) {
		List<Msj> resultado = new ArrayList<Msj>();
		for(Msj msj: mensajes) {
			if((msj.getUsuario1().getId() == usuario1 && msj.getUsuario2().getId() == usuario2) || (
					msj.getUsuario1().getId() == usuario2 && msj.getUsuario2().getId() == usuario1))
				resultado.add(msj);
		}
		return resultado;		
	}
	
	public Msj getUltimoMsj(int usuario1, int usuario2) {
		List<Msj> resultado = conversaciones(usuario1, usuario2);
		
		if(resultado.size() == 0)
			return null;
		return resultado.get(resultado.size()-1);		
	}
	
	public void addMensajes(Msj mensaje) {
		mensajes.add(mensaje);		
	}
}
