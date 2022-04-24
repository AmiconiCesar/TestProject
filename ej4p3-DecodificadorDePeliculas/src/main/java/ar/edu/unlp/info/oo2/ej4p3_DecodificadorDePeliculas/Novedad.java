package ar.edu.unlp.info.oo2.ej4p3_DecodificadorDePeliculas;

import java.util.List;
import java.util.stream.Collectors;

// ConcreteStrategyA    // TemplateMethod Concrete Class
public class Novedad extends TipoDeSugerencia {


	@Override
	protected List<Pelicula> ordenarLista(List<Pelicula> listaPelicula) {
		return listaPelicula.stream().sorted((Pelicula p1, Pelicula p2) -> Integer.compare(p2.getAño(),p1.getAño()))
							.collect(Collectors.toList()); 
		}

	@Override
	protected List<Pelicula> filtrarSimilares(List<Pelicula> result, List<Pelicula> vistas) {
		// TODO Auto-generated method stub
		return result;
	}

	
}
