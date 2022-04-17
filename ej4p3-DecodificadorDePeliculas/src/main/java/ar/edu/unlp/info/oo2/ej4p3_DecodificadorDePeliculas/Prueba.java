package ar.edu.unlp.info.oo2.ej4p3_DecodificadorDePeliculas;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {
		
		
		List<Pelicula> grilla = new ArrayList<Pelicula>();
		
		List<Integer> enteros = new ArrayList<Integer>();
		
		enteros.add(1);
		enteros.add(8);
		enteros.add(5);
		enteros.add(4);
		System.out.println(enteros);
		enteros.sort((Integer i1, Integer i2)-> Integer.compare(i2, i1));
		enteros = enteros.subList(0, 3);
		System.out.println(enteros);
		System.out.println(enteros.size());
		
		
		
		
	}

}
