package ar.edu.unlp.info.oo2.ej4p3_DecodificadorDePeliculas;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {
		
		
		Pelicula thor = new Pelicula("Thor", 2007, 7.9);
		Pelicula capAmerica = new Pelicula("Capitan America",2016,7.8);
		Pelicula ironMan = new Pelicula("Iron Man",2010,7.9);
		Pelicula dunkirk= new Pelicula("Dunkirk",2017,7.9);
		Pelicula rocky = new Pelicula("Rocky",1976,8.1);
		Pelicula rambo = new Pelicula("Rambo",1979,7.8);
		
		thor.establecerSimilar(capAmerica);
		thor.establecerSimilar(ironMan);
		ironMan.establecerSimilar(capAmerica);
		rocky.establecerSimilar(rambo);
		
		List<Pelicula> grilla = new ArrayList<Pelicula>(List.of(thor,capAmerica,ironMan,dunkirk,rocky,rambo));
		
		System.out.println(grilla);
		
		Decodificador deco= new Decodificador(grilla, new Similaridad());
		
		deco.reproducir(thor);
		deco.reproducir(rocky);
		
		List<Pelicula> resultado;
		resultado = deco.sugerirPeliculas();
		
		System.out.println(resultado);
		
		
	}

}
